package ch6;

public class CarTest3 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1);
		
		System.out.println("c1.color="+c1.color+", "+"c1.gearType="+c1.gearType+", "+"c1.door="+c1.door);
		System.out.println("c2.color="+c2.color+", "+"c2.gearType="+c2.gearType+", "+"c2.door="+c2.door);
		
		c1.door = 100;
		System.out.println("After c1.door = 100 !!!");
		System.out.println("c1.color="+c1.color+", "+"c1.gearType="+c1.gearType+", "+"c1.door="+c1.door);
		System.out.println("c2.color="+c2.color+", "+"c2.gearType="+c2.gearType+", "+"c2.door="+c2.door);
		
	}
}
