package com.tnsif.StaticKeyword;

public class StaticMaindemo {
	static int employeecount ;
	
	static {
		employeecount=100;
		System.out.println("Employee System initialized");
	}
	
	 public static void main(String[] args) {
		 System.out.println("Starting Employee System");
		 System.out.println("employee count="+employeecount);
	
	
}



}
