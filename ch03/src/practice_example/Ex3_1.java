package practice_example;

public class Ex3_1 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c= 'A';		// 'A'�� �����ڵ�� 65
		
		System.out.println(1 + x << 33);				// 6. int�� 32bit�̹Ƿ� 33�� shift �����ʰ�, 1���� shift 
		System.out.println(y >= 5 || x < 0 && x >2);	// true. �������ڴ� OR ���꺸�� AND ������ �켱������ ����.
		System.out.println(y += 10 - x++);				// 13.  y = y + (10 - x++);	 ������ x���� 3����.
		System.out.println(x += 2);						// 5.	x = x+2 
		System.out.println( !('A' <= c && c <= 'Z') );	// false
		System.out.println('C' - c);					// 2.  67 - 65 = 2	�ǿ����ڰ� int���� ���� Ÿ��(byte, short, char)�� ��� int�� ��ȯ�� ���� �������.
		System.out.println('5' - '0');					// 5.  '5' = 53  '0= 48  int������ ��ȯ�� �� ���� ���� ->  53 - 48 = 5
		System.out.println(c+1);						// 66	// char���� ���� 1�� ��������.  int������ ��ȯ�� �� ���� ����. ����� int��.
		
		System.out.println(++c);						// B  ���׿����� '++'�� ���׿����ڿ� �޸� int���� ���� Ÿ�Ե� ����ȯx.
		System.out.println(c++);						// B  �׷��� println�� ����c�� ����(int)�� ����ϴ� ���� �ƴ϶� ���ڷ� ���.
		System.out.println(c);							// C  ���� c�� ����� ���ڰ� 'A'(���� ����� ���� 65)�̹Ƿ� �����ڵ��� ���� 1�����Ǿ� 66('B'�� �����ڵ�)�� ���� c�� ����ȴ�.
														//	  ���� c�� ����� ���� �����ڵ�, �� ������. println�� �� ���� Ÿ�Կ� ���� ��� ������� ����.
														//	  ���� ����Ÿ���̸� ����� ��(�����ڵ�)�� �ش��ϴ� ���ڸ� ����ϰ� ���ڶ�� ���ڷ� ���.
	}
}
