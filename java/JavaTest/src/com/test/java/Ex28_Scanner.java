package com.test.java;

import java.util.Scanner;

public class Ex28_Scanner {
	
	public static void main(String[] args) {
		
		// 키보드 입력
		// 1. System.in.read()
		// 2. BufferedReader 클래스
		// 3. Scanner 클래스
		
		//m1();
		//m2();
		//m3();
		m4();
		
	}

	private static void m4() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scan.nextLine(); // nextLine => 입력버퍼 > 엔터를 만나기 전까지 가져와라
		System.out.println(name);
		
		System.out.print("나이: "); // 그외 => 입력버퍼 > 숫자만 가져오고 엔터는 방치
		int age = scan.nextInt();
		System.out.println(age);
		
		// 엔터가 남아 있다. > 우리가 직접 버린다!
		//scan.nextLine();
		scan.skip("\r\n");
		
		System.out.print("주소: ");
		String address = scan.nextLine(); // ""\r\n 앞에서 엔터친 게 여기로 와서 빈문자를 입력받음
		System.out.println(address);
	}

	private static void m3() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age = scan.nextInt();
		System.out.println(age);
		
		System.out.print("몸무게: ");
		double weight = scan.nextDouble();
		System.out.println(weight);
		
		System.out.print("키: ");
		int height = scan.nextInt();
		System.out.println(height);
		
	}

	private static void m2() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		System.out.println(name);
		
		System.out.print("주소: ");
		String address = scan.nextLine();
		System.out.println(address);
		
		System.out.print("전화: ");
		String tel = scan.nextLine();
		System.out.println(tel);
		
	}

	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("문자열: ");
//		String line = scan.nextLine();
//		System.out.println(line);

		
		// 자료형별로 입력받는 전용 메서드를 제공
		
		System.out.println("숫자: ");
		//int num = Integer.parseInt(reader.readLine());
		int num = scan.nextInt();
		System.out.println(num * num);
		
	}

}
