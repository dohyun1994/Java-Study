

import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		int score = 0;		// ������ �����ϱ� ���� ����
		char grade = ' ';	// ������ �����ϱ� ���� ����, �������� �ʱ�ȭ
 		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���:");
		
		score = sc.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		System.out.println("����� ������ " + grade + "�Դϴ�.");
		
		
		

	}

}
