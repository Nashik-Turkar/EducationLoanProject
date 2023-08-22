package com.cjc.educationloan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class ApplicantDetails {
	
	@Id
	
	private int applicationId;
	private String gender;
	private String nationality;
	private String category;
	private String mariatalStatus;
	private String religion;
	private long adharCardNo;
	private String applicationStatus;
	private long reqLoanAmount;
	
	private String firstName;
	  private String lastName;
	  private int age;
	  private String email;
	   private long mobileNo;
	   private String pancardNo;
	 
	   
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private EducationDetails educationDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankDetailsA;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoanDetails previousLoanDetailsA;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address addressA;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ParentDetails parentDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Course course;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GaurantorDetails gaurantorDetails;
	
	@Lob
	private byte[] applicantPanCardPhoto;
	
	@Lob
	private byte[] allotmentStatusProof;
	
	@Lob
	private byte[] applicantCastCertificate;
	
	@Lob
	private byte[] applicantPassBookPhoto;
	
	@Lob
	private byte[] costOfFinanceProof;
	@Lob
	private byte[] sscMarksheet;
	@Lob
	private byte[] gaurantorIdentityProofPhoto;
	@Lob
	private byte[] parentIdentityProofPhoto;
	
	
	public long getReqLoanAmount() {
		return reqLoanAmount;
	}
	public void setReqLoanAmount(long reqLoanAmount) {
		this.reqLoanAmount = reqLoanAmount;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPancardNo() {
		return pancardNo;
	}
	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getMariatalStatus() {
		return mariatalStatus;
	}
	public void setMariatalStatus(String mariatalStatus) {
		this.mariatalStatus = mariatalStatus;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public long getAdharCardNo() {
		return adharCardNo;
	}
	public void setAdharCardNo(long adharCardNo) {
		this.adharCardNo = adharCardNo;
	}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	
	
	public EducationDetails getEducationDetails() {
		return educationDetails;
	}
	public void setEducationDetails(EducationDetails educationDetails) {
		this.educationDetails = educationDetails;
	}
	public BankDetails getBankDetailsA() {
		return bankDetailsA;
	}
	public void setBankDetailsA(BankDetails bankDetailsA) {
		this.bankDetailsA = bankDetailsA;
	}
	public PreviousLoanDetails getPreviousLoanDetailsA() {
		return previousLoanDetailsA;
	}
	public void setPreviousLoanDetailsA(PreviousLoanDetails previousLoanDetailsA) {
		this.previousLoanDetailsA = previousLoanDetailsA;
	}
	public Address getAddressA() {
		return addressA;
	}
	public void setAddressA(Address addressA) {
		this.addressA = addressA;
	}
	public ParentDetails getParentDetails() {
		return parentDetails;
	}
	public void setParentDetails(ParentDetails parentDetails) {
		this.parentDetails = parentDetails;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public GaurantorDetails getGaurantorDetails() {
		return gaurantorDetails;
	}
	public void setGaurantorDetails(GaurantorDetails gaurantorDetails) {
		this.gaurantorDetails = gaurantorDetails;
	}
	public byte[] getApplicantPanCardPhoto() {
		return applicantPanCardPhoto;
	}
	public void setApplicantPanCardPhoto(byte[] applicantPanCardPhoto) {
		this.applicantPanCardPhoto = applicantPanCardPhoto;
	}
	public byte[] getAllotmentStatusProof() {
		return allotmentStatusProof;
	}
	public void setAllotmentStatusProof(byte[] allotmentStatusProof) {
		this.allotmentStatusProof = allotmentStatusProof;
	}
	public byte[] getApplicantCastCertificate() {
		return applicantCastCertificate;
	}
	public void setApplicantCastCertificate(byte[] applicantCastCertificate) {
		this.applicantCastCertificate = applicantCastCertificate;
	}
	public byte[] getApplicantPassBookPhoto() {
		return applicantPassBookPhoto;
	}
	public void setApplicantPassBookPhoto(byte[] applicantPassBookPhoto) {
		this.applicantPassBookPhoto = applicantPassBookPhoto;
	}
	public byte[] getCostOfFinanceProof() {
		return costOfFinanceProof;
	}
	public void setCostOfFinanceProof(byte[] costOfFinanceProof) {
		this.costOfFinanceProof = costOfFinanceProof;
	}
	public byte[] getSscMarksheet() {
		return sscMarksheet;
	}
	public void setSscMarksheet(byte[] sscMarksheet) {
		this.sscMarksheet = sscMarksheet;
	}
	public byte[] getGaurantorIdentityProofPhoto() {
		return gaurantorIdentityProofPhoto;
	}
	public void setGaurantorIdentityProofPhoto(byte[] gaurantorIdentityProofPhoto) {
		this.gaurantorIdentityProofPhoto = gaurantorIdentityProofPhoto;
	}
	public byte[] getParentIdentityProofPhoto() {
		return parentIdentityProofPhoto;
	}
	public void setParentIdentityProofPhoto(byte[] parentIdentityProofPhoto) {
		this.parentIdentityProofPhoto = parentIdentityProofPhoto;
	}
	
	
	
	
	
	


	
}
