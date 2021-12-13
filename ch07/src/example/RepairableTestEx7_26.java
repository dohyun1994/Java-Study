package example;

interface Repairable {}

class Unit3 {
	int hitPoint;
	final int MAX_HP;
	
	Unit3(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit3 {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit3 {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank2 extends GroundUnit implements Repairable {
	Tank2() {
		super(150);		// Tank의 HP는 150;
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}	
}

class Dropship2 extends AirUnit implements Repairable {

	Dropship2() {
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}

class Marine2 extends GroundUnit {

	Marine2() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit3) {
			Unit3 u = (Unit3) r;
			while(u.hitPoint != u.MAX_HP) {
				// Unit3의 HP를 증가시킨다.
				u.hitPoint++;
			}
			System.out.println( u.toString() + "의 수리가 끝났습니다.");
		}
	}
}


public class RepairableTestEx7_26 {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Dropship2 dropship2 = new Dropship2();
		
		Marine2 marine2 = new Marine2();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship2);
//		scv.repair(marine2);

	}
}
