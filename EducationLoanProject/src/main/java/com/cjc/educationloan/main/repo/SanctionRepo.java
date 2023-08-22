package com.cjc.educationloan.main.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.educationloan.main.model.SanctionDetails;
@Repository
public interface SanctionRepo extends CrudRepository<SanctionDetails, Integer>{

	
	Optional<SanctionDetails> getSectionDetailsByApplicationId(int applicationId);
}
