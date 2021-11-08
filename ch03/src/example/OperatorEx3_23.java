package example;

public class OperatorEx3_23 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\" == \"abc\" ? %b%n%n", "abc" == "abc");
		
		System.out.printf(" str1 ==\"abc\" ? %b%n%n", 	str1 == "abc");
		
		System.out.printf(" str2 ==\"abc\" ? %b%n%n",		str2 == "abc");			// ���� �ٸ� ��ü�� false��ȯ.
		
		System.out.printf("str1.equals(\"abc\") ? %b%n%n", str1.equals("abc"));	
		
		System.out.printf("str2.equals(\"abc\") ? %b%n%n", str2.equals("abc"));		// equals()�� ��ü�� �޶� ������ ������ true ��ȯ.
		
		System.out.printf("str2.equals(\"ABC\") ? %b%n%n", str2.equals("ABC"));
		
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));	// equalsIgnoreCase() - ��ҹ��� �������� �ʰ� ���Ҷ� ���.

	}

}
