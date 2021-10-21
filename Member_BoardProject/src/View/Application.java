package View;

import java.util.Scanner;

import Controller.MemberController;
import Database.File;
import Model.Member;

public class Application { // View

	// 0. 설정[Q1. main 밖에 만드는 이유 : ]
	public static Scanner scanner = new Scanner(System.in);
	// Q2. public : 
	// Q3. static : 
	
	public static void main(String[] args) {
		// 0. 프로그램 파일 로딩
		File.filesave(1); // 타입을 1로 했을경우 회원 불러옴, 3번은 댓글 // save는 static
		// 1. 프로그램 시작
		
		mainmenu(); // 메인 메뉴 메소드 호출
	}
	
	// 1. 메인 메뉴 메소드
	public static void mainmenu() {
				// void : 
		while(true) {
			try {
			System.out.println("\n --------------- 회원제 커뮤니티 ----------------");
			System.out.println("1. 로그인 2. 회원가입 3. 아이디 찾기 4. 비밀번호 찾기");
			System.out.println("--------------------------------------------");
			System.out.println("\t \t 선택 : "); int ch = scanner.nextInt();
			
			if(ch==1) {
				System.out.println("- 로그인 페이지 -");
				System.out.println("ID[4글자 이상] : "); String id = scanner.next();
				System.out.println("Password[4글자 만] : "); String password = scanner.next();
				
				boolean result = MemberController.login(id, password);
				
				if(result) {
					System.err.println("[알림] 로그인 성공");
					membermenu(id);
				} else {
					System.err.println("[알림] 로그인 실패(동일한 회원 정보가 없습니다.)");
				}
			}
			else if(ch==2) {
				System.out.println("- 회원가입 페이지 -");
				// 1. 변수를 입력 받아 변수에 저장 → 변수가 여러개 → 객체 → 객체가 여러개 → 배열/컬렉션 받는다
				System.out.println("ID[4글자 이상] : "); String id = scanner.next();
				System.out.println("Password[4글자 만] : "); String password = scanner.next();
				System.out.println("Name[2글자 이상] : "); String name = scanner.next();
				System.out.println("Email[@ 형식] : "); String email = scanner.next();
				// 4개 변수를 따로 따로 저장하면 힘들어짐 → 4개변수를 묶어줄 객체화
				Member member = new Member(id, password, name, email, 0);
				
				// Controller 전달[다른 클래스 내 메소드 호출하는 방법 1.	2.	]
				boolean result = MemberController.signup(member);
				if(result) {
					System.out.println("[알림] 회원가입 성공");
				} else {
					System.out.println("[알림] 회원가입 실패");
				}
				System.out.println("-------------------------------------------");
				
			} else if(ch==3) {
				System.out.println("- 아이디 찾기 페이지 -");
				System.out.println("Name : "); String name = scanner.next();
				System.out.println("Email : "); String email = scanner.next();
				
				boolean result = MemberController.forgotid(name, email);
				
				if(result) {
					System.err.println("[알림] 회원님의 아이디를 이메일로 전송 했습니다.");
				} else {
					System.err.println("[알림] 동일한 회원정보가 없습니다.");
				}
				System.out.println("-------------------------------------------");
				
			} else if(ch==4) {
				System.out.println("- 비밀번호 찾기 페이지 -");
				System.out.println("Id : "); String id = scanner.next();
				System.out.println("Email : "); String email = scanner.next();
				
			 boolean result = MemberController.forgotpassword(id, email);
			 
			 if( result ) {
					System.err.println("[알림] : 회원님의 비밀번호를 이메일로 전송했습니다");
				} else {
					System.err.println("[알림] : 동일한 회원정보가 없습니다");
				}
			 System.out.println("-------------------------------------------");
			} else {
				System.err.println("[알림] 알 수 없는 행동입니다 : 관리자에게 문의"); // out → err : 붉은색으로 표시가 됨
			}
		} catch (Exception e) {
			System.err.println("[알림] 메뉴페이지 오류 : 관리자 문의");
			scanner = new Scanner(System.in); // 입력 객체 초기화 A값이 안써짐
				// new : 메모리를 초기화 하는것 (새롭게 넣어주는것)
		}
		}
	}
	
	// 2. 회원 메뉴 메소드
	public static void membermenu(String id) {
								// 인수를 왜 받는지 : 
	}
	// 3. 게시판 메뉴 메소드
	public static void boardmenu(String id) {
	}
}