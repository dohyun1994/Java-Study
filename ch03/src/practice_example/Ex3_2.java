package practice_example;

public class Ex3_2 {

	public static void main(String[] args) {
		int numOfApple = 153;		// ����� ����
		int sizeOfBucket = 10;		// �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
//		int numOfBucket = (	numOfApple % sizeOfBucket==0 ? (numOfApple / sizeOfBucket) : numOfApple / sizeOfBucket +1	);	// ��� ����� ��µ� �ʿ��� �ٱ����� ��
							// ���׿����� �̿�. numOfApple % sizeOfBucket == 0 �̸� numOfApple / sizeOfBucket �����̸� numOfApple / sizeOfBucket +1
		
		int numOfBucket = numOfApple / sizeOfBucket + ( numOfApple % sizeOfBucket >0? 1 : 0 );
		System.out.println("�ʿ��� �ٱ����� �� :" + numOfBucket);

	}

}

// ����� ��µ� �ʿ��� ������ ���� ���ϴ� �ڵ带 �ۼ�.
// ex) ����� ���� 123���̸� �� 13���� �ٱ��ϰ� �ʿ�.