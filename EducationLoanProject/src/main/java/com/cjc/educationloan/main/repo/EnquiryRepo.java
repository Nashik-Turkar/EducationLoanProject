package com.cjc.educationloan.main.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.educationloan.main.model.Enquiry;

@Repository
public interface EnquiryRepo extends CrudRepository<Enquiry, Integer>{

}
