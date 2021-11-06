package practice_example;

public class Ex6_23 {
	
	static int max(int[] arr) {
	
		if(arr == null || arr.length == 0)
			return -99999;
		
		int max = arr[0];		// �迭�� ù ��° ������ �ִ밪�� �ʱ�ȭ.
		
		for(int i=1; i<arr.length; i++) {		// �迭�� �� ��° ������ ��.
			
			if(max < arr[i]) 		// �迭�� i ���� ���� max ���� ũ��, �� ���� max�� �����.
				max = arr[i];
		}
		
		return max;			// ���������� ����� max�� ��ȯ.
	}

	public static void main(String[] args) {
		
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(data));
		
		System.out.println("�ִ밪:" + max(data));
		
		System.out.println("�ִ밪:" + max(null));
		
		System.out.println("�ִ밪:" + max(new int[] {}));	// ũ�Ⱑ 0�� �迭
	}
}
