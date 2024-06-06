package com.kh.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요
		
	int arr [] =new int[10];
	
	for(int i=0; i<10; i++) {
	arr[i] = i+1;
		}
	for(int i =0; i<10; i++) {
		System.out.printf("%d번 인덱스의 값 : %d \n", i, arr[i] );
	}
	
	}
	
	public void practice2() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요
		
	int [] arr = new int [10];
	int value =10;		
	for(int i=0; i<10; i++) {
		arr[i] = value -i;
		
	}
		
	for(int i=0; i<10; i++){
		System.out.printf(arr[i] + " ");
	}
	
		
	}
	
	 public void pratice3() {
	    Scanner sc = new Scanner(System.in);
		int size =sc.nextInt();
		int [] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] =1+i;
			System.out.print(arr[i] + " ");
		}
		 
	 }
	 
	 public void practice4() {
		 String[] arr = new String[5];
		 arr[0] = "사과";
		 arr[1] = "귤";
		 arr[2] = "포도";
		 arr[3] = "복숭아";
		 arr[4] = "참외";
		 System.out.println(arr[1]);
	 }
	 
	 public void practice5() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("문자열");
		 String str = sc.nextLine();
		 
		 System.out.print("문자 : ");
		 char ch = sc.nextLine().charAt(0);
		 
		//2. 문자열의 문자를 하나하나 배열에다가 담기
				 char[] arr = new char[str.length()];
		 for(int i =0; i<arr.length; i++) {
			 arr[i] =str.charAt(i);
		 }
		 
		 int count = 0;
		 String index = " ";
		 
		 //3. 검색할 문자가 문자열에 몇 개 있는지
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i] ==ch) {
				 //갯수 증가
				 index += i+" ";
				 count++;
			 }
		 }
		//4.출력문 출력
		 System.out.printf("%s에 %c가 존재하는 위치 (인덱스) : %s \n", str, ch, index);
		 System.out.printf("%c 개수 : %d", ch,count);
		 
		
	 }
	 
	 public void practice6() {
		 String[] days = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		 System.out.print("0~6 사이의 숫자를 입력");
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 
		 if(num<=6 && num>=0) {
			 System.out.println(days[num]);
		 }else {
			 System.out.println("잘못입력하셨습니다");
			
		 }
		 
		 
		 
		 
	 }
	 
	 public void practice7() {
		 System.out.print("정수 :");
		 Scanner sc = new Scanner(System.in);
		 int size =sc.nextInt();
		 
		 int [] arr = new int[size];
		 for(int i=0; i<arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값: ", i);
			arr[i] = sc.nextInt();
			
		 }
		 
		 int sum =0;
		 for(int i =0; i<arr.length; i++) {
			 sum += arr[i];
			 System.out.print(arr[i] + "");
		 }
		 System.out.println("\n총 합 : " +sum);
		 
	 }
	 
	 public void practice8() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수 : ");
		 int size = sc.nextInt();
		 
		 if(size <3||size%2 == 0) {
			 System.out.println("다시 입력하세요");
			 practice8();
		 }else {
			 int [] arr = new int[size]; 
			 
			 //0,1,2 -> 1,2,3
			 //3,4 -> 2,1
			 for(int index=0; index <= size/2; index++) {
				 arr[index] = 1+index;
				 
			 }
			 int value =1;
			 for(int index = size/2+1; index<arr.length; index++) {
				 arr[index] = size/2+1 -value;
				 value++;
			 }
			 
			 for(int i=0; i<arr.length; i++) {
				 System.out.print(arr[i] + i == arr.length-1 ? "": ",");
			 }
		 }
		 
		 
	 }
	 
	 public void practice9() {
		 Scanner sc = new Scanner(System.in);
		 String [] menu = {"양념", "후라이드", "고추바사삭", "레드콤보"};
		 System.out.print("치킨 이름을 입력하세요 : ");
		 String chiken = sc.nextLine();
		 
		 for(int i=0; i<menu.length; i++) {
			 if(menu[i].equals(chiken)) {
				System.out.println(chiken + "치킨 배달 가능");
				return;
			 }
		 
		 System.out.println(chiken +"치킨은 없는 메뉴입니다");
		 
		 }
	 }


}
