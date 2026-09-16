package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;

import com.tnsif.encapsulation.Product;

class MainProducts  {
	private String name;
	private int price;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public MainProducts(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
}



public class ProductDetails {
	public static void main(String[] args) {
		List<Product> p=Arrays.asList(new Product("Mobile",43000),
				new Product("EarPhone",4000),
				new Product("Laptop",50000),
				new Product("Mouse",500),
				new Product("Keyboard",3500),
				new Product("Charger",500));
		
	}

}
