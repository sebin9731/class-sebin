package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;

public class Ex22_DateTime {
	
	public static void main(String[] args) throws IOException {
		
		//Ex22_DateTime.java
		/*
		  
			날짜/시간 자료형
			1. Date 클래스
			2. Calendar 클래스
			-----------------------------------
			3. java.time 패키지 > 다수의 클래스
			
			
			시간, 시각
			
			- 개강일: 2025년 12월 29일 오전 9시 00분 00초 > 시각
			- 하루 수업: 8시간 > 시간
			
			
			날짜/시간 > 연산
			
			2026년 01월 05일 15시 14분 51초
										-
			2025년 12월 29일 09시 00분 00초
			
			시각 + 시각 = X
			시각 - 시각 = O(시간)
			시각 * 시각 = X
			시각 / 시각 = X
			
			8시간 - 2시간 = 6시간
			
			시간 + 시간 = O(시간)
			시간 - 시간 = O(시간)
			시간 * 시간 = X
			시간 / 시간 = X
			
			
			2026년 01월 05일 15시 14분 51초 - 2시간 = 
			
			시각 + 시간 = O(시각)
			시각 - 시간 = O(시각)
			
		*/
		
		//m1();
		//m2();
		//m3();
		
		//m4();
		//m5();
		//m6();
		//m7();
		m8();
		
	}// main
	
	public static void m8() {
		
		// 연산
		// - 시간 + 시간 = 시간
		// - 시간 - 시간 = 시간
		
		// 2시간 + 1시간
		int h1 = 2;
		int h2 = 1;
		System.out.println(h1 + h2);
		
		//2시간 30분 + 1시간 10분
		h1 = 2;
		int m1 = 30;
		
		h2 = 1;
		int m2 = 10;
		
		System.out.println((h1 + h2) + "시간" + (m1 + m2) + "분");
		
		// 2시간 30분 + 10분
		h1 = 2;
		m1 = 30;
		
		m1 += 40;
		
		h1 = h1 + (m1 / 60);
		m1 = m1 % 60;
		
		System.out.printf("%d시간 %d분 \r\n".formatted(h1, m1));
		
	}
	
	
	public static void m7() {
		
		// 연산
		// - 시각 - 시각 = 시간
		
		// 요구사항] 내가 태어나서 총 며칠을 살아왔는지?
		// 현재 - 생일 = 살아온 기간(일)
		
		// *** 모든 지역변수는 Stack에 만들어진다.
		// 클래스 = 참조형
		Calendar now = Calendar.getInstance(); // 현재
		Calendar birthday = Calendar.getInstance();
		birthday.set(1999, 9, 5); // 생일
		
		// *** 모든 참조형은 산술 연산이 불가능하다.
		// *** 메모리 주소는 연산의 대상이 될 수 없다.
		//System.out.println(now - birthday); // 에러
		
		/*
		
			2026년 01월 06일 09시 30분 20초
			-
			1999년 10월 05일 14시 20분 30초
			==============================
			
			기준점
			- 1970년 1월 1일 0시 0분 0초
			- Unix Time, Epoch Time
			
		*/
		
		System.out.println(now.getTimeInMillis());
		System.out.println(birthday.getTimeInMillis());
		
		// 시간의 단위 > 최대 Hour까지(Date 가능)
		
		System.out.println((now.getTimeInMillis() - birthday.getTimeInMillis()) / 1000 / 60 / 60 / 24);
		
	}
	
	public static void m6() {
		
		Calendar now = Calendar.getInstance();
		
		// +- 시간
		
		//30분 뒤
		now.add(Calendar.MINUTE, 30);
		System.out.printf("%tF %tT\r\n", now, now);
		
		//3시간 뒤
		now.add(Calendar.HOUR, 3);
		System.out.printf("%tF %tT\r\n", now, now);
		
		//5일 뒤
		now.add(Calendar.DATE, 5);
		System.out.printf("%tF %tT\r\n", now, now);
		
		//1달 뒤
		now.add(Calendar.MONTH, 1);
		System.out.printf("%tF %tT\r\n", now, now);
		
	}

