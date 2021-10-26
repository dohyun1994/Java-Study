package example;

public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv;
	static int cv2 = new MemberCall().iv;
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv2);	// 클래스메서드에서 인스턴스변수 iv2 사용불가
		MemberCall c = new MemberCall();	// 객체 생성후 
		System.out.println(c.iv2);			// 인스턴스 변수(iv2) 사용가능.
	}
	
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);	
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
	
	
	public static void main(String[] args) {
		staticMethod1();
	}
	
	
}
