package practice_example;

class MyPoint {
	int x;		// �ν��Ͻ� ����
	int y;		// �ν��Ͻ� ����
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		return Math.sqrt( (x-x1)*(x-x1) + (y-y1)*(y-y1) );		// x, y�� �ν��Ͻ� ����
	}
}



public class Ex6_7 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		// p�� (2,2)�� �Ÿ��� ���Ѵ�.
		System.out.println(p.getDistance(2, 2));
		

	}

}