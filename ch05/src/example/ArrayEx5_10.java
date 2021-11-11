package example;

import java.util.Arrays;

public class ArrayEx5_10 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i < numArr.length; i++) {
			System.out.print(numArr[i]=(int)(Math.random()*10));
		}
		System.out.println();
		
		for(int i=0; i < numArr.length-1; i++) {	// 0부터 8까지 9번반복.
			boolean changed = false;				// 자리바꿈이 발생했는지를 체크한다.
			
			for(int j=0; j< numArr.length-1-i; j++) { 	// 9, 8, 7, 6, 5, 4, 3, 2, 1 번 반복. 
				if(numArr[j] > numArr[j+1]) {
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
					changed = true;
				}
			}
			
			if(!changed)
				break;
			
			System.out.println(Arrays.toString(numArr));
		}
	}
}
