package example;

public class OperatorEx3_18 {

	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;	// Math.round() - �Ҽ��� ù ° �ڸ����� �ݿø��� ������ ��ȯ.
		
		System.out.println(Math.round(pi * 1000));		// pi * 1000 = 3141.592�� �ǰ� �Ҽ��� ù ° �ڸ��� .5���� �ݿø��ؼ� 3142 ��ȯ. 
		
		System.out.println(shortPi);

	}

}
