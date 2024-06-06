package com.kh.operator;

public class B_inDecrease {

	
	/*
	 * 증감연산자(단항연산자) ++ --
	 * ++ : 변수에 담긴 값을 1증가시키는 연산자
	 * ++ 변수 (전위연산자) 변수++(후위연산자)
	 * -- : 값을 1감소시키는 연산자 
	 * 	--변수 (전위연산자) 변수-- (휘위연산자)
	 * 
	 * (증감연산자) 변수 : 전위연산 -> 선증감 후처리.
	 * 변수(증감연산자)  : 후위연산 -> 선처리 후증감.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void method1() { 
		//전위연산 테스트
		int num = 10; 
		System.out.println("전위연산 적용 전 num : " +num); //10
		System.out.println("1회 수행후 결과 : " + ++num); // 10에서 증감연산을 먼저실행하여 11로 num값을 증가시키고 
		// 최종적으로 11이 출력됨.
		
		System.out.println("2회 수행후 결과 : " + ++num); //현재 num =11이 담겨있음 . 따라서 12가 출력됨
		System.out.println("3회 수행후 결과 : " + ++num); //13
		System.out.println("최종 num : " +num);
		System.out.println("=====================================");
		
		
		//후위 연산테스트
		int num2 = 10;
		System.out.println("후위연산 적용 전 num2: " +num2); //10
		System.out.println("1회 수행후 결과" + num++); //10출력 후 1증가
		//즉 , 출력당시에는 10이 출력되고, 출력처리가 끝나고나서 11로증감처리됨.
		System.out.println("2회 수행후 결과" + num++);  //11 출력 후 1증가 num2 = 12
		System.out.println("3회 수행후 결과" + num++); // 12 출력 후 1증가 num2 = 13
	}
	
	public void method2 () {
		//전위연산 
		int a = 10; 
		int b = ++a;
		System.out.println("a : " +a+ ",b: " +b); //41 32
		
		
		//후위연산
		int c = 10;
		int d = c++; // d =10 , c=11
		System.out.printf("c : %d, d : %d" ,c,d);
		
		// ==========================
		// 예측
		int num =20;
		System.out.println("현재 num: "+num); //20
		System.out.println("++num ? " + ++num); //21
		System.out.println("num++ ? " + num++); //21  22
		System.out.println("--num ?" + --num);  // 21
		System.out.println("num-- ? " + num --); //21  20
		
		System.out.println("최종 num ? " +num); // 20
		
		
		
		
	}
	
	public void method3( ) {
		
		int num1 = 20;
		int result1 = num1++ *3; // result = 20 *3 연산후    num1 = num1 +1    21
		System.out.println("num1 : " + num1);
		System.out.println("result1 : " + result1);
		
		
		int num2 = 20;
		int result2 = ++num2 *3; // num2 = num2 + 1   연산후 result2 = 21 *3 
		System.out.println("num2 : " + num2);
		System.out.println("result2 " +result2);
		
		
		
		
	}
	
	
	public void method4() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);   //10  a=((11
		System.out.println((++a) + (b++));  // 12 + 20     a= 12 b= ((21
		System.out.println((a++)+(--b)+(--c));  //12 + 20 + 29  a=13 b==20 c=29
		System.out.println("a :" +a+ ", b :" +b+ ", c : " +c); // a=13 b=20 c=29
		
		
	}
	
	public void quiz() {
		
		int a = 5;
		int b = 10;
		
		int c = (++a) +b;  // a = 6 b = 10  c = 16
		int d = c / a; // d=2
		int e = c % a; // e=4
		
		int f = e++; //  f=4   e=5
		int g = (--b) + (d--); // b = 9 d= 1  g = 10
		int h = 2; // h =2 
		
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h); // 7 + (3 * 7 % 8 ) 
		
		System.out.println("a : " + a); // a = 7
		System.out.println("b : " + b); // b = 9
		System.out.println("c : " + c); // c = 15
		System.out.println("d : " + d); // d = 1
		System.out.println("e : " + e); // e = 6
		System.out.println("f : " + f); // f = 4
		System.out.println("g : " + g); // g = 10
		System.out.println("h : " + h); // h = 2
		System.out.println("i : " + i); // i = 12
		
	}
}
