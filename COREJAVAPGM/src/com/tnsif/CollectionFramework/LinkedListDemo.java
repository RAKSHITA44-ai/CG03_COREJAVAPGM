package com.tnsif.CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> h =new LinkedList<>();
		h.add("Google");
		h.add("Youtube");
		h.add("Github");
		h.add("Python");
		h.add("Java");
		
		System.out.println(h);
		
		h.addFirst("Sql");
		System.out.println(h);
		
		h.addLast("Postgresql");
		
		System.out.println("First"+h.peekFirst());
		
		System.out.println("removed:"+h.pollFirst());
		System.out.println(h);
	}

}
