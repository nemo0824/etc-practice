package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {

	Shape s  = new Shape();
	
	
public double calcArea(double height, double width) {
	s.setHeight(height);
	s.setWidth(width);
	
	return width * height;
}

public void paintColor (String color) {
	
}

public String print() {
	return "사각형" + s.information();
}
}
