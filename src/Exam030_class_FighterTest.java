abstract class UnitA{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("�����մϴ�.");
	}
}

interface Fightable{
	public abstract void move(int x, int y);// public abstract�� �����Ǿ� ����.
	public abstract void attack(Fightable f);
}

class Fighter extends UnitA implements Fightable{
	// �������̵� ��Ģ ���� : ��Ģ 2��°�� ������������ ������ ���������� �ȵȴ�. ����� default�� ���ѵǼ� �������̶�
	public void move(int x, int y){
		System.out.println("["+x+","+y+"] ��ǥ�� �̵�");
	};
	public void attack(Fightable f){ // �����϶���� �������̽� Fighterble�� ����
		System.out.println(f+"�� �����϶�");
	};
	Fightable getFightable() {
		Fighter f = new Fighter();
		return f;
	}
}

public class Exam030_class_FighterTest {
	public static void main(String[] args) {
//		Fighter f = new Fighter();
		//�����⸸ �ִ� �������̽��� ��ü �����
		Fightable f2 = new Fighter();
		f2.move(200, 200);
//		f2.stop();
		f2.attack(new Fighter()); // ���⼺ ����
	}

}
