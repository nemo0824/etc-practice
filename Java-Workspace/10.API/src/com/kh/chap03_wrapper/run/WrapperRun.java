package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Wrapper 클래스 
		 * =>기본 자료형을 객체로 포장해주는 클래스들을 래퍼클래스 라고 함
		 * 
		 * 기본자료형 		<----> 	wrapper 클래스
		 * boolean 				Boolean
		 * char					Char	
		 * byte					Byte	
		 * short				Short
		 * int					Integer	
		 * long					Long
		 * float				Float	
		 * double				Double
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	int num1 = 10;
	int num2 = 15;
	
	// 일반 기본자료형에서 객체 자료형의 메소드를 활용하 고 싶을때 --> wrapper클래스로 변환하여 사용.
	// 자동 형변환이 일어남
	// 기본자료형 => Wrapper 자료형 (Boxing)
	Integer i1 =num1;
	Integer i2 =num2;
	
//	System.out.println(num1.equals(num2));
	System.out.println(i1.equals(i2));
	System.out.println(i1.hashCode());
	System.out.println(i2.compareTo(i1));
	
	//a.compareTo(b) : a와 b를 비교해서, a가 b보다 크면 1, a가 b보다 작으면 -1, a와 b같으면 0 리턴
	
	//배열.sort()
	//컬렉션.sort()
	
	//Wrapper 자료형 => 기본자료형 (UnBoxing)
	int num3 = i1;
	int num4 = i2;
	
	//기본자료형 <--> String 
	String str1 ="10";
	String str2 ="15.3";
	
	System.out.println(str1 + str2);
	
	//1. String--> 기본자료형 : 파싱한다.
	//	바꿀자로형 Wrapper클래스 parsexxxx(변환할 문자열)
	int i = Integer.parseInt(str1); //"10" -> 10
	double d = Double.parseDouble(str2); //"15.3" ->15.3
	
	System.out.println(i+d);
	
	//2. 기본자료형 ---> String
	// 10 ---> "10"
//	15  ==> "15.4"
	//String valueOf(반환형 기본 자료형 값) : String
	String strI = String.valueOf(i); // 10=>"10"
	String strI2 = i+"";
	String strI3 = Integer.valueOf(i).toString();
	String strd = String.valueOf(d); // 15.3->"15.3"
	}

}
