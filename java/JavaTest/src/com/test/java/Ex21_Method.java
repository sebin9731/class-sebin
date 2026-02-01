package com.test.java;

public class Ex21_Method {
	
	public static void main(String[] args) {
		
		//Ex21_Method.java
		
		/*
		
			재귀 메서드, Recursive Method
			- 재귀 구조를 가지는 메서드
			- 자기가 자기를 호출하는 구조
			- 어렵다. > 머릿속으로 상상하기 힘들다.
			- 트리 구조(자료 구조) > 탐색에 사용
		
		*/
		//m2();
		//m1();
		
		//팩토리얼
		//4! = 4 x 3 x 2 x 1 = 24
		//4! = 24
		
		//요구사항] 팩토리얼 메서드를 구현하시오.
		int n = 4;
		int result = factorial(n);
		
		System.out.printf("%d! = %d\r\n", n, result);
		
	} //main
	
	public static int factorial(int n) {
		
		return (n == 1) ? 1 : n * factorial(n - 1);
	}
	
	
	public static void m1() { //재귀 메서드
		System.out.println("m1");
		m1(); //재귀 호출
	}
	
//	public static void m2() {
//		System.out.println("m2");
//		m1();
//	}

}




















