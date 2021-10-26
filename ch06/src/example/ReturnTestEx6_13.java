package example;

public class ReturnTestEx6_13 {

	int add(int a, int b) {
		return a + b;
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a + b;
	}
	
	
	public static void main(String[] args) {				// main ÇÔ¼ö
		ReturnTestEx6_13 r = new ReturnTestEx6_13();
		
		System.out.println( r.add(3, 5) );
		
		int[] result = new int[] {0};
		
		r.add(3, 4, result);
		
		System.out.println( result[0]);

	}
	
}
