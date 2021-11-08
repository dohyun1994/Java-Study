package example;

import java.util.Scanner;

public class FlowEx4_7 {

	public static void main(String[] args) {
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");	// 1 - 3 = -2,  2 - 1 = 1   유저 승.
																	// 1 - 2 = -1,  2 - 3 = -1,  3 - 1 = 2	컴 승
																	// user - com = 0 비김.
		
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		int com = (int)(Math.random() * 3) + 1;		// 1, 2, 3 중 하나가 com에 저장됨.
		
		System.out.println("당신은 " + user + "입니다.");
		System.out.println("컴은 " + com + "입니다.");
		
		switch(user - com) {
			case 1: case -2:
				System.out.println("당신이 이겼습니다.");
				break;
			
			case 2: case -1:
				System.out.println("당신이 졌습니다.");
				break;
			
			default:
				System.out.println("비겼습니다.");	
		}
	}
}
