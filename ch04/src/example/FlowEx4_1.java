package example;

public class FlowEx4_1 {

	public static void main(String[] args) {
		int x = 0;
		System.out.printf("x=%d �� ��, ���� ����%n", x);			// x=0 �� ��, ���� ����
		
		if( x==0 )	System.out.println("x==0");					// x==0
		if( x!=0 )	System.out.println("x!=0");		
		if( !(x==0) )	System.out.println("!(x==0)");
		if( !(x!=0) )	System.out.println("!(x!=0)");			// !(x!=0)
		
		x = 1;
		System.out.printf("x=%d �� ��, ���� ����%n", x);			// x=1 �� ��, ���� ����
		
		if( x==0 )	System.out.println("x==0");					
		if( x!=0 )	System.out.println("x!=0");					// x!=0
		if( !(x==0) )	System.out.println("!(x==0)");			// !(x==0)
		if( !(x!=0) )	System.out.println("!(x!=0");
	}

}
