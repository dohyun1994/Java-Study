package example;

class Tv {
	
	String color;
	boolean power;
	static int channel;

	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
		
	}
	
	void channelDown() {
		channel--;
	}
}


public class TvTest2Ex6_2 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println(t1.channel);
		
		t1.channelUp();
		
		System.out.println(t1.channel);

		System.out.println(t2.channel);
		
		t2.channelUp();
		
		System.out.println(t1.channel);

		System.out.println(t2.channel);
		
	}

}
