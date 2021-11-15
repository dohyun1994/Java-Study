package example;

class Parent {
	int x = 10;
}

class Child extends Parent {
	
	void method() {
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x);
		System.out.println("super.x= " + super.x);		// super - 인스턴스 메서드(생성자)내에서만 존재. 조상의 멤버와 자신의 멤버를 구별할 때 사용.
	}
}

public class SuperTestEx7_5 {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.method();
		
	}

}
