package com.kh.pratice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public void Test3() {
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("가로: ");
		double width = sc.nextDouble();
		
		System.out.println("세로 : ");
		double height = sc.nextDouble();
		
		System.out.println("면적 : "+ (height * width));
		
		System.out.println("둘레 : "+ ((height + width )* 2));
		
		
		
	}

}
