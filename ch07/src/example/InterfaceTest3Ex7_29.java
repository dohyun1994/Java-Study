package example;

class AAA {
	void methodA() {
		II i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
		
	}
}

interface II {
	public abstract void methodB();
}

class BBB implements II {
	
	public void methodB() {
		System.out.println("methodB in B class");
	}
	
	public String toString() { return "class BBB"; }
}

class InstanceManager {
	public static II getInstance() {
		return new BBB();
	}
}

public class InterfaceTest3Ex7_29 {

	public static void main(String[] args) {
		AAA a = new AAA();
		a.methodA();

	}

}
