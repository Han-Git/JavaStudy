package ch7;

public class BindingTest {
	public static void main(String[] args) {
		ParentBind p = new ChildBind();
		ChildBind c = new ChildBind();
		
		System.out.println("p.x==="+p.x);
		p.method();
		
		System.out.println("c.x==="+c.x);
		c.method();
	}
}

class ParentBind {
	int x = 100;
	
	void method(){
		System.out.println("ParentBind method()");
	}
}

class ChildBind extends ParentBind{
	int x = 200;
	
	void method(){
		System.out.println("April I Love you!");
		System.out.println("ChildBind method()");
	}
}