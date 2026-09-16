package com.tnsif.StreamAPI;


import java.util.Arrays;

class Customer {
	private String name;
	private double salary;
	
	
	
	public String getName() {
		return name;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getSalary() {
		return salary;
	}
	
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	public Customer(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	
}
























public class CustomerManagement {
	public static void main(String[] args) {
		List<Customer> c=Arrays.asList(new Customer("Manish","Bengaluru"),
				new Customer("Rahul","Hubli"),
				new Customer("Arjun","Dharawad"),
				new Customer("Girish","Delhi"),
				new Customer("Hitesh","Bengaluru"),
				new Customer("Muttu","Bengaluru"),
				new Customer("Gouse","Bengaluru"));
		List<String> m=c.stream().filter(c->getCity().equals("Bengaluru")).foreach(c->System.out.println(c.getName)+" "+c.getCity())
				.filter(customer->customer.map(employee->employee.getName().sorted().toList();
		System.out.println(m);
		     
		
		
		
	}

}
