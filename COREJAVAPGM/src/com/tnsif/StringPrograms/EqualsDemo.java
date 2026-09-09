package com.tnsif.StringPrograms;

public class EqualsDemo {
	public static void main(String[] args) {
		String s1="Rahul";
		String s2=new String("Arjun");
		String s3="Arjun";
		String s4="Rakshita";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.equalsIgnoreCase(s3));
		
		System.out.println(s1.equalsIgnoreCase(s4));
	}

}
