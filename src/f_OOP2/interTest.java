package f_OOP2;

public class interTest {
	public static void main(String[] args) {
		
	}
}


class Unit2 {
	int x;
	int y;
	int currentHP;
}

class Fight extends Unit2 implements Fightable{
	// Fight를 구현해주기 위해 Fightable을 implements를 통해 구현한다.
	// 추상클래스가 되지 않기 위해서는 오버라이드를 해준다.
	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attact(Unit2 u2) {
		
	}
	
}

interface Fightable extends Movable, Attackable{
	
}

interface Movable {
	void move(int x, int y); // 구현부가 없으므로 ';'을 붙여준다
}

interface Attackable {
	void attact(Unit2 u2);
}