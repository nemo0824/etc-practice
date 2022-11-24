package com.kh.practice.point.model.vo;

public class Rectangle {
	private int width;
	private int height;

	public Rectangle() {
		super();
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super();
		this.width = width;
		this.height = height;
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public String toString() {
		return "x : " + x +", y :" + y + "width" + width + "height" +height ;
	}
	
	
	
	
	
	
	
	
	
}
