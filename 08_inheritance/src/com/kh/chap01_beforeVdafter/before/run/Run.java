package com.kh.chap01_beforeVdafter.before.run;

import com.kh.chap01_beforeVdafter.before.model.vo.*;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Desktop d = new Desktop("삼성", "d-01", "삼성데스크탑", 1_500_000,true);
		
		
		
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰14", 1_400_400, "LG");
		
		
		
		Tv t = new Tv("엘지", "t-01", "얇은 티비 ", 3_500_000, 60);
		/*
		 * 실행하고자 하는 메소드가 자식클래스에 없다면, 자동으로 부모클래스에 있는 메소드가 실행됨.
		 * 단 자식클래스에서 오버라이딩(메소드 재정의)가 되었을경우
		 * 자식클래스에 있는 오버라이딩된 메소드가 우선권을가짐
		 * 
		 * 
		 */
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		
		/*상속의 장점
		 * - 보다 적은야으이 코드로 새로운 클래스들을 작성가능
		 * - 중복된 코드를 공통적으로 관리하기 때문에 새로운 
		 */
		
	}

}
