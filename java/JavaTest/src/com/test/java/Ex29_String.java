package com.test.java;

import java.util.Scanner;

public class Ex29_String {
	
	public static void main(String[] args) {
		
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
		
		
	}

	private static void m13() {
		
		// 문자열 분리
		// - String[] split(String delimiter)
		
		String txt = "홍길동,아무개,강아지,고양이,병아리";
		
		// 정규 표현식(Regular Expression)
		String[] list = txt.split(","); // 구분자는 사라진다.
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(i + ": " + list[i]);
		}
		
	}

	private static void m12() {
		
		// 문자열 치환(바꾸기)
		// - String replace(char old, char new)
		// - String replace(String old, String new)
		String txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 홍길동";
		
		System.out.println(txt.replace("홍길동", "아무개"));
		System.out.println(txt.replace("테스트", "아무개"));
		System.out.println(txt.replace("홍길동", "안녕"));
		System.out.println(txt.replace("홍길동", "김"));
		System.out.println(txt.replace("홍길동", ""));
		
		// 마스킹
		String content = "게시판입니다. 안녕~ 바보";
		String stop = "바보";
		
		//System.out.println(content.indexOf(stop) > -1);
		//System.out.println(content.contains(stop));
		System.out.println(content.replace(stop, "**"));
		
		txt = "     하나     둘     셋     ";
		System.out.println(txt.trim());
		System.out.println(txt.replace(" ", ""));
		
		content = "오늘은 메서드 수업을 진행합니다. 시작~";
		String word = "메서드수업";
		
		if (content.replace(" ", "").contains(word.replace(" ", ""))) {
			System.out.println("결과O");
		} else {
			System.out.println("결과X");
		}
		
	}

	private static void m11() {
		
		// 문자열 검색
		// - indexOf()
		// - lastIndexOf()
		// - startsWith()
		// - endsWith()
		// - boolean contains(String s)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.indexOf("홍길동") > -1);
		System.out.println(txt.contains("홍길동"));
		
	}

	private static void m10() {
		
		// 문자 추출
		// - char charAt(int index)
		
		// 문자열 추출
		// - String substring(int beginIndex, int endIndex)
		// - String substring(int beginIndex)
		//  - beginIndex: inclusive(포함)
		//  - endIndex: exclusive(미포함)
		
		String txt = "가나다라마바사아자차카파타하";
		
		System.out.println(txt.substring(4, 7));
		System.out.println(txt.substring(4));
		System.out.println(txt.substring(5, 6)); // "바"(String)
		System.out.println(txt.charAt(5)); //'바'(char) > 문자코드값
		System.out.println();
		
		String jumin = "990108-1234567";
		
		// 성별?
		System.out.println(jumin.charAt(7) == '1' ? "남자" : "여자");
		System.out.println(jumin.substring(7, 8).equals("1") ? "남자" : "여자");
		
		// 몇년생?
		System.err.println("" + jumin.charAt(0) + jumin.charAt(1)); // '9' + '9' = 99? charAt 쓰지 말 것
		System.out.println(jumin.substring(0, 2)); //"99"
		
		// 몇월생?
		System.out.println(jumin.substring(2, 4)); // 1
		
		// 몇일생?
		System.out.println(jumin.substring(4, 6)); // 8
		
		
		// 파일 경로
		String path = "C:\\code\\java\\JavaTest\\Ex29_String.java";
		
		// 1. 파일명 추출 > Ex29_String.java
		int index = path.lastIndexOf("\\");
		String filename = path.substring(index + 1);
		System.err.println("파일명: " + filename);
		
		// 2. 파일명 추출 > 확장자 없는 순수 파일명 > Ex29_String
		index = filename.lastIndexOf(".");
		String filenameWithoutExtention = filename.substring(0, index);
		System.out.println("순수 파일명: " + filenameWithoutExtention);
		
		// 3. 확장자 추출 > .java
		String extention = filename.substring(index);
		System.out.println("확장자: " + extention);
	}

	private static void m9() {
		
		// 패턴 검색
		// - boolean startsWith(String word)
		// - boolean endsWith(String word)
		
		String name = "홍길동";
		
		// 이 사람이 '홍'씨? > 네/아니오
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.indexOf('홍') == 0);
		System.out.println(name.startsWith("홍"));
		System.out.println();
		
		// '동'으로 끝나요?
		System.out.println(name.charAt(name.length()-1) == '동');
		System.out.println(name.indexOf('동') == name.length()-1);
		System.out.println(name.endsWith("동"));
		System.out.println();
		
		// 파일 업로드 > 반드시 *.java 가능
		
		String filename = "Ex03.JAVA";
		
		//System.out.println(filename.lastIndexOf(".java") == filename.length() - 5);
		
		System.out.println(filename.toLowerCase().endsWith(".java"));
		
	}

	private static void m8() {
		
		// 대소문자 변환
		// - String toUpperCase
		// - String toLowerCase
		
		String word = "Java"; // 사용자 입력
		
		System.out.println(word);
		System.out.println(word.toUpperCase());
		System.out.println(word.toLowerCase());
		
		//System.out.println("java".equals("Java"));
		
		// 대소문자 구분
		// - 구분 O: 정확도 높음, 검색율 낮음
		// - 구분 X: 
		String content = "오늘 수업은 Java입니다.";
		
		//System.out.println(word.toUpperCase());
		//System.out.println(content.toUpperCase());		
		
		//content = content.toUpperCase();
		
		// 메서드 체이닝
		// - 변수.메서드().메서드()
		
		if (content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
	}

	private static void m7() {
		
		// 게시판 글쓰기 > 금지어!
		
		String stop = "바보"; // 금지어
		String content = "안녕하세요. 저는 자바를 배우는 학생입니다."; // 글 내용
		
		System.out.println(content.indexOf(stop));
		
		if (content.indexOf(stop) > -1) {
			System.out.println("금지어 발견!");
		} else {
			System.out.println("글쓰기 완료!");
		}
		
		
		content = "안녕하세요. 저는 자바를 배우는 학생입니다.";
		String[] stopWords = { "바보", "멍청이", "메롱" };
		
		for (int i = 0; i < stopWords.length; i++) {
			
			if (content.indexOf(stopWords[i]) > -1) {
				System.out.println("금지어 발견!");
				break;
			}
		}
		
		String jumin = "990108-1234567";
		
		System.out.println(jumin.charAt(6) == '-');
		System.out.println(jumin.indexOf('-') == 6);
		
	}

	private static void m6() {
		
		// 검색
		// - int indexOf(char c)
		// - int indexOf(String s)
		// - int indexOf(char c, int beginIndex)
		// - int indexOf(String c, int beginIndex)
		
		// - int lastIndexOf(char c)
		// - int lastIndexOf(String s)
		// - int lastIndexOf(char c, int beginIndex)
		// - int lastIndexOf(String c, int beginIndex)
		
		String txt = "안녕하세요. 홍길동입니다.";
		int index = -1;
		
		index = txt.indexOf('요');
		System.out.println(index);
		
		index = txt.indexOf('홍');
		System.out.println(index);
		
		index = txt.indexOf('김');
		System.out.println(index);
		System.out.println();
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히 계세요. 홍길동입니다.";
		
		index = txt.indexOf("홍길동"); // 7
		System.out.println(index);
		
		index = txt.indexOf("홍길동", index + 3); // 22
		System.out.println(index);
		
		index = txt.indexOf("홍길동", index + 3); // 39
		System.out.println(index);
		System.out.println();
		
		
		index = txt.lastIndexOf("홍길동"); // 39
		System.out.println(index);
		
		index = txt.lastIndexOf("홍길동", index - 1); // 22
		System.out.println(index);
		
	}

	private static void m5() {
		
		// 공백(스페이스, 엔터, 탭) 제거
		// - String trim()
		// - 문자열의 시작과 끝에 존재하는 공백 문자를 제거한다.
		// - 사용자 실수 or 불필요한 공백 제거 역할
		
		String txt = "     하나     둘     셋     ";
		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim());
		
	}

	private static void m4() {
		
		char c1 = 'A';
		System.out.println((int)c1);
		System.out.println((char)65);
		
		// *** 절대 > 값형과 참조형 간의 형변환은 지원 안 함
		//String s1 = "A";
		//System.out.println((int)s1);
		
		// FM > 형변환(X)
		//System.out.println(Integer.parseInt("100"));
		
		// 영단어 입력(소문자)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어(영문자+숫자+_): ");
		String word = scan.nextLine();
		
		// java, JAVA, Java, javA..
		
		// 영소문자: a(97) ~ z(122)
		
		// Java
		// - J > 74
		// - a >
		// - v
		// - a
		
//		word.charAt(0)
//		word.charAt(1)
//		word.charAt(2)
//		word.charAt(3)
//		word.charAt(word.length()-1)
		
		boolean flag = true;
		
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			//System.out.println((int)c);
			
//			if ((int)c >= 97 && (int)c <= 122) {
//				// 소문자
//				//System.out.println("소문자");
//			} else {
//				// 잘못된 문자
//				//System.out.println("잘못된 문자");
//				flag = false;
//				break;
//			}
			
			// ***** 유효성 검사는 잘못된 것을 찾는다!
			
			// (int)c >= 97 && (int)c <= 122
			//if ((int)c < 97 || (int)c > 122) {
			//if ((int)c < (int)'a' || (int)c > (int)'z') {
			
			// char 비교 > 문자 코드값 비교
//			if ((c < 'a' || c > 'z') 
//					&& (c < 'A' || c > 'Z')
//					&& (c < '0' || c > '9')
//					&& (c != '_')) { 
			if (c < '가' || c > '힣') {
				flag = false;
				break;
			}
		}
		//System.out.println(flag);
		
		if (flag) {
			System.out.println("올바른 단어");
		} else {
			System.out.println("잘못된 단어");
		}
		
	}

	private static void m3() {
		
		// 주민등록번호 입력
		// ex) 990108-1234567
		
		String jumin = "990108-1234567";
		
		if (jumin.charAt(6) == '-') {
			System.out.println("올바른 주민번호");
		} else {
			System.out.println("잘못된 주민번호");
		}
		
	}

	private static void m2() {
		
		// 문자열 추출
		// - char charAt(int index)
		// - 문자열에서 원하는 위치를 문자 1개를 추출
		// - Zero-based Index
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.length());
		
		char c = txt.charAt(3);
		System.out.println(c);
		
		c = txt.charAt(10);
		System.out.println(c);
		
		// StringIndexOutOfBoundsException
		//c = txt.charAt(15);
		//System.out.println(c);
		
		// 마지막 문자
		c = txt.charAt(txt.length()-1);
		System.out.println(c);
		
		
	}

	private static void m1() {
		
		// 문자열 생성
		// 1. 리터럴
		// 2. 객체 생성
		
		// String 자료형 = 클래스
		String s1 = "홍길동"; // 문자열 리터럴
		String s2 = new String("홍길동");
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		// 문자열 길이
		// - int length()
		// - 글자수
		// - 문자열 == char[]
		
		// 배열의 길이
		// - arr.length
		
		String txt = "홍길동";
		System.out.println(txt.length());
		System.out.println("자바".length());
		System.out.println("ABC한글12345@#$".length());
		
		
		// 유효성 검사
		// - 회원 가입 > 이름 입력
		// - 2~5자 이내로 작성하세요.
		// - 성 + 5글자
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		System.out.println(name.length());
		
		if (name.length() >= 2 && name.length() <= 5) {
			System.out.println("올바른 이름");
		} else {
			System.out.println("이름을 2~5자 이내로 입력하세요.");
		}
		
	}

}
