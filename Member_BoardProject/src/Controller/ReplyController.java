package Controller;

import Model.Board;
import Model.Reply;

public class ReplyController {
// 1. 메소드
	// 
	public static boolean add(int index, Reply reply) {
							// 게시물 번호, 댓글 객체
							// 어떤 게시물에 댓을을 추가 할껀지
		
		try {
		BoardController.boardlist.get(index).getReplylist().add(reply);
		return true;
		} catch (Exception e) {
			
			return false;
		}
	}
}
