package e_OOP;

class Data {
	int x; //인스턴스변수
}//class Data


public class DataTest {
	public static void main(String[] args) {
		
		/*
		 JVM
		 - 대입연산자가 있으니 왼쪽부터
		 - 왼쪽: Data클래스 타입의 지역변수 d1이 main()안에 선언됨
		 - 오른쪽: new 연산자에 의해 Heap 영역에 Data클래스의 인스턴스가 생성됨 -> 인스턴스변수와 인스턴스메서드가 자동로드
		 - 대입연산자: 참조변수에 대입됨
		 - Data클래스 호출되어 Method Area에 로드되고 -> 클래스변수와 클래스메서드가 함께 로드됨

		*/
		//1. Data클래스의 객체를 생성하여라. 변수명 d1
		Data d1 = new Data();
		
		//2. 참조변수 d1의 x값을 10으로 변경하여라.
		d1.x = 10;
		
		//3. 참조변수 d1의 x값을 출력하여라.
		System.out.println(d1.x); //예상: 10
		
		//4. 인자값으로 참조변수 d1의 x값을 가지는 change메서드를 호출하여라.
		//같은 클래스내에 있는 클래스메소드를 쓰는 것이기 때문에 메소드 호출시 클래스명 생략가능
		change(d1.x); //예상: 1000으로 초기화, 1000출력 //결과1000출력
		
		//5. 참조변수 d1의 x값을 출력하여라.
		System.out.println(d1.x); //예상: 1000 결과10
		
		//6. Data클래스의 객체를 생성하여라. 변수명 d2
		Data d2 = new Data();
		
		//7. 참조변수 d2의 x값을 10으로 변경하여라.
		d2.x = 10;
		
		//8. 참조변수 d2의 x값을 출력하여라.
		System.out.println(d2.x); //예상: 10
		
		//9. 인자값으로 참조변수 d2를 가지는 change메서드를 호출하여라.
		change(d2); //예상: 1000, 1000출력 //결과:1000출력
		
		//10. 참조변수 d2의 x값을 출력하여라.
		System.out.println(d2.x); //예상: 1000
	}//main
	
	static void change(int x){ //기본형 매개변수
		x = 1000;
		System.out.println("change() 기본형 : " + x);
	}
	
	static void change(Data d1){ //참조형 매개변수
		d1.x = 1000;
		System.out.println("change() 참조형 : " + d1.x);
	}
	
}//class DataTest
