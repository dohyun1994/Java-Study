package example;

import java.util.Scanner;

public class FlowEx4_25 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();				// ȭ���� ���� �Է¹��� ������ tmp�� ����.
		num = Integer.parseInt(tmp);
		
		while( num != 0) {
			
			sum += num % 10;			// �Է¹��� num�� 10���� ���� �������� sum�� ����.(10���� ������ �����ϸ�, 1���ڸ��� ��´�.)
			
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num /= 10;					// num�� 10���� ���� ���� �ٽ� num�� ����.(10���� ������ 1���ڸ��� ���ŵȴ�.)
		}
		System.out.println("�� �ڸ����� ��:" + sum);
		
	}
}
