package com.ocp;

public class Rectangle {
private int startX;
private int startY;
private int endX;
private int endY;

public Rectangle(int startX, int startY, int endX, int endY) {
	this.startX = startX;
	this.startY = startY;
	this.endX = endX;
	this.endY = endY;
}

public void drawRectangle() {
	System.out.println("Draw Rectangle : " + startX + "," + startY + "," + endX + "," + endY);
}


}
