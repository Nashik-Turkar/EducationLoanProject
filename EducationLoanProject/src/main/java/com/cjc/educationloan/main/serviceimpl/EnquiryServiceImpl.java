package com.cjc.educationloan.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.cjc.educationloan.main.model.Enquiry;
import com.cjc.educationloan.main.repo.EnquiryRepo;
import com.cjc.educationloan.main.service.EnquiryService;

@Service
public class EnquiryServiceImpl implements EnquiryService{

	@Autowired
	private EnquiryRepo enquiryRepo;
	 
	@Override
	public String save(Enquiry enquiry) {
		 Enquiry savedata=enquiryRepo.save(enquiry);
		  if(savedata!=null) {
			  return "Saved";
		  }
		  else {
			return "Error";
		}
		
	}

	@Override
	public List<Enquiry> getAllEnquiry() {
		List<Enquiry> enquirylist=(List<Enquiry>) enquiryRepo.findAll();
		return enquirylist;
	}

	@Override
	public Optional<Enquiry> getsingle(int cId) {
	Optional<Enquiry> enq=	enquiryRepo.findById(cId);
		return enq;
	}
	
	
		
	
	

	
	
	
}
