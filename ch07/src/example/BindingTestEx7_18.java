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
		
		System.out.println("p.x = " + p.x);		// ����Ÿ���� ���������� �ڼ� �ν��Ͻ��� �����ϴ� ����,
		System.out.println("c.x = " + c.x);		// �ڼ�Ÿ���� ���������� �ڼ� �ν��Ͻ�(�ڽ��� �ν��Ͻ�)�� �����ϴ� ��� ���� �ٸ� ���.
		
		p.method();			// �޼���� �׻� ���� �ν��Ͻ��� �޼���(�������̵� �� �޼���)�� ȣ��
		c.method();			// �޼���� �׻� ���� �ν��Ͻ��� �޼���(�������̵� �� �޼���)�� ȣ��

	}

}
