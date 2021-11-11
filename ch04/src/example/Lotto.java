package example;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45) +1;
			
			for(int j=0; j<i; j++) {	//i=0, 0, i=1, 1, i=2, 2, i=3, 3, i=4, 4, i=5, 5
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.print("로또번호:");
		
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
