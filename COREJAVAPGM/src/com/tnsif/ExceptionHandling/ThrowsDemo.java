package com.tnsif.ExceptionHandling;

public class ThrowsDemo {
	static void calculate(int a, int b) throws ArithmeticException {
		int result=a/b;
		System.out.println("result: "+result);
	}
	public static void main(String[] args) {
		try {
			calculate(10,7);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot devide by zero");
		}
	}

}
