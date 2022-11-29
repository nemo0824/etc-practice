package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {
	
	public GalaxyNote9() {
		
	}
	
	public String makeCall() {
		return "";
	}
	
	public String takeCall() {
		return "수신 버튼누름";
	}
	
	public String picture() {
		return "1200만 듀얼 카메라";
	}
	
	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}
	public String touch() {
		return "정전식, 와콤펜 지원";
	}
	
	public boolean bluetoothPen() {
		return true;
	}
	
	public String printInformation() {
	String result	= "갤러시 노트9는 삼성에서 만들어졌고제원은 다음과 같다";
		result += makeCall()+ "\n";
		result +=takeCall()+ "\n";
		result +=picture()+ "\n";
		result +=charge()+ "\n";
		result +=touch()+ "\n";
		result +="블루투스 펜  탑제 여부 :" +bluetoothPen()+ "\n";
		return "갤럭시 노트9은 삼성에서 만들어졌고 제원은 다음과같다";
	}
	
	
}
