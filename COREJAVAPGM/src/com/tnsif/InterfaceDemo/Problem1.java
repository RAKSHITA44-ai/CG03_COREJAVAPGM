package com.tnsif.InterfaceDemo;

interface GPS {
	void tracklocation();
	void calculateroute();
}

interface VehicleSafety {
	void detectcollision();
	void applyemergencybrake();
}


class Smartvehicle implements GPS, VehicleSafety {
	
	private String vehiclenumber;
	private String model;
	private double currentspeed;
	private String location;
	

	public Smartvehicle(String vehicelnumber, String model, double currentspeed, String location) {
		super();
		this.vehiclenumber = vehiclenumber;
		this.model = model;
		this.currentspeed = currentspeed;
		this.location = location;
	}


	@Override
	public void tracklocation() {
		System.out.println("Vehicle Location: "+location);
		
	}


	@Override
	public void calculateroute() {
		System.out.println("Calculate Route: "+location);
		 
	}


	@Override
	public void detectcollision() {
		System.out.println("Collision Detected");
		applyemergencybrake();
		 
	}


	@Override
	public void applyemergencybrake() {
		System.out.println("Emergency Brake Applied");
		 
	}
	
	
void checkSpeed() {
	if(currentspeed>80) {
		
		System.out.println("Speed exists the limit");
	}
}

void displayvehicledetails() {
	System.out.println("Vehicle Details: ");
	System.out.println("Vehicle Number: "+vehiclenumber);
	System.out.println("Model: "+model);
	System.out.println("Current Speed: "+currentspeed);
	System.out.println("Location: "+location);
}
	
}

public class Problem1 {
	public static void main(String[] args) {
		Smartvehicle v=new Smartvehicle("KA01AB1234","Toyota",90,"Banglore");
		v.displayvehicledetails();
		v.tracklocation();
		v.calculateroute();
		v.detectcollision();
	}

}
