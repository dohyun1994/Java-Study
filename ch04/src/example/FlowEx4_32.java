package example;

import java.util.Scanner;

public class FlowEx4_32 {

	public static void main(String[] args) {
		
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0)>");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu ==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if( !(1<= menu && menu <= 3) ) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
				continue;					// 12 line�� ���ǽ����� �ٽ� �̵�.
			}
		
			System.out.println("�����Ͻ� �޴���" + menu + "�Դϴ�.");
		}
	}
}
