package example;

import java.util.Arrays;

public class ArrayEx5_4 {

	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D' };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		System.out.println(abc);
		System.out.println(num);
		
		// �迭 abc�� num�� �ٿ��� �ϳ��� �迭(result)�� �����.
		char[] result = new char[abc.length + num.length];		// ����14
		
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.out.println(result);
		
		System.arraycopy(num, 0, result, abc.length, num.length);	// num[0]���� result[abc.length] = result[4] ���� num.length(10)���� ������ ����
		System.out.println(result);
		
		// �迭 abc�� �迭 num�� ù ��° ��ġ���� �迭 abc�� ���̸�ŭ ����.
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		// qoduf abc�� �迭 num�� �ε���6 ��ġ���� 3���� ����. num[6], num[7], num[8]�� 'A', 'B', 'C'�� �����.
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);

	}
}
