package com.principles.ocp;

import java.util.ArrayList;
import java.util.List;

public class Sketch {

	List<Shape> shapes = new ArrayList<Shape>();
	
	public void createShapes(Shape shape) {
		shapes.add(shape);
	}
	
	public void drawSketch() {
		for(Shape shape : shapes) {
			shape.drawShape();
		}
	}
	
}
