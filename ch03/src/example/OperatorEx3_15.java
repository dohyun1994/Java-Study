package example;

public class OperatorEx3_15 {

	public static void main(String[] args) {
		char lowerCase = 'a';
		
		char upperCase = (char)(lowerCase-32);
//		char upperCase = 'a'-32;		// 위와 동일.
		System.out.println(upperCase);

	}

}
