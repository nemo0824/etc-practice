package com.kh.pratice1.func;

import java.util.Scanner;


public class VariablePractice1 {

	public void  Test1() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
	
		System.out.println("성별을 입력하세요 : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.println("키를 입력하세요(cm): ");
		double height = sc.nextDouble();
		
		System.out.println("키" + height + "cm 인" + age +"살" + gender +"자" + name +"님 반갑습니다 ^^");
	}
	
}
