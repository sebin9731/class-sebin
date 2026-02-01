package com.test.java.obj.inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex51_Object {
	
	public static void main(String[] args) {
		
		// Object 클래스
		// - 모든 클래스의 부모 클래스이다.
		
		m1();
		
	}

	private static void m1() {
		
		AA a1 = new AA();
		AA a2 = new BB();
		AA a3 = new CC();
		
		Object o1 = new AA();
		Object o2 = new BB();
		Object o3 = new CC();
		
		Object o4 = new Scanner(System.in);
		Object o5 = new BufferedReader(new InputStreamReader(System.in));
		Object o6 = new Lee();
		Object o7 = new Park();
		
		Object o8 = "홍길동"; // new String("홍길동")
		Object o9 = new int[3];
		
//		System.out.print("입력: ");
//		String input = ((Scanner)o4).nextLine();
//		System.out.println(input);
		
		String s8 = "홍길동";
		
		System.out.println(o8);
		System.out.println(s8);
		
//		System.out.print("입력: ");
//		String input = ((Scanner)o5).nextLine();
//		System.out.println(input);
		
		// 조심해야 할 것! > 절대 금지!!
		Object[] list = new Object[5];
		
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		list[4] = 50; // 처음 숫자를 넣었으면 끝까지 숫자로 넣어야 함
		
//		list[0] = "홍길동";
//		list[1] = 20;
//		list[2] = true;
//		list[3] = "서울시";
//		list[4] = 170;
		
		//                           20 + 1  (x)
		//                       Object + 1  // 모든 참조 주소는 산술 연산의 대상이 될 수 없다.
		System.out.println((int)list[1] + 1);
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
	}

}

class AA {
	
}

class BB extends AA {
	
}

class CC extends BB {
	
}






