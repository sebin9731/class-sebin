package com.test.java.obj.inheritance;

public class Ex49_Interface {

	public static void main(String[] args) {
		
		/*
		
			추상화 기술
			1. 추상 클래스
			2. 인터페이스
			
			
			인터페이스, interface
			- 추상 메서드의 집합
			- 객체를 생성할 수 없다.
			- 상속에서 부모 클래스 역할을 한다.
			- 구현 멤버를 가질 수 없다.(추상 클래스와 차이)
			
			일반클래스: 구현 멤버
			추상클래스: 구현 멤버 + 추상 멤버
			인터페이스: 추상 멤버
			
			일반클래스 + 인터페이스 > 보편적
			
		*/
		
		S25 p1 = new S25();
		p1.on();
		p1.call();
		p1.off();
		
		Iphone16 p2 = new Iphone16();
		p2.on();
		p2.call();
		p2.off();
		System.out.println();
		
		
		// 사람으로서의 길동이
		Person hong = new Person("홍길동", 40);
		System.out.println(hong);
		
		// 장소/위치/상황에 따른 역할 차이
		
		// 가정 > 아빠로서의 행동 > 메서드
		hong.아이와놀아주기();
		hong.가족여행을간다();
		
		// 직장 > 부장으로서의 행동 > 메서드
		//hong.결재를한다();
		hong.프로젝트를진행한다();
		
		// 집
		hong.아이와놀아주기();
		//hong.결재를한다();
		hong.아이와놀아주기();
		
		// Person hong
		아빠 hong2 = new Person("홍길동", 40);
		
		hong2.아이와놀아주기();
		hong2.가족여행을간다();
		//hong2.결재를한다();
		
		부장 hong3 = new Person("홍길동", 40);
		hong3.결재를한다();
		hong3.프로젝트를진행한다();
		
		// 인터페이스 적용 > 객체 자체를 보는 것이 아니라 그 객체가 하는 역할이 중요할 때 사용
		
		// 가정집 > 보일러 고장 > 수리 기사 호출
		Lee a1 = new Lee();
		
//		a1.달리기();
//		a1.술을마신다();
//		a1.보일러점검하기();
//		a1.배수관교체하기();
		
		// 보일러 고장 > 수리 기사 호출
		Park a2 = new Park();
		
//		a2.보일러오류를점검한다();
//		a2.배수관교체를진행합니다();
		a2.보일러를점검한다();
		a2.배수관을교체한다();
		
		// 기사(기사로서의 행동만 필요한데 개인의 특성까지 포함되어 있음)
		Lee a3 = new Lee();
		a3.보일러를점검한다();
		a3.배수관을교체한다();
		
		Park a4 = new Park();
		a4.보일러를점검한다();
		a4.배수관을교체한다();
		
		// 기사(기사로서의 행동만 필요하기 때문에 기사 사용)
		기사 a5 = new Lee();
		a5.보일러를점검한다();
		a5.배수관을교체한다();
		
		기사 a6 = new Park();
		a6.보일러를점검한다();
		a6.배수관을교체한다();
		
		
	}//main
}

// 보일러 수리 기사로서의 역할(규약) > 수리 기사 자격증
interface 기사 {
	
	void 보일러를점검한다();
	void 배수관을교체한다();
	
}

class Lee implements 기사 {
	private String name;
	private int age;
	private String address;
	
	public void 달리기() {
		System.out.println("이순신이 달리기를 합니다.");
	}
	
	public void 술을마신다() {
		System.out.println("이순신이 술을 마십니다.");
	}
	
//	public void 보일러점검하기() {
//		System.out.println("보일러 점검하기");
//	}
//	
//	public void 배수관교체하기() {
//		System.out.println("배수관 교체하기");
//	}

	@Override
	public void 보일러를점검한다() {
		System.out.println("보일러 점검하기");
	}

	@Override
	public void 배수관을교체한다() {
		System.out.println("배수관 교체하기");
	}
	
}

class Park implements 기사 {
	private String name;
	private int weight;
	private int height;
	
	public void 축구를잘한다() {
		System.out.println("축구를 잘한다.");
	}
	
	public void 고기를잘먹는다() {
		System.out.println("고기를 잘 먹는다.");
	}
	
//	public void 보일러오류를점검한다() {
//		System.out.println("보일러 오류 점검하기");
//	}
//	
//	public void 배수관교체를진행합니다() {
//		System.out.println("배수관 교체를 진행합니다.");
//	}

	@Override
	public void 보일러를점검한다() {
		System.out.println("보일러 오류 점검하기");
	}

	@Override
	public void 배수관을교체한다() {
		System.out.println("배수관 교체를 진행합니다.");
	}
}


// ************************
// 홍길동 객체 생성 + 사용

// 아빠로서의 행동
interface 아빠 {
	void 아이와놀아주기();
	void 가족여행을간다();
}

// 부장으로서의 행동
interface 부장 {
	void 결재를한다();
	void 프로젝트를진행한다();
}

// 인터페이스는 다중상속이 가능하다.(***)
class Person implements 아빠, 부장 {
	
	private String name;
	private int age;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%d)", this.name, this.age);
	}
	
	// 아빠로서의 행동
	public void 아이와놀아주기() {
		System.out.println("아이와 놀아준다.");
	}

	public void 가족여행을간다() {
		System.out.println("가족들과 여행을 간다.");
	}
	
	// 부장으로서의 행동
	public void 결재를한다() {
		System.out.println("결재를 한다.");
	}
	
	public void 프로젝트를진행한다() {
		System.out.println("프로젝트를 진행한다.");
	}
}

// 인터페이스 선언
interface Phone {
	
	// public final static int a = 10;
	
	// 구현 멤버(에러)
//	public int a;
//	public void test() {
//	}
	
	// 추상 멤버만..
	public abstract void on(); // public, abstract 생략 가능
	void off();
	void call();
	
}

class S25 implements Phone {
	
	public int price;
	private String color;

	@Override
	public void on() {
		System.out.println("삼성 기술 > 전원 On");
	}

	@Override
	public void off() {
		System.out.println("삼성 기술 > 전원 Off");
	}

	@Override
	public void call() {
		System.out.println("삼성 기술 > 통화");
	}
	
}

class Iphone16 implements Phone {
	
	public int price;
	public String color;

	@Override
	public void on() {
		System.out.println("애플 기술 > 전원 On");
	}

	@Override
	public void off() {
		System.out.println("애플 기술 > 전원 Off");
	}

	@Override
	public void call() {
		System.out.println("애플 기술 > 통화");
	}
	
}
















