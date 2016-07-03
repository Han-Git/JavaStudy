package ch7;

public class PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Tv2 tv = new Tv2();
		Computer2 com = new Computer2();
		Audio2 audio2 = new Audio2();
		b.buy(tv);
		b.buy(com);
		b.buy(audio2);
		b.summary();
		
	}
}

class Product2{
	int price;
	int bonusPoint;
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product2(){
		price = 0;
		bonusPoint = 0;
	}
}

class Tv2 extends Product2{
	Tv2() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100);	// Tv의 가격을 100으로 한다.
	}
	
	public String toString(){	// object 의 toString 을 오버라이딩한다.
		return "Tv2";
	}
}

class Computer2 extends Product2{
	Computer2() {
		super(200);	// 조상클래스의 생성자 Product(int price) 를 호출한다.
	}
	
	public String toString(){	// object 의 toString 을 오버라이딩한다.
		return "Computer2";
	}	
}


class Audio2 extends Product2{
	Audio2() {
		super(50);	// 조상클래스의 생성자 Product(int price) 를 호출한다.
	}
	
	public String toString(){	// object 의 toString 을 오버라이딩한다.
		return "Audio2";
	}	
}


class Buyer2 {	// 고객, 물건을 사는 사람
	int money = 1000; // 소유금액
	int bonusPoint = 0;	// 보너스점수
	Product2[] item = new Product2[10];	// 구입한 제품을 저장하기 위한 배
	int i = 0;	// Product 배열에 사용될 카운터
	
	void buy(Product2 p){
		if(money < p.price){
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		item[i++] = p; 
		System.out.println(p+"를 구입하셨습니다.");
		
	}
	
	void summary(){				// 구입한 물품에 대한 정보를 요약해서 보여 준다.
		int sum = 0;
		String itemList = "";
		
		// 반복문을 이용해서 구입한 물품의 총가격과 목록을 만든다.
		for(int i=0; i<item.length ; i++){
			if(item[i]==null){
				break;
			}
			sum = sum + item[i].price;
			itemList = itemList + item[i] + ",";
		}
		System.out.println("구입하신 물품의 총금액은 "+sum+"입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
}

