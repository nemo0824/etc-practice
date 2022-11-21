package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.*;
import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;
public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		System.out.println("====도형 프로그램=====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		int num = sc.nextInt();
		if(num ==3 ) {
			new ShapeMenu().triangleMenu();
			}if(num==4) {
				new ShapeMenu().squareMenu();{
					if(num == 9) {
						
					}
				}
			}else {
				System.out.println("잘못된 번호입니다. 다시입력하세요");
			}
	
	}
		
	

	public void triangleMenu() {
		System.out.println("========== 삼각형=======");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		int num = sc.nextInt();
		 
	}
	
	public void squareMenu() {
		System.out.println("========== 사각형=======");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		int num = sc.nextInt();
		
	}
	
	public void inputSize(int type, int menuNum) {
		System.out.println("높이 : ");
		Scanner sc  = new Scanner(System.in);
		System.out.println("너비 : ");
		Scanner sc1 = new Scanner(System.in);
	}
	
	public void printInformation(int type) {
		
	}
}
