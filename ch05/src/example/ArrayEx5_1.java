package example;

import java.util.Arrays;

public class ArrayEx5_1 {

	public static void main(String[] args) {
		
		int[] score = new int[5];
		
//		int[] score = new int[] {50, 60, 70, 80, 90};	// �迭�� ������ �ʱ�ȭ�� ���ÿ� 
		
//		int[] score = {50, 60, 70, 80, 90}				// new int[]�� ������ �� ����.
		
		
//		int k = 1;
//		score[0] = 50;
//		score[1] = 60;
//		score[k+1] = 70;
//		score[3] = 80;
//		score[4] = 90;
		
		for(int i=0; i<score.length; i++) {		// �ݺ������� �迭 �ʱ�ȭ.
			score[i] = 10 * i + 50;
			System.out.printf("score[%d]:%d%n", i, score[i]);
		}
		
		System.out.println();
		System.out.println("�迭�� ��� ���: " + Arrays.toString(score));			// Arrays.toString(�迭�̸�) : �迭�� ��� ��Ҹ� '[ù��° ���, �ι�° ���, ...]'�� ���� ������ ���ڿ��� ����� ��ȯ.
		System.out.println(score); 		// 'Ÿ��@�ּ�' ���.
		
//		for(int i=0; i<5; i++)
//			System.out.printf("score[%d]:%d%n", i, score[i]);

//		System.out.printf("score[%d]:%d%n", 7, score[7]);		index�� ������ ��� ��.

	}

}
