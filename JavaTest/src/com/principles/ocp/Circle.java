package com.principles.ocp;

public class Circle implements Shape {

	private int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	
	@Override
	public void drawShape() {
		System.out.println("Draw a circle with radius : " + radius);
	}
	
}
