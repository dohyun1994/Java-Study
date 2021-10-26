package example;

class Car {
	String color;
	String gearType;
	int door;
	
	
	Car() {
		this("white", "auto", 4);
	}
	
	Car(Car c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		
	}
}

public class CarTest3Ex6_26 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1);
		System.out.println(c1.color);
		System.out.println(c2.color);
		
		c2.color = "red";
		
		System.out.println(c2.color);
		
		System.out.println(c1.color);
	}

}
