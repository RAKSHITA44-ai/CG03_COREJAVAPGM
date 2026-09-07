package com.tnsif.CollectionFramework;

import java.util.TreeSet;

public class SalarySystem {
	public static void main(String[] args) {
		
		TreeSet<Integer>t=new TreeSet<>();
		
		t.add(250000);
		t.add(250000);
		t.add(20000);
		t.add(350000);
		t.add(350000);
		t.add(50000);
		t.add(80000);
		
		System.out.println("Salaries:"+t);
		System.out.println("Total Salaries:"+t.size());
		
		System.out.println("Contains 50000?"+t.contains(50000));
		System.out.println("Lowest Salary:"+t.first());
		System.out.println(t.last());
		
		System.out.println(t.headSet(50000));
		System.out.println(t.tailSet(50000));
		System.out.println(t.subSet(3000, 60000));
		
	}

}
