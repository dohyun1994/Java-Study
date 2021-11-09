package example;

import java.util.Scanner;

public class FlowEx4_28 {

	public static void main(String[] args) {
		int input = 0;
		int random = 0;
		
		Scanner sc = new Scanner(System.in);
		random = (int)(Math.random() * 100) + 1;	// 1~100 사이의 임의의 정수.
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = sc.nextInt();
			
			if(input > random) {
				System.out.println("더 작은 값으로 다시 시도해보세요.!!");
			}else if(input < random) {
				System.out.println("더 큰 값으로 다시 시도해보세요.!!");
			} 
			
		} while(input != random);		// input값과, random값이 같지 않을때 계속 반복. 같으면 반복문 종료.
		
		System.out.println("정답입니다. input="  + input + " , random=" + random );
	}
}
