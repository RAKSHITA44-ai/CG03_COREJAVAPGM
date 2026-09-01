package com.tnsif.ExceptionHandling;

public class FinallyDemo {
	public static void main(String[] args) {
		
		try {
			System.out.println(16/0);
		}
		catch(Exception f) {
			System.out.println(f);
		}
		finally {
			System.out.println("Welcome to java");
	}
		
		
	}
	
	

}
