package practice_example;

public class Ex3_2 {

	public static void main(String[] args) {
		int numOfApple = 153;		// 사과의 개수
		int sizeOfBucket = 10;		// 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
//		int numOfBucket = (	numOfApple % sizeOfBucket==0 ? (numOfApple / sizeOfBucket) : numOfApple / sizeOfBucket +1	);	// 모든 사과를 담는데 필요한 바구니의 수
							// 삼항연산자 이용. numOfApple % sizeOfBucket == 0 이면 numOfApple / sizeOfBucket 거짓이면 numOfApple / sizeOfBucket +1
		
		int numOfBucket = numOfApple / sizeOfBucket + ( numOfApple % sizeOfBucket >0? 1 : 0 );
		System.out.println("필요한 바구니의 수 :" + numOfBucket);

	}

}

// 사과를 담는데 필요한 버켓을 수를 구하는 코드를 작성.
// ex) 사과의 수가 123개이면 총 13개의 바구니가 필요.