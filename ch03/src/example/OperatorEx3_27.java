package example;

public class OperatorEx3_27 {

	public static void main(String[] args) {
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b);		// 11line. 단항연산자는 결합방향이 오른쪽에서 왼쪽.
		System.out.printf("!!!b=%b%n", !!!b);	// 피연산자인 b와 가까운 논리 부정 연산자 '!'가 먼저수행되어 false를 결과로 얻고,
		System.out.println();					// 이 값에 다시 '!'연산을 수행하므로 true를 결과로 얻는다.
		
		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z');
		
		System.out.printf("!('a'<=ch && ch='z')=%b%n", !('a'<=ch && ch<='z'));
		
		System.out.printf("  'a'<=ch && ch<='z' = %b%n", 'a'<=ch && ch<='z');
	}
}

/*
[실행결과]
b=true
!b=false
!!b=true
!!!b=false

ch=C
ch < 'a' || ch > 'z'=true
!('a'<=ch && ch='z')=true
  'a'<=ch && ch<='z' = false 
*/
 
