package ch6;

public class CarTest2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("Blue");
		
		System.out.println("c1.color="+c1.color+", "+"c1.gearType="+c1.gearType+", "+"c1.door="+c1.door);
		System.out.println("c2.color="+c2.color+", "+"c2.gearType="+c2.gearType+", "+"c2.door="+c2.door);
	}
}
