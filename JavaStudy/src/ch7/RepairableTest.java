package ch7;

public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship d = new Dropship();
		Marine m = new Marine();
		SCV scv = new SCV(); 
		scv.repair(tank);
		scv.repair(d);
	}
}

interface Repairable{}

class GroundUnit extends StarUnit{
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends StarUnit{
	AirUnit(int hp) {
		super(hp);
	}
}

class StarUnit {
	int hitPoint;
	final int MAX_HP;
	StarUnit(int hp){
		MAX_HP = hp;
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString(){
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable{
	Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString(){
		return "Dropship";
	}
}

class Marine extends GroundUnit{
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r){
		if(r instanceof StarUnit){
			StarUnit u = (StarUnit)r;
			while(u.hitPoint != u.MAX_HP){
				// Unit의 HP를 증가시킨다.
				u.hitPoint++;
			}
			System.out.println(u.toString()+"의 수리가 끝났습니다.");
		} 
	}
}
