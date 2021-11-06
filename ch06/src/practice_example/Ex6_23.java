package practice_example;

public class Ex6_23 {
	
	static int max(int[] arr) {
	
		if(arr == null || arr.length == 0)
			return -99999;
		
		int max = arr[0];		// 배열의 첫 번째 값으로 최대값을 초기화.
		
		for(int i=1; i<arr.length; i++) {		// 배열의 두 번째 값부터 비교.
			
			if(max < arr[i]) 		// 배열의 i 번재 값이 max 보다 크면, 그 값이 max에 저장됨.
				max = arr[i];
		}
		
		return max;			// 최종적으로 저장된 max값 반환.
	}

	public static void main(String[] args) {
		
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(data));
		
		System.out.println("최대값:" + max(data));
		
		System.out.println("최대값:" + max(null));
		
		System.out.println("최대값:" + max(new int[] {}));	// 크기가 0인 배열
	}
}
