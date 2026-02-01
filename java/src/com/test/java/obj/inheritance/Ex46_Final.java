package com.test.java.obj.inheritance;

import java.util.Calendar;

public class Ex46_Final {
	
	public static void main(String[] args) {
		
		/*
		
			final 키워드
			- 한 번 결정하면 바꿀 수 엇다.
			- 왜? 안정성을 높이기 위해서
			
			1. (지역, 멤버) 변수 적용
				- 의미를 가진 상수
				- 초깃값 이후 > 수정 불가능
				- 식별자는 모두 대문자로 작성
			
			2. 메서드 적용
				- 메서드 재정의 방지
			
			3. 클래스 적용
				- 클래스 상속을 방지
		
		*/
		
		// 10 > 데이터, 상수, 리터럴(Literal)
		
		int a = 10;
		final int b = 10; // final 변수, 상수(Constant)
		
		System.out.println(a);
		System.out.println(b);
		
		a = 20; // 수정 가능
		//b = 20; // 수정 불가능// The final local variable b cannot be assigned. It must be blank and not using a compound assignment
		
		//double pi = 3.14;
		//pi = 3.16; // 수정하면 안 되는데 수정이 되고 물리적 에러가 안 남
		
		final double pi = 3.14;
		//pi = 3.16;
		
		//a = 30;
		//b = 40;
		
		//PI = 30; // 상수는 대문자
		
		//int NUM = 30; // 상수가 아니면 소문자로
		
		
		User u1 = new User();
		//u1.gender = "남자";
		//u1.gender = 1;
		u1.gender = Gender.MALE;
		
		User u2 = new User();
		//u2.gender = "여자";
		//u2.gender = 2;
		u1.gender = Gender.FEMALE;
		
		if (u1.gender == User.MALE) {
			System.out.println("군대");
		}
		
		
		Member m1 = new Member();
		m1.gender = Gender.MALE;
		
		System.out.println(Gender.MALE);
		System.out.println(Calendar.YEAR);
		
		
		FinalParent fp1 = new FinalParent();
		System.out.println(fp1.plus()); // 10 + 20
		
		//FinalChild fc1 = new FinalChild();
		//System.out.println(fc1.plus()); // 10 * 20
		
	}//main

}

class Gender {
	// 열거형 상수
	public final static int MALE = 1;
	public final static int FEMALE = 2;
}

class Member {
	public String name;
	public int age;
	public int gender;
	
	public final static int MALE = 1;
	public final static int FEMALE = 2;
}

class User {
	
	public String name;
	public int age;
	
	// 성별
	//public String gender; // 문자열 > "남자", "여자"
	public int gender; // 숫자 > 남자(1), 여자(2)
	
	// final static 변수
	public final static int MALE = 1;
	public final static int FEMALE = 2;
}


// final 클래스
final class FinalParent {
	
	// 멤버 변수
	public int a = 10;
	public int b = 20;
	
	// 멤버 메서드 > 오버라이딩 금지!
	// - 클래스 상속 안정성 향상
	public final int plus() { // public도 지정자, final도 지정자. 지정자들끼리는 순서 상관 x. 근데 주로 접근지정자가 먼저 옴.
		return a + b;
	}
	
}

// The type FinalChild cannot subclass the final class FinalParent
//class FinalChild extends FinalParent {
	
	// 부모가 의도한 주제는 벗어나지 않는 선에서 재정의
//	@Override
//	public int plus() {
//		return a * b;
//	}
	
//}
















