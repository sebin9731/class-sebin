package com.test.java;

public class Ex02_DataType {

	public static void main(String[] args) {
		
		// Ex02_DataType.java
		// 주석(Comment)
		// - 컴파일에서 제외되는 영역

		// 한줄 주석(Single-line Comment)
		
		/*
		 여러줄 주석(Multi-line Comment)
		 */
		
		// 주석 단축키
		// - 한줄 주석: Ctrl + /
		// - 여러줄 주석: Ctrl + Shift + /
		//                Ctrl + Shift + \
		
		// 숫자 계산
//		int num = 10;
//		num *= 2;
//		System.out.println(num);
		
		/*
		 
		 Data Type, 자료형
		 - 데이터(자료)의 형태
		 - 데이터의 길이(범위)와 생김새(형태)를 미리 정의하고, 그 정의에 따라 분류해놓은 규칙(약속)
		 
		 자바의 자료형 > 나누는 기준
		 1. 형태
		 2. 길이
		 
		 자료형 종류
		 1. 기본형, 원시형(Primitive Type), 값형(Value Type)
		 	a. 숫자형
		 		1. 정수형
		 			a. byte
		 				- 1byte
		 				- 0 ~ 255 (X)
		 				- -128 ~ 127
		 			b. short
		 				- 2byte(=16bit)
		 				- 2^16 = 65,536
		 				- -32768 ~ 32767
		 			c. int
		 				- 4byte(=32bit)
		 				- 2^32
		 				- 4,294,967,296
		 				- -21억 ~ 21억
		 			d. long
		 				- 8byte(=64bit)
		 				- 2^64
		 				- 18,446,744,073,709,551,616
		 		2. 실수형
		 			- 부동소수점 표기 사용
		 			a. float
		 				- 4byte
		 				- 무한대에 가까움
		 				- 단정도형
		 				- 부호(1) + 지수(8) + 가수(23)
		 			b. double
		 				- 8byte
		 				- 무한대에 가까움
		 				- 배정도형
		 				- 부호(1) + 지수(11) + 가수(52)
		 	
		 	b. 문자형
		 		a. char
		 			- 문자를 저장하는 자료형
		 			- 한글, 영어, 숫자, 특수문자 등..
		 			- 2byte(=16bit)
		 			- 문자 1개를 2byte를 사용해서 저장하는 방식 > 유니코드
		 			- 문자표, 문자코드표 > ASCII
		 			- 문자 1개 저장 > 1바이트(256 경우 = 문자 256)
		 			- 문자 1개 저장 > 2바이트(65535 경우) > 유니코드(UniCode)
		 		
		 	c. 논리형
		 		a.boolean
		 			- 1byte
		 			- 명제(참, 거짓)
		 			- true, false 키워드 사용
		 
		 2. 참조형(Reference Type)
		 	- 나중에
		 
		 */
	}
}
