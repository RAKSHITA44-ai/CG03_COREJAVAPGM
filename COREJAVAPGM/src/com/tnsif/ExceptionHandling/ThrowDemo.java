package com.tnsif.ExceptionHandling;

public class ThrowDemo {
	static void checkage(int age) {
		if(age<18) {
			throw new ArithmeticException("Student is not eligible for voting");
		}
		System.out.println("Student is eligible for voting");
	}
	public static void main(String[] args) {
		try {
			checkage(16);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
