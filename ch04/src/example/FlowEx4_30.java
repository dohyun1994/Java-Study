package example;

public class FlowEx4_30 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
//		while(true) {
//			if(sum > 100)
//				break;
//			
//			++i;
//			sum += i;
//		}
		
		for(;;) {				// while���� for���� ���� 100% ���氡��.
			if(sum >100)
				break;			// �ڽ��� ���Ե� ���� ����� �ݺ��� ���.
			++i;
			sum += i;	
		}
		
		System.out.println("i=" + i + ", sum=" + sum);
	}
}
