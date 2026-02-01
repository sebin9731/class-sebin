package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Ex57_HashMap {
	
	public static void main(String[] args) {
		
		/*
		
			1. List > ArrayList
			2. Map > HashMap
			3. Set > HashSet
			
			List 계열
			- 요소 관리 > 첨자(index) 사용 > 방번호 존재
			- 순서가 있는 집합(방번호 == 요소의 순서)
			ex) 1강의실, 2강의실, 3강의실
			- 스칼라 배열(Scalar Array) - 유일한 첨자를 가짐
			- 요소(Element) = 첨자(index) + 값(value)
			- 첨자(index)는 유일하다.
			- 값(value)은 중복이 가능하다.
			
			Map 계열
			- 요소 관리 > 키(key) 사용 > 방 이름
			- 순서가 없는 집합
			ex) 햇님반, 달님반, 별님반
			- 연관 배열, 사전 구조(Dictionary) - 식별자를 이용
			- 요소(Element) = 키(key) + 값(value)
			- 키(key)는 유일하다.
			- 값(value)은 중복이 가능하다.
		
		*/
		
		//m1();
		//m2();
		m3();
		
		
	}//main

	private static void m3() {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("red", "장미");
		map.put("yellow", "개나리");
		map.put("blue", "라일락");
		map.put("white", "백합");
		
		// Map > 루프
		// Can only iterate over an array or an instance of java.lang.Iterable
		//for (Object o : map) {}
		
		Set<String> keys = map.keySet();
		
		System.out.println(keys);
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		Collection<String> values = map.values();
		System.out.println(values);
		
	}

	private static void m2() {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		// 1. 요소 추가
		map.put("red", "장미");
		map.put("yellow", "개나리");
		map.put("blue", "라일락");
		
		// 2. 요소 개수
		System.out.println(map.size());
		
		// 3. 요소 읽기 > 루프 불가능
		System.out.println(map.get("yellow"));
		
		// 4. 요소 수정
		map.put("yellow", "영춘화");
		System.out.println(map);
		
		// 5. 요소 삭제
		map.remove("yellow");
		System.out.println(map);
		
		// 6. 요소 검색
		System.out.println(map.containsKey("red"));
		System.out.println(map.containsValue("개나리"));
		
		map.clear();
		
		System.out.println(map.isEmpty());
		
		
	}

	private static void m1() {
		
		// 학생 1명 > 국어, 영어, 수학 점수 저장 + 관리
		// 1. 배열
		// 2. ArrayList
		// 3. Class
		// 4. HashMap
		
		// 1. 배열
		// - 집합
		// - 방번호 > 무슨 과목?
		// - 루프 가능
		int[] s1 = new int[3];
		
		s1[0] = 100;
		s1[1] = 90;
		s1[2] = 80;
		
		System.out.println(s1[0] + s1[1] + s1[2]);
		
		// 2. ArrayList
		// - 집합
		ArrayList<Integer> s2 = new ArrayList<Integer>();
		
		s2.add(100);
		s2.add(90);
		s2.add(80);
		
		System.out.println(s2.get(0) + s2.get(1) + s2.get(2));
		
		// 3. Class
		// - 집합
		// - 방번호(x) > 방이름 (o) > 가독성 높음
		// - 초기 비용 발생 > 클래스 설계
		Student s3 = new Student();
		
		s3.setKor(100);
		s3.setEng(90);
		s3.setMath(80);
		
		System.out.println(s3.getKor() + s3.getEng() + s3.getMath());
		
		// 4. HashMap
		// - 집합
		// - 방번호(x) > 방이름 (o) > 가독성 높음
		// - 초기 비용 무료
		HashMap<String, Integer> s4 = new HashMap<String, Integer>();
		
		s4.put("kor", 100);
		s4.put("eng", 90);
		s4.put("math", 80);
		
		System.out.println(s4.get("kor") + s4.get("eng") + s4.get("math"));
		
	}

}

class Student {
	private int kor;
	private int eng;
	private int math;
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
}









