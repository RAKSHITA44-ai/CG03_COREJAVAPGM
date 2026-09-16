package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List<Integer> n=Arrays.asList(20,50,39,0,100,23,88);
		n.stream().sorted().forEach(number->System.out.println(number));
	}

}
