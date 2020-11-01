package ca.employee.system;

import java.time.LocalDate;

public class HourlyBase extends Employee {
	
	private double workHoursMonth;
	private double payRate;

	public HourlyBase(String fName, String lName, String pNum, String email, 
			int year, int month, int day, double workHoursMonth, double payRate) {
		super(fName, lName, pNum, email, year, month, day);
		setWorkHoursMonth(workHoursMonth);
		setPayRate(payRate);
		
	}
	
	public double getWorkHoursMonth() {
		return workHoursMonth;
	}
	
	public double getPayRate() {
		return payRate;
	}
	
	public void setWorkHoursMonth(double workHoursMonth) {
		if(workHoursMonth > 0) {
			this.workHoursMonth = workHoursMonth;			
		} else {
			this.workHoursMonth = 0;
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
		return workHoursMonth * payRate;
	}
	
	@Override
	public String toString() {
		return "------ Hourly Base Employee ------\n" + super.toString() + "\nEmployee Income: " + getIncome() + "\n";
	}
	
	
	
	

}
