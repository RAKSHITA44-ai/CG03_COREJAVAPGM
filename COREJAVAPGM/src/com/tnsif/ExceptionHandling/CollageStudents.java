package com.tnsif.ExceptionHandling;

public class CollageStudents {
	public static void main(String[] args) {
		String Studname="Rakshita";
		String Studbranch=null;
		int Studrollno=102;
		
		try {
			System.out.println("Student Name: "+Studname);
			System.out.println("Student Rolle Number: "+Studrollno);
			System.out.println("Student Branch: "+Studbranch.toLowerCase());
		}
		
		catch(NullPointerException r) {
			System.out.println(r);
			System.out.println("Student Branch is Missing...");
		}
		
		System.out.println("Program Continue......");
		
	}

}
