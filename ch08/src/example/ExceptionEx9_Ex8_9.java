package example;

public class ExceptionEx9_Ex8_9 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("���Ƿ� �߻�������2222.");
			throw e;
//			throw new Exception("���Ƿ� �߻�������.");	// �� ������ ���ٷ� �ٿ���.	
		} catch(Exception e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ���.");
		
	}

}
