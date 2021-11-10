package example;

import java.util.Arrays;

public class ArrayEx5_1 {

	public static void main(String[] args) {
		
		int[] score = new int[5];
		
//		int[] score = new int[] {50, 60, 70, 80, 90};	// 배열의 생성과 초기화를 동시에 
		
//		int[] score = {50, 60, 70, 80, 90}				// new int[]를 생략할 수 있음.
		
		
//		int k = 1;
//		score[0] = 50;
//		score[1] = 60;
//		score[k+1] = 70;
//		score[3] = 80;
//		score[4] = 90;
		
		for(int i=0; i<score.length; i++) {		// 반복문으로 배열 초기화.
			score[i] = 10 * i + 50;
			System.out.printf("score[%d]:%d%n", i, score[i]);
		}
		
		System.out.println();
		System.out.println("배열의 모든 요소: " + Arrays.toString(score));			// Arrays.toString(배열이름) : 배열의 모든 요소를 '[첫번째 요소, 두번째 요소, ...]'와 같은 형식의 문자열로 만들어 반환.
		System.out.println(score); 		// '타입@주소' 출력.
		
//		for(int i=0; i<5; i++)
//			System.out.printf("score[%d]:%d%n", i, score[i]);

//		System.out.printf("score[%d]:%d%n", 7, score[7]);		index의 범위를 벗어난 값.

	}

}
