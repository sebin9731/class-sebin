package com.test.java.obj.inheritance;

public class Ex53_Generic {
	
	public static void main(String[] args) {
		
		
		//m1();
		//m2();
		m3();
	}

	private static void m3() {
		
		//Item item1 = new Item();
		
		// Object
		//item1.c = 10;
		
		
		Item<String> item2 = new Item<String>();
		item2.c = "문자열";
		
		Item<Integer> item3 = new Item<Integer>();
		item3.c = 100;
		
		
		Pen<String> p1 = new Pen<String>();
		p1.a = "문자열";
		p1.b = "문자열";
		p1.c = "문자열";
		
		Pen<Boolean> p2 = new Pen<Boolean>();
		p2.a = true;
		p2.b = false;
		p2.c = true;
		
		
		Desk<String> d1 = new Desk<String>();
		d1.setData("문자열");
		System.out.println(d1.getData());
		
		
		Laptop<String, Integer> l1 = new Laptop<String, Integer>("문자열", 10);
		System.out.println(l1.getA());
		System.out.println(l1.getB());
		
	}

	private static void m2() {
		
		// 참조형 데이터
		Object o1 = new Object();
		Object o2 = new LG100();
		
		// 값형 데이터
		int n1 = 10;
		
		// 박싱(Boxing) 발생
		Object o3 = 10; // Integer.valueOf(10) + new Integer(10)
		Object o4 = true; // Boolean.valueOf(true)
		
		System.out.println(n1 * 2);
		System.out.println((Integer)o3 * 3);
		System.out.println((int)o3 * 3); // 언박싱(Unboxing)
		
	}

	private static void m1() {
		
		int a = 10;
		Integer b = new Integer(20); // deprecated
		Integer c = Integer.valueOf(30);
		Integer d = 40;
		
		
		System.out.println(a * 2);
		System.out.println(b * 2);
		System.out.println(c * 2);
		System.out.println(d * 2);
		
	}

}


// 제네릭 클래스
// - <>: 인자리스트, 메서드의 test(int a)
// - T: 매개변수 > 타입변수 > 변수에 값을 저장(x), 자료형을 저장(o)
//	 - T = String
//	 - T = LG100
//	 - T = HP200
//	 - T = int // 에러
//	 - T = boolean // 에러
//	 - T = Integer
//	 - T = Boolean

class Item<T> {
	
	public int a;
	public String b;
	public T c;
	
	public void ccc() {
		
	}
	
}

class Pen<T> {
	public T a;
	public T b;
	public T c;
}

class Desk<T> {
	
	private T data;

	public T getData() {
		
		// 지역 변수 적용 > 절대 금지!!
		//T a;
		
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}

class Laptop<T, U> {
	
	private T a;
	private U b;
	
	public Laptop(T a, U b) {
		this.a = a;
		this.b = b;
	}
	
	public T getA() {
		return a;
	}
	
	public U getB() {
		return b;
	}
	
}













