package com.tnsif.InterfaceDemo;

interface Payment {
	void pay(double amount);
	void checkStatus();
}

class UPI implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid" + amount + "Using UPI");
	}

	@Override
	public void checkStatus() {
		System.out.println("UPI payment successfully");
		
	}
}

public class Main {
	public static void main(String[] args) {
		UPI u=new UPI();
		u.pay(1500.90);
		u.checkStatus();
	}

}
