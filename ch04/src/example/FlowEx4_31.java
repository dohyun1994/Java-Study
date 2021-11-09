package example;

public class FlowEx4_31 {

	public static void main(String[] args) {
		
//		for(int i=0; i<=10; i++) {
//			if(i % 3 == 0) 			// i가 3의 배수이면, 아래의 println()을 실행하지 않고, for문 블럭 끝으로 이동한 후, 증감식인(i++)로 이동하여 i값이 증가.
//				continue;
//			
//			System.out.println(i);
//		}
		
		int i = 0;		// while문으로 바꿔본 코드.
		while( i<= 10) {
			if(i % 3 == 0) { 		
				++i;
				continue;
			}
			System.out.println(i);
			++i;
		}
	}
}
