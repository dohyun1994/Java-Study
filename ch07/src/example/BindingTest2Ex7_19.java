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
		
		System.out.println("p.x = " + p.x);			// �ڼ� Ŭ�������� ���� Ŭ������ ����� �ߺ����� �������� �ʾ��� ����,
		System.out.println("c.x = " + c.x);			// ���������� Ÿ�Կ� ���� ��ȭ�� ����.(x�� ���� ����)
		
		p.method();
		c.method();
		
	}
}
