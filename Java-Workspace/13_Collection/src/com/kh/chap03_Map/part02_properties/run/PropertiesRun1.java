package com.kh.chap03_Map.part02_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_Map.park01_hashMap.modle.vo.Snack;

public class PropertiesRun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		//properties : Map 계열 ==> key, value 세트로 저장.
		// 				단, properties의 특징 : key, value 모두 String으로 제한 되어있음.
		
		Properties prop = new Properties();
		
		//String이 아닌 값을 넣게 될 경우.
		//Map계열이기 때문에 put메서드 활용가능.
//		prop.put("다이제", new Snack("초코맛", 1000));
//		
//		System.out.println(prop);
//		System.out.println(prop.get("다이제"));
//		
//		//단, 주로 Properteis를 사용하는 경우는 Properties에 담겨있는 KeY+value값 세트들을 파일로 기록하기 위해서 사용됨.
//		
//		try {
//			prop.store(new FileOutputStream("test.properties"), "Properties test");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//properties에 값을 추가할때는 보통
		//1.setProperty(String key,String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("set", "HashSet");
		prop.setProperty("Map","HashMap");
		prop.setProperty("Map", "Properteis");
		
		System.out.println(prop); //저장순서 유지 x , key값 중복 안됨
		
		//값 가져오기 
		//2.  getProperty(String key) : String 
		System.out.println(prop.getProperty("Set"));
		
		
		
		try {
			//3. store(OutputStream os, Stirng Comments) : Properties에 담긴 key - value값들을 파일로 출력
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			
			//4.storeToXML(OutputStream os, String Comments) : properties에 담긴 key~value값들을 xml문서로 출력
			prop.storeToXML(new FileOutputStream("test.xml"), "Properties Test");
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
