package com.test.java.obj;

public class Ex39_This {
	
	public static void main(String[] args) {
		
		// 첫 번째 컵 > 절대표현
		Cup c1 = new Cup();
		c1.setColor("black");
		
		Cup c2 = new Cup();
		c1.setColor("white");
		
		Cup c3 = new Cup();
		c1.setColor("yellow");
		
		System.out.println(c1.getColor());
		System.out.println(c2.getColor());
		System.out.println(c3.getColor());
		
	}//main

}

class Cup {
	
	private String color;
	private int size;
	
	public void setColor(String color) {
		
		// this > (자신)객체 접근 연산자
		
		// this의 역할 > 나(자기 자신) > 상대표현
		//this.color = color;
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
		//c1.color = color;
		
		test();
		this.test();
	}
	
	
	
	private void test() {

		
	}



	public String getColor() {
		//String color = "";
		//return color;
		
		// 1. 가독성 높음
		// 2. 코딩 쉬움(자동완성)
		return this.color;
	}
	
}