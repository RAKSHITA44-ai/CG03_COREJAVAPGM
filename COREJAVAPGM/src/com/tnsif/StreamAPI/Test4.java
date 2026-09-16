package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test4 {
	public static void main(String[] args) {
		List<Integer> n=Arrays.asList(10,3,70,8,9,26,11,70,3,9,65);
		long count=n.stream().distinct().count();
		System.out.println("Unique Values: " +count);
	}

}
