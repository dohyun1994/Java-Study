package practice_example;

public class Marine {
	
	int x=0, y=0;		// Marine�� ��ġ��ǥ(x, y)
	int hp = 60;		// ���� ü��
	static int weapon = 6;		// ���ݷ�
	static int armor = 0;		// ����
	
	static void weaponUp() {
		weapon ++;
	}
	
	static void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
