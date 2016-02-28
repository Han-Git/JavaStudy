package ch6;

public class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard() {
		num = 1;
		isKwang = true;
	}
	
	public SutdaCard(int a , boolean b) {
		num = a;
		isKwang = b;
	}
	
	public String info(){
		if(isKwang){
			return num+"K";
		}else{
			return num+"";
		}
	}
}
