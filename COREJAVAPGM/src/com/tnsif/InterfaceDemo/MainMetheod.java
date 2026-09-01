package com.tnsif.InterfaceDemo;

interface OrderService {
	boolean validateorder(double amount);
	void ProcessPayment(double amount);
	void generatelvoice(String Order,double amount);
	void updateorderstatus(String order,String status);
}

class OnlineOrder implements OrderService {
	
	private String customername;
	private String Orderid;
	
	public OnlineOrder(String customername, String orderid) {
		super();
		this.customername=customername;
		Orderid=orderid;
	}

	@Override
	public boolean validateorder(double amount) {
		if(amount>0) {
			System.out.println("Order Validation Successfull");
		
		return true;
		}
		System.out.println("Invalid order amount");
		return false;
	}

	@Override
	public void ProcessPayment(double amount) {
		System.out.println("Procession payment"+amount);
		System.out.println("Payment Successful");
		
	}

	@Override
	public void generatelvoice(String Order, double amount) {
		System.out.println("Invoice Generated");
		System.out.println("Order id" + Orderid);
		System.out.println("Customer name" + customername);
		System.out.println("Amount: " + amount);
		
	}

	@Override
	public void updateorderstatus(String order, String status) {
		System.out.println("Order is"+Orderid+"Status updated to:"+status);
		
	}
	
}

public class MainMetheod {
	public static void main(String[] args) {
		OnlineOrder o=new OnlineOrder("Ruth","ORD1001");
		double amount=5000;
		if(o.validateorder(amount)) {
			o.ProcessPayment(amount);
			o.generatelvoice("ORD1001",amount);
			o.updateorderstatus("ORD1001","Confirmed");
		}
	}

}
