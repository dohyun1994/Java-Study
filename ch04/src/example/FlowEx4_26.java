package example;

public class FlowEx4_26 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
//		// i�� �������Ѽ� sum�� ��� ���س�����.
//		while(sum <= 100) {
//			System.out.println(i + " - " + sum);
//			sum += ++i;					// ��� �Ŀ� sum�� ���ؾ���. �׷��� 100�� �Ѿ��� ��� ����� �ȵ�.
//
//		}
		
		// i�� �������Ѽ� sum�� ��� ���س�����.
		while( (sum += ++i) <= 100) {
			System.out.println(i + " - " + sum);
			
		}
		
	}
}
