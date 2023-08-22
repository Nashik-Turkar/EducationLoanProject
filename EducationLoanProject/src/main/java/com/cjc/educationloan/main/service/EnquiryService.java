package com.cjc.educationloan.main.service;

import java.util.List;
import java.util.Optional;

import com.cjc.educationloan.main.model.Enquiry;

public interface EnquiryService {

	String save(Enquiry enquiry);

	List<Enquiry> getAllEnquiry();

	Optional<Enquiry> getsingle(int cId);
	


}
