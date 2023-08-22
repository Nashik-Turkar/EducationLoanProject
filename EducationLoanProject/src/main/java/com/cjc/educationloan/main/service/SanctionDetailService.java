package com.cjc.educationloan.main.service;

import java.util.List;
import java.util.Optional;

import com.cjc.educationloan.main.model.ApplicantDetails;
import com.cjc.educationloan.main.model.SanctionDetails;

public interface SanctionDetailService {

	Optional<ApplicantDetails> getApplicById(int id);

	ApplicantDetails getApplicationById(int id);

	void saveSanctionDetails(SanctionDetails sd);

	Optional<SanctionDetails> getSanctionDetailsById(int id);

	List<SanctionDetails> getAllSanctionDetails();



}
