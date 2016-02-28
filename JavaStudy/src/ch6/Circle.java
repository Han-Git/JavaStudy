package ch6;

public class Circle {
	Point center;
	int r;
	
	public Circle() {
		this(new Point(0,0),100);
	}
	
	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
}
