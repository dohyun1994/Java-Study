

public class Ex2_12 {

	public static void main(String[] args) {

		String str = "3";
		
		System.out.println(str.charAt(0) - '0');  // '3' - '0' -> ���� 3���� �ٲ�.
		System.out.println('3' - '0' + 1);  // '3' - '0' -> ���� 3���� �ٲ�� +1 �ϸ� ���� 4 ���.
		System.out.println(Integer.parseInt("3") + 1);
		System.out.println("3" + 1);
		System.out.println(3 + '0'); 	// '0' �� ���ڷ� 48
		
		int octNum = 010;
		System.out.println(octNum);
		
		int binNum = 0b10;		// 0b 2���� 10 �� 10������ ǥ��
		System.out.println(binNum);
		

	}

}