	private static void m5() throws IOException {
		
		//신생아 > 년, 월, 일, 시, 분, 초 입력
		//- 백일?
		//- 첫돌?
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//2026-01-03 17:30:00
		//2026년 1월 3일 5시 30분
		//2026/01/01 
		System.out.print("생일 입력(년): ");
		String input1 = reader.readLine(); 
		int year = Integer.parseInt(input1);//"2026" > 2026
		
		System.out.print("생일 입력(월): ");
		String input2 = reader.readLine();
		int month = Integer.parseInt(input2) - 1;
		
		System.out.print("생일 입력(일): ");
		String input3 = reader.readLine();
		int date = Integer.parseInt(input3);
		
		System.out.print("생일 입력(시): ");
		String input4 = reader.readLine();
		int hour = Integer.parseInt(input4);
		
		System.out.print("생일 입력(분): ");
		String input5 = reader.readLine();
		int minute = Integer.parseInt(input5);
		
		System.out.print("생일 입력(초): ");
		String input6 = reader.readLine();
		int second = Integer.parseInt(input6);
		
		
		Calendar birthday = Calendar.getInstance();
		birthday.set(year, month, date, hour, minute, second);
		
		System.out.printf("%tF %tT \r\n", birthday, birthday);
		
		//백일?
		birthday.add(Calendar.DATE, 99);
		System.out.printf("%tF %tT \r\n", birthday, birthday);
		
		//첫돌?
		birthday.add(Calendar.DATE, -99);
		birthday.add(Calendar.YEAR, 1);
		System.out.printf("%tF %tT \r\n", birthday, birthday);
		
	}

	private static void m4() {
		
		//연산
		//- 시각 + 시간
		//- 시각 - 시간
		
		//오늘 만난 커플 > 100일?
		//오늘(시각) + 100일(시간) = 기념일(시각)
		
		Calendar now = Calendar.getInstance(); //오늘
		System.out.printf("001일차: %tF \r\n", now);
		
		//now + 99일
		now.add(Calendar.DATE, 99); //100일 기념일
		System.out.printf("100일차: %tF \r\n", now);
		
		//덮어쓰기 + 초기화 = 현재 시각
		now = Calendar.getInstance();
		
		//1주일 후?
		now.add(Calendar.DATE, 7);
		System.out.printf("1주일 후: %tF \r\n", now);
		
		now = Calendar.getInstance();
		
		//3일 전?
		now.add(Calendar.DATE, -3);
		System.out.printf("3일 전: %tF \r\n", now);
		
		now = Calendar.getInstance();
		
		//컵라면 > 3분뒤?
		now.add(Calendar.MINUTE, 3);
		System.out.printf("컵라면 먹을 시간: %tT \r\n", now);
		
	}

	private static void m3() {
		
		//m2() > 현재 시각 만들기
		//m3() > 특정 시각 만들기
		
		//Calendar 클래스 메서드
		//1. int get(int): 읽기
		//2. void set(오버로딩): 쓰기
		
		//올해 크리스마스
		Calendar christmas = Calendar.getInstance(); //현재 시각
		System.out.printf("%tF %tT \r\n", christmas, christmas);
		
		//수정(덮어쓰기)
		christmas.set(Calendar.MONTH, 11);
		christmas.set(Calendar.DATE, 25);
		christmas.set(Calendar.HOUR_OF_DAY, 0);
		christmas.set(Calendar.MINUTE, 0);
		christmas.set(Calendar.SECOND, 0);
		System.out.printf("%tF %tT \r\n", christmas, christmas);
		
		
		//내 생일
		Calendar birthday = Calendar.getInstance();
		
		//birthday.set(1990, 7, 1);
		birthday.set(1999, 11, 20, 15, 30, 0);
		
		System.out.printf("%tF %tT\r\n", birthday, birthday);
		
	}

