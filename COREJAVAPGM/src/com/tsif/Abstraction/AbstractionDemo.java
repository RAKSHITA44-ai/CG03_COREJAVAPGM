package com.tsif.Abstraction;

abstract class delivery {
	abstract double calculatecharge(double distance);
	void showdeliveryType() {
		System.out.println("delivery service seleted");
	}
}

class Bikedelivery extends delivery {

	@Override
	double calculatecharge(double distance) {
		
		return distance*10;
	}
}

class Dronedelivery extends delivery {

	@Override
	double calculatecharge(double distance) {
		
		return distance*2;
	}
		
}

public class AbstractionDemo {
	public static void main(String[] arhs) {
		Bikedelivery b=new Bikedelivery();
		System.out.println("b.bikecharge:"+b.calculatecharge(5));
		
		Dronedelivery d=new Dronedelivery();
		System.out.println("d.dronecharge:"+d.calculatecharge(2));
	}
	

}
