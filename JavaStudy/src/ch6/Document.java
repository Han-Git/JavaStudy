package ch6;

public class Document {
	static int count = 0;
	String name;
	
	public Document() {
		// TODO Auto-generated constructor stub
		this("�������"+ ++count);
	}
	public Document(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		System.out.println("���� "+this.name+"�� �����Ǿ����ϴ�.");
	}
	
}
