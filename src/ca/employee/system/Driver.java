package ca.employee.system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static void printAllEmployee(ArrayList<SalaryBase> sList, ArrayList<HourlyBase> hList) {
		
		System.out.println("------ All the Employee ------\n");	
		for(SalaryBase s : sList) {
			System.out.println(s.toString());
		}
		for(HourlyBase h : hList) {
			System.out.println(h.toString());
		}		
	}
	
	public static String findEmployee(String name, ArrayList<SalaryBase> sList, ArrayList<HourlyBase> hList) {			
		
			if(!name.isEmpty() && !name.equalsIgnoreCase(null)) {
				for(int i = 0; i < sList.size(); i++) {
					if(sList.get(i).getlName().equalsIgnoreCase(name)) {
						System.out.println(sList.get(i).toString());
					} 					
				}
				for(int j = 0; j < hList.size(); j++) {
					if(hList.get(j).getlName().equalsIgnoreCase(name)) {
						System.out.println(hList.get(j).toString());
					} 
				}			
				
			} else {
				System.err.println("We can't find the employee.");
			}
			
		return "";
						
	}
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		SalaryBase s1 = new SalaryBase("Inae", "Park", "123-456-7890", "inae@gamil.com",2004, 2, 4, 400000, 0.1);
		SalaryBase s2 = new SalaryBase("Momo", "Kim", "123-456-7899", "momo@gamil.com",2010, 12, 27, 29000, 0.2);
		SalaryBase s3 = new SalaryBase("Nana", "Lee", "233-456-7899", "nana@gamil.com",2001, 2, 8, 35000, 0);
		SalaryBase s4 = new SalaryBase("Kiki", "Hong", "456-444-7899", "kiki@gamil.com",1997, 4, 10, 67000, 0.4);
		
		ArrayList<SalaryBase> sEmployee = new ArrayList<SalaryBase>();
		sEmployee.add(s1);
		sEmployee.add(s2);
		sEmployee.add(s3);
		sEmployee.add(s4);
		
		HourlyBase h1 = new HourlyBase("Sura", "Ah", "011-999-0000", "sura@gamil.com", 1987, 2, 18, 40, 18);
		HourlyBase h2 = new HourlyBase("Nara", "Oh", "988-999-0000", "nara@gamil.com", 2003, 4, 20, 38, 38);
		HourlyBase h3 = new HourlyBase("Susu", "Kwon", "011-777-0000", "susu@gamil.com", 2020, 5, 24, 25, 40);
		HourlyBase h4 = new HourlyBase("Haha", "Hwang", "011-666-0000", "haha@gamil.com", 2018, 11, 1, 10, 14);
		
		ArrayList<HourlyBase> hEmpoyee = new ArrayList<HourlyBase>();
		hEmpoyee.add(h1);
		hEmpoyee.add(h2);
		hEmpoyee.add(h3);
		hEmpoyee.add(h4);
		
		printAllEmployee(sEmployee, hEmpoyee);	
		
		System.out.println("Enter the Last Name of Employee: ");
		String enteredName = input.nextLine();
		
		findEmployee(enteredName, sEmployee, hEmpoyee);
		
		
		

	}

}
