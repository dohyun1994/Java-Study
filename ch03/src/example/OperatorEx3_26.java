package example;

public class OperatorEx3_26 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n",a ,b);						// 실행 결과 b의 값은 증가되지 않는다.
		System.out.printf("a!=0 || ++b!=0 = %b%n",a!=0 || ++b!=0);	// ||(OR)연산 좌측 피연산자(a!=0)이 참이라서 우측 피연산자를 평가하지 않았기 때문.
		System.out.printf("a=%d, b=%d%n", a, b);					
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);	// &&(AND)연산 좌측 피연산자(a=0)이 거짓이라서 우측 피연산자를 평가하지 않았기 때문.
		System.out.printf("a=%d, b=%d%n", a, b);
	}

}

	/*
	[실행결과]
	a=5, b=0
	a!=0 || ++b!=0 = true
	a=5, b=0
	a==0 && ++b!=0 = false
	a=5, b=0
	*/
