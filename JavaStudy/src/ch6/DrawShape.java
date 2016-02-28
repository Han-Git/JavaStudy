package ch6;
import java.awt.Frame;
import java.awt.Graphics;

public class DrawShape extends Frame{
	public DrawShape(String title) {
		super(title);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		DrawShape win = new DrawShape("draw a model.");
		
	}
	
	public void paint(Graphics g){
		Point[] p = {
				new Point(100,100),
				new Point(140,50),
				new Point(200,100)
		};
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150,150),50);
	}
	
}
