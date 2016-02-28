package ch7;

public class Point3D extends Point{
	int z = 30;
	public Point3D() {
		// TODO Auto-generated constructor stub
		this(100,200,300);
	}
	
	Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
}
