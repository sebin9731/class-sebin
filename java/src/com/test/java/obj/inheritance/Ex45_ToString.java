package com.test.java.obj.inheritance;

import java.util.Date;

public class Ex45_ToString {
	
	public static void main(String[] args) {
		
		// 클래스 상속 + 메서드 오버라이딩 > 복습
		// *** toString() 메서드 오버라이딩
		// - 모든 개발자들이 어떤 객체에 toString()을 호출하면 덤프값이 반환될 거라고 기대하고 있음.
		
		Time t1 = new Time();
		//System.out.println(t1.info());
		System.out.println(t1);
		//System.out.println(t1.toString());
		
		Time t2 = new Time(2, 30);
		//System.out.println(t2.info());
		System.out.println(t2);
		//System.out.println(t2.toString());
		
		Time t3 = new Time(5, 10);
		//System.out.println(t3.info());
		System.out.println(t3);
		//System.out.println(t3.toString()); // 덤프
		
		Date d1 = new Date();
		System.out.println(d1); // Mon Jan 12 09:14:15 GMT+09:00 2026
		System.out.println(d1.toString()); // 덤프
	}

}

class Time {
	
	private int hour;
	private int min;
	
	public Time() {
		this.hour = 0;
		this.min = 0;
	}

	public Time(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}
	
	// 덤프
//	public String info() {
//		return String.format("%d:%d", this.hour, this.min);
//	}
	
//	@Override
//	public String toString() {
//		return String.format("%d:%d", this.hour, this.min);
//	}
	
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + "]";
	}
	
	
	
}