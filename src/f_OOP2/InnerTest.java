package f_OOP2;

public class InnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();	//내부클래스인 Inner의 객체를 만들기 위해서 Outer의 참조변수를 통해 객체를 생성한다.
		in.method2(50);
		
	}
}

class Outer {
	int value = 10;
	
	
	class Inner {	// 인스턴스 클래스
		int value = 20;
		
		void method2(int value){
			System.out.println(value);	//인자값
			System.out.println(this.value);	// 20
			System.out.println(Outer.this.value); // Outer클래스의 value값 출력 = 10
		}
	}
	
	static class Inner2 {	// static 클래스
		
	}
	
	void method(){
		class Inner3 {	// 지역클래스
			
		}
	}
}