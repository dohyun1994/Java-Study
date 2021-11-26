package example;

class Product {
	int price;				// ��ǰ�� ����
	int bonusPoint;			// ��ǰ���� �� �����ϴ� ���ʽ� ����
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);		// ���ʽ� ������ ��ǰ������ 10%
	}
}

class Tv3 extends Product {
	
	Tv3() {
		super(100);						// ���� Ŭ������ ������ Product(int price)�� ȣ��.
	}
	
	public String toString() {
		return "Tv3";
	}
}

class Computer extends Product {
	
	Computer() { super(200); }			// ���� Ŭ������ ������ Product(int price)�� ȣ��.
	
	public String toString() {
		return "Computer";
	}
}

class Buyer {								// ��, ������ ��� ���
	int money = 1000;						// �����ݾ�		
	int bonusPoint = 0;						// ���ʽ�����
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;					// ���� ��(money)���� ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");			// p.toString�� ����.
	}
}

public class PolyArgumentTestEx7_21 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		Tv3 t = new Tv3();
		b.buy(t);									
//		b.buy(new Tv3());		// ���� ���ٰ� ���� ��ġ.
		
		// int i = 10
		// System.out.println(i);
		// System.out.println(10);		����.
		
		b.buy(new Computer());
		
		System.out.println("���� ���� ���� " + b.money + "���� �Դϴ�.");
		System.out.println("���� ���ʽ� ������ " + b.bonusPoint + "�� �Դϴ�.");

	}
}
