package com.tnsif.Polymorphism;

class StudentResult {
	
	void calculateresult1(int math, int java, int dbms) {
		int total=math+java+dbms;
		System.out.println("total marks:"+total);
	}
	
	void calculateresult(int math, int java, int pyhton) {
		int total=math+pyhton;
		System.out.println("total marks"+total);
	}
	
	void calculateresult(int totalmarks, double bonus) {
		double finalmarks=totalmarks+bonus;
		System.out.println("final amrks" + finalmarks);
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		StudentResult s=new StudentResult();
		s.calculateresult1(70,60,80);
		s.calculateresult(50,90);
		s.calculateresult(240, 5.0);
	}

}
