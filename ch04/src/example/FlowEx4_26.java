package example;

public class FlowEx4_26 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
//		// i를 증가시켜서 sum에 계속 더해나간다.
//		while(sum <= 100) {
//			System.out.println(i + " - " + sum);
//			sum += ++i;					// 출력 후에 sum을 더해야함. 그래야 100이 넘었을 경우 출력이 안됨.
//
//		}
		
		// i를 증가시켜서 sum에 계속 더해나간다.
		while( (sum += ++i) <= 100) {
			System.out.println(i + " - " + sum);
			
		}
		
	}
}
