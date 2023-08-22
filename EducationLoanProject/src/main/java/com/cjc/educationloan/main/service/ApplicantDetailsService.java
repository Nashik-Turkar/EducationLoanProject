package com.cjc.educationloan.main.service;

import java.util.List;
import java.util.Optional;

import com.cjc.educationloan.main.model.ApplicantDetails;

public interface ApplicantDetailsService {



	List<ApplicantDetails> getApplicantDetails();

	ApplicantDetails savedoc(ApplicantDetails dd);

	Optional<ApplicantDetails> getsingle(int applicationId);

}
