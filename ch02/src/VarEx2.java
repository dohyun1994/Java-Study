
public class VarEx2 {

	public static void main(String[] args) {
		final int score = 100;
		//score = 200; ����� �Ǿ����Ƿ� ���� �� �� ����. ����
		
		System.out.println(score);
		
		int oct = 010;
		int hex = 0x10;
		
		//long l = 10_000_000_000L; ���� �����ʰ�
		
		char ch = 'A';
		int i = 'A';
		System.out.println(i);
		
		String str = "";   // �� ���ڿ�(empty String) ����
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(""+ 7 + 7);	  // ���ڿ� ���ϱ� ���� ����
		System.out.println(7 + 7 +"");    // ������ ���� ���� ���� ����
		
	}

}
