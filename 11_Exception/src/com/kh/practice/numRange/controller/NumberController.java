package com.kh.practice.numRange.controller;

import java.util.Scanner;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {

	
	public NumberController() {
		
	}
	
	public boolean checkDouble(int num1, int num2) throws NumRangeException {
	Scanner sc = new Scanner(System.in);
	
	if(num1/num2==0) {
		boolean checkDouble = true;
		System.out.print(num1 + "은(는) " + num2 + "의 배수인가?" +checkDouble);
	}else {
		boolean checkDouble = false;
		System.out.print(num1 + "은(는) " + num2 + "의 배수인가?" +checkDouble);
	}
		
	}
	
	
}


//public C_CustomException() {
//	
//}
//
//public C_CustomException(String msg) {
//	super(msg);
//}