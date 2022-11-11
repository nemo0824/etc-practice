package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public void practice() {
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.

		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수 : ");
		int pe = sc.nextInt();

		System.out.println("사탕 개수 : ");
		int candy = sc.nextInt();

		int result1 = (candy / pe);
		int result2 = (candy % pe);

		System.out.printf("1인당 사탕 개수 : " + result1);
		;
		System.out.printf("남는 사탕 개수 : " + result2);

	}

	public void practice2() {

		// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		// 이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
		Scanner sc = new Scanner(System.in);

		System.out.println("이름 : ");
		String name = sc.nextLine();

		System.out.print("학년(숫자만) :");
		int grade = sc.nextInt();

		System.out.print("반(숫자만) : ");
		int ban = sc.nextInt();

		System.out.print("번호(숫자만) :");
		int num = sc.nextInt();

		sc.nextLine(); // 비워줘야함

		System.out.print("성별(M/F) :");

		char gender = sc.nextLine().charAt(0);

		System.out.println("성적(소수점 아래 둘째자리 까지 ) :");
		Double score = sc.nextDouble();

		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f ", grade, ban, num, name, (gender == 'M' ? "남학생 " : "여학생"),
				score);

	}

	public void practice3() {
		// 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
		// 성인(19세 초과)인지 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("나이 : ");
		int age = sc.nextInt();

		String result = (age > 19) ? "성인" : (age < 14) ? "어린이" : "청소년";
		System.out.println(result);

	}

	public void practice4() {
//국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
//////		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
////		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
//		
		Scanner sc = new Scanner(System.in);

		System.out.println("국어 : ");
		int kor = sc.nextInt();

		System.out.println("영어 : ");
		int eng = sc.nextInt();

		System.out.println("수학 : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		double avg = sum / 3.0;

		String result = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격";

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(result);

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		// 주민번호를 이용하여 남자 인지 여자 인지 구분하여 출력하세요.
		System.out.print("주민번호를 입력하세요 (-포함) : ");
		String resNo = sc.nextLine(); // 901225-1234567
		char gender = resNo.charAt(7);// '1' '2' '3' '4'

		String result = (gender == '1' || gender == '3') ? "남자" : "여자";
		// '1' ==1 -> 49 ==1 , '2' ==1 -> 50 ==1
		// 형변환 유의 행야함 아스키코드 부분

		System.out.println(result);

	}

	public void practice6() {
//키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
//		그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
//		아니면 false를 출력하세요.
//		(단, num1은 num2보다 작아야 함

		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 : ");
		int num1 = sc.nextInt();

		System.out.println("정수2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력 : ");
		int num3 = sc.nextInt();

		boolean result = (num3 <= num1 || num3 > num2) ? true : false;
		System.out.println(result);
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.println("입력 1 : ");
		int num1 = sc.nextInt();

		System.out.println("입력 2 : ");
		int num2 = sc.nextInt();

		System.out.println("입력 3 : ");
		int num3 = sc.nextInt();

		System.out.println((num1 == num2 && num1 == num3 && num2 == num3) ? true : false);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		// A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		//		인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
		// (A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)

		System.out.println("A사원의 연봉");
		int personA =sc.nextInt();
		
		System.out.println("B사원의 연봉");
		int personB =sc.nextInt();
		
		System.out.println("C사원의 연봉");
		int personC =sc.nextInt();
		
		double personAtotal = personA * 1.4;
		double personBtotal = personB ;
		double personCtotal = personC * personC *0.15;
		
		System.out.println("A사원의 연봉/연봉+a : " +personA+ "/" + personAtotal);
		System.out.println(personAtotal >= 3000 ? "3000 이상" : "3000미만");
		
		System.out.println("B사원의 연봉/연봉+a : " +personB+ "/" + personBtotal);
		System.out.println(personBtotal >= 3000 ? "3000 이상" : "3000미만");
		
		System.out.println("C사원의 연봉/연봉+a : " +personC+ "/" + personCtotal);
		System.out.println(personCtotal >= 3000 ? "3000 이상" : "3000미만");
		
	}
}
