package ch7;

import java.util.Vector;

public class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer3 b = new Buyer3();
		Tv3 tv = new Tv3();
		Computer3 com = new Computer3();
		Audio3 audio3 = new Audio3();
		b.buy(tv);
		b.buy(com);
		b.buy(audio3);
		b.summary();
		System.out.println();
		
		b.refund(com);
		b.summary();
	}
}

class Product3{
	int price;
	int bonusPoint;
	
	Product3(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product3(){
		price = 0;
		bonusPoint = 0;
	}
}

class Tv3 extends Product3{
	Tv3() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100);	// Tv의 가격을 100으로 한다.
	}
	
	public String toString(){	// object 의 toString 을 오버라이딩한다.
		return "Tv3";
	}
}

class Computer3 extends Product3{
	Computer3() {
		super(200);	// 조상클래스의 생성자 Product(int price) 를 호출한다.
	}
	
	public String toString(){	// object 의 toString 을 오버라이딩한다.
		return "Computer3";
	}	
}


class Audio3 extends Product3{
	Audio3() {
		super(50);	// 조상클래스의 생성자 Product(int price) 를 호출한다.
	}
	
	public String toString(){	// object 의 toString 을 오버라이딩한다.
		return "Audio3";
	}	
}


class Buyer3 {	// 고객, 물건을 사는 사람
	int money = 1000; // 소유금액
	int bonusPoint = 0;	// 보너스점수
	Vector item = new Vector();		//제품을 저장하는데 사용될 Vector 객체
	
	void buy(Product3 p){
		if(money < p.price){
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		item.add(p);	// 구입한 제품을 Vector 에 저장한다. 
		System.out.println(p+"를 구입하셨습니다.");
		
	}
	
	void refund(Product3 p){
		if(item.remove(p)){
			money = money + p.price;
			bonusPoint = bonusPoint + p.bonusPoint;
			System.out.println(p+"을/를 반품하셨습니다.");
		}else{
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary(){				// 구입한 물품에 대한 정보를 요약해서 보여 준다.
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()){		// Vector 가 비어있는지 확인한다.
			System.out.println("구입하신 제품이없습니다.");
			return;
		}
		
		for(int i=0; i<item.size() ;i++){
			Product3 p = (Product3) item.get(i);
			sum = sum + p.price;
			itemList = itemList + ((i==0) ? "" + p : ", " +p);
		}
		
		System.out.println("구입하신 물품의 총금액은 "+sum+"입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
}
