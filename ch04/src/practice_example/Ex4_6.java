package practice_example;

public class Ex4_6 {

	public static void main(String[] args) {

		// (1, 5), (5, 1), (2, 4), (4, 2), (3, 3)		
		for(int i=1; i <= 5; i++) {
			for(int j=1; j <= 5; j++) {
				if(i+j == 6)
					System.out.println(i + "+" + j + "=" + (i+j) );
			}

		}

	}

}
