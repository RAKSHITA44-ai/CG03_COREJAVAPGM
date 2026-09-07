package com.tnsif.CollectionFramework;

import java.util.HashSet;

public class SkillComparision {
	public static void main(String[] args) {
		
		HashSet<String> JavaTeam=new HashSet<>();
		
		JavaTeam.add("Java");
		JavaTeam.add("SQL");
		JavaTeam.add("Git");
		JavaTeam.add("Docker");
		JavaTeam.add("Spring");
		System.out.println(JavaTeam);
		
		HashSet<String> PythonTeam=new HashSet<>();
		
		PythonTeam.add("Python");
		PythonTeam.add("SQL");
		PythonTeam.add("Git");
		PythonTeam.add("AWS");
		System.out.println(PythonTeam);
		
		HashSet<String> Common=(HashSet<String>) JavaTeam.clone();
		System.out.println(Common);
		
		Common.retainAll(PythonTeam);
		
		System.out.println("Common Skills: "+Common);
		HashSet<String> OnlyJava=(HashSet<String>) JavaTeam.clone();
		OnlyJava.removeAll(OnlyJava);
		

		
	}
	
}
