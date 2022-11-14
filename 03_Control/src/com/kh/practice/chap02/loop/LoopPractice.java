package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
	
	System.out.print("1이상의 숫자를 입력하세요 : ");
	int num = sc.nextInt();
	
	if(num >=1) {
		for(int i =1; i<= num; i++) {
			System.out.printf(i+"");
		}
	
	}else {
		System.out.println("1이상읫 숫자를입력하세요.");
		practice1();
		
	 }
   }
	
	
	
	public void practice3() {
		
		// 1+ 2+ 3+ 4+ 5+ 6+ 7+ 8 =36
		System.out.println("정수를 하나 입력하세요 : ");
		int num =sc.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			if(i==num) {
				System.out.print(i);
			}else {
			System.out.print(i + " + ");
			}
			sum +=i;
		}
		System.out.print("= " +sum);
		
		
		
		
		
	}
	
//	public void practice4() {
	//		System.out.print("첫 번쨰 숫자:");
	//		int num1 =sc.nextInt();
		
	//	System.out.print("두 번쨰 숫자:");
	//	int num2 =sc.nextInt();
		
	//	if(num1 <1 || num2 <1) {
	//		System.out.println("1 이상의 숫자를 입력해주세요");
			//		practice4();
			
			//	}else {
	//	  if(num1 < num2) {
				  //			  for(int i= num1; num1<num2 ; num1++) {
	//	System.out.print(i + "");
	//		  } else { 
	//			  for(int i= num2; i<num1 ; num2++) {
	//		  }
	//			System.out.print(i + "");
					  
	//		  }
				 
//	  
		
		
//	}
			
		

		
		
		
	
	

	public void practice6() {
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		
		System.out.print("공차 : ");
		int gong = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.print(num + "");
			num += gong;
		}
				
	}
	
	public void practice8() {
		//*
		//**
		//***
		//****
		
		System.out.print("정수 입력 : ");
		int num =sc.nextInt();
		for(int i=0; i<=num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice9 () {
		//****
		//***
		//**
		//*
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = num; i>=1; i--) {
			
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//****
		
	}
	
	public void practice10() {
		//    *
		//   **
		//  ***
		// ****
		
		System.out.print("정수 입력: ");
		int num =sc.nextInt();
		for (int i=0; i< num; i++) {
			for(int j= 1; j<num - i; j++) { // 1 2 3
				System.out.print(" "); // ;
				}
			for(int j= 1; j<2 + i; j++) { //1
				System.out.print("*"); //*
				
			}
			System.out.println();
		}
		// *
		} 
	public void practice11() {
		//****
		// ***
		//  **
		//   *
		
		System.out.print("정수 입력: ");
		int num =sc.nextInt(); //4
		for(int i=0; i< num; i++) { // 0 1 2 3
			System.out.print("*");
			for(int j=0; j<i; j++) {
				
		}
			for(int j=0; j< num- i; j++) { //4 3 2 1
				System.out.print("*");
			}
			System.out.println();
				
		}
	
	}		
		
		
		
	public void practice12() {
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		for(int i =0; i<num; i++) {// 0 1 2 3
			for(int j=0; j<num-1 - i; j++) { // 3 2 1 0
			System.out.print(" ");
		}
		for(int j=0; j<1+2*i; j++) { // 1 3(1+2) 5 (1+2*2)  7(1+2*3)
			System.out.print("*");
			
		}
		System.out.println();
		
		}
		
	}
	
	
	public void practice14() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num <2) {
			System.out.println("잘못 입력하셨습니다");
			return;
			}
		int count = 0;
		
		for(int i=2; i<= num; i++) {
			boolean isPrime = true;
			//i값이 소수인지 아닌지 검사를 함
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					isPrime = false;
				break;
				}
			}
			if(isPrime == true) {
				System.out.print(i + " ");
				count++;
			}
			//i값이 소수라면 출력을 하고 , 값을 1증가시킴
			
		}
		System.out.printf("2부터 %d까지의 소수의 개수는 %d개입니다", num, count);
		
		
	}
	
	
	public void practice18() {
		
	//   *
	//  ***
	// *****
	//*******
	// *****
	//  ***
		
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
		
		for(int j=0; j<num-(1+i); j++) {
			System.out.print(" ");
		}
		for(int j=0; j<1+2*i; j++) {
			System.out.print("*");
			}
		System.out.println();
		
		
		
		
		for(int j=0; j<1; j++) {
			System.out.print(" ");
		}
		for(int j=0; j<3; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int j=0; j<2; j++) {
			System.out.print(" ");
		}
		for(int j=0; j<1; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		
	}
	
	}
}
	



