package com.tnsif.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	int marks;
	String name;

	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		return this.marks-o.marks;
		
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
		
	
}


public class ComparableInterfaceDemo {
	public static void main(String[] args) {
		ArrayList<Student> s=new ArrayList<>();
		s.add(new Student(80, "Ram"));
		s.add(new Student(70, "Giri"));
		s.add(new Student(65, "Pavi"));
		s.add(new Student(97, "Arav"));
		
		Collections.sort(s);
		System.out.println(s);
		
	
}

}
