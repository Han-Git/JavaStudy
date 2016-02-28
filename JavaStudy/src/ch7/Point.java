package ch7;

public class Point {
	int x = 10;
	int y = 20;
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	String getLoacation(){
		return "x="+x+", y="+y;
	}
}
