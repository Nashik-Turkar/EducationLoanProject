package com.cjc.educationloan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Disbursement {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int disbursementId;
	private String agreementDate;
	private String bankName;
	private long accountNumber;
	private String ifscCode;
	private String accountType;
	private double transferAmount;
	private String amountPaidDate;
	private String paymentStatus;
	@OneToOne(cascade =CascadeType.ALL)
	private SanctionDetails sanctionDetails;
	public int getDisbursementId() {
		return disbursementId;
	}
	public void setDisbursementId(int disbursementId) {
		this.disbursementId = disbursementId;
	}
	public String getAgreementDate() {
		return agreementDate;
	}
	public void setAgreementDate(String agreementDate) {
		this.agreementDate = agreementDate;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getTransferAmount() {
		return transferAmount;
	}
	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}
	public String getAmountPaidDate() {
		return amountPaidDate;
	}
	public void setAmountPaidDate(String amountPaidDate) {
		this.amountPaidDate = amountPaidDate;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public SanctionDetails getSanctionDetails() {
		return sanctionDetails;
	}
	public void setSanctionDetails(SanctionDetails sanctionDetails) {
		this.sanctionDetails = sanctionDetails;
	}
	
	
	
	
	


}
