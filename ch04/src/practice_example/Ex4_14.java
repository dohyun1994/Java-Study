package practice_example;

public class Ex4_14 {

	public static void main(String[] args) {

		int answer = (int)(Math.random() * 100) + 1;	// 정답값.
		int input = 0;			// 사용자 입력을 저장.
		int count = 0;			// 시도횟수를 세기위한 변수
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = sc.nextInt();		// 입력받은 값을 변수 input에 저장한다.
			
			if( input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if( input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번입니다.");
				break;			// 정답을 맞췄으므로 do-while문 벗어난다.
			}
			
		}while(true);		// 무한 반복문

	}
}
