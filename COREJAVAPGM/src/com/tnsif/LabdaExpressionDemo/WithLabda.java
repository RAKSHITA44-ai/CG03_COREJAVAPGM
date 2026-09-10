package com.tnsif.LabdaExpressionDemo;

@FunctionalInterface
interface Draw {
	public void draw() ;
}
public class WithLabda {
	public static void main(String[] args) {
		int width=20;
		Draw d2= () -> {System.out.println("Draw: "+width);//lambda expression
	};
	d2.draw();
	}

}
