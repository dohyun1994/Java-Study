package example;

import java.util.Arrays;

public class ArrayEx5_10 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i < numArr.length; i++) {
			System.out.print(numArr[i]=(int)(Math.random()*10));
		}
		System.out.println();
		
		for(int i=0; i < numArr.length-1; i++) {	// 0���� 8���� 9���ݺ�.
			boolean changed = false;				// �ڸ��ٲ��� �߻��ߴ����� üũ�Ѵ�.
			
			for(int j=0; j< numArr.length-1-i; j++) { 	// 9, 8, 7, 6, 5, 4, 3, 2, 1 �� �ݺ�. 
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