	private static void m2() {
		
		//Data, Calendar > 현재 컴퓨터의 메인보드로부터 가져온다. 
				
		//Calendar 클래스 + 현재 시각
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		//java.util.GregorianCalendar[time=1767595697855,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="GMT+09:00",offset=32400000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2026,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=5,DAY_OF_YEAR=5,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=48,SECOND=17,MILLISECOND=855,ZONE_OFFSET=32400000,DST_OFFSET=0]
		
		//캘린더 객체 > 원하는 항목을 추출
		//- int get(int)
		
		System.out.println(now.get(0));
		System.out.println(now.get(1));
		System.out.println(now.get(2));
		System.out.println(now.get(3));
		
		int year = 1;
		System.out.println(now.get(year));
		
		System.out.println(Calendar.YEAR);
		System.out.println(now.get(Calendar.YEAR));
		System.out.println();
		
		
		System.out.println(now.get(Calendar.YEAR)); //2026 > 년
		System.out.println(now.get(Calendar.MONTH)); //0 > 월(0~11)
		System.out.println(now.get(Calendar.DATE)); //5 > 일
		System.out.println(now.get(Calendar.HOUR)); //4 > 시(12H)
		System.out.println(now.get(Calendar.HOUR_OF_DAY));//16 > 시(24H)
		System.out.println(now.get(Calendar.MINUTE)); //9 > 분
		System.out.println(now.get(Calendar.SECOND)); //48 > 초
		System.out.println(now.get(Calendar.MILLISECOND)); //.796>밀리초
		System.out.println(now.get(Calendar.AM_PM)); //1 > 오전(0),오후(1)
		System.out.println(now.get(Calendar.DAY_OF_YEAR));//일(년)
		System.out.println(now.get(Calendar.DAY_OF_MONTH));//일(월)
		System.out.println(now.get(Calendar.DAY_OF_WEEK));//일(주). 요일. 일(1)~토(7)
		System.out.println(now.get(Calendar.WEEK_OF_YEAR));//주(년)
		System.out.println(now.get(Calendar.WEEK_OF_MONTH));//주(월)
		
		
		//요구사항] "오늘은 2026년 1월 5일입니다." 출력하시오.
		System.out.println("오늘은 2026년 1월 5일입니다.");
		
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\r\n"
							, now.get(Calendar.YEAR)
							, now.get(Calendar.MONTH) + 1
							, now.get(Calendar.DATE));
		
		//요구사항] "오늘은 2026년 01월 05일입니다." 출력하시오.
		
		int month = now.get(Calendar.MONTH) + 1;
		
		System.out.printf("오늘은 %d년 %s월 %d일입니다.\r\n"
						, now.get(Calendar.YEAR)
						, month < 10 ? "0" + month : "" + month
						, now.get(Calendar.DATE));
		
		//요구사항] "오늘은 2026년 01월 05일입니다." 출력하시오.
		System.out.printf("오늘은 %d년 %02d월 %02d일입니다.\r\n"
						, now.get(Calendar.YEAR)
						, now.get(Calendar.MONTH) + 1
						, now.get(Calendar.DATE));
		
		
		//요구사항] "지금은 오후 04시 38분 14초입니다."
		System.out.printf("지금은 %s %02d시 %02d분 %02d초입니다.\r\n"
						, now.get(Calendar.AM_PM) == 0 ? "오전":"오후"
						, now.get(Calendar.HOUR)
						, now.get(Calendar.MINUTE)
						, now.get(Calendar.SECOND));
		
		
		//printf() > 형식 문자(날짜/시간)
		System.out.printf("%tF \r\n", now); //2026-01-05
		System.out.printf("%tT \r\n", now); //16:44:34 
		System.out.printf("%tA \r\n", now); //월요일(Locale)	
		
		
	}

	private static void m1() {
		
		//Date 클래스
		Date now = new Date(); //현재 시각
		System.out.println(now);
		
		//1시간 흘러감..
		
		// 협업 나중에 김대리에게 질문!!
		Date now2 = new Date();
		System.out.println(now2);
		
	}

}














