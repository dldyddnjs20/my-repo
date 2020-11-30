abstract class UnitA{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("정지합니다.");
	}
}

interface Fightable{
	public abstract void move(int x, int y);// public abstract가 생략되어 있음.
	public abstract void attack(Fightable f);
}

class Fighter extends UnitA implements Fightable{
	// 오버라이딩 규칙 위반 : 규칙 2번째에 접근제어자의 범위가 좁아져서는 안된다. 여기는 default로 제한되서 빨간줄이뜸
	public void move(int x, int y){
		System.out.println("["+x+","+y+"] 좌표로 이동");
	};
	public void attack(Fightable f){ // 공격하라면은 인터페이스 Fighterble를 구현
		System.out.println(f+"를 공격하라");
	};
	Fightable getFightable() {
		Fighter f = new Fighter();
		return f;
	}
}

public class Exam030_class_FighterTest {
	public static void main(String[] args) {
//		Fighter f = new Fighter();
		//껍데기만 있는 인터페이스로 객체 만들기
		Fightable f2 = new Fighter();
		f2.move(200, 200);
//		f2.stop();
		f2.attack(new Fighter()); // 다향성 지원
	}

}
