package example;

public class FlowEx4_31 {

	public static void main(String[] args) {
		
//		for(int i=0; i<=10; i++) {
//			if(i % 3 == 0) 			// i�� 3�� ����̸�, �Ʒ��� println()�� �������� �ʰ�, for�� �� ������ �̵��� ��, ��������(i++)�� �̵��Ͽ� i���� ����.
//				continue;
//			
//			System.out.println(i);
//		}
		
		int i = 0;		// while������ �ٲ㺻 �ڵ�.
		while( i<= 10) {
			if(i % 3 == 0) { 		
				++i;
				continue;
			}
			System.out.println(i);
			++i;
		}
	}
}
