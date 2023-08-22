package com.cjc.educationloan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ParentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int parentId;
	private String parentFirstName;
	private String parentLastName;
	private long parentMobileNo;
	private long parentAdharCardNo;
	private String parentPanCardNo;
	private Double parentIncome;
	private String parentOccupation;
	private String relationshipWithApplicant;
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankDetailsP;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoanDetails previousLoanDetailsP;

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getParentFirstName() {
		return parentFirstName;
	}

	public void setParentFirstName(String parentFirstName) {
		this.parentFirstName = parentFirstName;
	}

	

	public String getParentLastName() {
		return parentLastName;
	}

	public void setParentLastName(String parentLastName) {
		this.parentLastName = parentLastName;
	}

	public long getParentMobileNo() {
		return parentMobileNo;
	}

	public void setParentMobileNo(long parentMobileNo) {
		this.parentMobileNo = parentMobileNo;
	}

	

	public long getParentAdharCardNo() {
		return parentAdharCardNo;
	}

	public void setParentAdharCardNo(long parentAdharCardNo) {
		this.parentAdharCardNo = parentAdharCardNo;
	}

	public String getParentPanCardNo() {
		return parentPanCardNo;
	}

	public void setParentPanCardNo(String parentPanCardNo) {
		this.parentPanCardNo = parentPanCardNo;
	}

	

	public Double getParentIncome() {
		return parentIncome;
	}

	public void setParentIncome(Double parentIncome) {
		this.parentIncome = parentIncome;
	}

	public String getParentOccupation() {
		return parentOccupation;
	}

	public void setParentOccupation(String parentOccupation) {
		this.parentOccupation = parentOccupation;
	}

	public String getRelationshipWithApplicant() {
		return relationshipWithApplicant;
	}

	public void setRelationshipWithApplicant(String relationshipWithApplicant) {
		this.relationshipWithApplicant = relationshipWithApplicant;
	}

	public BankDetails getBankDetailsP() {
		return bankDetailsP;
	}

	public void setBankDetailsP(BankDetails bankDetailsP) {
		this.bankDetailsP = bankDetailsP;
	}

	public PreviousLoanDetails getPreviousLoanDetailsP() {
		return previousLoanDetailsP;
	}

	public void setPreviousLoanDetailsP(PreviousLoanDetails previousLoanDetailsP) {
		this.previousLoanDetailsP = previousLoanDetailsP;
	}

	

	
	
	
}
