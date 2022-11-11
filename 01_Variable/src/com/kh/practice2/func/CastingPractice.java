package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {
	 
	
	public void Subject() {
	//실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
	//이 때 총점과 평균은 정수형으로 처리하세요
		
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("국어 성적 : ");
	double korean = sc.nextDouble();
	
	
	System.out.printf("영어 성적 : ");
	Double Englsih = sc.nextDouble();
	
	
	System.out.printf("수학 성적 : ");
	Double Math = sc.nextDouble();
	
	int total =  (int)(korean + Englsih + Math); 
	
	System.out.printf("총점 : %d \n" , total);
	
	
	int average = (total/3);
	
	System.out.printf("평균 : %d \n", average);
	}
}
