package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25_For {
	
	public static void main(String[] args) throws IOException {
		
		//Ex25_For.java
		/*
		
			반복문
			- 특정 코드를 개발자가 원하는 횟수만큼 반복한다.
			
			for (초기식; 조건식; 증감식) {
				코드;
			}
		
		*/
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		
		//m9();
		//m10();
		//m11();
		
		//m12();
		//m13();
		//m14();
		//m15();
		m16();
		
		
	} //main

	private static void m16() {
		
		// 프로그램 실행(Run): Ctrl + F11
		// 프로그램 실행(Debug): F11 > F6
		
		// Breakpoint 찍기
		System.out.println("시작");
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				continue;
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("끝");
	}

	private static void m15() {
		
		// 다중 for + break/continue
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				
				// if (i == 5) {
				// if (j == 5) {
				// if (i ==5 || j == 5) {
				if (j == 5) {
					//break;
					continue;
				}
				
				System.out.printf("i: %d, j: %d\n", i, j);
				
			}
		}
		
	}

	private static void m14() {
		
		// 구구단
		// - 2단 ~ 9단
		
		for (int j = 2; j <= 9; j++) {
			//int dan = 2;
			
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %2d\n", j, i, j * i);
			}
			System.out.println();
		}
		
	}

	private static void m13() {
		
		// - (단일) for문
		// - 중첩 for문 > 2중 for문, 3중 for문.. N중 for문
		
		// 단일 for문
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
		
		// 2중 for문
		for (int i = 0; i < 10; i++) { // 대회전
			for (int j = 0; j < 10; j++) { // 소회전
				//System.out.println("출력물"); // 몇 번 실행 100번
				System.out.printf("i: %d, j: %d\n", i, j);
			}
		}
		
		// 3중 for문
		for (int i = 0; i < 24; i++) { // 대회전 > 시침
			for (int j = 0; j < 60; j++) { //중회전 > 분침
				for (int k = 0; k < 60; k++) { // 소회전 > 초침
					// 문장 > 1000번
					System.out.printf("i: %d, J: %d, k: %d\n", i, j, k);
				}
			}
		}
		
		/*
		
			학교
			
			for (학년) {
				for (반) {
					for (번호) {
					
					}
				}
			}
			
			아파트
			
			for (단지) {
				for (동) {
					for (층) {
						for (호수) {
						
						}
					}
				}
			}
		
		*/
	}

	private static void m12() {
		
		//난수 만들기
		//- 임의의 수 만들기
		
		//1. Math 클래스
		//2. Random 클래스(Math 감싼 클래스)
		
		//System.out.println(Math.PI);
		//- Math.abs(5)
		//- Math.ceil(0)
		//- Math.round(0)
		//- Math.floor(0)
		//- Math.exp(0)
		//- Math.random()
		//- Math.sin(0)
		//- Math.cos(0)
		//- Math.tan(0)
		
		//0.8931524182776694
		//0.4942994518231305
		//0.0 ~ 0.999999999999999
		//0이상 1미만
		//Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0. Returned values are chosen pseudorandomly with (approximately) uniform distribution from that range.
		//System.out.println(Math.random());
		
		for (int i=0; i<10; i++) {
			
			//System.out.println(Math.random());
			
			//가공 > 1 ~ 10 정수
			//System.out.println(Math.random() * 10);
			//System.out.println((int)(Math.random() * 10));
			//System.out.println((int)(Math.random() * 10) + 1);
			
			//주사위 > 1 ~ 6
			//System.out.println((int)(Math.random() * 6) + 1);
			
			//3 ~ 8
			//0 ~ 5
			System.out.println((int)(Math.random() * 6) + 3);
			
		}		
		
	}

	private static void m11() {
		
		//중학교 > 선생님 + 학생 상담(30명)
		for (int i=1; i<=30; i++) {
			
//			if (i >= 16) {
//				break;
//			}
			
			if (i == 10 || i == 15 || i == 19) {
				continue; //skip
			}
			
			System.out.println(i + "번 학생 상담 중..");
			
		}
				
	}

	private static void m10() {
		
		//분기문
		//- break, continue
		//- switch문 반복문와 같이 사용
		//- if문 제외(인식 못함)
		
		//1. break
		//- 자신이 포함된 제어문을 탈출하는 역할
		//- 중단하는 역할(Stop)
				
		//2. continue
		//- 자신이 포함된 제어문의 처음으로 돌아간다.
		//- 잠시 건너뛰기 역할(Skip)
		
//		for (int i=1; i<=10; i++) {
//			
//			if (i == 5) {
//				break;
//			}
//			
//			System.out.println(i);
//
//		}
		
		for (int i=1; i<=10; i++) {
			
			if (i == 5) {
				continue;
			}
			
			System.out.println(i);

		}
		
	}

	private static void m9() throws NumberFormatException, IOException {
		
		//무한 루프, Infinite Loop
		//1. 개발자 실수
		//2. 개발자 의도적으로
		//	a. 반복 횟수 미정
		//	b. 진짜로 무한 루프가 필요할 때
		
		//21억 바퀴
//		for (int i=0; i<10; i--) {
//			System.out.println("실행문");
//		}
		
		//고의로 무한루프 생산하기
		//for (int i=0; true; i++) {
		//for (int i=0; ; i++) {
//		for (;;) {
//			System.out.println("실행문");
//		}
		
		
		//사용자가 숫자 입력 x ?번 > 합 구하기
		//- 반복 횟수 미정 > 무한 루프
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		
		for (;;) {
			
			//숫자: 0 > 그만 입력하고 싶다.
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			
			if (num == 0) {
				break;
			}
			
			sum += num;
		
		}
		
		System.out.println(sum);
		
		
		/*
		
			for (;;) {
				게임실행코드;
			}
		
		*/
		
	}

	private static void m8() throws NumberFormatException, IOException {
		
		//요구사항] 사용자 보고싶은 구구단 출력
		/*
		
			단: 5
			
			5 x 1 =  5
			5 x 2 = 10
			5 x 3 = 15
			..
			5 x 9 = 45
		
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단(2~9): ");
		int dan = Integer.parseInt(reader.readLine());
		
		for (int i=1; i<10; i++) {
			System.out.printf("%d x %d = %2d\r\n"
								, dan, i, dan * i);
		}
		
	}

	private static void m7() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//요구사항] 사용자 숫자 10개 입력 > 수의 합
		int sum = 0;
		
		for (int i=0; i<10; i++) {
			
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			sum += num;			
			
		}
		
		System.out.println(sum);
		
	}

	private static void m6() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//요구사항] 사용자 숫자 입력 > 1~사용자입력숫자까지의 합
		System.out.print("숫자: ");
		
		//String input = reader.readLine();
		//int num = Integer.parseInt(input);
		
		int num = Integer.parseInt(reader.readLine());
		int sum = 0; //누적 변수
		
		for (int i=1; i<=num; i++) {
			//System.out.println(i);
			sum += i;
		}
		
		System.out.printf("1 ~ %,d = %,d\r\n", num, sum);
		
	}

	private static void m5() {
		
		//요구사항] 1~10까지의 합
		
		int sum = 0; //누적 변수
		//sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		
		//1..10 > 루프 변수값
		for (int i=1; i<=10; i++) {
			//System.out.println(i);
			sum = sum + i;
			
			//i(1) >  1 = 0 + 1
			//i(2) >  3 = 0 + 1 + 2
			//i(3) >  6 = 0 + 1 + 2 + 3
			//i(4) > 10 = 0 + 1 + 2 + 3 + 4
			//..
			//i(10)> 55 = 0 + ... + 9 + 10
		}
		
		System.out.println(sum);
		
	}

	private static void m4() {
		
		//반복문
		//1. 반복 횟수 > 10
		//2. 루프 변수 > 90 > 루프 변수 값의 변화(*****)
		
		//요구사항] 숫자 1~10까지 출력
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		System.out.println();
		
		
		int num = 1;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		System.out.println();
		
		
		num = 1;
		
		for (int i=0; i<10; i++) {
			System.out.println(num + "," + i);
			num++;
		}
		System.out.println();
		
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		for (int i=1; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
		for (int i=2; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
	}

	private static void m3() {
		
		//반복문
		//1. 반복 횟수 > 10
		//2. 루프 변수 > 90
		
		for (int i=0; i<5; i++) {
			//0, 1, 2, 3, 4
			System.out.println("실행문");
		}
		System.out.println();
		
		
		for (int i=1; i<=5; i++) {
			//1, 2, 3, 4, 5
			System.out.println("실행문");
		}
		System.out.println();
		
		
		for (int i=1; i<6; i++) {
			//1, 2, 3, 4, 5
			System.out.println("실행문");
		}
		System.out.println();
		
		
		
		for (int i=5; i<10; i++) {
			System.out.println("실행문");
		}
		System.out.println();

		
		
		for (int i=5; i>0; i--) {
			System.out.println("실행문");
		}
		System.out.println();

		
		
		for (int i=0; i<25; i+=5) {
			System.out.println("실행문");
		}
		System.out.println();
		
		
	}

	private static void m2() {
		
		//지역 변수
		//- 메서드/제어문 내에서 선언한 변수
		
		int a = 10; //지역 변수(m2)
		System.out.println("a: " + a);
		int c = 0;
		
		if (a > 0) {
			
			int b = 20; //지역 변수(if)
			System.out.println("b: " + b);
			System.out.println("a: " + a);
			c = b;
			
		}
		
		System.out.println("a: " + a);
		//System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		
		
	}

	private static void m1() {
		
		//요구사항] "안녕하세요." x 5회 출력
		//수정사항] "반갑습니다." 수정
		//추가사항] "반갑습니다." x 100회 출력
		
		//Case A.
		System.out.println("안녕하세요."); //Ctrl + Alt + 방향키(아래, 위) 
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요."); //Ctrl + D
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요."); //Alt + 방향키
		System.out.println();
		
		//Case B.
		hello();
		hello();
		hello();
		hello();
		hello();
		System.out.println();
		
		//Case C.
		//- i: 루프(Loop) 변수
		//- 초기식: 루프 변수 초기화
		//- 조건식: 루프 반복을 위한 조건
		//- 증감식: 루프 조건에 대한 변화
		for (int i=0; i<5; i++) {
			System.out.println("안녕하세요.");
		}
		
		//System.out.println(i);		
		
	}

	private static void hello() {
		System.out.println("안녕하세요.");
	}

}
















