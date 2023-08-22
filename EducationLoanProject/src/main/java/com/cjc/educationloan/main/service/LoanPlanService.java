package com.cjc.educationloan.main.service;

import java.util.List;

import com.cjc.educationloan.main.model.LoanPlan;

public interface LoanPlanService {

	
	List<LoanPlan> getAllLoanPlan();

	String save(LoanPlan loanplan);
}
