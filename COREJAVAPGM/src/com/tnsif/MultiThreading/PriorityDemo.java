package com.tnsif.MultiThreading;

class Mytask extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
	}
}

public class PriorityDemo {
	public static void main(String[] args) {
		Mytask t1=new Mytask();
		Mytask t2=new Mytask();
		Mytask t3=new Mytask();
		
		t1.setName("Background Task");
		t2.setName("Normal Task");
		t3.setName("Important Task");
		
		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
