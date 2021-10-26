package example;

class Card {
	String kind;
	int number;
	
	static int width = 100;
	static int height = 250;
	
	
}


public class CardTestEx6_5 {
	
	public static void main(String[] args) {
		
		
		
		System.out.println(Card.width);		// static 변수, 객체생성 없이 사용가능.
		System.out.println(Card.height);	// static 변수, 객체생성 없이 사용가능.
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
		
		System.out.println("c1의 width와 height를 각각 150, 300으로 변경합니다.");
		c1.width = 150;
		c1.height = 300;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );

	}

}
