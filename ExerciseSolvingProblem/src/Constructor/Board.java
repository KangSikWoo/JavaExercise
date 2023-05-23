package Constructor;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board() {}
	
	Board(String title, String content) {
		this(title, content, "로그인한 회원 아이디", "현재 컴퓨터 날짜", 0);
	}
	
	Board(String title, String content, String writer) {
		this(title, content, writer, "현재 컴퓨터 날짜", 0);
	}
	
	Board(String title, String content, String writer, String date) {
		this(title, content, writer, date, 0);
	}
	
	//마지막에 이렇게 생성자를 다 초기화 해주는 부분이 있어야 this(); 구문 사용 가능
	//밑의 생성자를 위에서 호출하는 방식
	Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}

}
