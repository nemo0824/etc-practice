package com.kh.chap03_Map.park01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_Map.park01_hashMap.modle.vo.Snack;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String , Snack> hm = new HashMap<>();
		
		/*
		 * 계층구조를 보면 list나 Set계열은 collection을 구현한 클래스 +> 데이터를 추할때도 add메소드 단 
		 * map은 아니다 => 데이터를 추가할때 put메소드 사용(key+calue 세트로 추가)
		 * 
		 * 
		 * 
		 * 
		 */
		//1. put(k key, V value) = > map 공간에 key + value세트로 추가해주는 메소드
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 900));
		hm.put("칸초", new Snack("짠맛", 1000));
		hm.put("포테이토칩", new Snack("짠맛", 1000));
		
		System.out.println(hm);
		
		//1.저장순서 유지 x
		//2.vlaue값이 동일하다고해도 key값이 중복되지 않기때문에 잘 저장됨
		hm.put("포카칩", new Snack("매운맛", 1200));
		//중복된 key값의 value값으로 덮어씌우기 됨
		System.out.println(hm);	
			
		
		
		//2.get(object key) : V => 컬렉션에서 해당 키값의 value값을 돌려주는 메소드
		System.out.println(hm.get("다이제"));
		
		Snack s = hm.get("칸초"); //제네릭 설정을 해놨기 때문에 Snack 타입 객체로 강제 형변환 하는과정 생략되었다
		System.out.println(s);
		
		//3. size() => 컬렉션에 담겨있는 갯수 
		System.out.println("size : " +hm.size());
		
		
		//4. replace(k key, V value) => 컬렉션에서 해당 key 값을 찾아내서 새로 전달된 value로 변경해주는 메소드
		hm.replace("포테이토칩", new Snack("겁나 짠맛", 1500));
		System.out.println(hm);
		
		
		//5. remove(Object key) => 컬렉션에 해당 key값을 찾아서 key+value값 동시에 지워주는 메소드.
		hm.remove("포테이토칩");
		System.out.println(hm);
		
		System.out.println("=============================================");
		
		//순차적으로 hashMap 안에 담겨있는 값에 접근하고자 할때?
		
		//for문 사용불가.
		
		//List와 Map은 다른 계열이기때문에 ArrayList에 담은후 출력불가
		//ArrayList lsit = new ArrayList(hm);
		
		//iterator()는 list와  set게열에서만 쓰는 메소드이기때문에 바로 사용불가
		//iterator it = hm.iterator();
		
		//Map을 set로 변겮애주는 메소드가 있음 (2개있음)
		//hashMap => set게열을 바꿔서 => iterator호출
		
		//1. keySet() 이용하는 방법
		//1) hm에 있는 key값들만  set에 담기.
		Set<String> keySet = hm.keySet();
		System.out.println(keySet);
		//2) 1번과정에서 작업된 keySet을 iterator에 담기
		Iterator<String> itkey=keySet.iterator();
		
		//3)반복자에 담긴 값을 순차적으로 뽑기
		while(itkey.hasNext()) {
			String key = itkey.next();
			Snack value = hm.get(key);
			System.out.println("key : " +key);
			System.out.println("value : " +value);
			
		}
		
		System.out.println("=========================================");
		
		//2. entryset()이용하는 방법.
		
		//1) hm에 있는 key+value값 모두(Entry) set에 담기 (Entry 집합형태)
		Set<Entry<String, Snack>> entrySet= hm.entrySet(); 
		
		
		for(Entry<String,Snack> entry : hm.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		//2) entrySet에 있는 것들을 Iterator에 담기.
		Iterator<Entry<String, Snack>> inEntry = hm.entrySet().iterator();
		
		
		
		//3)반복자를 이용해서 순차적으로 값을 뽑기.
		while(inEntry.hasNext()) {
			Entry<String, Snack> entry = inEntry.next();
			System.out.println("key : " +entry.getKey());
			System.out.println("value : "+entry.getValue());
		}
		
		
	}
	

}
