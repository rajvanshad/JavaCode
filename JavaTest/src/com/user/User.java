package com.user;

import com.ocp.Circle;
import com.ocp.Rectangle;
import com.ocp.Sketch;

public class User {

	public static void main(String[] args) {
//		Circle circle = new Circle(10);
//		circle.drawCircle();
//		Rectangle rectangle = new Rectangle(10, 20, 10, 20);
//		rectangle.drawRectangle();
		
		Sketch sketch = new Sketch();
		sketch.createShapes(new Circle(10));
		sketch.createShapes(new Rectangle(10, 10, 10, 10));
		sketch.createShapes(new Circle(20));
		sketch.drawSketch();		
		
	}

}
