package com.cjc.educationloan.main.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.educationloan.main.model.LoanPlan;

@Repository
public interface LoanPlanRepo extends CrudRepository<LoanPlan, Integer>{

}
