package example;

public class ArrayEx5_5 {

	public static void main(String[] args) {
		int sum = 0;			// �迭�� ����� ��� ���� ������ �����ϱ� ���� ���� sum.
		float average = 0f;		// ����� �����ϱ� ���� ���� average.
		
		int[] score = { 100, 88, 100, 100, 90 };
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		average = sum / (float)score.length;	// ������� float�� ��� ���ؼ� ����ȯ.
												// 478 / (float)5 -> 478 / 5.0f -> 478.0f / 5.0f
		
		System.out.println("���� : " + sum );
		System.out.println("��� : " + average);
	}
}
