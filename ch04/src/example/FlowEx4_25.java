package example;

import java.util.Scanner;

public class FlowEx4_25 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요.(예:12345)>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();				// 화면을 통해 입력받은 내용을 tmp에 저장.
		num = Integer.parseInt(tmp);
		
		while( num != 0) {
			
			sum += num % 10;			// 입력받은 num을 10으로 나눈 나머지를 sum에 저장.(10으로 나머지 연산하면, 1의자리를 얻는다.)
			
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num /= 10;					// num을 10으로 나눈 값을 다시 num에 저장.(10으로 나누면 1의자리가 제거된다.)
		}
		System.out.println("각 자리수의 합:" + sum);
		
	}
}
