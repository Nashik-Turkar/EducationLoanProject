package com.cjc.educationloan.main.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class SanctionDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sanctionId;
	private String sanctionDate;
	private double sanctionAmount;
	private String sanctionLetterValidity;
	private double processingCharge;
	private double loanAmountRequired;
	private int applicationId;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<EmiDetails> emiDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private LoanPlan loanPlan;
	  private String sanctionStatus;
	  
	
	public String getSanctionStatus() {
		return sanctionStatus;
	}

	public void setSanctionStatus(String sanctionStatus) {
		this.sanctionStatus = sanctionStatus;
	}



	public Set<EmiDetails> getEmiDetails() {
		return emiDetails;
	}

	public void setEmiDetails(Set<EmiDetails> emiDetails) {
		this.emiDetails = emiDetails;
	}

	public int getSanctionId() {
		return sanctionId;
	}

	public void setSanctionId(int sanctionId) {
		this.sanctionId = sanctionId;
	}

	public String getSanctionDate() {
		return sanctionDate;
	}

	public void setSanctionDate(String sanctionDate) {
		this.sanctionDate = sanctionDate;
	}

	public double getSanctionAmount() {
		return sanctionAmount;
	}

	public void setSanctionAmount(double sanctionAmount) {
		this.sanctionAmount = sanctionAmount;
	}

	public String getSanctionLetterValidity() {
		return sanctionLetterValidity;
	}

	public void setSanctionLetterValidity(String sanctionLetterValidity) {
		this.sanctionLetterValidity = sanctionLetterValidity;
	}

	public double getProcessingCharge() {
		return processingCharge;
	}

	public void setProcessingCharge(double processingCharge) {
		this.processingCharge = processingCharge;
	}

	public double getLoanAmountRequired() {
		return loanAmountRequired;
	}

	public void setLoanAmountRequired(double loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public LoanPlan getLoanPlan() {
		return loanPlan;
	}

	public void setLoanPlan(LoanPlan loanPlan) {
		this.loanPlan = loanPlan;
	}
	
	
	

}
