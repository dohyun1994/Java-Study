package example;

public class FlowEx4_21 {

	public static void main(String[] args) {
//		for(int i=1; i<=5; i++) {			// i == j �� �����ϴ� ��쿡�� i,j ��ǥ�� ���.
//			for(int j=1; j<=5; j++) {
//				if(i == j) {
//					System.out.printf("[%d,%d]", i, j);
//				} else {
//					System.out.printf("%5c", ' ');
//				}
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=5; i++) {				// if���� ���ǿ� ���� �������� ������·� ��°���.
//			for(int j=1; j<=5; j++) {			// x�� ������� ��ǥ�� ����ϱ�.
//				if((i + j == 6) || (i == j)) {
//					System.out.printf("[%d,%d]", i, j);
//				} else {
//					System.out.printf("%5c", ' ');
//				}
//			}
//			System.out.println();
//			
//		}
		
		for(int i=1; i<=5; i++) {				// if���� ���ǿ� ���� �������� ������·� ��°���.
			for(int j=1; j<=5; j++) {			
				if((1<=i && i<=5) && (j==5)) {
					System.out.printf("[%d,%d]", i, j);
				} else {
					System.out.printf("%5c", ' ');
				}
			}
			System.out.println();
			
		}

	}
}
