package example;

import java.util.Arrays;

public class ArrayEx5_2 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] {100, 95, 80, 70, 60};
//		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for(int i=0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;					// 1 ~ 10의 값을 배열에 저장.
			
			if(i == 9) {
				System.out.print(iArr1[i]);
			} else {
				System.out.print(iArr1[i] + ",");	
			}	
		}
		
		for(int i=0; i < iArr2.length; i++) 
			iArr2[i] = (int)(Math.random() * 10) + 1;			// 1 ~ 10 사이의 랜덤값을 배열에 저장.
		

		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(iArr2);
		System.out.println(Arrays.toString(chArr));
		System.out.println(chArr);
	
	}
}
