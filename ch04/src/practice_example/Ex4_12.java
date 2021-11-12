package practice_example;

public class Ex4_12 {

	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<10; j +=3) {
				System.out.printf("%d*%d=%d ", j, i, j*i );
			}
			System.out.println();
		}

	}

}
