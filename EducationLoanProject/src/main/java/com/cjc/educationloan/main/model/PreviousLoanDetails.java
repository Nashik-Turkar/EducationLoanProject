package com.cjc.educationloan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PreviousLoanDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int previousLoanId;
	private String bankName;
	private Double loanAmount;
	private Double remainingAmount;
	private String loanStatus;
	public int getPreviousLoanId() {
		return previousLoanId;
	}
	public void setPreviousLoanId(int previousLoanId) {
		this.previousLoanId = previousLoanId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Double getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(Double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

}
