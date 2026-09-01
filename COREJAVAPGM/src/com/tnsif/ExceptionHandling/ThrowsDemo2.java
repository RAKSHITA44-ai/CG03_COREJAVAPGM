package com.tnsif.ExceptionHandling;

public class ThrowsDemo2 {
	static void Login(String username,String password)throws Exception {
		if(username.equals("admin")) {
			throw new Exception("Invalid Username");
		}
		if(password.equals("1234")) {
			throw new Exception("Invalid Password");
		}
		System.out.println("Login Successfully");
	}
	public static void main(String[] args) {
		try {
			Login("admin","1234");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Login Process Successfull");
	}

}
