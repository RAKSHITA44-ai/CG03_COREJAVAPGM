package com.tnsif.Polymorphism;

class Employee {
	int id;
	String name;
	static String company="TCS";
	
	Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	void dislpay() {
		System.out.println(id+"     "  );
	}
}

public class Staticvariable {

}
