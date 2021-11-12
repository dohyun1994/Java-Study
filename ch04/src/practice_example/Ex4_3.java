package practice_example;

public class Ex4_3 {

	public static void main(String[] args) {
		//1 + 3 + 6 + 10 + 15 + 21 + 28 + 36 + 45 + 55 = 220
		
		int sum = 0;
		int totalSum = 0;
		
		for(int i=1; i <= 10; i++) {
			sum += i;
			totalSum += sum;		
		}
		
		System.out.println("sum=" + sum);
		System.out.println("totalSum=" + totalSum);
	
	}
}
