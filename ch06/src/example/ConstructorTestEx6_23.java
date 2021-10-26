package example;

class Data1 {
	int value;
}

class Data2 {
	int value;
	
	Data2(int x) {
		value = x;
	}
}

 class ConstructorTestEx6_23 {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(1);

		System.out.println(d1.value);
		System.out.println(d2.value);
	}

}
