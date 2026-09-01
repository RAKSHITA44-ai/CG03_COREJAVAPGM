package com.tnsif.ExceptionHandling;

public class ThrowDemo2 {
	static void checkpassword(String password) {
		if(password.length()<6) {
			throw new IllegalArgumentException("password is too short...");
		}
		System.out.println("password accepted");
	}
	public static void main(String[] args) {
		
		try {
			checkpassword("rakshitagh");
		}
		catch(IllegalArgumentException i) {
			System.out.println(i.getMessage());
		}
	}

}
