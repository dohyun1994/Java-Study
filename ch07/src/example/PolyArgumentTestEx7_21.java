package example;

class Product {
	int price;				// 제품의 가격
	int bonusPoint;			// 제품구매 시 제공하는 보너스 점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);		// 보너스 점수는 제품가격의 10%
	}
}

class Tv3 extends Product {
	
	Tv3() {
		super(100);						// 조상 클래스의 생성자 Product(int price)를 호출.
	}
	
	public String toString() {
		return "Tv3";
	}
}

class Computer extends Product {
	
	Computer() { super(200); }			// 조상 클래스의 생성자 Product(int price)를 호출.
	
	public String toString() {
		return "Computer";
	}
}

class Buyer {								// 고객, 물건을 사는 사람
	int money = 1000;						// 소유금액		
	int bonusPoint = 0;						// 보너스점수
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;					// 가진 돈(money)에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");			// p.toString과 같음.
	}
}

public class PolyArgumentTestEx7_21 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		Tv3 t = new Tv3();
		b.buy(t);									
//		b.buy(new Tv3());		// 위의 두줄과 같은 이치.
		
		// int i = 10
		// System.out.println(i);
		// System.out.println(10);		예시.
		
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점 입니다.");

	}
}
