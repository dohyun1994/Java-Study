package example;


import java.util.Scanner;

public class FlowEx4_4 {

	public static void main(String[] args) {
		int score = 0;			// ������ �����ϱ� ���� ����
		char grade = ' ';		// ������ �����ϱ� ���� ����, �������� �ʱ�ȭ�Ѵ�.
		
		System.out.print("������ �Է��ϼ���,>");
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
		
		System.out.println("����� ������ " + grade + "�Դϴ�.");
		
	}
}
