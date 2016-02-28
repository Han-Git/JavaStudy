package ch6;
class MyPoint{
	int x;
	int y;
	
	public MyPoint(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1){
		
		return 0;
	}
}

public class Exercise6_7 {
	
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2,2));
	}
}
