package com.test.java;

public class Ex23_If {
	
	public static void main(String[] args) {
		
		/*
		
			제어문
			- 수많은 명령어 > 명령어의 실행 순서 > 위에서 아래로..
			- 제어의 흐름을 통제하는 도구
			- 조건 제어, 반복 제어, 분기 제어
			
			1. 조건문
				- 개발자가 조건을 제시한 후 결과에 따라 흐름을 제어
				a.  if
				b. switch
				
			2. 반복문
				- 특정 코드를 원하는 횟수만큼 반복 제어
				a. for
				b. while
				c. do while
				d. for
			
			3. 분기문
				- 코드의 흐름을 원하는 곳으로 이동
				a. break
				b. continue
				c. goto(JDK 1.5 폐기)
		
		*/
		
		//m1();
		//m2();
		m3();
		
	} // main
	
	private static void m3() {
		
		// 성적(0~100) 입력 > 유효성 검사!! > 합격/불합격 > 60점 이상 합격
		int score = 95;
		
		//1.
//		if (score >= 60) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
		
		//2.
//		if (score >= 60 && score <= 100) {
//			System.out.println("합격");
//		} else if (score >= 0 && score < 60) {
//			System.out.println("불합격");
//		} else {
//			System.out.println("점수는 0~100 이내로 입력하시오.");
//		}
//		
		//3. 중첩된 if문, nested if statement
		if (score >= 0 && score <= 100) {
			
			// 올바른 성적 > 처리
			if (score >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
			
		} else {
			System.out.println("점수는 0~100 이내로 입력하시오.");
		}
		
	}

	private static void m2() {
		
		// 출근 > 기상 몇 시?
		int hour = 6;
		
		if (hour < 6) {
			System.out.println("지하철을 타고 출근한다.");
		} else if (hour >= 6 && hour < 7) {
			System.out.println("버스를 타고 출근한다.");
		} else if (hour >= 7 && hour < 8) {
			System.out.println("택시를 타고 출근한다.");
		} else {
			System.out.println("병가를 낸다.");
		}
		
		// 유지보수가 쉬움
		if (hour < 6) {
			System.out.println("지하철");
		} else if (hour < 7) {
			System.out.println("버스");
		} else if (hour < 8) {
			System.out.println("택시");
		} else {
			System.out.println("병가");
		}
		
	}

	public static void m1() {
		
		/*
		
			if문
			- 개발자가 조건을 제시한 후 결과에 따라 흐름을 제어
			- 조건식 > boolean 값을 가지는 표현식
			
			if (조건식) {
				코드;
			}
			
			
			if (조건식) {
				코드;
			} else {
				코드;
			}
			
			
			다중 조건문
			
			if (조건식) {
				코드;
			} else if (조건식) {
				코드;
			} else if (조건식) {
				코드;
			} else {
				코드;
			}
			
			
			if (조건식) {
				코드;
			} [else if (조건식) {
				코드;
			}] x N
			else {
				코드;
			}
		
		*/
		
		// 사용자 숫자 입력 > 조건
		int num = -5;
		
		String result = num > 0 ? "양수" : "양수아님";
		System.out.printf("%d는 %s입니다.\n", num, result);
		
		System.out.println(1);
		
		if (num > 0) {
			System.out.println(2);
		}
		
		System.out.println(3);
		
		
		num = 5;
		
		if (num > 0) {
			// 참 블럭
			System.out.println("양수");
		} else {
			// 거짓 블럭
			System.out.println("양수아님");
			
		}
		
		num = 10;
		
		if (num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
		
	} // m1
	
	
	

}
