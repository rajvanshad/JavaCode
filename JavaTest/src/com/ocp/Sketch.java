package com.ocp;

import java.util.ArrayList;
import java.util.List;

public class Sketch {
	
List<Object> shapes = new ArrayList<Object>();

public void createShapes(Object shape) {
	shapes.add(shape);
}

public void drawSketch() {
	for (Object shape :shapes) {
		if(shape instanceof Circle) {
			((Circle) shape).drawCircle();
		}else if (shape instanceof Rectangle) {
			((Rectangle) shape).drawRectangle();
		}		
	}
 }
}
