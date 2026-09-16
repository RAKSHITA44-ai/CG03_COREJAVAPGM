package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test7 {
	public static void main(String[] args) {
		List<Integer> m=Arrays.asList(2399,3400,4324,5600,4599,699,2399);
		boolean r=m.stream().filter(salary->salary>10000).anyMatch(salary->salary>10000);
		System.out.println("Salary Found: "+r);
	}

}
