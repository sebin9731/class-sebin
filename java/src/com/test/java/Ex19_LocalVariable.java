package com.test.java;

public class Ex19_LocalVariable {
	
	int num;
	
	public static void main(String[] args) {
		
		//Ex19_LocalVariable.java
		/*

			자바 변수의 종류
			- 선언된 위치, 역할 차이
			
			1. 멤버 변수, Member Variables
				- 클래스 수업
			
			2. 지역 변수, Local Variables
				- 지금까지의 모든 변수
				- 메서드 내에서 선언한 변수
				- 변수의 영역(Scope) > 변수를 사용할 수 있는 영역(***)
			
			지역 변수의 생명 주기, Life Cycle
			- 변수가 언제 태어나서(메모리 생성)~언제 죽는지(메모리 해제)
			- 생성: 변수 선언문이 실행되는 순간
			- 소멸: 변수 선언문이 포함된 자신의 영역을 제어가 벗어날 때
			
			
		*/
		
		//The local variable a may not have been initialized
		//int a;
		//System.out.println(a);
		
		
		//int a = 30;
		//System.out.println(a);
		
		//m1();
		
		//name cannot be resolved to a variable
		//System.out.println(name);
		
		//m2();
		
		
		m1();
		m2();
		
	}//main
	
	public static void m1() { //{}: Scope, Block
		
		//지역 변수
		int a = 10;
		System.out.println(a);
		//int a = 20;
		
		String name = "홍길동";
		
	}
	
	public static void m2() {
		
		int a = 20;
		System.out.println(a);
		
	}

}














