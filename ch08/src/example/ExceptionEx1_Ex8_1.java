package example;

public class ExceptionEx1_Ex8_1 {

	public static void main(String[] args) {
		try {
			try {  } catch (Exception e) { }
		} catch (Exception e) {
			//try {  } catch (Exception e) { }	// 에러. 변수 e가 중복 선언되었다.
		}
		
		try {
			
		} catch(Exception e) {
			
		}

	}

}
