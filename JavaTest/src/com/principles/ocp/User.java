package com.principles.ocp;


public class User {

	public static void main(String[] args) {
		
		Sketch sketch = new Sketch();
		
		sketch.createShapes(new Circle(10));
		sketch.createShapes(new Rectangle(10, 20));
		sketch.createShapes(new Circle(25));
		sketch.createShapes(new Square(20));
		sketch.drawSketch();
	}

}
