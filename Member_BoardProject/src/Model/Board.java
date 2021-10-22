package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.crypto.Data;

// 1. 필드
public class Board {
private String title;
private String contents;
private String writer;
private String date;
private int view;

ArrayList<Reply> replylist;

// 2. 생성자 
public Board(){ // 빈 생성자 : 1. 메소드 호출시, 2. 빈 객체 생성 후 추후에 필드 값 대입
	
}

// 게시물 등록시 사용되는 생성자
public Board(String title, String contents, String writer) {
	super();
	this.title = title;
	this.contents = contents;
	this.writer = writer;
	Date date = new Date(); // 현재시간 클래스
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd");
	this.date = simpleDateFormat.format(date);
	
	this.view = 1;
	this.replylist = new ArrayList<>(); 
}
// 파일 로드시 사용되는 생성자
public Board(String title, String contents, String writer, String date, int view) {
	this.title = title;
	this.contents = contents;
	this.writer = writer;
	this.date = date;
	this.view = view;
	this.replylist = new ArrayList<>();
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getContents() {
	return contents;
}

public void setContents(String contents) {
	this.contents = contents;
}

public String getWriter() {
	return writer;
}

public void setWriter(String writer) {
	this.writer = writer;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public int getView() {
	return view;
}

public void setView(int view) {
	this.view = view;
}

public ArrayList<Reply> getReplylist() {
	return replylist;
}

public void setReplylist(ArrayList<Reply> replylist) {
	this.replylist = replylist;
}

}
