package e_OOP;

public class InitTest {
	public static void main(String[] args) {

		Init it = new Init(30);
		//순서: 1.기본값 2.명시적초기화  3.초기화블럭 4. 생성자
										// 클래스 변수
		System.out.println(it.action);  // 명시적초기화100 -> 초기화블럭10 			=> 출력값10
		
										// 인스턴스 변수
		System.out.println(it.action2); // 명시적초기화0 -> 초기화블럭70 -> 생성자30 => 출력값30

	}//main
}//InitTest



class Init{
	static int action = 100; //명시적 초기화
	int action2;
	
	Init(int action2){		 //생성자를 이용한 인스턴스변수 초기화
		this.action2 = action2;
	}
	
	//클래스 초기화 블럭
	static {
		action = 10;
	}
	
	//인스턴스 초기화 블럭
	{
		action2 = 70;
	}
	
	
}//Init
