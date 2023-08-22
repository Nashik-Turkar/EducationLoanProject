package com.cjc.educationloan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Eligibility {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int eligiilityId;
private String location;
private String familyAnnualIncome;
private String category;
private String courseType;
private String lengthOfCourse;
private String typeOfCourse;
private String courseFee;
private String amountYouInvested;
private String requiredLoanAmount;
public int getEligiilityId() {
	return eligiilityId;
}
public void setEligiilityId(int eligiilityId) {
	this.eligiilityId = eligiilityId;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getFamilyAnnualIncome() {
	return familyAnnualIncome;
}
public void setFamilyAnnualIncome(String familyAnnualIncome) {
	this.familyAnnualIncome = familyAnnualIncome;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getCourseType() {
	return courseType;
}
public void setCourseType(String courseType) {
	this.courseType = courseType;
}
public String getLengthOfCourse() {
	return lengthOfCourse;
}
public void setLengthOfCourse(String lengthOfCourse) {
	this.lengthOfCourse = lengthOfCourse;
}
public String getTypeOfCourse() {
	return typeOfCourse;
}
public void setTypeOfCourse(String typeOfCourse) {
	this.typeOfCourse = typeOfCourse;
}
public String getCourseFee() {
	return courseFee;
}
public void setCourseFee(String courseFee) {
	this.courseFee = courseFee;
}
public String getAmountYouInvested() {
	return amountYouInvested;
}
public void setAmountYouInvested(String amountYouInvested) {
	this.amountYouInvested = amountYouInvested;
}
public String getRequiredLoanAmount() {
	return requiredLoanAmount;
}
public void setRequiredLoanAmount(String requiredLoanAmount) {
	this.requiredLoanAmount = requiredLoanAmount;
}
}
