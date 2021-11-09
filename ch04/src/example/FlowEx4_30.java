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
		
		for(;;) {				// while문과 for문은 서로 100% 변경가능.
			if(sum >100)
				break;			// 자신이 포함된 가장 가까운 반복문 벗어남.
			++i;
			sum += i;	
		}
		
		System.out.println("i=" + i + ", sum=" + sum);
	}
}
