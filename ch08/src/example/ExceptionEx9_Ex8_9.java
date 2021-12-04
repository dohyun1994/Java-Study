package example;

public class ExceptionEx9_Ex8_9 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시켰음2222.");
			throw e;
//			throw new Exception("고의로 발생시켰음.");	// 위 두줄을 한줄로 줄여씀.	
		} catch(Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
		
	}

}
