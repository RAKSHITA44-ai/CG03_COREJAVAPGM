package com.tnsif.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Person {
	
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name: "+name+"Age: "+age);
	}

}

class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class Agecomparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return Integer.compare(o1.age, o2.age);
	}
	
}


public class ComparableDemo {
	public static void main(String[] args) {
		List<Person> p=new ArrayList<>();
		
		p.add(new Person("A ",30));
		p.add(new Person("B ",26));
		p.add(new Person("C ",19));
		p.add(new Person("G ",36));
		
		Collections.sort(p,new NameComparator());
		System.out.println("Sorted by name");
		for(Person s:p) {
		s.display();
		}
	}
	
	



}


