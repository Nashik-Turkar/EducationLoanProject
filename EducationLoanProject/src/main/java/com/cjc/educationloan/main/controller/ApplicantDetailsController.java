package com.cjc.educationloan.main.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import javax.persistence.Lob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.educationloan.main.model.Address;
import com.cjc.educationloan.main.model.ApplicantDetails;
import com.cjc.educationloan.main.model.BankDetails;
import com.cjc.educationloan.main.model.Cibil;
import com.cjc.educationloan.main.model.CostOfFinanceDetail;
import com.cjc.educationloan.main.model.Course;

import com.cjc.educationloan.main.model.EducationDetails;
import com.cjc.educationloan.main.model.Enquiry;
import com.cjc.educationloan.main.model.GaurantorDetails;
import com.cjc.educationloan.main.model.ParentDetails;
import com.cjc.educationloan.main.model.PreviousLoanDetails;
import com.cjc.educationloan.main.service.ApplicantDetailsService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/applicantDetails")
public class ApplicantDetailsController {
	
	@Autowired
	private ApplicantDetailsService applicantDetailsService;
	
	@Autowired
	JavaMailSender javasender;
	
	Random random=new Random();
	
	String res="Error";
	
	
	@PostMapping(value = "/saveApplicant" ,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ApplicantDetails docsave(
			
            @RequestPart(required = true, value = "applicantPanCardPhoto") MultipartFile f1,
          
          
            @RequestPart(required = true, value = "parentIdentityProofPhoto") MultipartFile f2,
            @RequestPart(required = true, value = "gaurantorIdentityProofPhoto") MultipartFile f3,
            @RequestPart(required = true, value = "allotmentStatusProof") MultipartFile f4,
            @RequestPart(required = true, value = "applicantCastCertificate") MultipartFile f5,
            @RequestPart(required = true, value = "applicantPassBookPhoto") MultipartFile f6,
            @RequestPart(required = true, value = "costOfFinanceProof") MultipartFile f7,
            @RequestPart(required = true, value = "sscMarksheet") MultipartFile f8,
            @RequestPart("doc") String doc) throws IOException
	
	{
        int accno=randomNumber();
		ApplicantDetails dd= new ApplicantDetails();
	
	dd.setApplicantPanCardPhoto(f1.getBytes());
	dd.setParentIdentityProofPhoto(f2.getBytes());
	dd.setGaurantorIdentityProofPhoto(f3.getBytes());
	dd.setAllotmentStatusProof(f4.getBytes());
	dd.setApplicantCastCertificate(f5.getBytes());
	dd.setApplicantPassBookPhoto(f6.getBytes());
    dd.setCostOfFinanceProof(f7.getBytes());
	dd.setSscMarksheet(f8.getBytes());
	
	
		Gson g=new Gson();
		ApplicantDetails  ds=g.fromJson(doc,ApplicantDetails.class);
		dd.setAge(ds.getAge());
		dd.setEmail(ds.getEmail());
		dd.setFirstName(ds.getFirstName());
		dd.setLastName(ds.getLastName());
		dd.setMobileNo(ds.getMobileNo());
		dd.setPancardNo(ds.getPancardNo());
		
		dd.setAddressA(ds.getAddressA());
	   dd.setAdharCardNo(ds.getAdharCardNo());
	   dd.setApplicationId(accno);
	   dd.setBankDetailsA(ds.getBankDetailsA());
	   dd.setCategory(ds.getCategory());
	   dd.setCourse(ds.getCourse());
	   dd.setEducationDetails(ds.getEducationDetails());
	  dd.setReqLoanAmount(ds.getReqLoanAmount());
	  dd.setApplicationStatus("Pending");
	
	  dd.setGaurantorDetails(ds.getGaurantorDetails());
	   dd.setGender(ds.getGender());
	   dd.setMariatalStatus(ds.getMariatalStatus());
	   dd.setNationality(ds.getNationality());
	   dd.setParentDetails(ds.getParentDetails());
	   dd.setPreviousLoanDetailsA(ds.getPreviousLoanDetailsA());
	   dd.setReligion(ds.getReligion());
	   
	   
	   ApplicantDetails	 dls=applicantDetailsService.savedoc(dd);
		
		return dls;
	}

	

	@GetMapping("/getApplicantDetails")
	public List<ApplicantDetails> getDetails(){
	
	List<ApplicantDetails> applist=applicantDetailsService.getApplicantDetails();
	
	return applist;
	}
	
	int randomNumber() {
		int min=10000000;
		int max=100000000;
		int ran=(int)(Math.random()*(max-min+1)+min);
		return ran;
	}
	
	@GetMapping("/getsingleApplication/{applicationId}")
	public ResponseEntity<ApplicantDetails> getsingleApplication(@PathVariable("applicationId") int applicationId) {
		Optional<ApplicantDetails> singleapplication = applicantDetailsService.getsingle(applicationId);
		if (singleapplication.isPresent()) {
			ApplicantDetails application =singleapplication.get();
			return new ResponseEntity<ApplicantDetails>(application, HttpStatus.OK);
		} else {

		}
		return new ResponseEntity<ApplicantDetails>(HttpStatus.NOT_FOUND);

	}
	
	@PutMapping("/verifyDocu/{id}")
	public ResponseEntity<String > sendMailAcept(@PathVariable int id){
		
		List<ApplicantDetails> applist=applicantDetailsService.getApplicantDetails();
		for(ApplicantDetails a:applist) {
			
			if(id==a.getApplicationId()) {
                a.setApplicationStatus("Verified");
                applicantDetailsService.savedoc(a);
				SimpleMailMessage m=new SimpleMailMessage();
				
				m.setTo(a.getEmail());
				m.setSubject("Hello "+a.getFirstName()+" "+a.getLastName());
				m.setText(a.getFirstName()+" "+a.getLastName()+"  Verify your Documents and "+"Your Application Id ="+a.getApplicationId());
				
				
				javasender.send(m);

				
			}
		}
		
		return new ResponseEntity<String>("mail send",HttpStatus.OK);
	}
	
	
	@PutMapping("/rejectDocu/{id}")
	public ResponseEntity<String > sendMailRejct(@PathVariable int id){
		
		List<ApplicantDetails> applist=applicantDetailsService.getApplicantDetails();
		for(ApplicantDetails a:applist) {
			
			if(id==a.getApplicationId()) {
				  a.setApplicationStatus("Rejected");
	                applicantDetailsService.savedoc(a);
				SimpleMailMessage m=new SimpleMailMessage();
				
				m.setTo(a.getEmail());
				m.setSubject("Hello "+a.getFirstName()+" "+a.getLastName());
				m.setText(a.getFirstName()+" "+a.getLastName()+"  Reject your Documents and "+"Your Application Id ="+a.getApplicationId());
				
				
				javasender.send(m);

				
			}
	
			}
		return new ResponseEntity<String>("mail send",HttpStatus.OK);
	}
}
