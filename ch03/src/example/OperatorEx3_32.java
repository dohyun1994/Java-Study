package example;

public class OperatorEx3_32 {

	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x;		// x�� ���� �����̸�, ����� �����.
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		signX = x > 0 ? '+' : (x==0 ? ' ' : '-');	// ���� ������ ��ø. (x�� 0���� ũ�� '+'��ȣ, x�� 0�̸� ��ȣ����, x�� �����̸� '-'��ȣ)
		signY = y > 0 ? '+' : (y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : (z==0 ? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
		
		
		int i = 2, j = 4;
		System.out.println(i *= 10+j); 		// i *= 10 + j  =  i = i * (10+j)
		
	}
}
