package com.cjc.educationloan.main.service;

import java.util.List;

import com.cjc.educationloan.main.model.Scheme;

public interface SchemeService {

	String save(Scheme scheme);

	List<Scheme> getAllScheme();
}
