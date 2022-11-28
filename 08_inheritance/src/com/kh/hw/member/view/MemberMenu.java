package com.kh.hw.member.view;

import java.util.Scanner;
import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	public void mainMenu() {
		
		while(true) {
			
		
		System.out.println("최대 등록 가능한 회원 수는 " +MemberController.size+"명입니다.");
		int existNum = mc.existMemberNum();
		System.out.println("현재 등록 회원 수는 " +existNum+"명 입니다");
		
		if(existNum!=10 ) {
			System.out.println("1. 새 회원 등록");
			
		}
		System.out.println("2.회원 검색");
		System.out.println("3.회원 정보 수정");
		System.out.println("4.회원 삭제");
		System.out.println("5.모두 출력");
		System.out.println("9.끝내기");
		System.out.println("메뉴번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1 :
			if(existNum! =10) {
				inserMember();
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
			break;
		case 2 :searchMember(); break;
		case 3 :updateMember(); break;
		case 4 :deleteMember(); break;
		case 5 :printAll(); break;
		case 9 :System.out.println("프로그램을 종료합니다");return;
		default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
	
	
	public void insertMember() {
		System.out.print("새 회원을 등록합니다.");
		String id = sc.nextLine();
		while(true) {
			System.out.print("아이디 :");
			id = sc.nextLine();
			if(mc.checkId(id)) {
				//true => 중복되는 아이디가 없슴 일치하는 아이디가 없음.
				break;
			}
		}
		System.out.print("이름 :");
		String name = sc.nextLine();
		System.out.print("비밀번호 :");
		String password =sc.nextLine();
		System.out.print("이메일 :");
		String email = sc.nextLine();
		char gender;
		while(true) {
			System.out.print("성별(M/F) : ");
			gender = sc.nextLine().charAt(0);
			if(gender == 'm'|| gender =='M' ||gender =='f'||gender =='F') {
				break;
			}
		}
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		mc.insertMember(String id , String name , String password, String email, char gender, int age)
	}
	
	public void searchMember() {
		
	}
	
	public void searchId() {
		
	}
	
	public void searchName() {
		
	}
	public void searchEmail() {
	
	}
	public void updateMember() {
		
	}
	public void updatePassword() {
		
	}
	public void updateEmail() {
		
	}
	public void deleteMember() {
		
	}
	public void deleteOne() {
	
	}
	public void deleteAll() {
		
	}
}
