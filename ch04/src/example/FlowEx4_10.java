package example;

import java.util.Scanner;

public class FlowEx4_10 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.print("������ �Է��ϼ���.(1~100)>");
		
		Scanner sc = new Scanner(System.in);
		
		score = sc.nextInt();
		
		switch(score / 10) {
			case 10:
			case 9:
				grade = 'A';
				break;
				
			case 8:
				grade = 'B';
				break;
				
			case 7:
				grade = 'C';
				break;
				
			default:
				grade = 'F';
		}
		System.out.println("����� ������ " + grade + "�Դϴ�.");

	}

}
