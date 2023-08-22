package com.cjc.educationloan.main.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.educationloan.main.model.ApplicantDetails;
import com.cjc.educationloan.main.model.LoanPlan;
import com.cjc.educationloan.main.model.SanctionDetails;
import com.cjc.educationloan.main.service.ApplicantDetailsService;
import com.cjc.educationloan.main.service.LoanPlanService;
import com.cjc.educationloan.main.service.SanctionDetailService;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/finance")
public class SanctionDetailController {
	
	@Autowired
	private SanctionDetailService sanctionDetailsService; 
	
	@Autowired
	private LoanPlanService loanservice;
	
	@Autowired
	private ApplicantDetailsService applicantDetailsService;
	
	
	
	
	

	@PostMapping("/saveSanction")
	public void setSanctionDetails(@RequestBody SanctionDetails sd)
	{
		System.out.println(sd.getApplicationId());
		//Date
	long millis=System.currentTimeMillis(); 
        java.sql.Date d = new java.sql.Date(millis);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDate = dateFormat.format(d);  
	        System.out.println(strDate);
		//  used to fetch current date and time
      Date date = Calendar.getInstance().getTime();
       
         //specify the format yyyy-mm-dd to print current
        // date to as an argument
       DateFormat date_format = new SimpleDateFormat("yyyy-mm-dd");
       
        // print date in the specified format
     String date_string = date_format.format(date);
       
	        
	        sd.setSanctionDate(date_string);
        
	        
	    	List<LoanPlan> lplist=loanservice.getAllLoanPlan();
	    	
	    	
	    	Optional<ApplicantDetails> appl=applicantDetailsService.getsingle(sd.getApplicationId());
	    	if(appl.isPresent()) {
	    		ApplicantDetails details=appl.get();
	    	

		for(LoanPlan lp:lplist)
	    {
		
			if(details.getReqLoanAmount()>=lp.getLoanStartingRange() && details.getReqLoanAmount()<lp.getLoanEndRange())
   {        	
     sd.setSanctionLetterValidity("180 Days");
		 sd.setProcessingCharge(lp.getProcessinFee());
		 sd.setLoanAmountRequired(details.getReqLoanAmount());
		 sd.setSanctionAmount(details.getReqLoanAmount());
		 sd.setLoanPlan(lp);
		 
		 System.out.println("Sanction Amount in Save"+sd.getSanctionAmount());

		 sanctionDetailsService.saveSanctionDetails(sd);
		    
	        
	        }
	    }
    }
	}
	

	@GetMapping("/getSanctionDetails/{id}")
	public Optional<SanctionDetails> getSanctionDetails(@PathVariable int id)
	{
		System.out.println(id);
	 Optional<SanctionDetails> sdo= sanctionDetailsService.getSanctionDetailsById(id);

		 return sdo;

	}	
	
	@GetMapping("/getapplById/{id}")
	public Optional<ApplicantDetails> getCustomer(@PathVariable int id)
	{
		
		Optional<ApplicantDetails> a=sanctionDetailsService.getApplicById(id);
		
		return a;
     }
	
//	
//	@RequestMapping("/getSanctionDetailsAll")
//	public ResponseEntity<List<SanctionDetails>> getAllSanctions()
//	{
//		List<SanctionDetails> sdlist=applicantDetailsService.getAllSanctionDetails();
//		
//		if(sdlist != null)
//		{
//			return new ResponseEntity<List<SanctionDetails>>(sdlist,HttpStatus.OK);
//		  }
//	   else 
//	     {
//			return new ResponseEntity<List<SanctionDetails>>(sdlist,HttpStatus.NOT_FOUND);
//		 }
//		
//	}

}
