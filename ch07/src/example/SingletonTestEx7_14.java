package example;

class Singleton {
	
	private static Singleton s = new Singleton();
	
	private Singleton() {
		//...
	}
	
	public static Singleton getInstance() {
		if(s == null)				// Singleton 객체를 참조하는 참조변수 s가 null이면 새로운 객체 생성.
			s = new Singleton();
		
		return s;
	}
}

public class SingletonTestEx7_14 {

	public static void main(String[] args) {
//		Singleton s = new Singleton();				// error!!
		
		Singleton s2 = Singleton.getInstance();		// Singleton 클래스의 getInstance() 메서드 호출하여 객체생성.		
		System.out.println(s2);
		
	}

}
