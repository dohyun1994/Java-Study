package example;

import java.util.Arrays;

public class ArrayEx5_18 {

	public static void main(String[] args) {
		
		int[][] score = {	{ 100, 100, 100},
							{ 20, 20, 20 },
							{ 30, 30, 30 },
							{ 40, 40, 40 }
						 };
		
		int sum = 0;
		
//		for(int i=0; i < score.length; i++) {
//			for(int j=0; j < score[i].length; j++) {
//				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
//			}
//		}
		
		for(int[] tmp : score) {		// score�� �� ���(1���� �迭 �ּ�)�� tmp�� ����
			System.out.println(Arrays.toString(tmp));
			for(int i : tmp) {			// tmp�� 1���� �迭�� ����Ű�� ��������
				sum += i;
			}
		}
		
		System.out.println("sum=" + sum);
	}
}
