package com.tnsif.MultiThreading;

class Watsapp implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Eclipse is:"+" "+Thread.currentThread().getId());
		}
	
	}
	
}

public class ImplementingRunnable {
	public static void main(String[] args) {
		Watsapp w=new Watsapp();
		Thread obj=new Thread(w);
		obj.start();
		
		System.out.println("Main id:"+" "+Thread.currentThread().getId());
	}

}
