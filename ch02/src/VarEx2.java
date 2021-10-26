
public class VarEx2 {

	public static void main(String[] args) {
		final int score = 100;
		//score = 200; 상수가 되었으므로 변경 할 수 없다. 에러
		
		System.out.println(score);
		
		int oct = 010;
		int hex = 0x10;
		
		//long l = 10_000_000_000L; 에러 범위초과
		
		char ch = 'A';
		int i = 'A';
		System.out.println(i);
		
		String str = "";   // 빈 문자열(empty String) 가능
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(""+ 7 + 7);	  // 문자열 더하기 먼저 실행
		System.out.println(7 + 7 +"");    // 숫자의 덧셈 연산 먼저 실행
		
	}

}
