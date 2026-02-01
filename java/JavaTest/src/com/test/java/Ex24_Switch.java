package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex24_Switch {
	
	public static void main(String[] args) throws IOException {
		
		
		/*
		
			switch문, switch case문
			- 조건: 정수, 문자열, 열거형
			
			switch (조건) {
				case 값:
					코드;
					break;
				[case 값:
					코드;
					break;] x N
				[default:
					코드;
					break;]   --> default는 생략이 가능하고, 사용할 시 한 번만 사용 가능
			}
		
		*/
		
		//m1();
		//m2();
		//m3();
		m4();
		
	} //main

	private static void m4() {
		
		// 형변환
		// - 숫자형(6+1)끼리만 가능
		
		// 'A' > 65
		System.out.printf("%c\r\n", 65);
		System.out.println((char)65);
		System.out.println((int)'A');
		
		char c1 = 'B'; //2byte
		byte b1;
		short s1; //2byte
		
		// short(2) = char(2)
		// 명시적 현상은 작은형 = 큰형일 때 일어남
		s1 = (short)c1;
		
		System.out.println(s1); //66
		
		char c2;
		short s2 = 67; //'C'
		
		// char(2) = short(2)
		// 작은형 = 큰형
		c2 = (char)s2;
		
		// *** 문자 코드를 저장할 숫자형은 int이다.
		// char를 숫자형으로 바꿀 때는 byte, short가 아닌 int로 바꿀 수 있음
		
	}

	private static void m3() {
		
		// 달력 > 마지막 일?
		
		int month = 5;
		int lastDay = 0;
		
		if (month == 1 || 
			month == 3 || 
			month == 5 || 
			month == 7 || 
			month == 8 || 
			month == 10 || 
			month == 12) {
			lastDay = 31;
		} else if (month == 4 || 
					month == 6 || 
					month == 9 || 
					month == 11) {
			lastDay = 30;
		} else {
			lastDay = 28;
		}
		
		System.out.println(lastDay);
		
		
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastDay = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				lastDay = 30;
				break;
			case 2:
				lastDay = 28;
				break;
		}
		
	}

	private static void m2() throws IOException {
		
		// 요구사항] 자판기
		// - 메뉴 출력 > 음료 선택 > 가격 출력 
		// - 가격 변동 > 앞으로 평생 콜라와 사이다는 가격을 동일하게 판매
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("=========================");
		System.out.println("         자판기          ");
		System.out.println("=========================");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 박카스");
		System.out.println("-------------------------");
		System.out.print("번호 선택: ");
		
		String input = reader.readLine();
		
		if (input.equals("1") || input.equals("2")) {
			System.out.println("800원입니다.");
		} else if (input.equals("3")) {
			System.out.println("500원입니다.");
		}
		
		
		switch (input) {
			case "1":
			case "2":
				System.out.println("800원입니다.");
				break;
			case "3":
				System.out.println("500원입니다.");
				break;
		}
		
	}

	private static void m1() {
		
		// 숫자 1개 입력 > 한글로 출력
		// - 1 > 하나
		// - 2 > 둘
		// - 3 > 셋
		
		int num = 1;
		
		if(num == 1) {
			System.out.println("하나");
		} else if (num == 2) {
			System.out.println("둘");
		} else if (num == 3) {
			System.out.println("셋");
		} else {
			System.out.println("나머지 숫자");
		}
		
		
		switch (num) {
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
			default:
				System.out.println("나머지 숫자");
				break;
		}
		
		int score = 95;
		
		if (score >= 60 && score <= 100) {
			System.out.println("합격");
		} else if (score >= 0 && score < 60) {
			System.out.println("불합격");
		}
		
		// *** switch문은 범위 조건에는 부적합하다.
//		switch (score) {
//			case 값:
//				System.out.println("합격");
//				break;
//			case 값:
//				System.out.println("불합격");
//				break;
//		}
		
	}

}
