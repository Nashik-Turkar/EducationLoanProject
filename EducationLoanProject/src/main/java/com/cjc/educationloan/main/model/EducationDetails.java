
package com.cjc.educationloan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EducationDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int educationdetaiId;
	private String institutionName;
	private int passingYear;
	private double percentage;
	private String specialization;
	private String examination;
	
	
	public int getEducationdetaiId() {
		return educationdetaiId;
	}
	public void setEducationdetaiId(int educationdetaiId) {
		this.educationdetaiId = educationdetaiId;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public int getPassingYear() {
		return passingYear;
	}
	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getExamination() {
		return examination;
	}
	public void setExamination(String examination) {
		this.examination = examination;
	}
	
	

}
