
public class forExample {

	public static void main(String[] args) {
		for (int i=1, j=10; i<=10; i++, j--) {
			System.out.println("i=" + i + ",j=" + j);
		}
		
		// 조건식을 생략하면, true로 간주되어서 무한반복문이 됨
//		for (;;) {
//			System.out.println("i=" + i);
//		}
	}
}
