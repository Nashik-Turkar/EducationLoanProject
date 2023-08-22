package com.cjc.educationloan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CostOfFinanceDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int costId;
	private int particulars;
	private double tutionFee;
	private double examFee;
	private double stationaryBooks;
	private double computerLaboratry;
	private double totalExpenses;
	private double scholarship;
	private double requiredLoan;
	public int getCostId() {
		return costId;
	}
	public void setCostId(int costId) {
		this.costId = costId;
	}
	public int getParticulars() {
		return particulars;
	}
	public void setParticulars(int particulars) {
		this.particulars = particulars;
	}
	public double getTutionFee() {
		return tutionFee;
	}
	public void setTutionFee(double tutionFee) {
		this.tutionFee = tutionFee;
	}
	public double getExamFee() {
		return examFee;
	}
	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}
		public double getTotalExpenses() {
		return totalExpenses;
	}
	public double getStationaryBooks() {
			return stationaryBooks;
		}
		public void setStationaryBooks(double stationaryBooks) {
			this.stationaryBooks = stationaryBooks;
		}
		public double getComputerLaboratry() {
			return computerLaboratry;
		}
		public void setComputerLaboratry(double computerLaboratry) {
			this.computerLaboratry = computerLaboratry;
		}
	public void setTotalExpenses(double totalExpenses) {
		this.totalExpenses = totalExpenses;
	}
	public double getScholarship() {
		return scholarship;
	}
	public void setScholarship(double scholarship) {
		this.scholarship = scholarship;
	}
	public double getRequiredLoan() {
		return requiredLoan;
	}
	public void setRequiredLoan(double requiredLoan) {
		this.requiredLoan = requiredLoan;
	}
	
	

}
