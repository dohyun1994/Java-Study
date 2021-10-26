

public class Ex2_12 {

	public static void main(String[] args) {

		String str = "3";
		
		System.out.println(str.charAt(0) - '0');  // '3' - '0' -> 숫자 3으로 바뀜.
		System.out.println('3' - '0' + 1);  // '3' - '0' -> 숫자 3으로 바뀌고 +1 하면 숫자 4 출력.
		System.out.println(Integer.parseInt("3") + 1);
		System.out.println("3" + 1);
		System.out.println(3 + '0'); 	// '0' 은 숫자로 48
		
		int octNum = 010;
		System.out.println(octNum);
		
		int binNum = 0b10;		// 0b 2진수 10 을 10진수로 표현
		System.out.println(binNum);
		

	}

}
