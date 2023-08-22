package com.cjc.educationloan.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cjc.educationloan.main.model.ApplicantDetails;
import com.cjc.educationloan.main.model.SanctionDetails;
import com.cjc.educationloan.main.repo.ApplicantDetailsRepo;
import com.cjc.educationloan.main.repo.SanctionRepo;
import com.cjc.educationloan.main.service.SanctionDetailService;
@Service
public class SanctionServiceImpl implements SanctionDetailService{
	
	@Autowired
	private ApplicantDetailsRepo applicantDetailsRepo;
	
	@Autowired
	private SanctionRepo sanctionrepo;

	@Override
	public Optional<ApplicantDetails> getApplicById(int id) {
		
  Optional<ApplicantDetails> oa=applicantDetailsRepo.findById(id);
		
		//ApplicantDetails a=oa.get();
		
		
		return oa;
	}
	
	@Override
	public ApplicantDetails getApplicationById(int id) {
Optional<ApplicantDetails> oa=applicantDetailsRepo.findById(id);
		
		ApplicantDetails c=oa.get();
		return c;
	}

	@Override
	public void saveSanctionDetails(SanctionDetails sd) {
		sanctionrepo.save(sd);
		
	}

	@Override
	public Optional<SanctionDetails> getSanctionDetailsById(int id) {
		Optional<SanctionDetails> sdo=sanctionrepo.getSectionDetailsByApplicationId(id);
		return sdo;
	}

	@Override
	public List<SanctionDetails> getAllSanctionDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
