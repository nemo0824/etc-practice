package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 implements NotePen {
	
	public V40() {
		
	}
	public String makeCall() {
	
	}
	public String makeCall() {
	
	}
	
	public String takeCall() {
		
	}
	
	public String picture() {
		return "1200,1600만 화소 트리플 카메라";
	}
	
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	public String touch() {
	 return "정전식";
	}
	
	public boolean bluetoothPen() {
		return false;
	}
	
	public String printInformation() {
		String result	= "V40 는 LG에서 만들어졌고제원은 다음과 같다";
		result += makeCall()+ "\n";
		result +=takeCall()+ "\n";
		result +=picture()+ "\n";
		result +=charge()+ "\n";
		result +=touch()+ "\n";
		result +="블루투스 펜  탑제 여부 :" +bluetoothPen()+ "\n";
		return "갤럭시 노트9은 삼성에서 만들어졌고 제원은 다음과같다";
	}
	
}
