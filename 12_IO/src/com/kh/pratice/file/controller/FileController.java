package com.kh.pratice.file.controller;

import com.kh.pratice.file.model.dao.FileDAO;

public class FileController {
private FileDAO fd = new FileDAO();

public boolean checkName(String file) {
	return fd.checkName(file);
}

public void fileSave(String file, StringBuilder sb) {
	// 매개변수로 넘어온 sb를 String으로 바꿔 fd의 fileSave()메소드 매개변수로
	// file과 String을 넘김
	fd.fileSave(file, sb.toString());
	
}

public StringBuilder fileOpen(String file) {
//fd의 fileOpen() 매개변수로 file을 넘겨주고 그 반환값을 그대로 받아 또 반환	
	return fd.fileOpen(file);
}
	

public void fileEdit(String file, StringBuilder sb) {
	fd.fileEdit(file, sb.toString());
}
}
