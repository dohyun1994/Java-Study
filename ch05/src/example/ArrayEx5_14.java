package example;

import java.util.Arrays;

public class ArrayEx5_14 {

	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i=0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt(" + i + ") :" + ch);
		}
		
		char[] chArr = src.toCharArray();		// ���ڿ��� ����(char)�迭�� ��ȯ.
		
		System.out.println(chArr);
		System.out.println(src.toCharArray());
		System.out.println(Arrays.toString(chArr));
		
		

	}

}
