package example;

public class OperatorEx3_18 {

	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;	// Math.round() - 소수점 첫 째 자리에서 반올림한 정수를 반환.
		
		System.out.println(Math.round(pi * 1000));		// pi * 1000 = 3141.592가 되고 소수점 첫 째 자리인 .5에서 반올림해서 3142 반환. 
		
		System.out.println(shortPi);

	}

}
