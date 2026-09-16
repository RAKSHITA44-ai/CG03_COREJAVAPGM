package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Employee {
	private int id;
	private String name;
	private String department;
	private double salary;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	
}

public class Test8 {
	public static void main(String[] args) {
		List<Employee> e=Arrays.asList(new Employee(101,"Guru","IT",70000),
				new Employee(102,"Vara","IT",65000),
				new Employee(102,"Raju","IT",80000),
				new Employee(103,"Giri","hr",60000),
				new Employee(102,"Arav","data",90000),
				new Employee(102,"Bhargav","IT",65000),
				new Employee(102,"Rahul","Finance",46000));
		
		List<String> r=e.stream().filter(employe->employe.getDepartment().equals("IT"))
				.filter(employee->employee.getSalary()>50000)
				.map(employee->employee.getName())
				.sorted().toList();
		System.out.println(r);
				
	}

}
