package example;

class Point2 {
	int x, y;

	Point2(int x, int y) {
		super();			// �����ص� �����Ϸ��� �ڵ��߰�. ObjectŬ������ �����ڸ� ����.
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
		super(x, y);				// Point2Ŭ������ ������ Point2(int x, int y)�� ����.
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
