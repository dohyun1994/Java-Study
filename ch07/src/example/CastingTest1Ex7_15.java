package example;

class Car {
	String color;
	int door;
	
	void drive() {			// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {			// 멈추는 기능
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {		// 소방차
	
	void water() {			// 물 뿌리는 기능
		System.out.println("water!!!");
	}	
}

public class CastingTest1Ex7_15 {

	public static void main(String[] args) {
		Car car = null;
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
//		car.water();		// error!! Car타입의 참조변수로 water() 호출불가.
		
		fe2 = (FireEngine)car;
		fe2.water();	
	}
}
