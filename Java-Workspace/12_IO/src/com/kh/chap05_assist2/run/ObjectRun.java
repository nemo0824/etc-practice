package com.kh.chap05_assist2.run;

import com.kh.chap05_assist2.model.dao.ObjectDao;

public class ObjectRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectDao od = new ObjectDao();
		//od.fileSave("phone.txt"); 	// 객체 단위로 기록되어있기때문에 깨져서보이지만, 제대로 기록된것.
		od.fileRead();
	}

}
