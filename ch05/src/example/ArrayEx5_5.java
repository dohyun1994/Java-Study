package example;

public class ArrayEx5_5 {

	public static void main(String[] args) {
		int sum = 0;			// 배열에 저장된 모든 값의 총점을 저장하기 위한 변수 sum.
		float average = 0f;		// 평균을 저장하기 위한 변수 average.
		
		int[] score = { 100, 88, 100, 100, 90 };
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		average = sum / (float)score.length;	// 계산결과를 float로 얻기 위해서 형변환.
												// 478 / (float)5 -> 478 / 5.0f -> 478.0f / 5.0f
		
		System.out.println("총점 : " + sum );
		System.out.println("평균 : " + average);
	}
}
