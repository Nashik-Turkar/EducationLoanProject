package com.cjc.educationloan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Scheme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int schemeId;
	private String schemeName;
	private long subsidyPercentage;
	private long incomeStartrange;
	private long incomeEndrange;
	public int getSchemeId() {
		return schemeId;
	}
	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	public long getSubsidyPercentage() {
		return subsidyPercentage;
	}
	public void setSubsidyPercentage(long subsidyPercentage) {
		this.subsidyPercentage = subsidyPercentage;
	}
	public long getIncomeStartrange() {
		return incomeStartrange;
	}
	public void setIncomeStartrange(long incomeStartrange) {
		this.incomeStartrange = incomeStartrange;
	}
	public long getIncomeEndrange() {
		return incomeEndrange;
	}
	public void setIncomeEndrange(long incomeEndrange) {
		this.incomeEndrange = incomeEndrange;
	}
	

}
