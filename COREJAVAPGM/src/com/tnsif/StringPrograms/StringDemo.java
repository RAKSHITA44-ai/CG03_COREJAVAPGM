package com.tnsif.StringPrograms;

public class StringDemo {
	public static void main(String[] args) {
		
		String s="Hello Java Programming";
		
		System.out.println("Length: "+s.length());
		System.out.println("Character at the index: "+s.charAt(6));
		
		System.out.println("UpperCase: "+s.toUpperCase());
		System.out.println("Lower Case: "+s.toLowerCase());
		
		System.out.println(s.contains("Java"));
		
		System.out.println(s.startsWith("word"));
		
		System.out.println(s.endsWith("hello"));
		
		System.out.println(s.substring(6,10));
		
		System.out.println(s.replace("Java","Python"));
		
		
	}

}
