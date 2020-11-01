package ca.employee.system;

import java.time.LocalDate;

public class HourlyBase extends Employee {
	
	private double workHours;
	private double payRate;

	public HourlyBase(String fName, String lName, String pNum, String email, 
			int year, int month, int day, double workHours, double payRate) {
		super(fName, lName, pNum, email, year, month, day);
		setWorkHours(workHours);
		setPayRate(payRate);
		
	}
	
	public double getWorkHours() {
		return workHours;
	}
	
	public double getPayRate() {
		return payRate;
	}
	
	public void setWorkHours(double workHours) {
		if(workHours > 0 && workHours <= 40) {
			this.workHours = workHours;			
		} else {
			this.workHours = 0;
		}
	}
	
	public void setPayRate(double payRate) {
		if(payRate > 0) {
			this.payRate = payRate;			
		} else {
			this.payRate = 1;
		}
	}

	@Override
	public double getIncome() {
		return ((workHours * payRate) * 4) * 12;
	}
	
	@Override
	public String toString() {
		return "------ Hourly Base Employee ------\n" + super.toString() + "\nEmployee Income: " + getIncome() + "\n";
	}
	
	
	
	

}
