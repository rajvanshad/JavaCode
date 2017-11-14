package com.principles.ocp;

public class Square implements Shape {

	private int l;

	public Square(int l) {
		this.l = l;
	}
	
	@Override
	public void drawShape() {
		
		System.out.println("Draw Square : " + l + "," + l);
		
	}
}
