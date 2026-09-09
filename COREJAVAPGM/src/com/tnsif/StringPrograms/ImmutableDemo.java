package com.tnsif.StringPrograms;

public class ImmutableDemo {
	public static void main(String[] args) {
		 String s1="Rakshu";
		 String s2=s1;
		 String s3=s2;
		 
		 System.out.println("Before Modification: ");
		 System.out.println("S1: "+s1);
		 System.out.println("S2: "+s2);
		 System.out.println("S3: "+s3);
		 
		  s1="RakshitaGH";
		 
		 System.out.println("After Modificatio: ");
		 System.out.println("S1: "+s1);
		 System.out.println("S2: "+s2);
		 System.out.println("S3: "+s3);
		 
		 
		 
	}

}
