package com.cjc.educationloan.main.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.educationloan.main.model.Scheme;

@Repository
public interface SchemeRepo extends CrudRepository<Scheme, Integer>{

	
}
