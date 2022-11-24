package com.kh.practice.point.model.vo;

public class  Circle extends Point {
private int radius;

public Circle() {
	super();
}

public Circle(int x, int y, int radius) {
	super();
	this.radius = radius;

}

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}


public String toString() {
	
	return "x : " + x +", y :" + y + "radius" +radius ;
}
	





}
