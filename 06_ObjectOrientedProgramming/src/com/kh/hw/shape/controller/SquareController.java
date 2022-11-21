package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {

 Shape s = new Shape();
	
 public double calcPerimeter(double height, double width) {
	 s.setHeight(height);
	 s.setWidth(width);
	 
	 return width*2+height*2;
 }
 
 public double calArea(double height, double width) {
	 s.setHeight(height);
	 s.setWidth(width);
	 
	 return width * height;
 }
 
 public void printColor() {
	 
 }
 
 public String print() {
	 
	 return "사각형"+ s.information();
 }
 
}
