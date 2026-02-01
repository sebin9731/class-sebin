package com.test.java.file;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;

public class Ex59_File {
	
	private static int fileCount = 0;
	private static int directoryCount = 0;
	private static int totalSize = 0;
	
	public static void main(String[] args) {
		
		/*
		
			데이터의 지속적 관리
			
			1. 파일/디렉터리 조작
				- 윈도우 탐색기가 하는 행동들..
				
			2. 파일 입출력
				a. 텍스트 입출력 > 문자
					- 메모장
					- 이클립스
				
				b. 이진 데이터(바이너리) 입출력 > 비문자
					- 이미지 생성
					- 동영상 재생
					
			
		*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		//m14(); //***
		m15(); //***
		
		
		
	}//main
	
	private static void m15() {
		
		//내용물이 있는 폴더 삭제하기
		String path = "C:\\code\\java\\file\\bbb";
		File dir = new File(path);
		
		if (dir.exists()) {
			deleteDirectory(dir);
		}
		
	}

	private static void deleteDirectory(File dir) {
		
		//빈폴더!! > 모든 파일 삭제
		File[] list = dir.listFiles();
		
		for (File file : list) {
			if (file.isFile()) {
				System.out.println(file.getName() + " - deleted");
				file.delete();
			}
		}
		
		for (File subdir : list) {
			if (subdir.isDirectory()) {
				deleteDirectory(subdir);
			}
		}
		
		//현재 폴더 > 빈폴더
		dir.delete();
		
	}

	private static void m14() {
		
		//- 773MB (810,556,631 바이트)
		//- 파일 13,855
		//- 폴더 2,486
		
		
		String path = "C:\\dev\\eclipse";
		File dir = new File(path);
		
		if (dir.exists()) {
			
			search(dir);
		
			System.out.printf("총 파일 개수: %,d개\n", fileCount);
			System.out.printf("총 폴더 개수: %,d개\n", directoryCount);
			System.out.printf("폴더 크기: %,dB\n", totalSize);
			System.out.printf("폴더 크기: %,dMB\n", totalSize / 1024 / 1024);
			
		}
		
	}

	public static void search(File dir) {
		
		//1. 목록 가져오기
		File[] list = dir.listFiles();
		
		//2. 파일 > 개수
		for (File file : list) {
			if (file.isFile()) {
				fileCount++;
				totalSize += file.length();
			}
		}
		
		//3. 자식 폴더 > 1 + 2 반복
		for (File subdir : list) {
			if (subdir.isDirectory()) {
				search(subdir);
				directoryCount++;
			}
		}
		
	}

	private static void m13() {
		
		//- 773MB (810,556,631 바이트)
		//- 파일 13,855
		//- 폴더 2,486
		String path = "C:\\dev\\eclipse";
		File dir = new File(path);
		
		int count = 0; //누적 변수
		
		if (dir.exists()) {
			
			File[] list = dir.listFiles();
			
			for (File file : list) {
				if (file.isFile()) {
					count++;
				}
			}
			
			for (File subdir : list) {
				if (subdir.isDirectory()) {
					
					File[] sublist = subdir.listFiles();
					
					for (File subfile : sublist) {
						if (subfile.isFile()) {
							count++;
						}							
					}
					
					for (File subsubdir : sublist) {
						if (subsubdir.isDirectory()) {
							
							File[] subsublist = subsubdir.listFiles();
							
							for (File subsubfile : subsublist) {
								if (subsubfile.isFile()) {
									count++;
								}
							}
							
						}
					}
					
				}
			}
			
			System.out.printf("총 파일 개수: %,d개\n", count);
		
		}
		
	}

	private static void m12() {
		
		//특정 폴더의 내용물 보기
		String path = "C:\\dev\\eclipse";
		File dir = new File(path);
		
		if (dir.exists()) {
			
			//폴더의 내용물 > 이름들
//			String[] list = dir.list();
//			
//			for (String item : list) {
//				System.out.println(item);
//			}
			
			File[] list = dir.listFiles();
			
//			for (File item : list) {
//				System.out.println(item.getName());
//				System.out.println(item.isFile());
//				System.out.println();
//			}
			
			for (File item : list) {
				if (item.isDirectory()) {
					System.out.println("📁" + item.getName());
				}
			}
			
			for (File item : list) {
				if (item.isFile()) {
					System.out.println(item.getName());
				}
			}
			
			
		}
		
		
	}


	private static void m11() {
		
		// 폴더 삭제
		File dir = new File("C:\\code\\java\\file\\bbb");
		
		// 빈 폴더만 삭제 가능!
		System.out.println(dir.delete());
		
	}

	private static void m10() {
		
		// 폴더명 수정 or 폴더 이동
		File dir = new File("C:\\code\\java\\file\\schedule");
		File dir2 = new File("C:\\code\\java\\move\\schedule");
		
		System.out.println(dir.renameTo(dir2));
		
	}

	private static void m9() {
		
		// 요구사항] 일정 관리 > 날짜별 폴더 생성하기
		// - [2026-01-01 목]
		// - [2026-01-02 금]
		// - [2026-01-03 토]
		// ..
		// - [2026-12-31]
		
		Calendar c = Calendar.getInstance();
		c.set(2026, 0, 1);
		
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR));
		
		for (int i = 0; i < 365; i++) {
			
			//String date = String.format("%tF %tA", c, c).substring(0, 12);
			String date = String.format("%tF %s", c, c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.NARROW_FORMAT, Locale.KOREAN));
			System.out.println(date);
			
			String path = "C:\\code\\java\\file\\일정\\[" + date + "]";
			File dir = new File(path);
			dir.mkdir();
			
			c.add(Calendar.DATE, 1); //num++
			
		}
		
	}

	private static void m8() {
		
		// 요구사항] 회원 명단 > 개인 폴더 생성하기
		String[] member = { "홍길동", "아무개", "강아지", "고양이", "병아리" };
		
		for (int i = 0; i < member.length; i++) {
			
			String path = String.format("C:\\code\\java\\file\\회원\\[개인폴더]%s님", member[i]);
			
			File dir = new File(path);
			dir.mkdir();
			
		}
		
		System.out.println("생성 완료");
		
	}

	private static void m7() {
		
		// 폴더 생성하기
//		String path = "C:\\code\\java\\file\\aaa";
//		File dir = new File(path);
//		
//		System.out.println(dir.mkdir()); // make directory
		
		String path = "C:\\code\\java\\file\\bbb\\ccc\\ddd";
		File dir = new File(path);
		
		System.out.println(dir.mkdirs()); // 중간에 필요한 부모 폴더까지 만들어줌
		
	}

	private static void m6() {
		
		// 파일 삭제
		
		String path2 = "C:\\code\\java\\move\\aaa.txt";
		File file2 = new File(path2);
		
		// 보통 삭제: 휴지통 폴더로 이동하기
		// 진짜 삭제: 복구 불가능
		boolean result = file2.delete();
		System.out.println(result);
		
	}

	private static void m5() {
		
		//파일 이동하기
		// - C:\code\java\file > data.txt
		// - C:\code\java\move
		
		// 원본
		String path = "C:\\code\\java\\file\\data.txt";
		File file = new File(path);
		
		// 수정 후
		String path2 = "C:\\code\\java\\move\\aaa.txt";
		File file2 = new File(path2);
		
		System.out.println(file.renameTo(file2));
		
	}

	private static void m4() {
		
		//파일명 수정하기
		// - list.txt > data.txt
		
		// 원본
		String path = "C:\\code\\java\\file\\list.txt";
		File file = new File(path);
		
		// 수정 후
		String path2 = "C:\\code\\java\\file\\data.txt";
		File file2 = new File(path2);
		
		System.out.println(file.renameTo(file2));
		
		
	}

	private static void m3() {
		
		// 파일 조작 > 생성, 이동, 이름 수정, 복사(지금은 x), 삭제
		
		// 생성하기 > 새 파일 만들기
		String path = "C:\\code\\java\\file\\list.txt";
		
		File file = new File(path);
		
		try {
			boolean result = file.createNewFile();
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

	private static void m2() {
		
		// C:\code\java\file
		
		// 디렉토리의 정보 읽기
		String path = "C:\\code\\java\\file";
		
		// 디렉토리 참조 객체 > 폴더는 파일이다.
		File dir = new File(path);
		
		if (dir.exists()) {
			System.out.println(dir.getName());
			System.out.println(dir.isFile());
			System.out.println(dir.isDirectory());
			System.out.println(dir.length());
			System.out.println(dir.getAbsolutePath());
			System.out.println(dir.lastModified());
			System.out.println(dir.isHidden());
			System.out.println(dir.canRead());
			System.out.println(dir.canWrite());
			System.out.println(dir.getParent());
		} else {
			System.out.println("디렉토리가 없습니다.");
		}
		
	}

	private static void m1() {
		
		// C:\code\java\file\test.txt
		
		// 파일의 정보 읽기
		
		// 자바 > (접근) > 파일
		// - 참조 객체를 사용한다.
		
		// 파일 경로
		String path = "C:\\code\\java\\file\\test.txt";
		
		// 파일 참조 객체 > java.io.File
		File file = new File(path);
		
		//System.out.println(file.exists()); // 해당 경로에 파일이 있는지 확인
		
		if (file.exists()) {
			// 파일 정보 읽기
			System.out.println(file.getName()); // 파일명 > test.txt
			System.out.println(file.isFile()); // true
			System.out.println(file.isDirectory()); // false
			System.out.println(file.length()); // 파일 크기(byte)
			System.out.println(file.getAbsolutePath()); // 파일 위치
			System.out.println(file.lastModified()); // 마지막 수정일
			
			// 타임스탬프 > Calendar
			Calendar c1 = Calendar.getInstance();
			System.out.println(c1.getTimeInMillis());
			c1.setTimeInMillis(file.lastModified());
			
			System.out.printf("%tF %tT\n", c1, c1);
			
			System.out.println(file.isHidden()); // 숨김여부
			System.out.println(file.canRead()); // 읽을 수 있는지
			System.out.println(file.canWrite()); // 쓸 수 있는지
			System.out.println(file.getParent()); // 파일이 속해있는 부모 디렉토리
		} else {
			System.out.println("파일을 찾을 수 없습니다.");
		}
		
	}

}

























