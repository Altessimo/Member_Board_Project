package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reply {
private String contents;
private String wrier;
private String date;

public Reply() {}

public Reply(String contents, String wrier) {
	this.contents = contents;
	this.wrier = wrier;
	
	Date date = new Date(); // 현재시간 클래스
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd");
	this.date = simpleDateFormat.format(date);
}

public String getContents() {
	return contents;
}

public void setContents(String contents) {
	this.contents = contents;
}

public String getWrier() {
	return wrier;
}

public void setWrier(String wrier) {
	this.wrier = wrier;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}


}
