package example;

class Point2 {
	int x, y;

	Point2(int x, int y) {
		super();			// 생략해도 컴파일러가 자동추가. Object클래스의 생성자를 뜻함.
		this.x = x;
		this.y = y;
	}
	
	void getLocation() {
		System.out.println("x :" + x + ", y :" + y);
	}
}

class Point3D extends Point2 {
	int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);				// Point2클래스의 생성자 Point2(int x, int y)를 뜻함.
//		this.x = x;
//		this.y = y;
		this.z = z;
	}
	 
	void getLocation() {
		System.out.println("x :" + x + ", y :" + y + ", z :" + z);
	
	}
}

public class PointTestEx7_7 {
	
	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);
		p3.getLocation();
		
	}
}
