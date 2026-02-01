package com.test.java.obj.inheritance;

public class Ex52_Generic {
	
	public static void main(String[] args) {
		
		/*
			
			제네릭, Generic
			- Object 클래스 업무 일부를 대신하기 위해서
			1. 제네릭 클래스
			2. 제네릭 메서드
			
			요구사항] 클래스 설계해주세요.
			1. 멤버 변수 1개 > int
			2. 멤버 변수를 중심으로 여러가지 행동을 하는 메서드를 구현
			
			추가사항] String 중심으로 하는 클래스 설계
			추가사항] boolean 중심으로 하는 클래스 설계
			추가사항] double 중심으로 하는 클래스 설계
			추가사항] byte 중심으로 하는 클래스 설계
			추가사항] long 중심으로 하는 클래스 설계
			추가사항] Student 중심으로 하는 클래스 설계
			추가사항] 무한대..
			
		*/
		
		WrapperInteger n1 = new WrapperInteger(10);
		System.out.println(n1.getData());
		System.out.println(n1.getData() * 2);
		System.out.println();
		
		WrapperObject n2 = new WrapperObject(20);
		System.out.println(n2.getData());
		System.out.println((int)n2.getData() * 2);
		System.out.println();
		
		Wrapper<Integer> n3 = new Wrapper<Integer>(30);
		System.out.println(n3.getData());
		System.out.println(n3.getData() * 2);
		System.out.println();
		
		
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1.getData());
		System.out.println(s1.getData().length());
		System.out.println();
		
		WrapperObject s2 = new WrapperObject("대한민국");
		System.out.println(s2.getData());
		System.out.println(((String)s2.getData()).length());
		System.out.println();
		
		Wrapper<String> s3 = new Wrapper<String>("아무개");
		System.out.println(s3.getData());
		System.out.println(s3.getData().length());
		System.out.println();
		
		
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1.getData());
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println();
		
		WrapperObject b2 = new WrapperObject(false);
		System.out.println(b2.getData());
		System.out.println((boolean)b2.getData() ? "참" : "거짓");
		System.out.println();
		
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3.getData());
		System.out.println(b3.getData() ? "참" : "거짓");
		System.out.println();
		
	}//main

}

class Wrapper<T> {
	
	private T data;
	
	public Wrapper(T data) {
		this.setData(data);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}

class WrapperObject {
	
	// 1. 핵심 데이터
	private Object data;
	
	// 2. 데이터 중심 > 조작하는 메서드
	public WrapperObject(Object data) {
		this.setData(data);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
}

class WrapperBoolean {
	
	// 1. 핵심 데이터
	private boolean data;
	
	// 2. 데이터 중심 > 조작하는 메서드
	public WrapperBoolean(boolean data) {
		this.setData(data);
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
}

class WrapperString {
	
	// 1. 핵심 데이터
	private String data;
	
	// 2. 데이터 중심 > 조작하는 메서드
	public WrapperString(String data) {
		this.setData(data);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
}

class WrapperInteger {
	
	// 1. 핵심 데이터
	private int data;
	
	// 2. 데이터 중심 > 조작하는 메서드
	public WrapperInteger(int data) {
		this.setData(data);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
}









