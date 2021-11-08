package example;


import java.util.Scanner;

public class FlowEx4_4 {

	public static void main(String[] args) {
		int score = 0;			// 점수를 저장하기 위한 변수
		char grade = ' ';		// 학점을 저장하기 위한 변수, 공백으로 초기화한다.
		
		System.out.print("점수를 입력하세요,>");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if(score >= 90)				// 90~	'A
			grade = 'A';
		else if (score >= 80)		// 80~89 'B'
			grade = 'B';
		else if (score >= 70)		// 70~79 'C'
			grade = 'C';
		else if (score >= 60)		// 60~69 'D'
			grade = 'D';
		else
			grade = 'F';			//  score < 60 'F'
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
		
	}
}
