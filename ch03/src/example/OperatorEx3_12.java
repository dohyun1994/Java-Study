package example;

public class OperatorEx3_12 {

	public static void main(String[] args) {
		char c1 = 'a';		// c1���� ���� 'a'�� �ڵ尪�� 97�� ����ȴ�.
		char c2 = c1;		// c1�� ����Ǿ� �ִ� ���� c2�� ����ȴ�.
		char c3 = ' ';		// c3�� �������� �ʱ�ȭ �Ѵ�.
		
		int i = c1 + 1;		// 97 + 1 = 98�� i�� ����.
		
		c3 = (char)(c1 + 1);
		c2++;
		c2++;
		
		System.out.println("i=" + i);		// i = 98
		System.out.println("c2=" + c2);		// c2 = c
		System.out.println("c3=" + c3);		// c3 = b 
		
		
		

	}

}
