package example;

import java.util.Scanner;

public class FlowEx4_27 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		boolean flag = true;		// while���� ���ǽ����� ���� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�հԸ� ���� ���ڸ� �Է��ϼ���. (�������� 0�� �Է�)");
		
		while(flag) {				// flag�� ���� true�϶� ��� ����ȴ�.
			System.out.print(">>");
			num = sc.nextInt();
			
			if(num != 0) {			// �Է°��� 0�� �ƴϸ� �Է°��� sum�� �����ȴ�.
				sum += num;
			} else {				// �Է°��� 0�̸�, flag�� false�� �Ǿ� �ݺ��� ����ȴ�.
				flag = false;
			}
		}
		System.out.println("�հ�: " + sum);	// 0�� �ԷµǱ� ���� �Է°����� �հ踦 ���.
	}
}
