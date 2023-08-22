package com.cjc.educationloan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanPlan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int loanPlanId;
	private double loanStartingRange;
	private double loanEndRange;
	private double loanTenure;
	private double interestRate;
	private double processinFee;
	public int getLoanPlanId() {
		return loanPlanId;
	}
	public void setLoanPlanId(int loanPlanId) {
		this.loanPlanId = loanPlanId;
	}
	public double getLoanStartingRange() {
		return loanStartingRange;
	}
	public void setLoanStartingRange(double loanStartingRange) {
		this.loanStartingRange = loanStartingRange;
	}
	public double getLoanEndRange() {
		return loanEndRange;
	}
	public void setLoanEndRange(double loanEndRange) {
		this.loanEndRange = loanEndRange;
	}
	public double getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(double loanTenure) {
		this.loanTenure = loanTenure;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getProcessinFee() {
		return processinFee;
	}
	public void setProcessinFee(double processinFee) {
		this.processinFee = processinFee;
	}
	
	
}
