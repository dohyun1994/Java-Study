package practice_example;

public class Ex6_20 {
	
//	static int[] shuffle(int[] arr) {
//		if(arr == null || arr.length == 0)
//			return arr;
//		
//		for(int i=0; i<arr.length; i++) {
////			int ran =(int)(Math.random() * 9) + 1;
////			original[i] = ran;
//		}
//		
//		return original;
//	}

	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
//		System.out.println(java.util.Arrays.toString(original));
		
//		int[] result = shuffle(original);
//		System.out.println(java.util.Arrays.toString(result));
//		
		//System.out.println(original.length);
		for(int i=0; i<100; i++)
			System.out.println( (int)(Math.random() * 9) );

	}

}
