package com.test.java.obj.inheritance.cast;

public class Ex47_Casting {
	
	public static void main(String[] args) {
		
		/*
		
			형변환, Type Casting
			- *** 값형과 참조형 간에는 형변환 절대(*****) 불가능
			
			1. 값형(끼리) 형변환
				- 숫자끼리(boolean 제외)
				- byte, short, int, long, float, double, char
				- (): 형변환 연산자 사용
				- 문제 발생 > 오버 플로우(Overflow)
				
			2. 참조형(끼리) 형변환
				- 클래스끼리 형변환
				
			참조형 형변환
			- 상속 관계에 있는 클래스끼리만 가능(***)
			- 직계만 가능
			- 방계는 불가능
			
			1. 업캐스팅. Up Casting
				- 암시적인 형변환
				- 자식 클래스 > (형변환) > 부모 클래스
			
			2. 다운캐스팅. Down Casting
				- 명시적인 형변환
				- 부모 클래스 > (형변환) > 자식 클래스
		
		*/
		
		short s1 = 10; // 원본
		int n1;
		
		n1 = s1;
		
		// 형변환이 성공했는지? > 복사본 출력
		System.out.println(n1);
		
		Parent p1;
		Child c1;
		
		c1 = new Child(); // 원본 역할
		
		// 참조형 변수끼리의 복사 = 주소값 복사
		
		// Parent = Child
		// 부모 = 자식
		// 업캐스팅 > 100% 안전 > 안전하다는 의미???
		p1 = c1;
		//p1 = (Parent)c1; //원래 이런 형식인데 생략해도 암시적 형변환 됨.
		
		// p1 문제 없는지 검증? p1을 가지고 할 수 있는 모든 행동(***) > 문제 발생?
		
		p1.a = 10;
		p1.b = 20;
		
		System.out.println(p1.a);
		System.out.println(p1.b);
		
		Parent p2;
		Child c2;
		
		p2 = new Parent();
		
		// Child = Parent
		// 자식 = 부모
		// 다운 캐스팅 > 불안전 > 명시적
		// 100% 불가능
		c2 = (Child)p2;
		
		// 검증
//		c2.a = 10;
//		c2.b = 20;
//		c2.c = 30;
//		c2.d = 40;
		
		// 다운 캐스팅
		Parent p3;
		Child c3;
		
		c3 = new Child();
		
		p3 = c3;
		
		
		Child c4;
		
		// 다운 캐스팅
		// 100% 안전
		c4 = (Child)p3;
		
		c4.a = 10;
		c4.b = 20;
		c4.c = 30;
		c4.d = 40;
		
		System.out.println(c4.a);
		System.out.println(c4.b);
		System.out.println(c4.c);
		System.out.println(c4.d);

		
		A aa1;
		C cc1;
		
		cc1 = new C(); // 원본(손자)
		
		aa1 = cc1;
		
		aa1.a = 10;
		
		
		B bb1;
		D dd1;
		
		dd1 = new D();
		
		//bb1 = (B)dd1; // 방계는 복사 안 됨
		
		//bb1.a = 10;
		//bb1.b = 20;
		
		
		
	}//main

}

class Parent {
	public int a;
	public int b;
}

class Child extends Parent {
	public int c;
	public int d;
}


class A {
	public int a;
}

class B extends A {
	public int b;
}

class D extends A {
	
}

class C extends B {
	public int c;
}





















