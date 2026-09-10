package com.tnsif.LabdaExpressionDemo;

import java.util.Scanner;

public class LoginMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username: ");
		String username=sc.nextLine();
		
		System.out.println("Enter your password: ");
		String password=sc.nextLine();
		
		//lambda expression
		
		Loginvalidation login=(user,pass) -> {
			if(user.equals("admin")&&pass.equals("admin123")) {
				return true;
			}
			return false;
		};
		boolean result=login.validate(username, password);
		if(result)
			System.out.println("Login successfully");
		else {
			System.out.println("Invalid Login");
		}
			
	}

}
