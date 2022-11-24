package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {

	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc= new RectangleController();
	
	public void mainMenu() {
		System.out.println("=====메뉴=====");
		sc.nextInt();
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.println("메뉴 번호 :");
	}
	
	public void circleMenu() {
		
	}
	
	public void rectangleMenu() {
		
	}
	
	public void calcCircum() {
		
	}
	
	public void calcPerimeter() {
		
	}
	
	public void calcRectArea() {
		
	}
	
	
	
	
	
	
	
	
	
	
}
