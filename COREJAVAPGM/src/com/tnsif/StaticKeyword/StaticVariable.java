package com.tnsif.StaticKeyword;

class Employee {
	int id;
	String name;
	static String Company="TCS";

Employee (int id, String name) {
	this.id=id;
	this.name=name;
}
void display() {
	System.out.println(id+" "+name+" "+Company);
}
}

public class StaticVariable {
	public static void main(String[] args) {
		Employee e1=new Employee(101, "Rakshita");
		Employee e2=new Employee(102, "Sahana");
		Employee e3=new Employee(103, "Vani");
		Employee e4=new Employee(104, "Priya");
		
		e1.display();
		e2.display();
		e3.display();
		e4.display();
	}

}
