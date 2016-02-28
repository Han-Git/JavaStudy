package ch7;

final class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance(){
		if(s==null){
			s = new Singleton();
		}
		return s;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		//Singleton s = new Singleton();
		Singleton s1 = Singleton.getInstance();
		System.out.println("s1==="+s1);
	}
}
