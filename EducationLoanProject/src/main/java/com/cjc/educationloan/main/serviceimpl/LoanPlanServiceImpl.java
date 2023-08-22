package com.cjc.educationloan.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.educationloan.main.model.LoanPlan;
import com.cjc.educationloan.main.repo.LoanPlanRepo;
import com.cjc.educationloan.main.service.LoanPlanService;
@Service
public class LoanPlanServiceImpl implements LoanPlanService {

	
	@Autowired
	 private LoanPlanRepo loanplanRepo;
	
	@Override
	public List<LoanPlan> getAllLoanPlan() {
		List<LoanPlan> loanplanlist=(List<LoanPlan>) loanplanRepo.findAll();
		return loanplanlist;
	}

	@Override
	public String save(LoanPlan loanplan) {
		 LoanPlan savedata=loanplanRepo.save(loanplan);
		  if(savedata!=null) {
			  return "Saved";
		  }
		  else {
			return "Error";
		}
	}
}
