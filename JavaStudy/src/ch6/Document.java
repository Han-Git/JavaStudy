package ch6;

public class Document {
	static int count = 0;
	String name;
	
	public Document() {
		// TODO Auto-generated constructor stub
		this("제목없음"+ ++count);
	}
	public Document(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		System.out.println("문서 "+this.name+"가 생성되었습니다.");
	}
	
}
