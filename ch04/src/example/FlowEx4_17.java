package example;

import java.util.Scanner;

public class FlowEx4_17 {

	public static void main(String[] args) {		// ����ڷκ��� �������� ���� �Է¹޾� ���� ����ϴ� ���α׷�.
		int num = 0;
		
		System.out.print("*�� ����� ������ ���� �Է��ϼ���,>");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
}
