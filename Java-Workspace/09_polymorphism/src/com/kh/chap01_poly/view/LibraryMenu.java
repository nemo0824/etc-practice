package com.kh.chap01_poly.view;

import java.util.Scanner;

import com.kh.chap01_poly.controller.LibraryController;
import com.kh.chap01_poly.model.vo.Book;
import com.kh.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);		
	
	
	public void mainMenu() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별 : ");
		char gen = sc.nextLine().charAt(0);
		
		Member mem = new Member();
		mem.setAge(age);
		mem.setName(name);
		mem.setGender(gen);
		lc.insertMember(mem);
		// 회원 등록부
		
		
		
		while(true) {
			System.out.println("===메뉴===");
			System.out.println("1. 마이페이지 ");
			System.out.println("2. 도서 전체 조회 ");
			System.out.println("3. 도서 검색 ");
			System.out.println("4. 도서 대여하기 ");
			System.out.println("5. 프로그램 종료하기 ");
			System.out.println("메뉴번호 : ");
			int num = sc.nextInt();

			switch(num) {
				case 1:  System.out.println(lc.myInfo());
					break;
				case 2:  lc.selectAll();break;
				case 3:  lc.SearchBook();break;
				case 4:  lc.rentBook(index);break;
				case 9: return;
				default : System.out.println("잘못된 번호입니다");
		}
	}
}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for(int i =0; i<bList.length; i++) {
			System.out.println(i+"번 도서 : " +bList[i]);
		}
		
		
	}
	
	public void searchBook() {
		sc.nextLine();
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		Book[] searchList= lc.SearchBook(keyword);
		for(int i =0; i<searchList.length; i++) {
			if(searchList[i] != null) {
				
			
			System.out.println(i+"번 도서 : " +searchList[i]);
		 }
		}
	}
	
	public void rentBook() {
		selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		if(result ==0 ) {
		System.out.println("성공적으로 대여되었습니다");
		}else if(result==1) {
		System.out.println("나이 제한으로 대여 불가능 합니다");
		}else {
			System.out.println("성공적으로 대여되었습니다. 요리학원쿠폰이 발급되었으니 마이페이지 확인하세요");
		}
	}
}
