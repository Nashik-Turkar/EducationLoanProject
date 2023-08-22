package com.cjc.educationloan.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.educationloan.main.model.ApplicantDetails;
import com.cjc.educationloan.main.model.Enquiry;
import com.cjc.educationloan.main.repo.ApplicantDetailsRepo;
import com.cjc.educationloan.main.service.ApplicantDetailsService;

@Service
public class ApplicantDetailsServiceImpl implements ApplicantDetailsService{

	@Autowired
	private ApplicantDetailsRepo applicantDetailsRepo;



	
	@Override
	public ApplicantDetails savedoc(ApplicantDetails dd) {
		
		return applicantDetailsRepo.save(dd);
	}




	@Override
	public List<ApplicantDetails> getApplicantDetails() {
		List<ApplicantDetails> applist=(List<ApplicantDetails>) applicantDetailsRepo.findAll();
		return applist;
	}




	@Override
	public Optional<ApplicantDetails> getsingle(int applicationId) {
		
			Optional<ApplicantDetails> enq=	applicantDetailsRepo.findById(applicationId);
				return enq;
		
	}
}
