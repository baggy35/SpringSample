package kr.green.spring.object;

public class Board {
	private String title;
	private String contents;
	private int number;
	private static int cnt=0;
	public Board(String t, String c) {
		this.title = t;
		this.contents = c;
		this.number = ++cnt;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
