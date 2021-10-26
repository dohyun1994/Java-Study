package example;

public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv;
	static int cv2 = new MemberCall().iv;
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv2);	// Ŭ�����޼��忡�� �ν��Ͻ����� iv2 ���Ұ�
		MemberCall c = new MemberCall();	// ��ü ������ 
		System.out.println(c.iv2);			// �ν��Ͻ� ����(iv2) ��밡��.
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
