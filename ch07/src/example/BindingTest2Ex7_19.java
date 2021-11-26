package example;

class Parent4 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child4 extends Parent4 {
	
}

public class BindingTest2Ex7_19 {

	public static void main(String[] args) {
		Parent4 p = new Child4();
		Child4 c = new Child4();
		
		System.out.println("p.x = " + p.x);			// 자손 클래스에서 조상 클래스의 멤버를 중복으로 정의하지 않았을 때는,
		System.out.println("c.x = " + c.x);			// 참조변수의 타입에 따른 변화는 없다.(x의 값은 동일)
		
		p.method();
		c.method();
		
	}
}
