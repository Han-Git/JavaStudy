package ch7;

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		b.buy(tv);
		System.out.println("현재 남은 돈은 "+b.money+"입니다");
		System.out.println("현재 보너스는 "+b.bonusPoint+"입니다");
		
		b.buy(com);
		
		System.out.println("현재 남은 돈은 "+b.money+"입니다");
		System.out.println("현재 보너스는 "+b.bonusPoint+"입니다");
	}
}

class Product{
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100);	// Tv의 가격을 100으로 한다.
	}
	
	public String toString(){	// object 의 toString 을 오버라이딩한다.
		return "Tv";
	}
}

class Computer extends Product{
	Computer() {
		super(200);	// 조상클래스의 생성자 Product(int price) 를 호출한다.
	}
	
	public String toString(){	// object 의 toString 을 오버라이딩한다.
		return "Computer";
	}	
}

class Buyer {	// 고객, 물건을 사는 사람
	int money = 1000; // 소유금액
	int bonusPoint = 0;	// 보너스점수
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		System.out.println(p+"를 구입하셨습니다.");
		
	}
}

