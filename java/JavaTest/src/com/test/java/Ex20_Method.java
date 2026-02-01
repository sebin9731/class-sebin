package com.test.java;

public class Ex20_Method {
	
	public static void main(String[] args) {
		
		//Ex20_Method.java
		
		/*
		
			메서드 오버로딩, Method Overloading
			- 같은 이름의 메서드를 여러개 만드는 기술
			
			왜?
			- 사람을 위한 기술
			- 성능 향상(X)
			
			
			
			메서드 오버로딩 구현 조건 가능
			1. 매개변수의 개수
			2. 매개변수의 자료형
			
			메서드 오버로딩 구현 조건 불가능
			1. 매개변수의 이름(변수명)
			2. 반환값의 자료형
			
			
			메서드 선언
			1. public static void test() {}				//O
			2. public static void test() {}				//X, 1번
			3. public static void test(int n) {}		//O
			4. public static void test(int m) {}		//X, 3번
			5. public static void test(int n, int m) {}	//O
			6. public static void test(String s) {}		//O
			7. public static void test(byte n) {}		//O
			8. public static int test() {}				//X, 1번
			
			
			메서드 호출하기(***)
			test();				//1번 호출
			test(10);			//3번 호출
			test(10, 20);		//5번
			test("문자열");		//6번
			test(10);			//7번(X) > 3번(O)
			test((byte)10); 	//7번(O)
			int result = test();//8번(X) > 1번(O)
			
		
		*/
		
		//요구사항] 화면에 선을 그리는 메서드를 구현하시오.
		//요구사항] 선 모양(***)
		drawLine();
		System.out.println("  성적표");
		drawLine2();
		
		drawLine();
		drawLine("+");
		
		
		System.out.println(10);
		System.out.println("문자열");
		System.out.println(true);
		
		
	}//main
	
	public static void test() {
		
	}
	
	public static void drawLine() {
		System.out.println("==========");
	}
	
	public static void drawLine2() {
		System.out.println("**********");
	}
	
	public static void drawLine(String s) {
		
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.println(s);
		
	}
	
	public static void m1() {
		
	}
	

}









