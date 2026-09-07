package com.tnsif.CollectionFramework;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		
		s.add("Car");
		s.add("Bike");
		s.add("Cycle");
		s.add("Helicopter");
		
		System.out.println(s);
		s.addFirst("Plane");
		System.out.println(s);
		
		s.addLast("Bullet");
		System.out.println(s);
		
		System.out.println("First:"+s.peek());
		System.out.println("Removed:"+s.push("Honda"));
		
		System.out.println(s);
		
		
	}

}
