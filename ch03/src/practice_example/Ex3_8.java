package practice_example;

public class Ex3_8 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);		// byte + byte의 연산을 하면 형변환이 되어 int형이 된다.
		
		char ch = 'A';
		ch = (char) (ch + 2);	// char타입이 덧셈연산의 과정을 거치면서 int타입으로 변환된다.
		
		float f = 3 / 2f;
		long l = 3000 * 3000 * 3000L;
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float)d == f2;	// 비교연산자도 이항연산자이므로 연산 시에 두 피연산자의 타입을 맞추기 위해 형변환이 발생한다. 
											// 그래서 double과 float의 연산은 double과 double의 연산으로 자동형변환 되는데, 실수는 정수와 달리 근사값으로 표현을 하기 때문에 float를 double로 형변환했을 때 오차가 발생할 수 있다.
											// 그래서 float값을 double로 형변환하기 보다는 double값을 유효자리수가 적은 float로 형변환해서 비교하는 것이 정확한 결과를 얻는다. 
		System.out.println("c=" + c);
		System.out.println("ch=" + ch);
		System.out.println("f=" + f);
		System.out.println("l=" + l);
		System.out.println("result=" + result);
	}
}

/*[실행결과]
c=30
ch=C
f=1.5
l=27000000000
result=true
*/