package example;

//class Car {
//	
//	String color;
//	String gearType;
//	int door;
//	
//	Car() {}		// 기본 생성자
//	
//	Car(String c, String g, int d) {		// 매개변수가 있는 생성자
//		color = c; 
//		gearType = g; 
//		door = d; 
//	}
//	
//}

public class CarTestEx6_24 {

	public static void main(String[] args) {
		
		Car c1 = new Car("white", "auto", 4);
		Car c2 = new Car("red", "manual", 5);
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);

	}
}
