

public class RandomNum {

	public static void main(String[] args) {
		 
		int num = 0;
		
		// -5 ~ 5 ������ ������ 20�� ����غ���.
		
		for (int i =1; i<=20; i++) {
			System.out.println((int)(Math.random() * 11)-5);
		}

	}

}
