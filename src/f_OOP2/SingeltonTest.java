package f_OOP2;

public class SingeltonTest {
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance(); //6.s1만들면서 객체생성됨 (null->객체주소로 저장)
												//-> s가 클래스변수니까 null아니여서 if문실행x, 그냥 s1객체 주소만 계속 출력됨 
												//-> 아무리만들어도 계속 s1객체 주소만 출력
												//-> 이렇게 객체생성을 제한하는거임
	}
}

final class Singleton{ //7.생성자의 접근제어자가 private -> final class -> 조상 불가
	
	static private Singleton s; //5. 그냥 static default로 두면 그냥 와서 꺼내가니까 private으로...
	
	private Singleton() { //1. 기본생성자를 private으로 지정
		
	}
	
	//2. 기본생성자가 private이라서 다른 클래스에서 쓸 수 없으니 객체를 생성하는 getInstance()를 만들어준다.
	static Singleton getInstance(){ //4.인스턴트 메소드로 만들면 main에서 객체못만들어서 못부르니까, static 메소드로 만들고, 그럼 변수들도 class변수로 만들어야함
		if(s == null){ //3.처음에 Singleton s 선언할땐 null로 초기화
			s = new Singleton(); //Singleton 생성자가 private이라 이 클래스 내에서는 사용가능함
		}
		return s;
	}
	
	
}