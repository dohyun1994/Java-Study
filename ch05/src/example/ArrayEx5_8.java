package example;

import java.util.Arrays;

public class ArrayEx5_8 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i + 1;
		}
		
		System.out.println(Arrays.toString(ball));
		
		int temp = 0;		// 두 값을 바꾸는데 사용할 임시변수
		int j = 0;
		
		for(int i=0; i<6; i++) {
			j = (int)(Math.random() * 45);		// 0 ~ 44 사이의 난수.
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		for(int i=0; i<6; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
	}
}
