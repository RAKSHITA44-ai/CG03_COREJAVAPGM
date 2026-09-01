package com.tnsif.ExceptionHandling;

public class ArithematicDemo {
	public static void main(String[] args) {
		int salary=50000;
		int workingdays=20;
		int bonusdays=5;
		
		try {
			int dailysalary=salary/workingdays;
			System.out.println("Daily Salary: "+dailysalary);
			
			int bonusperday=salary/0;
			System.out.println("Bonus: "+(bonusperday*bonusdays));
		}
		catch(ArithmeticException e) {
			System.out.println("cannot calculate salary bonus...");
			System.out.println(e);
		}
		System.out.println("Program Contine");
	}

}
