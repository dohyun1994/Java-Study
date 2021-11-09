package example;

public class FlowEx4_20 {

	public static void main(String[] args) {		// x,y 좌표 출력하기.
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("[%d, %d]", i, j);
			}
			System.out.println();
		}
	}
}
