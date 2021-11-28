package example;

import java.util.Vector;				// Vector Ŭ������ ����ϱ� ���� import.

class Product4 {
	int price;					// ��ǰ�� ����
	int bonusPoint;				// ��ǰ���Ž� �����ϴ� ����Ʈ(10%)
	
//	Product4() {}				// �⺻ ������
	Product4(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv4 extends Product4 {
	Tv4() { super(100); }			// �⺻ �����ڿ��� Product4 Ŭ������ Product4(int price) ������ ȣ��
	
	public String toString() { return "Tv"; }
}

class Computer4 extends Product4 {
	Computer4() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Audio4 extends Product4 {
	Audio4() { super(50); }
	
	public String toString() { return "Audio"; }
}

class Buyer4 {
	int money = 1000;			// ���� �����ݾ�
	int bonusPoint = 0;
	Vector item = new Vector();			// ������ ��ǰ�� �����ϴµ� ���� Vector��ü(�������� ũ�Ⱑ �����Ǵ� ��ü�迭)
	
	void buy(Product4 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);									// boolean add(Object o) - Vector�� ��ü�� �߰�. �߰� ������ true, ���н� false ��ȯ.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");	
	}
	
	void refund(Product4 p) {							// ������ ��ǰ�� ȯ���Ѵ�.
		if(item.remove(p)) {							// boolean remove(Object o) - Vector�� ����Ǿ� �ִ� ��ü ����. ���� ������ true, ���н� false ��ȯ.
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
		} else {										// ���� ���н�
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");			
		}
	}
	
	void summary() {									// ������ ��ǰ�� ���� ������ ����ؼ� �����ش�.
		int sum = 0;									// ������ ��ǰ�� �����հ�
		String itemList = "";							// ������ ��ǰ���
		
		if(item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Product4 p = (Product4)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p; 		// (i==0) - ��ǰ�� �ϳ��� ������ ���.
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "���� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}	
}

public class PolyArgumentTest3Ex7_23 {

	public static void main(String[] args) {
		Buyer4 b = new Buyer4();
		Tv4 tv = new Tv4();
		Computer4 com = new Computer4();
		Audio4 audio = new Audio4();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}
