package View;

import java.util.Scanner;

import Controller.MemberController;
import Database.File;
import Model.Member;

public class Application { // View

	// 0. ����[Q1. main �ۿ� ����� ���� : ]
	public static Scanner scanner = new Scanner(System.in);
	// Q2. public : 
	// Q3. static : 
	
	public static void main(String[] args) {
		// 0. ���α׷� ���� �ε�
		File.filesave(1); // Ÿ���� 1�� ������� ȸ�� �ҷ���, 3���� ��� // save�� static
		// 1. ���α׷� ����
		
		mainmenu(); // ���� �޴� �޼ҵ� ȣ��
	}
	
	// 1. ���� �޴� �޼ҵ�
	public static void mainmenu() {
				// void : 
		while(true) {
			try {
			System.out.println("\n --------------- ȸ���� Ŀ�´�Ƽ ----------------");
			System.out.println("1. �α��� 2. ȸ������ 3. ���̵� ã�� 4. ��й�ȣ ã��");
			System.out.println("--------------------------------------------");
			System.out.println("\t \t ���� : "); int ch = scanner.nextInt();
			
			if(ch==1) {
				System.out.println("- �α��� ������ -");
				System.out.println("ID[4���� �̻�] : "); String id = scanner.next();
				System.out.println("Password[4���� ��] : "); String password = scanner.next();
				
				boolean result = MemberController.login(id, password);
				
				if(result) {
					System.err.println("[�˸�] �α��� ����");
					membermenu(id);
				} else {
					System.err.println("[�˸�] �α��� ����(������ ȸ�� ������ �����ϴ�.)");
				}
			}
			else if(ch==2) {
				System.out.println("- ȸ������ ������ -");
				// 1. ������ �Է� �޾� ������ ���� �� ������ ������ �� ��ü �� ��ü�� ������ �� �迭/�÷��� �޴´�
				System.out.println("ID[4���� �̻�] : "); String id = scanner.next();
				System.out.println("Password[4���� ��] : "); String password = scanner.next();
				System.out.println("Name[2���� �̻�] : "); String name = scanner.next();
				System.out.println("Email[@ ����] : "); String email = scanner.next();
				// 4�� ������ ���� ���� �����ϸ� ������� �� 4�������� ������ ��üȭ
				Member member = new Member(id, password, name, email, 0);
				
				// Controller ����[�ٸ� Ŭ���� �� �޼ҵ� ȣ���ϴ� ��� 1.	2.	]
				boolean result = MemberController.signup(member);
				if(result) {
					System.out.println("[�˸�] ȸ������ ����");
				} else {
					System.out.println("[�˸�] ȸ������ ����");
				}
				System.out.println("-------------------------------------------");
				
			} else if(ch==3) {
				System.out.println("- ���̵� ã�� ������ -");
				System.out.println("Name : "); String name = scanner.next();
				System.out.println("Email : "); String email = scanner.next();
				
				boolean result = MemberController.forgotid(name, email);
				
				if(result) {
					System.err.println("[�˸�] ȸ������ ���̵� �̸��Ϸ� ���� �߽��ϴ�.");
				} else {
					System.err.println("[�˸�] ������ ȸ�������� �����ϴ�.");
				}
				System.out.println("-------------------------------------------");
				
			} else if(ch==4) {
				System.out.println("- ��й�ȣ ã�� ������ -");
				System.out.println("Id : "); String id = scanner.next();
				System.out.println("Email : "); String email = scanner.next();
				
			 boolean result = MemberController.forgotpassword(id, email);
			 
			 if( result ) {
					System.err.println("[�˸�] : ȸ������ ��й�ȣ�� �̸��Ϸ� �����߽��ϴ�");
				} else {
					System.err.println("[�˸�] : ������ ȸ�������� �����ϴ�");
				}
			 System.out.println("-------------------------------------------");
			} else {
				System.err.println("[�˸�] �� �� ���� �ൿ�Դϴ� : �����ڿ��� ����"); // out �� err : ���������� ǥ�ð� ��
			}
		} catch (Exception e) {
			System.err.println("[�˸�] �޴������� ���� : ������ ����");
			scanner = new Scanner(System.in); // �Է� ��ü �ʱ�ȭ A���� �Ƚ���
				// new : �޸𸮸� �ʱ�ȭ �ϴ°� (���Ӱ� �־��ִ°�)
		}
		}
	}
	
	// 2. ȸ�� �޴� �޼ҵ�
	public static void membermenu(String id) {
								// �μ��� �� �޴��� : 
	}
	// 3. �Խ��� �޴� �޼ҵ�
	public static void boardmenu(String id) {
	}
}