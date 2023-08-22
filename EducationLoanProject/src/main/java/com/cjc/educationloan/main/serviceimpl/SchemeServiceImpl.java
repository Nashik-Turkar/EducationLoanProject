package com.cjc.educationloan.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.educationloan.main.model.Scheme;
import com.cjc.educationloan.main.repo.SchemeRepo;
import com.cjc.educationloan.main.service.SchemeService;

@Service
public class SchemeServiceImpl implements SchemeService{

	@Autowired
	 private SchemeRepo schemeRepo;
	@Override
	public String save(Scheme scheme) {
		 Scheme savedata=schemeRepo.save(scheme);
		  if(savedata!=null) {
			  return "Saved";
		  }
		  else {
			return "Error";
		}
	}

	

	@Override
	public List<Scheme> getAllScheme() {
		List<Scheme> schemelist=(List<Scheme>) schemeRepo.findAll();
		return schemelist;
	}
}
