package ca.employee.system;

import java.time.LocalDate;

public class SalaryBase extends Employee{
	
	private double annualPay;
	private double comitionRate;

	public SalaryBase(String fName, String lName, String pNum, String email, int year, int month, int day, double annualPay, double comitionRate) {
		super(fName, lName, pNum, email, year, month, day);
		setAnnualPay(annualPay);
		setComitionRate(comitionRate);
	}
	
	public double getAnnualPay() {
		return annualPay;
	}
	
	public double getComitionRate() {
		return comitionRate;
	}
	
	public void setAnnualPay(double annualPay) {
		if(annualPay > 0) {
			this.annualPay = annualPay;			
		} else {
			this.annualPay = 0;
		}
	}
	
	public void setComitionRate(double comitionRate) {
		if(comitionRate > 0) {
			this.comitionRate = comitionRate;			
		} else {
			this.comitionRate = 0;
		}
	}
	
	@Override
	public double getIncome() {
		return annualPay + (annualPay * comitionRate);
	}
	
	@Override
	public String toString() {
		return "------ Salary Base Employee ------\n" + super.toString() + "\nEmployee Income: " + getIncome() + "\n";
	}

}
