package example;

//class Data {		// Ex6_9�� Data Class �����Ǿ�����. �ּ�ó��.
//	int x;
//}

public class ReferenceReturnEx6_14 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		Data d2 = copy(d);
		d2.x = 20;
		
		System.out.println(d.x);
		System.out.println(d2.x);
	}
	
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		
		return tmp;
		
	}
	
}
