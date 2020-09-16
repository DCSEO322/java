package e_OOP;

public class MyMath {
	public static void main(String[] args) {
		//0817숙제: 이거 풀고 이거jvm 마이매스테스트jvm, 3-5계산기만드는프로그램 풀고 호출만들어라고? 숫자받고부호받고숫자받고 밑에 메서드로 어쩌고
		//메서드 만들 때: 메서드명칭(매개변수 뭔타입 몇개){
		//				수행문장
		//				return 있으면 -> return타입
		//				return 없으면 -> void
		//				}
		//메서드 호출시:
		//1. 누구 친구세요? 
		//2. 원하는 입력값(매개변수)이 있으신각여?
		//3. 반환값(리턴)이 있나여 -> 네 : 변수에 저장해서 쓰세요
		//				   	아뇨: 걍 호출만하세요
		
		
		//12. add1 메서드 호출
		MathTest.add1();
		
		//인스턴스 메소드 쓰기위해 인스턴스 생성
		MathTest example = new MathTest();
		
		//13. add2 메서드 호출
		int result2 = example.add2();
		System.out.println("result2: "+result2);
		
		//14. add3 메서드 호출
		MathTest.add3(50, 60);
		
		//15. add4 메서드 호출
		int result4 = example.add4(50, 60);
		System.out.println("result4: "+result4);

		//16. add5 메서드 호출
		long result5 = example.add5(50L, 60);	//long타입이기때문에 숫자에 L을 붙여 컴터에게 알려준다
		System.out.println("result5: "+result5);

		//17. add6 메서드 호출
		long result6 = example.add6(50L, 60, 70); 
		System.out.println("result6: "+result6);

		//18. add7 메서드 호출
		String result7 = example.add7("랜덤 : "); //매개변수에 임의의값??
		System.out.println(result7);

		
		
		
		
	}//main 끝
}


class MathTest{
	//1. 클래스변수 a를 선언하고 10의 값으로 초기화 하여라
	static int a = 10;
	//2. 클래스변수 b를 선언하고 20의 값으로 초기화 하여라
	static int b = 20;
	//3. 인스턴스변수 c를 선언하고 30의 값으로 초기화 하여라
	int c = 30;
	//4. 인스턴스변수 d를 선언하고 40의 값으로 초기화 하여라
	int d = 40;
	//5. 클래스메서드 add1, 클래스변수 a,b의 합을 출력하는 메서드
	static void add1(){				//입력X, 반환X
		int result = a + b;
		System.out.println(result);
	}
	//6. 인스턴스메서드 add2, 인스턴스변수 c,d의 합을 반환하는 메서드
	int add2(){						//입력X, 반환O
		int result = c + d;
		return result;
	}
	//7. 클래스메서드 add3, 매개변수 : int 타입 두개, 매개변수의 합을 출력
	static void add3(int x, int y){	//입력O, 반환X
		int result = x + y;
		System.out.println(result);
	}
	//8. 인스턴스메서드 add4, 매개변수 : int 타입 두개, 매개변수의 합을 반환
	int add4(int x, int y){			//입력O, 반환O
		int result = x + y;
		return result;
	}
	//9. 인스턴스메서드 add5, 매개변수 : int 타입 1개, long 타입1개, 매개변수의 합을 반환하는 메서드
	long add5(long x, int y){		//입력O, 반환O , 타입이 큰 연산자부터 써준다.
		long result = x + y;
		return result;
	}
	//10. 인스턴스메서드 add6, 매개변수 : long 타입1개, int타입 2개, 매개변수의 합을 반환하는 메서드
	long add6(long x, int y, int z){//입력O, 반환O
		long result = x + y + z;
		return result;
	}
	//11. 인스턴스메서드 add7, 매개변수 : 문자열 1개, 매개변수에 48~94중 임의의 값의 합을 반환하는 메서드	
	String add7(String x){			//입력O, 반환O
		String result = x + (int)(Math.random()*47+48);
		return result;
	}
	
	
}