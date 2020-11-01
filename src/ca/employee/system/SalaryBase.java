package ca.employee.system;

import java.time.LocalDate;

public class SalaryBase extends Employee{
	
	private double annualPay;

	public SalaryBase(String fName, String lName, String pNum, String email, int year, int month, int day, double annualPay) {
		super(fName, lName, pNum, email, year, month, day);
		setAnnualPay(annualPay);
	}
	
	public double getAnnualPay() {
		return annualPay;
	}
	
	public void setAnnualPay(double annualPay) {
		if(annualPay > 0) {
			this.annualPay = annualPay;			
		} else {
			this.annualPay = 0;
		}
	}
	
	@Override
	public double getIncome() {
		return annualPay;
	}
	
	@Override
	public String toString() {
		return "------ Salary Base Employee ------\n" + super.toString() + "\nEmployee Income: " + getIncome() + "\n";
	}

}
