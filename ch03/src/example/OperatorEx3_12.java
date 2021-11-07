package example;

public class OperatorEx3_12 {

	public static void main(String[] args) {
		char c1 = 'a';		// c1에는 문자 'a'의 코드값인 97이 저장된다.
		char c2 = c1;		// c1에 저장되어 있는 값이 c2에 저장된다.
		char c3 = ' ';		// c3를 공백으로 초기화 한다.
		
		int i = c1 + 1;		// 97 + 1 = 98이 i에 저장.
		
		c3 = (char)(c1 + 1);
		c2++;
		c2++;
		
		System.out.println("i=" + i);		// i = 98
		System.out.println("c2=" + c2);		// c2 = c
		System.out.println("c3=" + c3);		// c3 = b 
		
		
		

	}

}
