package com.test.java.obj;

import java.util.Random;
import java.util.Scanner;

public class Ex54_Exception {
	
	public static void main(String[] args) {
		
		/*
		
			예외, Exception
			- 런타임 오류
			- 컴파일(x) > 실행(o)
			- 테스터 or 개발자 > 경험 근거 > 미리 예측 > 사전 조치
			
			예외 처리, Exception Handling
			1. 제어문 사용
			2. 전용문 사용
		
		*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		
		try {
			//m5();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		m6();
		
	}//main

	private static void m6() {
		
		// 예외 던지기
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자(짝수만): ");
		int n = scan.nextInt();
		
		if (n % 2 == 0) { // 예외 조건
			System.out.println("짝수: " + n); // 비즈니스 코드
		} else {
			System.out.println("홀수 입력 불가"); // 예외 처리 코드
		}
		
		
		try {
			
			if (n % 2 == 1) {
				throw new Exception(); // 예외 던지기
			}
			
			System.out.println("짝수: " + n);
		} catch (Exception e) {
			System.out.println("홀수 입력 불가");
		}
		
	}

	private static void m5() throws Exception {
		
		// 예외 미루기
		// - 특정 메서드 내에 발생한 예외를 해당 메서드 내에서 직접 처리하지 않고, 그 예외 처리에 대한 책임을 이 메서드를 호출한 쪽으로 넘기는 기술
		int n = 0;
		System.out.println(100 / n); // new ArithmeticException();
		
	}

	private static void m4() {
		
		int n = 10; // 사용자 입력
		
		try { // 업무 영역 
			// 엑셀 + 파일 열기
			System.out.println(100 / n);
			// 엑셀 + 파일 닫기
			return; // 빈 리턴문(메서드 종료)
		} catch (Exception e) { // 예외 처리 영역
			System.out.println("예외 처리");
		} finally { // 클린 코드 영역(자원 해제 코드)
			// 무조건 실행 블럭(성공/실패)
			System.out.println("finally");
		}
		
		System.out.println("엑셀 + 파일 닫기");
		System.out.println("종료");
		
	}

	private static void m3() {
		
		try {
			
			int num = 0;
			// throw new ArithmeticException()
			System.out.println(100 / num);
			
			int[] nums = { 10, 20, 30 };
			// throw new ArrayIndexOutOfBoundsException()
			System.out.println(nums[0]);
			
			Random rnd = new Random();
			// throw new NullPointerException()
			System.out.println(rnd.nextInt());
			
		} catch (ArithmeticException e) {
			System.out.println("0입력 > 김대리");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("첨자 오류 > 박과장");
			
		} catch (NullPointerException e) {
			System.out.println("널 참조 > 최부장");
		} catch (Exception e) {
			System.out.println("예외 발생");
		}
		
	}

	private static void m2() {
		
		//int num = 10;
		int num = 0;
		try {
			System.out.println(100 / num);
		} catch (Exception e) {
			System.out.println("0으로 나누기 > 김대리 연락");
		}
		
		int[] nums = { 10, 20, 30 };
		try {
			//System.out.println(nums[0]);
			System.out.println(nums[5]);
		} catch (Exception e) {
			System.out.println("배열 첨자 오류 > 박과장 연락");
		}
		
		//Random rnd = new Random();
		Random rnd = null;
		try {
			System.out.println(rnd.nextInt());
		} catch (Exception e) {
			System.out.println("널 참조 오류 > 최부장 연락");
		}
		
	}

	private static void m1() {
		
		// 요구사항] 숫자를 입력받아 산술 연산을 하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int num = scan.nextInt();
		
		// 선조건 > 후처리
		
		if (num != 0) { // 예외 조건
			// 비즈니스 코드(업무 코드)
			System.out.println(111);
			System.out.printf("100 / %d = %d\r\n", num, 100 / num);
			System.out.println(222);
		} else {
			// 예외 처리 코드
			System.out.println("0을 입력하지 마시오.");
		}
		
//		if (num == 0) { // 예외 조건
//			// 예외 처리 코드
//			System.out.println("0을 입력하지 마시오.");
//		} else {
//			// 비즈니스 코드(업무 코드)
//			System.out.printf("100 / %d = %d\r\n", num, 100 / num);
//		} // 권장하지 않음
		
		
		// try catch문
		// try catch finally문
		
		// 선실행 > (에러 발생) > 후조치
		
		try {
			// 비즈니스 코드(업무 코드)
			System.out.println(111);
			System.out.printf("100 / %d = %d\r\n", num, 100 / num);
			System.out.println(222);
		} catch (Exception e) {
			// 예외 처리 코드
			// - Exception e: 예외 발생 상황에 대한 정보 객체
			System.out.println("0을 입력하지 마시오.");
			//System.out.println(e);
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		//System.out.println(100 / 0);
		//System.out.println(100 / 0.0);
		
	}

}





















