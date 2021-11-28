package example;

import java.util.Vector;				// Vector 클래스를 사용하기 위해 import.

class Product4 {
	int price;					// 제품의 가격
	int bonusPoint;				// 제품구매시 제공하는 포인트(10%)
	
//	Product4() {}				// 기본 생성자
	Product4(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv4 extends Product4 {
	Tv4() { super(100); }			// 기본 생성자에서 Product4 클래스의 Product4(int price) 생성자 호출
	
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
	int money = 1000;			// 고객의 보유금액
	int bonusPoint = 0;
	Vector item = new Vector();			// 구입한 제품을 저장하는데 사용될 Vector객체(동적으로 크기가 관리되는 객체배열)
	
	void buy(Product4 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);									// boolean add(Object o) - Vector에 객체를 추가. 추가 성공시 true, 실패시 false 반환.
		System.out.println(p + "을/를 구입하셨습니다.");	
	}
	
	void refund(Product4 p) {							// 구입한 제품을 환불한다.
		if(item.remove(p)) {							// boolean remove(Object o) - Vector에 저장되어 있는 객체 제거. 제거 성공시 true, 실패시 false 반환.
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {										// 제거 실패시
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");			
		}
	}
	
	void summary() {									// 구입한 물품에 대한 정보를 요약해서 보여준다.
		int sum = 0;									// 구입한 물품의 가격합계
		String itemList = "";							// 구입한 물품목록
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Product4 p = (Product4)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p; 		// (i==0) - 제품을 하나만 구매한 경우.
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
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
