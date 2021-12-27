package example;

class AA {
	void autoPlay(I i) {
		i.play();
	}
}

interface I {
	public abstract void play();
}

class BB implements I {
	public void play() {
		System.out.println("play in BB class");
	}
}

class CC implements I {
	public void play() {
		System.out.println("play in CC class");
	}
}

public class InterfaceTest2Ex7_28 {

	public static void main(String[] args) {
		AA a = new AA();
		a.autoPlay(new BB());
		a.autoPlay(new CC());

	}

}
