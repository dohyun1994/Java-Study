package example;

import java.util.Scanner;

public class FlowEx4_5 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수를 입력해주세요.>");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();		// 화면을 통해 입력받은 점수를 score에 저장.
		
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
		if (score >= 90) {					// score가 90점 이상이면 ,
			
			grade = 'A';					// A학점(grade)
			
			if(score >= 98) {				// 90점 이상 중에서도 98점 이상이면,
				opt = '+';					// opt = '+'
			} else if(score < 94) {			// 94점 미만이면, opt = '-'
				opt = '-';
			}
			
		} else if(score >= 80) {
			grade = 'B';
			
			if(score >= 88) {
				opt = '+';
			}else if(score < 84) {
				opt = '-';
			}
		} else {							// 80점 미만이면 무조건 C학점.
			grade = 'C';
		}
		
		System.out.println("당신의 학점은 " + grade + opt + "입니다.");
//		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);	

	}
}
