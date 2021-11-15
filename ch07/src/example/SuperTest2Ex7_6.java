package example;

class Parent2 {
	int x = 10;
	
}

class Child2 extends Parent2 {
	int x = 20;
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}

public class SuperTest2Ex7_6 {

	public static void main(String[] args) {
		
		Child2 ch2 = new Child2();
		ch2.method();	

	}
}
