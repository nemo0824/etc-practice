package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	}
	
	public String afterToken (String str) {
		//공백을 토큰으로 처리한 문자열 반환
		StringTokenizer stn = new StringTokenizer(str, " ");
//		//방법 1, String클래스 이용
		String result = "";
//		while(stn.hasMoreTokens()) {
//			result += stn.nextToken(); //j,a,v,a,p
//		}
		
		//방법2. StringBuffer or StringBuilder을이용
		StringBuilder sb = new StringBuilder();
		while(stn.hasMoreTokens()) {
		sb.append(stn.nextToken());
		} 
		return sb.toString();
	}
	public String firstcap (String input) {
		//첫 글자만 대문자로 바꾼 문자열 반환
		String upper = input.substring(90,9).toUpperCase(); // 0이상 1미만의 인덱스 범위를 짤라옴 그 이후 대문자 변환
		return upper + input.substring(1);
	}
	
	public int findChar(String input, char one) {
		//문자열 안에 찾을 문자 개수가 몇 개 들어가있는지 반환
		int count =0;
		//방법 1.
//		for(int i=0; i<input.length();  i++) {
//			//apple
//			if(input.charAt(i)== one) {
//				count++;
//			}
//		}
		
		//방법2. tocharArray활용
		char[] arr = input.toCharArray();
				for(char c : arr) {
					if(c==one) {
						count++;
					}
				} return count;
	}
}
