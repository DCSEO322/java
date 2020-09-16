package f_OOP2;

public class AbsTest {
	public static void main(String[] args) {
		
	}
}

abstract class Unit {
	int x;
	int y;
	
	abstract void move(int x, int y);
	
	void stop(){
		
	}
	
}

class Marin extends Unit{
	void stimPack(){
		
	}

	@Override
	void move(int x, int y) {
		
	}
	
}

class Tank extends Unit{
	void changeMode(){
		
	}

	@Override
	void move(int x, int y) {	// 오버라이드시키면 추상클래스로 바꿔줄 필요가 없다
		
	}
	
}

class DropShip extends Unit{
	void load(){
		
	}

	@Override
	void move(int x, int y) {
		
	}
	
	
}











