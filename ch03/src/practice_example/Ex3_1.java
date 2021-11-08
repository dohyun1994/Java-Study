package practice_example;

public class Ex3_1 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c= 'A';		// 'A'의 문자코드는 65
		
		System.out.println(1 + x << 33);				// 6. int는 32bit이므로 33번 shift 하지않고, 1번만 shift 
		System.out.println(y >= 5 || x < 0 && x >2);	// true. 논리연산자는 OR 연산보다 AND 연산이 우선순위가 높다.
		System.out.println(y += 10 - x++);				// 13.  y = y + (10 - x++);	 연산후 x에는 3저장.
		System.out.println(x += 2);						// 5.	x = x+2 
		System.out.println( !('A' <= c && c <= 'Z') );	// false
		System.out.println('C' - c);					// 2.  67 - 65 = 2	피연산자가 int보다 작은 타입(byte, short, char)인 경우 int로 변환한 다음 연산수행.
		System.out.println('5' - '0');					// 5.  '5' = 53  '0= 48  int형으로 변환된 후 연산 수행 ->  53 - 48 = 5
		System.out.println(c+1);						// 66	// char형과 정수 1의 덧셈연산.  int형으로 변환된 후 연산 수행. 결과도 int형.
		
		System.out.println(++c);						// B  단항연산자 '++'는 이항연산자와 달리 int보다 작은 타입도 형변환x.
		System.out.println(c++);						// B  그래서 println은 변수c를 숫자(int)로 출력하는 것이 아니라 문자로 출력.
		System.out.println(c);							// C  변수 c에 저장된 문자가 'A'(실제 저장된 값은 65)이므로 문자코드의 값이 1증가되어 66('B'의 문자코드)이 변수 c에 저장된다.
														//	  변수 c에 저장된 것은 문자코드, 즉 정수값. println은 이 값을 타입에 따라 어떻게 출력할지 결정.
														//	  만일 문자타입이면 저장된 값(문자코드)에 해당하는 문자를 출력하고 숫자라면 숫자로 출력.
	}
}
