package com.tnsif.StringPrograms;

public class ImmutableDemo1 {
	public static void main(String[] args) {
		String s1="Rakshu";
		String str=new String("Hello ");
		System.out.println(str);
		str=str.concat("Welcome to java");
		System.out.println(str);
		
		String s2=s1;
		String s3=s2;
		
		System.out.println("Before Modification: ");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		
		s1="Rakshita Hiremath";
		
		System.out.println("After Modification: ");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s2: "+s3);
	}

}
