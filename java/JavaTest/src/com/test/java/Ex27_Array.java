package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Calendar;

import javax.annotation.processing.SupportedSourceVersion;

public class Ex27_Array {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		
			배열, Array
			- 자료 구조 > 데이터를 저장하는 물리적 구조
			- 데이터의 집합 > 변수들을 모아놓은 집합
			- 같은 자료형을 가지는 데이터(요소)의 집합
			
			int[] nums = new int[3];
			
			- 3: 배열의 길이(length)
			- nums[0] > 0: 방번호(index, 첨자)
			- nums[0]: 방(element, 요소)
		
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
		m13();
		//m14();
		
		//nullTest();
	}

	private static void m14() {
		
		int[][] nums = new int[2][3];
		
		nums[0][0] = 10;
		nums[0][1] = 20;
		nums[0][2] = 30;
		
		nums[1][0] = 40;
		nums[1][1] = 50;
		nums[1][2] = 60;
		
		System.out.println(nums.length); // 2
		System.out.println(nums[0].length); // 3
		
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				System.out.println(nums[i][j]);
			}
		}
		
	}

	private static void m13() {
		
		// 초기화 리스트
		int[] nums1 = { 10, 20, 30 };
		
		int[][] nums2 = { { 10, 20, 30 }, { 10, 20, 30 } };
		
		int[][][] nums3 = { { { 10, 20, 30 }, { 10, 20, 30 } }, { { 10, 20, 30 }, { 10, 20, 30 } } };
		
	}

	private static void m12() {
		
		//  배열의 차원
		// - 1차원 배열, 2차원 배열, 3차원 배열..
		
		// 1차원 배열
		
		int[] nums1 = new int[3];
		
		nums1[0] = 10;
		nums1[1] = 20;
		nums1[2] = 30;
		
		// 2차원 배열
		int[][] nums2 = new int[2][3];
		
		nums2[0][0] = 10;
		nums2[0][1] = 20;
		nums2[0][2] = 30;
		
		nums2[1][0] = 40;
		nums2[1][1] = 50;
		nums2[1][2] = 60;
		
		// 2차원 배열 > 2중 for문
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				//System.out.println(i + ", " + j);
				System.out.printf("%5d", nums2[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		// 3차원 배열
		int[][][] nums3 = new int[2][2][3];
		
		nums3[0][0][0] = 10;
		nums3[0][0][1] = 20;
		nums3[0][0][2] = 30;
		
		nums3[0][1][0] = 40;
		nums3[0][1][1] = 50;
		nums3[0][1][2] = 60;
		
		nums3[1][0][0] = 70;
		nums3[1][0][1] = 80;
		nums3[1][0][2] = 90;
		
		nums3[1][1][0] = 100;
		nums3[1][1][1] = 110;
		nums3[1][1][2] = 120;
		
		// 3차원 배열 > 3중 for문
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.printf("%5d", nums3[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
			
		}
	}

	private static void m11() {
		
		// 배열 조작
		// 1. 요소 삽입
		//	 - Right Shift 발생
		// 2. 요소 삭제
		//	 - Left Shift 발생
		
		int[] nums = { 1, 2, 3, 4, 5 };
		
		System.out.println(Arrays.toString(nums));
		
		int index = 2;
		
		for (int i = index; i < nums.length - 1; i++) {
			//System.out.println(i);
			nums[i] = nums[i+1];
		}
		
		nums[nums.length-1] = 0;
		
		System.out.println(Arrays.toString(nums));

	}

	private static void m10() {
		
		// 배열 조작
		// 1. 요소 삽입
		//	 - Right Shift 발생
		// 2. 요소 삭제
		
		int[] nums = { 1, 2, 3, 4, 5 };
		
		System.out.println(Arrays.toString(nums));
		
		int index = 2;
		int value = 10;
		
		for (int i = nums.length-2; i >= index; i--) {
			//System.out.println(i);
			nums[i + 1] = nums[i];
		}
		
		nums[index] = value;
		
		System.out.println(Arrays.toString(nums));
		
	}

	private static void m9() throws NumberFormatException, IOException {
		
		// *** 배열의 길이는 불변이다.(= 메모리에 할당받은 공간의 크기는 불변이다.)
		// - 런타임 시 배열의 길이를 변경할 수 없다.
		// - 런타임 시 배열의 초기 길이는 지정할 수 없다.
		
		// int[] nums = new int[10]; // 4byte x 10 = 40byte
		
		// 중학교 교장 > 성적처리 프로그램(국어)
		// 학생수? 100명 > 20명 전학 옴
		//int[] kors = new int[140];
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("학생 수: ");
		int count = Integer.parseInt(reader.readLine());
		
		int[] kors = new int[count]; // 동적
		
	}

	private static void m8() {
		
		// 배열의 초기화 리스트
		//int[] nums = new int[] { 15, 6, 17, 25, 11 };
		int[] nums = { 15, 6, 17, 25, 11 }; // ***
		
//		nums[0] = 15;
//		nums[1] = 6;
//		nums[2] = 17;
//		nums[3] = 25;
//		nums[4] = 11;
		
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = (i + 1) * 10;
//		}
		
		System.out.println(Arrays.toString(nums));
	}

	private static void m7() {
		
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		// Arrays 클래스
		// - 배열을 조작하는 데 여러가지 기능을 제공하는 클래스
		// - 유틸리티 클래스
		
		// [I@28a418fc
		// - [I > int[]
		// - @ > 구분자
		// - 28a418fc > 16진수 > 해시코드(HashCode) - 메모리주소 비슷한 거
		System.out.println(nums);
		
		// 개발자용 > dump
		System.out.println(Arrays.toString(nums));
		
		// 깊은 복사
		int[] copy = Arrays.copyOf(nums, nums.length);
		
		System.out.println(Arrays.toString(copy));
		
		nums[0] = 100;
		
		System.out.println(Arrays.toString(copy));
		
		System.out.println(nums.hashCode()); // 681842940
		System.out.println(copy.hashCode()); // 1392838282
	}

	private static void m6() {
		
		// 배열의 복사
		// 1. 얕은 복사(Shallow Copy)
		//	 - m5() 예제
		// 2. 깊은 복사(Deep Copy)
		//	 - m6() 예제
		
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		int[] copy = new int[3]; // 복사본
		
		// 얕은 복사
		//copy = nums;
		
		// int = int
		//copy[0] = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			copy[i] = nums[i];
		}
		
		nums[0] = 100;
		
		for (int i = 0; i < copy.length; i++) {
			System.out.printf("copy[%d] = %d\n", i, copy[i]);
		}
		System.out.println();
		
		
		System.out.println(nums); // [I@16b98e56
		System.out.println(copy); // [I@7ef20235
		
	}

	private static void m5() {
		
		// 배열의 복사
		
		// 값형 복사
		int a = 10;
		int b;
		
		b = a;
		
		System.out.println(b); // 10
		
		// 값형 복사 > 원본을 수정해도 복사본에는 영향을 주지 않는다.
		// - Side Effect 발생하지 않음
		
		a = 20; // 원본 수정
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		
		// 참조형 복사
		int[] nums = new int[3]; // 원본
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		int[] copy = new int[3]; // 복사본
		
		// *** 모든 참조형 복사 > 주소값 복사
		copy = nums;
		
		for (int i = 0; i < copy.length; i++) {
			System.out.printf("copy[%d] = %d\n", i, copy[i]);
		}
		System.out.println();

		// 배열의 원본을 수정 > 복사본에 영향을 미치는지?
		nums[0] = 100;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		System.out.println();
		
		
		System.out.println(nums); // [I@b4c966a
		System.out.println(copy); // [I@b4c966a
		
	}

	private static void m4() {
		
		// 각 자료형별 > 배열 선언하기
		
		// 원시형(값형) 배열
		
		// 정수 배열(byte, short, int, long)
		byte[] list1 = new byte[5];
		list1[0] = 10;
		System.out.println(list1[0]);
		
		// 실수 배열(float, double)
		double[] list2 = new double[5];
		list2[0] = 3.14;
		System.out.println(list2[0]);
		
		// 논리 배열(boolean)
		boolean[] list3 = new boolean[5];
		list3[0] = true;
		System.out.println(list3[0]);
		
		// 문자 배열(char) == String
		char[] list4 = new char[5]; // 'A', 'B', 'C', 'D', 'E' == "ABCDE"
		list4[0] = 'A';
		System.out.println(list4[0]);
		
		String s1;
		
		// 참조형 배열
		String[] list5 = new String[5];
		list5[0] = "홍길동";
		System.out.println(list5[0]);
		
		//     변수 = 값;
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));
		
		// java.lang.NullPointerException
		Calendar[] list6 = new Calendar[5];
		list6[0] = Calendar.getInstance();
		System.out.println(list6[0].get(Calendar.HOUR_OF_DAY));

		//d1 상태 > null 상태
		//Calendar d1;
		//System.out.println(d1);
		
		Calendar[] list7 = new Calendar[5];
		//list7[0] > null
		
	
	}

	private static void nullTest() {
		
		// void
		// - 없다.(무)
		// - 메서드 반환값으로만 사용
		
		// null 개념
		// - 없다.(무)
		// - 데이터 표현으로 사용
		
		String str1 = "홍길동";
		String str2 = ""; // 빈문자열
		String str3 = null; // null 상수
		String str4;
		
		System.out.println(str3);
		//System.out.println(str4);
	
		// *** 참조형만 null을 가질 수 있다.
		// *** 값형은 null을 대입할 수 없다.
		int a = 10;
		//int b = null;
		int b; // null
		
		
	}

	private static void m3() {
		
		// 배열 초깃값
		// - 배열(모든 참조형)은 메모리에 공간 할당된 직후 > 자동으로 값이 초기화가 된다.
		
		// 초깃값(암기)
		// - 정수: 0
		// - 실수: 0.0
		// - 문자: \0 (null 문자, 문자코드값이 0인 문자)
		// - 논리: false
		// - 참조형: null
		
		// *** 지역 변수는 초기화를 해야 한다.
		//int n;
		//System.out.println(n);
		
		int[] nums = new int[5]; // int방 x 5개
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]); // 초기화를 안 했는데 에러가 안 남
		System.out.println(nums[4]);
		
	}

	private static void m2() {
		
		// 요구사항] 학생 3명 > 국어 점수 > 총점, 평균
		// 추가사항] 학생 300명
		
		// 배열 선언하기
		// - 자료형[] 변수명 = new 자료형[길이];
		int[] kors = new int[300];
		
		System.out.println(kors.length); // 300
		
		// 배열의 방에 접근(방번호, 즉 인덱스 사용) > 국어 점수 입력
		// int = int
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		// +297 추가
		
		//int total = kors[0] + kors[1] + kors[2];
		int total = 0; // 누적 변수
		
		for (int i = 0; i < kors.length; i++) {
			total += kors[i];
		}
		
		double avg = (double)total / kors.length; // 3.0 + 300.0
		
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
		
	}

	private static void m1() {
		
		// 요구사항] 학생 3명 > 국어 점수 > 총점, 평균
		// 추가사항] 학생 300명
		
		int kor1;
		int kor2;
		int kor3;
		// +297 추가
		
		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		// +297 추가
		
		int total = kor1 + kor2 + kor3; // + kor4 + kor5 + .. + kor300;
		
		double avg = total / 3.0; // 3.0 + 300.0
		
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
		
	}

}
