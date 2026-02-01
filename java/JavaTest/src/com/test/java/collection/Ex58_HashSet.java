package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex58_HashSet {

	public static void main(String[] args) {
		
		/*
		
			1. List
			- 순서가 있는 집합
			- 첨자(방번호) + 유일
			- 값 중복을 허용
			
			2. Map
			- 순서가 없는 집합
			- 키(방이름) + 유일
			- 값 중복을 허용
			
			3. Set 
			- 순서가 없는 집합
			- 방을 구분하는 식별자가 없다.(번호x, 이름x) > 방을 구분할 수 없다.
			- 값의 중복을 허용하지 않는다. (******)
		
		*/
		
		//m1();
		//m2();
		//m3();
		m4();
		
		
	}

	private static void m4() {
		
		// User 배열
		HashSet<User> group = new HashSet<User>();
		
		group.add(new User("홍길동", 20));
		group.add(new User("아무개", 22));
		group.add(new User("테스트", 25));
		group.add(new User("홍길동", 20));
		
		System.out.println(group);
		
	}

	private static void m3() {
		
		int a1 = 10;
		int a2 = 20;
		int a3 = 10;
		
		System.out.println(a1 == a2); // false
		System.out.println(a1 == a3); // true
		
		User u1 = new User("홍길동", 20);
		User u2 = new User("아무개", 22);
		User u3 = new User("홍길동", 20);
		User u4 = u1;
		
		// u1과 u3 > 동일인? 동명이인?
		System.out.println(u1.equals(u2)); // false
		System.out.println(u1.equals(u3)); // false
		System.out.println(u1.equals(u4)); // true
		
		System.out.println();
		
		// 사전 확인
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
		System.out.println(u3.hashCode());
		System.out.println(u4.hashCode());
		
		
	}

	private static void m2() {
		
		// 로또 번호 > 난수 + 유일한 번호
		
		Random rnd = new Random();
		
		// Case 1. ArrayList
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for (int i = 0; i < 6; i++) {
			
			int n = rnd.nextInt(45) + 1; //1~45
			
			if (lotto.contains(n)) {
				// 중복됨
				i--;
			} else {
				// 중복안됨
				lotto.add(n);
			}
			
		}
		
		while (lotto.size() < 6) {
			
			int n = rnd.nextInt(45) + 1;
			
			if (!lotto.contains(n))	{
				lotto.add(n);
			}
		}
		
		System.out.println(lotto);
		
		// Case 2. HashSet
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		
		while (lotto2.size() < 6) {
			int n = rnd.nextInt(45) + 1;
			lotto2.add(n); // 중복값 허용x
		}
		
		System.out.println(lotto);
	}

	private static void m1() {
		
		HashSet<String> set = new HashSet<String>();
		
		// 1. 요소 추가
		set.add("사과");
		set.add("딸기");
		set.add("바나나");
		
		// 눈으로 확인 + 개발자만
		System.out.println(set.toString());
		
		// 2. 요소 개수
		System.out.println(set.size());
		
		// Iterator 인터페이스의 구현체
		// 1. 향상된 for문 사용 가능
		// 2. Iterator의 대상 가능
		
		// 3. 요소 읽기
		// - 방 식별 붉능 > 원하는 방만 접근 불가능
		// - 전용 읽기 도구 제공(*****) > Iterator
		for (String item : set) {
			System.out.println(item);
		}
		
		// 전진 커서(cursor) == 이터레이터
		Iterator<String> iter = set.iterator();
		
		System.out.println(iter.hasNext());
		System.out.println(iter.next()); // 한칸 전진 + 데이터 읽음
		
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		
		System.out.println(iter.hasNext());
		//System.out.println(iter.next());
		
		// 처음부터 다시 읽고 싶다..
		System.out.println(set);
		
		iter = set.iterator(); // 다시 만들기(유일한 초기화 방법)
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for (String item : set) {
			System.out.println(item);
		}
	}
	
}

class User {
	
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%d)", this.name, this.age);
	}
	
	
	
	// 값이 동일한 객체를 진짜 같은 객체로 취급하게 하려면..
	// 1. hashCode() 재정의
	// 2. equals() 재정의
	@Override
	public int hashCode() {
		
//		System.out.println("홍길동: " + "홍길동".hashCode());
//		System.out.println("홍길동: " + "홍길동".hashCode());
		
		// 이름과 나이가 동일하면 > 같은 해시코드를 반환
		// - "홍길동20"
		// - "아무개22"
		return (this.name + this.age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// u1.equals(u2)
		//return super.equals(obj); > 메모리 주소값 비교
		
		// 방법1.
//		User u2 = (User)obj;
//		
//		return this.name.equals(u2.getName()) && this.age == u2.getAge();
		
		// 방법2.
		return this.hashCode() == obj.hashCode();
	}
	
	
}




















