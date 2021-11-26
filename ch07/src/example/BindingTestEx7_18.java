package example;

class Parent3 {
	int x = 100;
	
	void method() {
		System.out.println("Parent3 Method");
	}
}

class Child3 extends Parent3 {
	int x = 200;
	
	void method() {
		System.out.println("Child3 Method");
	}
}

public class BindingTestEx7_18 {

	public static void main(String[] args) {
		Parent3 p = new Child3();
		Child3 c = new Child3();
		
		System.out.println("p.x = " + p.x);		// 조상타입의 참조변수로 자손 인스턴스를 참조하는 경우와,
		System.out.println("c.x = " + c.x);		// 자손타입의 참조변수로 자손 인스턴스(자신의 인스턴스)를 참조하는 경우 서로 다른 결과.
		
		p.method();			// 메서드는 항상 실제 인스턴스의 메서드(오버라이딩 된 메서드)가 호출
		c.method();			// 메서드는 항상 실제 인스턴스의 메서드(오버라이딩 된 메서드)가 호출

	}

}
