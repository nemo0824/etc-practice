package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
/*
 * switch문은 if문 둘은 동일한 조건문
 * 
 * 차이점 
 * if(조건식) => 조건식을 복잡하게 기술가능, 범위 제시가능
 * witch 조건식 => 정확한 값의 조건만 기술(동등비교만 수행)
 * 
 * [표현법]
 * switch(앞으로 동등비교를할 대상자) {
 * case 값1 : 실행할 코드1; //앞으로 동등비교를 할 대상자 == 값1 일경우 실행할 코드.
 * breack ; //실행할 코드 1만 실행하고 switc문을 빠져나갈지 결정하는 키워드
 * 브레이크 문이 없다면 이아래 코드도 계~속 실행됨.
 * 
 * case 값2 : 실행할 코드 2;
 * break
 *  case 값n : 실행할 코드 n;
 * break
 * 
 * ....
 * default : 실행할 코드 // if ~else 문에서 else와 같은 역할을 함
 * 						// 위의 값1 값2 값n 앞으로 동등비교할 대상과 하나도 일치하지않다면
 * 						// default내의 시랳ㅇ할 코드가 실행된다
 * 
 * switch문 자주 사용되진 않지만, 사용하는 경우에는 정말 정밀하게 동일한 연산결과가 수행되어야 하는경우
 * ex) 키보드입력, 마우스입력 등
 * 
 */
	
	public void method1() {
		//1~3사이에 정수값을 입력받아 
		//1인경우 "빨간불입니다."
		//2인경우 "파란불입니다."
		//3인경우 "초록불입니다."
		//4인경우 "잘못입력했습니다"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~3 사이의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		//if(num ==1 ) {
		//	System.out.println("빨간불입니다");
	//	}else if(num ==2) {
	//		System.out.println("파란불입니다");
	//	}else if(num ==3) {
	//		System.out.println("초록불입니다");
	//	}else {
	//		System.out.println("잘못 입력했습니다.");
	//	}
		
		switch(num) {
			case 1: System.out.println("빨간불입니다."); break;
			case 2: System.out.println("파란불입니다."); break;
			case 3: System.out.println("초록불입니다"); break;
			default: System.out.println("잘못입력하셨습니다.");
		
		
	}
		
		
}
	
	public void method2() {
		// 사용자에게 구매할 과일명 (사과, 바나나,복숭아)을 입력받아
		// 각 과일마다 가격을 출력 (사과 1000원, 바나나 2000원, 복숭 5000원 
		//잘못된 과일입력시 저희 가게에서 판매하는 과일이 아닙니다
		
		//xx의 가격은 xxx원 입니다
		Scanner sc = new Scanner(System.in);
		System.out.print("구매할 과일명을 입력해주세요 (사과,바나나,복숭아) 입력 : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		
		case "사과" : price = 1000; break;
		case "바나나": price = 2000; break;
		case "복숭아": price = 5000; break;
		
		default : 
			System.out.println("저희 가게에서 판매하는 과일 아닙니다");
			method2();
			return;
		}
		
		//xx의 가격은 xxx원입니다.
		System.out.printf("%s 의 가격은 %d원입니다 . \n", fruit, price);
		
		
		
		
		
	}
	
	
	public void method3() {
		//사용자에게 등급 별로 권한을 부여하는 프로그램 
		// 1 : 관리권한, 글쓰기 권한,  읽기 권한
		// 2 : 글쓰기 권한, 읽기권한
		// 3 : 읽기권한
		Scanner sc =new Scanner(System.in);
		System.out.print("등급 : ");
		int level = sc.nextInt();
		
		switch(level) {
		case 1 : System.out.print("관리 권한, " );
		case 2 : System.out.print("글쓰기 권한, ");
		case 3 : System.out.println("읽기 권한");
		}
		
		
	}
	
	public void method4() {
		//사용자에게 1월 ~12월사이에 월을 입력받아 
		// 해당 달의 마지막 날짜를 출력하는 프로그램.
		//
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1월 ~ 12월");
		
		int month =sc.nextInt();
		
		switch (month) {
		case 1 :
		case 2 :
		case 3 :
		case 4 :
		case 5 :
		case 6 :
		case 7 :
		case 8 :
		case 9 :
		case 10 :
		case 11 :
		case 12 :
		}
	}
	
	
}
