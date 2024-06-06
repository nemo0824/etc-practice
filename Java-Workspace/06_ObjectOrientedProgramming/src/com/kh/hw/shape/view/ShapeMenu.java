package com.kh.hw.shape.view;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

import com.kh.hw.shape.*;
import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;
public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		while(true) {
		System.out.println("====도형 프로그램=====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴번호 : ");
		
		int num = sc.nextInt();
		switch(num) {
		case 3: triangleMenu(); break;
		case 4: squareMenu(); break;
		case 9: return; 
			default : System.out.println("잘못된 번호입니다. 다시입력하세요.");
			}
		}
	}
		
	

	public void triangleMenu() {
		while(true) {
		System.out.println("========== 삼각형=======");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.println("메뉴번호 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1: inputSize(3,1); break;
		case 2: inputSize(3,2); break;
		case 3: printInformation(3); break;
		case 9: System.out.println("프로그램을 종료합니다."); return;
		default: 
			}	
		}

	}
	public void squareMenu() {
		while(true) {
		System.out.println("========== 사각형=======");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		int num = sc.nextInt();
		switch(num) {
			case 1: inputSize(4,1); break;
			case 2: inputSize(4,2); break;
			case 3: inputSize(4,3); break;
			case 4: printInformation(4); break;
			case 9:  return;
			default: 
			}
		}
		
	}
	
	public void inputSize(int type, int menuNum) {
		if(type ==3) {
			if(menuNum ==1) {
				System.out.println("높이 : ");
				int height = sc.nextInt();
				System.out.println("너비 : " );
				int width = sc.nextInt();
				System.out.print("삼각형의 면적은 : ");
				tc.calcArea(height,width);
				System.out.println();
			}else {
				sc.nextLine();
				System.out.print("색깔을 입력하세요");
				String color = sc.nextLine();
				tc.paintColor(color);
				System.out.println("색이 변경되었습니다.");
			}	
			
		}else {
			if(menuNum==3) {
				sc.nextLine();
				System.out.print("생깔을 입력하세요.");
				String color =sc.nextLine();
				scr.paintColor(color);
				System.out.println("색상이 변경되었습니다");
				
	
			}else {
				System.out.println("높이 :");
				int height = sc.nextInt();
				System.out.println("너비 :");
				if(menuNum ==1) {
					System.out.println("사각형의 둘레 : ");
					scr.calcPerimeter(height, width);
				}else {
					System.out.println("사각형의 면적 :");
					scr.calcArea(height,width);
				}
			}
	 }
	}
	
	public void printInformation(int type) {
		String result = "";
		if(type ==3) {
			result = tc.print();
		}else {
			result =scr.print();
			}
		System.out.println(result);
	}
}
