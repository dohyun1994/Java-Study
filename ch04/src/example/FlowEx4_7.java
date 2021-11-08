package example;

import java.util.Scanner;

public class FlowEx4_7 {

	public static void main(String[] args) {
		System.out.print("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.>");	// 1 - 3 = -2,  2 - 1 = 1   ���� ��.
																	// 1 - 2 = -1,  2 - 3 = -1,  3 - 1 = 2	�� ��
																	// user - com = 0 ���.
		
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		int com = (int)(Math.random() * 3) + 1;		// 1, 2, 3 �� �ϳ��� com�� �����.
		
		System.out.println("����� " + user + "�Դϴ�.");
		System.out.println("���� " + com + "�Դϴ�.");
		
		switch(user - com) {
			case 1: case -2:
				System.out.println("����� �̰���ϴ�.");
				break;
			
			case 2: case -1:
				System.out.println("����� �����ϴ�.");
				break;
			
			default:
				System.out.println("�����ϴ�.");	
		}
	}
}
