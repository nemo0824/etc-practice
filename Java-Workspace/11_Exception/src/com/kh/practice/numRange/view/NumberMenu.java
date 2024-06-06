package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {

	
	public void menu() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
	
		
		System.out.println("정수 1 : ");
		int num1 = sc.nextInt();
		
		
		System.out.println("정수 2 : ");
		int num2 = sc.nextInt();
		try {
			if(!(num1>=1 && num1 <= 100 && num2 >=1 && num2 <=100)) {
				throw new NumRangeException("1과 100사이의 값이 아닙니다.");
			}
		System.out.printf("%d은 %d의 배수인가? %s", num1, num2,new NumberController().checkDouble(num1, num2));
		}catch (NumRangeException e) {
			e.printStackTrace();
		}
	}
}
