package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("priya","raman","farhan");
		List<String> uppernames=names.stream().map(name->name.toUpperCase()).toList();
		System.out.println("All Converted To: "+uppernames);
	}


}
