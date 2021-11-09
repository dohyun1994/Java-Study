package example;

import java.util.Scanner;

public class FlowEx4_17 {

	public static void main(String[] args) {		// 사용자로부터 ㄴ라인의 수를 입력받아 별을 출력하는 프로그램.
		int num = 0;
		
		System.out.print("*을 출력할 라인의 수를 입력하세요,>");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
}
