package example;

class Card2 {
	
	final String KIND;			// ������� ����� �Բ� �ʱ�ȭ ���� �ʰ�,
	final int NUMBER;			// �����ڿ��� �� �ѹ��� �ʱ�ȭ �� �� �ִ�.
	static int width = 100;
	static int height = 250;
	
	Card2(String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}
	
	Card2() {
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
	
}

public class FinalCardTestEx7_12 {

	public static void main(String[] args) {
		Card2 c = new Card2("HEART", 10);
		
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
//		System.out.println(c.toString());
	}

}