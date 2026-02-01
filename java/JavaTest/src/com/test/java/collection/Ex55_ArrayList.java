package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex55_ArrayList {
	
	public static void main(String[] args) {
		
		/*
		
			Collection, 컬렉션
			 - 배열의 업그레이드 버전
			 - JCF, Java Collection Framework
			 - 업그레이드?
			 	1. (상황에 따른) 성능 향상
			 	2. (상황에 따른) 사용법 향상
			 	3. 길이 가변 > 길이가 늘었다 줄었다 가능
			 
			 	
			 컬렉션 종류
			 
			 1. List 계열
			 	- ArrayList(*****)
			 	- LinkedList
			 	- Queue
			 	- Stack
			 	- Vector
			 
			 2. Set 계열
			 	- HashSet(***)
			 	- TreeSet
			 
			 3. Map 계열
			 	- HashMap(***)
			 	- TreeMap
			 	- Properties
			 	- HashTable
			 	
			 
			 ArrayList 클래스
			 - Iterable<E>, Collection<E>, List<E>
			 - Resizable-array implementation of the List interface.
			 
		*/
		
		//m1();
		//m2();
		//m3();
		m4();
		
	}//main

	private static void m4() {
		
		// 성적표
		// - 학생 5명의 국영수 성적표 > 학생명, 국어, 영어, 수학
		// 1. 배열		> 길이 고정
		// 2. ArrayList	> 길이 가변
		
		Score s1 = new Score();
		
//		s1.setName("홍길동");
//		s1.setKor(100);
//		s1.setEng(90);
//		s1.setMath(80);
//		
//		System.out.println(s1.getTotal());
//		System.out.println(s1.getAvg());
		
		// 더미(dummy) 데이터
		
		// 학생 명단
		ArrayList<Score> list = new ArrayList<Score>();
		
		String[] names = { "홍길동", "아무개", "강아지", "고양이", "병아리" };
		Random rnd = new Random();
		
		for (int i = 0; i < 5; i++) {
			// 1회전 > 학생 1명 > Score 객체 1개
			Score s = new Score();
			
			s.setNo(i + 1);
			s.setName(names[i]);
			
			// 60 ~ 100
			// (0 ~ 40) + 60
			s.setKor(rnd.nextInt(41) + 60);
			s.setEng(rnd.nextInt(41) + 60);
			s.setMath(rnd.nextInt(41) + 60);
			
			list.add(s);
			
		}
		
		// 출력
		System.out.println("======================================================");
		System.out.println("                       성적표");
		System.out.println("======================================================");
		System.out.println("[번호]\t[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		for (Score s : list) {
			System.out.printf("%5d\t%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\r\n", s.getNo(), s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAvg());
		}
		
	}

	private static void m3() {

		//int[] a1 = new int[3];
		//int a2[] = new int[3];
		
		int[]     ns1 = new int[3];
		int[][]   ns2 = new int[2][3];
		int[][][] ns3 = new int[2][3][4];
		
		// int[] ns1
		ArrayList<Integer> ms1 = new ArrayList<Integer>();
		ns1[0] = 10;
		ms1.add(10);
		
		// int[][] ns2
		ArrayList<ArrayList<Integer>> ms2 = new ArrayList<ArrayList<Integer>>();
		ns2[0][0] = 10;
		ms2.add(new ArrayList<Integer>()); // ***
		ms2.get(0).add(10); // **
		System.out.println(ms2.get(0).get(0)); // **
		
		// int[][][] ns3
		ArrayList<ArrayList<ArrayList<Integer>>> ms3 = new ArrayList<ArrayList<ArrayList<Integer>>>();
		
	}

	private static void m2() {
		
		ArrayList<String> list = new ArrayList<String>();
		
		// 1. 요소 추가하기
		// - boolean add(T value)
		// - 배열의 마지막 방에 추가 > Append Mode
		list.add("사과");
		list.add("바나나");
		list.add("귤");
		list.add("파인애플");
		list.add("망고");
		
		// 2. 요소 개수
		// - 추가한 요소의 총 개수 = 배열의 길이 역할
		// - int size()
		System.out.println(list.size());
		
		// 3. 요소 읽기
		// - T get(int index)
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.get(4));
		//System.out.println(list.get(5));
		
		// 4. 요소 수정
		// - T set(int index, T newValue)
		// - list[2] = "파파야"
		list.set(2, "파파야");
		System.out.println(list.get(2));
		
		// 5. 요소 삭제
		// - 방 없애기
		// - T remove(index index)
		// - boolean remove(Object o)
		// - 시프트 발생(********)
		
		list.add("파파야");
		
		System.out.println(list.get(4));
		
		System.out.println(list);
		list.remove(2);
		//list.remove("파파야");
		System.out.println(list);
		
		System.out.println(list.get(4));
		
		// 6. 요소 추가
		// - Insert Mode
		// - 새치기. 원하는 위치에 요소 추가
		// - 시프트 발생
		// - void add(int index, T value)
		
		System.out.println();
		System.out.println(list);
		list.add(2, "포도");
		System.out.println(list);
		
		// 7. 요소 검색
		// - int indexOf(T value)
		// - int lastIndexOf(T value)
		// - boolean contains(T value)
		System.out.println(list.indexOf("파인애플"));
		
		// 8. 탐색
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		// 향상된 for문, Enhanced for statement
		// foreach (변수 : 집합) {
		// for (변수 in 집합) {
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println();
		
		
		// 9. 초기화
		// - 모든 요소 삭제 > 모든 방.remove()
		// - void clear()
		
		System.out.println(list);
		list.clear();
		//
		list = new ArrayList<String>();
		System.out.println(list);
		
		// 10. 빈배열 확인
		// - boolean isEmpty()
		System.out.println(list.isEmpty());
		
		list.add("사과");
		
		System.out.println(list.isEmpty());
	}

	private static void m1() {
		
		// 순수 배열
		// - 타입 몇시(int)
		// - 길이 명시(3)
		int[] nums1 = new int[3];
		
		// 요소 접근 > 첨자(index) 사용
		nums1[0] = 10; // Indexer(인덱서)
		nums1[1] = 20;
		nums1[2] = 30;
		
		System.out.println(nums1[0]);
		System.out.println(nums1[1]);
		System.out.println(nums1[2]);
		System.out.println(nums1.length);
		System.out.println();
		
		// 컬렉션(ArrayList)
		//ArrayList nums2 = new ArrayList();
		// - 타입 명시(제네릭)
		// - 길이 없음 > 가변(*****)
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		
		// 요소 접근 > Append
		nums2.add(10); // 0번째 방
		nums2.add(20); // 1번째 방
		nums2.add(30); // 2번째 방
		
		System.out.println(nums2.size());
		System.out.println(nums2.get(0));
		System.out.println(nums2.get(1));
		System.out.println(nums2.get(2));
		
		nums2.add(40);
		nums2.add(50);
		System.out.println(nums2.size());
		
		System.out.println();
		
		System.out.println(Arrays.toString(nums1));
		System.out.println(nums2);
		System.out.println(nums2.toString());
		
	}

}

// 학생 1명
class Score {
	
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	
	// 계산된 프로퍼티
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	public double getAvg() {
		return this.getTotal() / 3.0;
	}
	
}















