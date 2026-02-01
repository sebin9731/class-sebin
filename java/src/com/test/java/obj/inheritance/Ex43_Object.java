package com.test.java.obj.inheritance;

public class Ex43_Object {
	
	public static void main(String[] args) {
		
		/*
		
			Object 클래스
			- 개발자가 선언한 모든 클래스는 무조건 Object 클래스의 자식 클래스가 된다.
			- 루트 클래스 > 모든 클래스의 근원 클래스
			
			상속 관계에 있는 클래스 간 호칭
			- 부모 클래스 <-> 자식 클래스
			- 슈퍼 클래스 <-> 서브 클래스
			- 기본 클래스 <-> 확장 클래스
			- 기본 클래스 <-> 파생 클래스
			
		*/
		
		OChild c1 = new OChild();
		
		c1.a = 10;
		c1.b = 20;
		c1.c = 30;
		c1.d = 40;
		
		
	}//main

}

// 컴파일러 > 부모가 없는 클래스를 발견 > 자동으로 Object 클래스를 상속한다.
class OParent { // class OParent extends Object 이렇게 만들어버림
	
	
	
	public int a;
	public int b;
	
}

class OChild extends OParent {
	
	public int c;
	public int d;
	
}