package com.kh.chap02_string.controller;

	// Stringd은 불변클래스(변하지 않는 클래스)
	// 수정하는순간 기존의 값이 담겨있는겨있는 공간에서 수정되지 않음
public class A_StringPoolTest {

	
	
	
	//생성자를 통해 문자열 닫기
	public void method1() {
		String str1 = new String("hello");
		String str2 = new String("hello2");
		
		System.out.println(str1 == str2); //false => 주소값 비교
		System.out.println(str1); 
		System.out.println(str2.toString());
	//String 클래스의 toString() 메소드의경우 실제 담겨있는 문자열을 반환하도록 오버라이딩 되어있음	
		
		System.out.println(str1.equals(str2)); //true => 문자열비교
		//String 클래스의 equals()메소드의 경우 주소값 비교가 아닌 문자열을 비교하도록 오버라이딩 되어있음
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		///String 클래스의 hashCode()메소드의 경우 주소값 기반이 아닌 실체 담긴 문자열 기반으로 해시코드값을
		//변환하도록 오버라이딩 되어있음
		
		//정말 조소값을 알고싶을때 사용하는 메서드 System.identitiyHashCode (차좀변수(레퍼런스));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	
	
	
	public void method2() {
		String str = new String("hello");
		
		//리터럴값이 상수풀에 올라감.
		String str1 = "hello";
		String str2 = "hello";
		
		//String pool : 동일한 문자열 존재 불가
		System.out.println(str1 == str2); //주소값이 일치한다 true
		//heap영역에 Stringpool에 들어가서 공유개념으로 같이씀
		
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1)); //실제 주소
		System.out.println(System.identityHashCode(str2));
	}
	
	public void method3() {
		String str = "hello";
		System.out.println(System.identityHashCode(str));
		str = "goodbye";
		System.out.println(System.identityHashCode(str));
		str+="abc"; // str = atr + "abc";
		System.out.println(System.identityHashCode(str));
		
		/* 
		 * 기존의 상수풀의 연결이 끊긴 문자열들은 가비지 콜렉터가 알아서 정리해줌
		 * 불변이라고해서 수정이 아예 안되는게아니라
		 * 기존의 그 자리 (원래있던 주소값)에서 수정되는 개념이 니라는것
		 * 매번 새로운 주소값을 참조하게됨.
		 * 
		 */
	}
}
