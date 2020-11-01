package ca.employee.system;

import java.time.LocalDate;
import java.util.Date;

public abstract class Employee {


	private String fName;
	private String lName;
	private String pNum;
	private String email;
	private LocalDate birthOfDate;
	
	public Employee(String fName, String lName, String pNum, String email, int year, int month, int day) {
		setfName(fName);
		setlName(lName);
		setPNum(pNum);
		setEmail(email);
		setBirthOfDate(year, month, day);
	}

	public String getfName() {
		return fName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public String getpNum() {
		return pNum;
	}
	
	
	
	public void setfName(String fName) {
		if(!fName.isEmpty() && !fName.equalsIgnoreCase(null)) {
			this.fName = fName;			
		} else {
			this.fName = "Unknown";
		}
	}
	
	public void setlName(String lName) {
		if(!lName.isEmpty() && !lName.equalsIgnoreCase(null)) {
			this.lName = lName;			
		} else {
			this.lName = "Unknown";
		}
	}
	
	public void setPNum(String pNum) {
		if(!pNum.isEmpty() && !pNum.equalsIgnoreCase(null)) {
			this.pNum = pNum;			
		} else {
			this.pNum = "Unknown";
		}
	}
	
	public void setEmail(String email) {
		if(!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;			
		} else {
			this.email = "Unknown";
		}
	}
	
	public void setBirthOfDate(int year, int month, int day) {
		if (year > 0 && month > 0 && day > 0) {
	        this.birthOfDate = LocalDate.of(year, month, day);
		} else {
			this.birthOfDate = null;
		}
		
	}
	
	public abstract double getIncome();
	
	@Override
	public String toString() {
		return "Employee Name: " + fName + " " + lName
				+"\nEmployee Phone Number: " + pNum
				+"\nEmployee Email: " + email
				+"\nEmployee Birth of Day: " + birthOfDate;
	}

}
