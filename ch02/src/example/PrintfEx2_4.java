package example;

public class PrintfEx2_4 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xffff_ffff_ffff_ffffL;
		
		int octNum = 010;		// 8���� 10, 10�����δ� 8
		int hexNum = 0x10;		// 16���� 10, 10�����δ� 16
		int binNum = 0b10;		// 2���� 10, 10�����δ� 2
		
		System.out.printf("b=%d %n", b);
		System.out.printf("s=%d %n", s);
		System.out.println();
		
		System.out.printf("c=%c, %d %n", c, (int)c );
		System.out.println();
		
		System.out.printf("finger=[%5d] %n", finger);
		System.out.printf("finger=[%-5d] %n", finger);
		System.out.printf("finger=[%05d] %n", finger);
		System.out.println();
		
		System.out.printf("big=%d %n", big);
		System.out.printf("hex=%#X %n", hex);
		System.out.println();
		
		System.out.printf("octNum=%o, %d %n", octNum, octNum);
		System.out.printf("hexNum=%x, %d %n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d %n", Integer.toBinaryString(binNum), binNum);	// ������ 2������ ��ȯ�ؼ� ���ڿ��� ��ȯ�ϴ� �Լ�.
		System.out.println();

	}

}
