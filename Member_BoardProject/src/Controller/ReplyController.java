package Controller;

import Model.Board;
import Model.Reply;

public class ReplyController {
// 1. �޼ҵ�
	// 
	public static boolean add(int index, Reply reply) {
							// �Խù� ��ȣ, ��� ��ü
							// � �Խù��� ������ �߰� �Ҳ���
		
		try {
		BoardController.boardlist.get(index).getReplylist().add(reply);
		return true;
		} catch (Exception e) {
			
			return false;
		}
	}
}
