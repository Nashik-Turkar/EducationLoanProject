package com.cjc.educationloan.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.educationloan.main.model.LoanPlan;
import com.cjc.educationloan.main.service.LoanPlanService;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/loanplan")
public class LoanPlanController {
	
	@Autowired
	private LoanPlanService loanplanservice;

	
	@PostMapping("/saveLoanPlan")
	public ResponseEntity<String> saveEnquiry(@RequestBody LoanPlan loanplan){
		
		
		String response=loanplanservice.save(loanplan);
		if(response.equals("Saved")) {
			return new ResponseEntity<String>(" Loan Plan Saved...!! ",HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getAllLoanPlan")
	public ResponseEntity<List<LoanPlan>> getAllLoanPlan(){
		List<LoanPlan> allloanplan=loanplanservice.getAllLoanPlan();
		if(allloanplan != null) {
			return new ResponseEntity<List<LoanPlan>>(allloanplan,HttpStatus.OK);
		  }
	   else 
	     {
			return new ResponseEntity<List<LoanPlan>>(allloanplan,HttpStatus.NOT_FOUND);
		 }
}
}
