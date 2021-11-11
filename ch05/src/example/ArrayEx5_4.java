package example;

import java.util.Arrays;

public class ArrayEx5_4 {

	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D' };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		System.out.println(abc);
		System.out.println(num);
		
		// 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length + num.length];		// 길이14
		
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.out.println(result);
		
		System.arraycopy(num, 0, result, abc.length, num.length);	// num[0]에서 result[abc.length] = result[4] 으로 num.length(10)개의 데이터 복사
		System.out.println(result);
		
		// 배열 abc를 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사.
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		// qoduf abc를 배열 num의 인덱스6 위치부터 3개를 복사. num[6], num[7], num[8]에 'A', 'B', 'C'가 복사됨.
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);

	}
}
