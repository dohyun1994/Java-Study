package practice_example;

public class Ex3_8 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);		// byte + byte�� ������ �ϸ� ����ȯ�� �Ǿ� int���� �ȴ�.
		
		char ch = 'A';
		ch = (char) (ch + 2);	// charŸ���� ���������� ������ ��ġ�鼭 intŸ������ ��ȯ�ȴ�.
		
		float f = 3 / 2f;
		long l = 3000 * 3000 * 3000L;
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float)d == f2;	// �񱳿����ڵ� ���׿������̹Ƿ� ���� �ÿ� �� �ǿ������� Ÿ���� ���߱� ���� ����ȯ�� �߻��Ѵ�. 
											// �׷��� double�� float�� ������ double�� double�� �������� �ڵ�����ȯ �Ǵµ�, �Ǽ��� ������ �޸� �ٻ簪���� ǥ���� �ϱ� ������ float�� double�� ����ȯ���� �� ������ �߻��� �� �ִ�.
											// �׷��� float���� double�� ����ȯ�ϱ� ���ٴ� double���� ��ȿ�ڸ����� ���� float�� ����ȯ�ؼ� ���ϴ� ���� ��Ȯ�� ����� ��´�. 
		System.out.println("c=" + c);
		System.out.println("ch=" + ch);
		System.out.println("f=" + f);
		System.out.println("l=" + l);
		System.out.println("result=" + result);
	}
}

/*[������]
c=30
ch=C
f=1.5
l=27000000000
result=true
*/