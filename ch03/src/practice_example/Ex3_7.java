package practice_example;

public class Ex3_7 {

	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)(5/9f * (fahrenheit - 32) * 100 + 0.5f) / 100f;
		
		// 5/9 * (fahrenheit - 32);
		// ��� 37.78 ��µǾ�� ��.
		
		System.out.println("Fahrenheit:" + fahrenheit);
		System.out.println("Celcius:" + (celcius));
		
	}
}
