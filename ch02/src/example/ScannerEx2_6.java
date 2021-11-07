package example;

import java.util.Scanner;

public class ScannerEx2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용: " + input);
		System.out.printf("num=%d%n", num);

	}

}
