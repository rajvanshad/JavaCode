package com.principles.ocp;

public class Rectangle implements Shape {

	private int x;
	private int y;
	
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}


	@Override
	public void drawShape() {
		System.out.println("Draw Rectangle with length and bredth : " + x +"," + y);
		
	}

}
