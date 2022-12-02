package com.kh.pratice.file.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	
	public boolean checkName(String file) {
//		File f = new File(file);
//		boolean result f.isFile();
//		return result;
		return new File(file).isFile(); 
		//true면 -> file임. 즉 생성되어있음
		//false면 -> 파일이 없음.
	}
	
	public void fileSave(String file, String s) {
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 만들어주고
		// String에 써서 저장
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write(s);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
		// 매개변수로 들어온 file로 파일을 찾아 StringBuilder에 값들 저장하여 반환
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String value = null;
			while((value = br.readLine()) != null){
				sb.append(value + "\n"); 
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
			bw.write(s);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
