package example;

public class FlowEx4_24 {

	public static void main(String[] args) {
		int i=11;
		
		System.out.println("ī��Ʈ �ٿ��� �����մϴ�.");
		
		while( i-- != 0) {
			System.out.println(i);
			
			for(int j=0; j<2_000_000_000; j++) {		// for������ �� ��¸��� �ణ�� �ð��� �����ǵ��� �ߴ�.
				;
			}
		}
		System.out.println("Game Over");
	}
}
