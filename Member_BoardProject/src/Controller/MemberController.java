package Controller;

import java.util.ArrayList;

import Database.File;
import Model.Member;

public class MemberController {
	
	// 1. �ʵ�[��� ȸ���� ��� �ִ� ��ü = �÷��� ������ ��ũ Vs �迭]
	public static ArrayList<Member> memberlist = new ArrayList<>();
	
	// 2. �޼ҵ�
	// 1. ȸ������
	public static boolean signup(Member member) { // ȸ������ �� �ɹ�
		// ��ȯŸ�� : 
		
		// 1. ��ȿ�� �˻�
		if(member.getId().length()<4) {
			System.out.println("[�˸�] ID�� 4���� �̻� �����մϴ�.");
			return false;
			}
		if(member.getPassword().length()!=4) {
			System.out.println("[�˸�] Password�� 4���ڸ� �����մϴ�.");
			return false;
			}
		if(member.getName().length()<2) {
			System.out.println("[�˸�] Name�� 2���� �̻� �����մϴ�.");
			return false;
			}
		if(!member.getEmail().contains("@")) {
			System.out.println("[�˸�] Email�� @ ���� �����մϴ�.");
			return false;
			}
		// 2. Id �ߺ�üũ[����Ʈ �� ������ ���̵� �ִ��� Ȯ��]
		for(Member temp:memberlist) {
			if(temp.equals(member.getId())) {
				System.out.println("[�˸�] �̹� ������� ���̵� �Դϴ�.");
				return false;
			}
		}
		// 3. ����Ʈ ����
		memberlist.add(member);
		
		// 4. ���� ó��
		File.filesave(1);
		// ��ü�� ���� ���� or 
		// File.file = new File();
		
		return true; // ȸ������ ������
	}
	
	// 2. �α���
	public static boolean login( String id , String password ) {
		
		for(Member member : memberlist) {
			if(member.getId().equals(id) && member.getPassword().equals(password))
				return true; // �α��� ������
		}
		return false; // �α��� ���н� 
	}
	// 3. ���̵�ã��[ �̸� , �̸��� �μ��� �޾� �ش� ���Ͽ� ���̵� ���� ]
	public static boolean forgotid( String name , String email ) {
		
		for(Member member:memberlist) {
		if(member.getName().equals(name) && member.getEmail().equals(email)) {
			return true;
		}
		}
		return false; // ���̵�ã�� ������  
	}
	// 4. ��й�ȣã��[ ���̵� , �̸��� �μ��� �޾� �ش� ���Ͽ� ��й�ȣ ���� ] 
	public static boolean forgotpassword( String id , String email ) {
		for(Member member : memberlist) {
			if(member.getId().equals(id) && member.getEmail().equals(email))}{
				return true;
		}
		return false; // ��й�ȣã�� ���н� 
	}
	// 5. ȸ������[ ���̵� �μ��� �޾� �ش� ���̵��� ��� ���� ��ȯ ] 
	public Member info( String loginid ) {
		Member member = null;
		return member;
	}
	// 6. ȸ����������[ ���̵�� ���������� �޾Ƽ� ������Ʈ ó���� �������� ��ȯ
	public boolean info ( String loginid , Member updatemember) {
		return true;
	}
	// 7. ȸ��Ż�� [ ���̵� �μ��� �޾� �ش� ���̵� ���� �� �������� ��ȯ
	public boolean delete( String loginid ) {
		return true;
	}
	}