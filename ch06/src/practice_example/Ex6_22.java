package practice_example;

public class Ex6_22 {
	
	static boolean isNumber(String str) {
		char ch;
		
		if(str == null || str.equals(""))
			return false;
		
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			
			if( !('0' <= ch && ch <='9') )  {
				return false;
			}
		}
		return true;
	
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

}
