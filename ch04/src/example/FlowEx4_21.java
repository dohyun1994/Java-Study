package example;

public class FlowEx4_21 {

	public static void main(String[] args) {
//		for(int i=1; i<=5; i++) {			// i == j 를 만족하는 경우에만 i,j 좌표값 출력.
//			for(int j=1; j<=5; j++) {
//				if(i == j) {
//					System.out.printf("[%d,%d]", i, j);
//				} else {
//					System.out.printf("%5c", ' ');
//				}
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=5; i++) {				// if문의 조건에 따라 여러가지 출력형태로 출력가능.
//			for(int j=1; j<=5; j++) {			// x자 모양으로 좌표값 출력하기.
//				if((i + j == 6) || (i == j)) {
//					System.out.printf("[%d,%d]", i, j);
//				} else {
//					System.out.printf("%5c", ' ');
//				}
//			}
//			System.out.println();
//			
//		}
		
		for(int i=1; i<=5; i++) {				// if문의 조건에 따라 여러가지 출력형태로 출력가능.
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
