package com.tnsif.LabdaExpressionDemo;

interface Area {
	double calculate(double side);
}

public class AreaOfSide {
	public static void main(String[] args) {
		Area squareArea=(side)->side*side;
		double side=5;
		double area=squareArea.calculate(side);
		
		System.out.println("Side: "+side);
		System.out.println("Area of Square: "+area);
	}

}
