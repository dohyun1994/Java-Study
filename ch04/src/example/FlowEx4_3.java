package example;

import java.util.Scanner;

public class FlowEx4_3 {

	public static void main(String[] args) {
		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if( input == 0) {			// if-else�� ���� �� ���� ������ �ϳ����� ��� ��{} ��������.
			System.out.println("�Է��Ͻ� ���ڴ� " + input + "�Դϴ�.");
		}
		else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		}

	}
}
