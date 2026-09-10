package com.tnsif.LabdaExpressionDemo;

//demo for with lambda expression
@FunctionalInterface
interface Drawable{
	public void draw();
	
}

class Test implements Drawable {
	int width=20;

	@Override
	public void draw() {
		System.out.println("Drawin: "+width);
		
		
	}
	

	
}

public class WithoutLambda {
	public static void main(String[] args) {
		Drawable d=new Test();
		d.draw();
		
	}

}
