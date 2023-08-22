package com.cjc.educationloan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class GaurantorDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int gaurantorId;
	private String gaurantorFirstName;
	private String gaurantorLastName;
	private String gaurantorGender;
	private long gaurantorMobileNo;
	private String gaurantorEmail;
	private long gaurantorAdharCardNo;
	private String gaurantorPanCardNo;
	private String gaurantorRelationWithApplicant;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address addressG;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankDetailsG;

	public int getGaurantorId() {
		return gaurantorId;
	}

	public void setGaurantorId(int gaurantorId) {
		this.gaurantorId = gaurantorId;
	}

	public String getGaurantorFirstName() {
		return gaurantorFirstName;
	}

	public void setGaurantorFirstName(String gaurantorFirstName) {
		this.gaurantorFirstName = gaurantorFirstName;
	}

	

	public String getGaurantorLastName() {
		return gaurantorLastName;
	}

	public void setGaurantorLastName(String gaurantorLastName) {
		this.gaurantorLastName = gaurantorLastName;
	}

	public String getGaurantorGender() {
		return gaurantorGender;
	}

	public void setGaurantorGender(String gaurantorGender) {
		this.gaurantorGender = gaurantorGender;
	}

	

	public String getGaurantorEmail() {
		return gaurantorEmail;
	}

	public void setGaurantorEmail(String gaurantorEmail) {
		this.gaurantorEmail = gaurantorEmail;
	}

	

	

	public String getGaurantorPanCardNo() {
		return gaurantorPanCardNo;
	}

	public void setGaurantorPanCardNo(String gaurantorPanCardNo) {
		this.gaurantorPanCardNo = gaurantorPanCardNo;
	}

	public String getGaurantorRelationWithApplicant() {
		return gaurantorRelationWithApplicant;
	}

	public void setGaurantorRelationWithApplicant(String gaurantorRelationWithApplicant) {
		this.gaurantorRelationWithApplicant = gaurantorRelationWithApplicant;
	}

	
	

	public Address getAddressG() {
		return addressG;
	}

	public void setAddressG(Address addressG) {
		this.addressG = addressG;
	}

	public BankDetails getBankDetailsG() {
		return bankDetailsG;
	}

	public void setBankDetailsG(BankDetails bankDetailsG) {
		this.bankDetailsG = bankDetailsG;
	}

	public long getGaurantorMobileNo() {
		return gaurantorMobileNo;
	}

	public void setGaurantorMobileNo(long gaurantorMobileNo) {
		this.gaurantorMobileNo = gaurantorMobileNo;
	}

	public long getGaurantorAdharCardNo() {
		return gaurantorAdharCardNo;
	}

	public void setGaurantorAdharCardNo(long gaurantorAdharCardNo) {
		this.gaurantorAdharCardNo = gaurantorAdharCardNo;
	}
	

}
