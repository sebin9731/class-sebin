package com.test.java.obj;

public class Ex34_Access {
	
	public static void main(String[] args) {
		
		Mouse m1 = new Mouse();
		
		m1.setModel("VXE");
		System.out.println(m1.getModel());
		
		// 객체의 price 상태 > 쓰기 전용 멤버
		m1.setPrice(35000);
		//System.out.println(m1.getPrice());
		
		//m1.setPrice = 35000;
		//System.out.println(m1.price);
		
		// 읽기 전용 멤버
		//m1.setColor("yellow");
		System.out.println(m1.getColor());
		
		
		m1.setButtons(5);
		
		// 프로퍼티(Property) > 속성
		// - 객체의 상태(객체가 가지고 있는 데이터)
		// - Setter/Getter
		
		// 쓰기 전용 멤버 > 계산된 프로퍼티, 가상 프로퍼티
		// - 아~ 멤버 변수 type이라는 게 있는데.. 그 값을 반환하는구나.. 라고 생각할 수 있음
		System.out.println(m1.getType());
		
	}

}

// 클래스 > 객체 생성 > 객체(데이터:변수 + 행동:메서드)
class Mouse {
	
	private String model;
	private int price;
	private String color;
	private int buttons;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		
		// 유효성 검사
		this.model = model;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getColor() {

		if (price >= 0 && price <= 10000) {
			color = "black";
		} else if (price <= 30000) {
			color = "white";
		} else {
			color = "gold";
		}
		
		return color;
	}
	
	public void setButtons(int buttons) {
		this.buttons = buttons;
	}
	
	public String getType() {
		
		String type = "";
		
		if (buttons <= 3) {
			type = "초보자용";
		} else if (buttons <= 5) {
			type = "사무용";
		} else {
			type = "전문가용";
		}
		
		return type;
		
	}
	
	
	
}