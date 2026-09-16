package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test6 {
	public static void main(String[] args) {
		List<String> f=Arrays.asList("Rose","TV","Handle","Bag","Dres");
		Optional<String> result=f.stream().skip(3).findFirst();
		System.out.println("All Products: "+result);
	}

}
