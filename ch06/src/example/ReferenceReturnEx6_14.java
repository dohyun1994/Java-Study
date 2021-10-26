package example;

//class Data {		// Ex6_9에 Data Class 생성되어있음. 주석처리.
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
