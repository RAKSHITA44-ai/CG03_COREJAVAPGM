package com.tnsif.ExceptionHandling;

public class ArrayIndexDemo {
	public static void main(String[] args) {
		int marks[]= {70,50,45,90,68,55};
		try {
			System.out.println(marks[2]);
			System.out.println(marks[0]);
			System.out.println(marks[6]);
		}
		catch(ArrayIndexOutOfBoundsException r) {
			System.out.println(r);
		}
		System.out.println("Program Continue");
			
			
		}
	}


