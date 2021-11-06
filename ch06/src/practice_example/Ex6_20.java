package practice_example;

public class Ex6_20 {
	
	static int[] shuffle(int[] arr) {
		
		if(arr == null || arr.length == 0) {
			return arr;
		}
		
		for(int i=0; i<arr.length; i++) {
			int j = (int)(Math.random() * arr.length);	// 0~9 randomNumber
		
			// arr[i]�� arr[j]�� ���� ���� �ٲ۴�.
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		return arr;
	}

	public static void main(String[] args) {
		
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
//		for(int i=0; i<30; i++) {
//			System.out.print( (int)(Math.random() * 9) + 1 );
//		}

	}
}
