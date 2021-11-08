package example;

import java.util.Scanner;

public class FlowEx4_3 {

	public static void main(String[] args) {
		System.out.print("숫자를 하나 입력하세요.>");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if( input == 0) {			// if-else문 역시 블럭 내의 문장이 하나뿐인 경우 블럭{} 생략가능.
			System.out.println("입력하신 숫자는 " + input + "입니다.");
		}
		else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}

	}
}
