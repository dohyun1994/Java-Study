package example;

public class OperatorEx3_17 {

	public static void main(String[] args) {
		double pi = 3.141592;
		System.out.println(pi * 1000);
		
		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;	// 소수점 넷째자리에서 반올림 하는 방법.
		System.out.println(shortPi);

	}

}
