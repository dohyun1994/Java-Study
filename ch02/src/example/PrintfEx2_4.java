package example;

public class PrintfEx2_4 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xffff_ffff_ffff_ffffL;
		
		int octNum = 010;		// 8진수 10, 10진수로는 8
		int hexNum = 0x10;		// 16진수 10, 10진수로는 16
		int binNum = 0b10;		// 2진수 10, 10진수로는 2
		
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
		System.out.printf("binNum=%s, %d %n", Integer.toBinaryString(binNum), binNum);	// 정수를 2진수로 변환해서 문자열로 반환하는 함수.
		System.out.println();

	}

}
