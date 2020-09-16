package e_OOP;

public class MyMathTest {
	public static void main(String[] args) {
		//8. MethodTest클래스의 add01메서드를 호출 하여라.
		//클래스명.클래스메서드명();
		MethodTest.add01();
		
		//9. MethodTest클래스의 add02메서드를 호출 하여라.
		int re02 = MethodTest.add02(100);
		System.out.println("add02 메서드 호출해서 반환받은 값 re02 : "+re02);
		
		//인스턴스 메서드를 호출하기위한 인스턴스 변수 생성
		//클래스명 참조변수명 = new 클래스명();
		MethodTest example = new MethodTest();
		//= 왼쪽 : 참조형변수 example이 main()안에 선언된 것
		//= 오른 : 인스턴스 만들긔
		
		//10. MethodTest클래스의 add03메서드를 호출 하여라.
		//인스턴스메서드 호출방법 : 참조변수명.인스턴스메서드();
		int re03 = example.add03(100);
		System.out.println("add03 메서드 호출해서 반환받은 값 re03 : "+re03);
		
		//11. MethodTest클래스의 add04메서드를 호출 하여라.
		example.add04(); //add04에 커서 올리면 1. 매개변수 없음 2. 반환값 없음 -> void 확인 가능
		
		
		
	} //main
}

class MethodTest {
	//1. 클래스변수 a를 선언하고 10의 값으로 초기화 하여라.
	static int a = 10;
	
	//2. 클래스변수 b를 선언하고 20의 값으로 초기화 하여라.
	static int b = 20;
	
	//3. 인스턴스변수 c를 선언하고 50의 값으로 초기화 하여라.
	int c = 50;
	
	//4. 클래스변수 a와 b의 합을 출력하는 클래스메서드 add01를 구현하여라.
	static void add01(){
		int result = a + b; //a, b, add01 전부 같은 클래스내에 있기에 MethodTest.a의 MethodTest.생략가능
		System.out.println(result);
	}
	
	//5. 클래스변수 a, b, int 타입의 매개변수 c의 합을 반환하는 클래스메서드 add02를 구현하여라.
	static int add02(int c){
		int result = a + b + c;
		return result;
	}
	
	//6. 인스턴스변수 c와 int 타입의 매개변수 c의 합을 반환하는 인스턴스메서드 add03를 구현하여라.
	//인스턴스변수와 매개변수 이름이 같을 때 인스턴스변수구별을 위해 this.사용 (우선순위: 지역변수 c > 인스턴스변수 c)
	int add03(int c){
		int result = this.c + c;
		return result;
	}
	
	
	
	//7. 인스턴스변수 c와 0~100 사이의 임의의 정수의 합을 출력하는 인스턴스메서드 add04를 구현하여라.
	void add04(){
		int random = (int)(Math.random()*101);
		int result = c + random;
		System.out.println(result);
	}
	
}
