package example;

public class ExceptionEx1_Ex8_1 {

	public static void main(String[] args) {
		try {
			try {  } catch (Exception e) { }
		} catch (Exception e) {
			//try {  } catch (Exception e) { }	// ����. ���� e�� �ߺ� ����Ǿ���.
		}
		
		try {
			
		} catch(Exception e) {
			
		}

	}

}
