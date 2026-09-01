package com.tnsif.ExceptionHandling;

public class WithException {
	public static void main(String[] args) {
		System.out.println("Good Morning All");
		int a=100;
		int b=0;
		System.out.println("Welcome to Java");
		try {
		System.out.println(a/b);
		}
		catch (Exception r ) {
			System.out.println(r.gettingmessage);
		System.out.println("Hello World!");
		}
	}

}
