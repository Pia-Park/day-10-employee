package ca.employee.system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static void printAllEmployee(ArrayList<SalaryBase> s, ArrayList<HourlyBase> h) {
		
		System.out.println("------ All the Employee ------\n");	
		for(int i = 0; i < s.size(); i++) {			
				System.out.println(s.get(i).toString());
			} 
		for(int j = 0; j < h.size(); j++) {			
			System.out.println(h.get(j).toString());
		} 
		
	}
	
	public static String findEmployee(String name, ArrayList<SalaryBase> sList, ArrayList<HourlyBase> hList) {
				
			
//			if(!name.isEmpty() && !name.equalsIgnoreCase(null)) {
//				for(int i = 0; i < sList.size(); i++) {
//					if(sList.get(i).getlName().equalsIgnoreCase(name)) {
//						System.out.println(sList.get(i).toString());
//					} 
//					
//				}
//				for(int j = 0; j < hList.size(); j++) {
//					if(hList.get(j).getlName().equalsIgnoreCase(name)) {
//						System.out.println(hList.get(j).toString());
//					} 
//				}			
//				
//			} else {
//				System.err.println("We can't find the employee.");
//			}
//			
//		return "";
		
		if(!name.isEmpty() && !name.equalsIgnoreCase(null)) {
			for(int i = 0; i < sList.size(); i++) {
				if(sList.get(i).getlName().equalsIgnoreCase(name)) {
					System.out.println(sList.get(i).toString());
				} else {
					System.err.println("We can't find the employee.");
				}
				
			}
			for(int j = 0; j < hList.size(); j++) {
				if(hList.get(j).getlName().equalsIgnoreCase(name)) {
					System.out.println(hList.get(j).toString());
				} else {
					System.err.println("We can't find the employee.");
				}
			}			
			
		} else {
			System.err.println("We can't find the employee.");
		}
		
	return "";
				
		
	}
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		SalaryBase s1 = new SalaryBase("Inae", "Park", "123-456-7890", "inae@gamil.com",1987, 2, 4, 400000);
		SalaryBase s2 = new SalaryBase("Momo", "Kim", "123-456-7899", "momo@gamil.com",1985, 12, 27, 29000);
		SalaryBase s3 = new SalaryBase("Nana", "Lee", "233-456-7899", "nana@gamil.com",1990, 2, 8, 35000);
		SalaryBase s4 = new SalaryBase("Kiki", "Hong", "456-444-7899", "kiki@gamil.com",1982, 4, 10, 67000);
		
		ArrayList<SalaryBase> sEmployee = new ArrayList<SalaryBase>();
		sEmployee.add(s1);
		sEmployee.add(s2);
		sEmployee.add(s3);
		sEmployee.add(s4);
		
		HourlyBase h1 = new HourlyBase("Sura", "Ah", "011-999-0000", "sura@gamil.com", 1955, 2, 18, 120, 18);
		HourlyBase h2 = new HourlyBase("Nara", "Oh", "988-999-0000", "nara@gamil.com", 1976, 4, 20, 120, 38);
		HourlyBase h3 = new HourlyBase("Susu", "Kwon", "011-777-0000", "susu@gamil.com", 1969, 5, 24, 90, 40);
		HourlyBase h4 = new HourlyBase("Haha", "Hwang", "011-666-0000", "haha@gamil.com", 1999, 11, 1, 75, 14);
		
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
