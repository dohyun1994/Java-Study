package example;

public class ExceptionEx3_Ex8_3 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i=0; i< 10; i++) {
			try {
				result = number / (int) (Math.random() * 10);		// 10번째 라인
				System.out.println(result);
			} 
			catch(ArithmeticException e) {
				System.out.println("0");
				
			}
			
		}

	}

}
