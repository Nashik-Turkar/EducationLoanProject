package com.cjc.educationloan.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.educationloan.main.model.Enquiry;
import com.cjc.educationloan.main.service.EnquiryService;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/enquiry")
public class EnquiryController {
	
@Autowired
private EnquiryService enquiryService;

@Autowired
public JavaMailSender javaMailSender;

	
//	@PostMapping("/saveEnquiry")
//	public ResponseEntity<String> saveEnquiry(@RequestBody Enquiry enquiry){
//		
//		enquiry.getCibil().setCibilStatus("Accepted");
//		
//		String response=enquiryService.save(enquiry);
//		if(response.equals("Saved")) {
//			return new ResponseEntity<String>("Enquiry Data Saved...!! ",HttpStatus.CREATED);
//		}
//		else {
//			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
//		}
//	}
//	
//	@GetMapping("/getAllEnquiry")
//	public ResponseEntity<List<Enquiry>> getAllEnquiry(){
//		List<Enquiry> allenquiry=enquiryService.getAllEnquiry();
//		if(allenquiry != null) {
//			return new ResponseEntity<List<Enquiry>>(allenquiry,HttpStatus.OK);
//		  }
//	   else 
//	     {
//			return new ResponseEntity<List<Enquiry>>(allenquiry,HttpStatus.NOT_FOUND);
//		 }
//}
//	

@PostMapping("/saveEnquiry")
public ResponseEntity<String> saveEnquiry(@RequestBody Enquiry enquiry){


	if(enquiry.getEnquiryStatus().equals("Accept")) {
	enquiry.setEnquiryStatus("Accepted");	
	}
  else if(enquiry.getEnquiryStatus().equals("Reject")) {
	  enquiry.setEnquiryStatus("Rejected");	
  }
	else {
		enquiry.setEnquiryStatus("Pending");	}
	
	
	String response=enquiryService.save(enquiry);
	if(response.equals("Saved")) {
		return new ResponseEntity<String>("Enquiry Data Saved...!! ",HttpStatus.CREATED);
	}
	else {
		return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
	}
}

@GetMapping("/getAllEnquiry")
public ResponseEntity<List<Enquiry>> getAllEnquiry(){
	List<Enquiry> allenquiry=enquiryService.getAllEnquiry();
	if(allenquiry != null) {
		return new ResponseEntity<List<Enquiry>>(allenquiry,HttpStatus.OK);
	  }
   else 
     {
		return new ResponseEntity<List<Enquiry>>(allenquiry,HttpStatus.NOT_FOUND);
	 }
}


@GetMapping("/sendmailacept/{id}")
public ResponseEntity<String > sendMailAcept(@PathVariable int id){
	
	List<Enquiry> enquiries=enquiryService.getAllEnquiry();
	for(Enquiry e:enquiries) {
		
		if(id==e.getcId()) {
                
            
                
			SimpleMailMessage m=new SimpleMailMessage();
			
			m.setTo(e.getEmail());
			m.setSubject("Hello "+e.getFirstName());
			m.setText("Congrates For Enquiry Accepted "+"Your Enquiry Id ="+e.getcId()+" And Your Cibile Score is  "+e.getCibil().getCibilScore());
			System.out.println("Name"+e.getFirstName());
			System.out.println("Email"+e.getEmail());
			
			
			javaMailSender.send(m);

			
		}
	}
	
	return new ResponseEntity<String>("mail send",HttpStatus.OK);
}
	

@GetMapping("/sendmailreject/{id}")
public ResponseEntity<String > sendMailReject(@PathVariable int id){
	
	
	List<Enquiry> enquiries=enquiryService.getAllEnquiry();
	
	for(Enquiry e:enquiries) {
		
		if(id==e.getcId()) {
			
SimpleMailMessage m=new SimpleMailMessage();
			
			m.setTo(e.getEmail());
			m.setSubject("Hello "+e.getFirstName());
			m.setText("Sorry For Enquiry Rejection Beacause Your Cibile Score is "+e.getCibil().getCibilScore()+" below 700");
			
			javaMailSender.send(m);

		}
	}
	
	
	return new ResponseEntity<String>("mail send",HttpStatus.OK);
}
	
	@GetMapping("/getsinglenquiry/{cId}")
	public ResponseEntity<Enquiry> getsingleEnquiry(@PathVariable("cId") int cId) {
		Optional<Enquiry> singleenquiry = enquiryService.getsingle(cId);
		if (singleenquiry.isPresent()) {
			Enquiry enquiry = singleenquiry.get();
			return new ResponseEntity<Enquiry>(enquiry, HttpStatus.OK);
		} else {

		}
		return new ResponseEntity<Enquiry>(HttpStatus.NOT_FOUND);

	}
	

}
