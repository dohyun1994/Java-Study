package practice_example;

public class PlayingCard {
	
	int kind;	// �ν��Ͻ� ����
	int num;	// �ν��Ͻ� ����
	
	static int width;		// Ŭ���� ����
	static int height;		// Ŭ���� ����
	
	PlayingCard(int k, int n) {		// k, n = ��������
		kind = k;			
		num = n;
	}

	public static void main(String[] args) {		// args = ��������
		PlayingCard card = new PlayingCard(1, 1);	// card = ��������
		
		System.out.println(card.kind);
		System.out.println(card.num);

	}

}
