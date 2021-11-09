package example;

import java.util.Scanner;

public class FlowEx4_27 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		boolean flag = true;		// while문의 조건식으로 사용될 변수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("합게를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");
		
		while(flag) {				// flag의 값이 true일때 계속 실행된다.
			System.out.print(">>");
			num = sc.nextInt();
			
			if(num != 0) {			// 입력값이 0이 아니면 입력값이 sum에 누적된다.
				sum += num;
			} else {				// 입력값이 0이면, flag가 false가 되어 반복문 종료된다.
				flag = false;
			}
		}
		System.out.println("합계: " + sum);	// 0이 입력되기 전의 입력값들의 합계를 출력.
	}
}
