package example;

import java.util.Scanner;

public class FlowEx4_28 {

	public static void main(String[] args) {
		int input = 0;
		int random = 0;
		
		Scanner sc = new Scanner(System.in);
		random = (int)(Math.random() * 100) + 1;	// 1~100 ������ ������ ����.
		
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ���.>");
			input = sc.nextInt();
			
			if(input > random) {
				System.out.println("�� ���� ������ �ٽ� �õ��غ�����.!!");
			}else if(input < random) {
				System.out.println("�� ū ������ �ٽ� �õ��غ�����.!!");
			} 
			
		} while(input != random);		// input����, random���� ���� ������ ��� �ݺ�. ������ �ݺ��� ����.
		
		System.out.println("�����Դϴ�. input="  + input + " , random=" + random );
	}
}
