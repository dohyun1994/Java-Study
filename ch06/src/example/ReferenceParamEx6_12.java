package example;

public class ReferenceParamEx6_12 {
	
	static void printArr(int[] arr) {
		System.out.print("[");
		
		for(int i : arr)		// ���� for��  for( Ÿ�� ������ : �迭 or �÷���)
			System.out.print(i + ",");
		System.out.println("]");
	}
	

	static int sumArr(int[] arr) {
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) 
			sum += arr[i];
		return sum;
	}
	
	static void sortArr(int[] arr) {
		for(int i=0; i<arr.length-1; i++)		// i �� 1�϶� ���� ����. ���̻� �����ص� ���ĵ�������. i<2 �� �ڵ�ٲ㵵 �Ȱ������.
			for(int j=0; j<arr.length-1-i; j++) {
				
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}	
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3, 2, 1, 6, 5, 4};
		
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum =" + sumArr(arr));
		

	}

}
