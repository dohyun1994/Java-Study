package practice_example;

public class Ex4_14 {

	public static void main(String[] args) {

		int answer = (int)(Math.random() * 100) + 1;	// ���䰪.
		int input = 0;			// ����� �Է��� ����.
		int count = 0;			// �õ�Ƚ���� �������� ����
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
			input = sc.nextInt();		// �Է¹��� ���� ���� input�� �����Ѵ�.
			
			if( input < answer) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if( input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� " + count + "���Դϴ�.");
				break;			// ������ �������Ƿ� do-while�� �����.
			}
			
		}while(true);		// ���� �ݺ���

	}
}
