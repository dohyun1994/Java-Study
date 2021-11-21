package example;

class Singleton {
	
	private static Singleton s = new Singleton();
	
	private Singleton() {
		//...
	}
	
	public static Singleton getInstance() {
		if(s == null)				// Singleton ��ü�� �����ϴ� �������� s�� null�̸� ���ο� ��ü ����.
			s = new Singleton();
		
		return s;
	}
}

public class SingletonTestEx7_14 {

	public static void main(String[] args) {
//		Singleton s = new Singleton();				// error!!
		
		Singleton s2 = Singleton.getInstance();		// Singleton Ŭ������ getInstance() �޼��� ȣ���Ͽ� ��ü����.		
		System.out.println(s2);
		
	}

}
