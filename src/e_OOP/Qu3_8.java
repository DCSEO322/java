package e_OOP;

public class Qu3_8 {
	public static void main(String[] args) {
		//7. 3번의 add메서드를 호출
		int result1 = MyAdd.add(10);
		System.out.println(result1);
		//8. 4번의 add메서드를 호출
		//인스턴스 메서드 호출을 위해 인스턴스 생성
		MyAdd ex = new MyAdd();
		int result2 = ex.add(10, 20);
		System.out.println(result2);
		//9. 5번의 add메서드를 호출
		long result3 = ex.add(10, 20L); //L안붙이면 int 2개로 인식해서 그 메소드한테로 감
		System.out.println(result3);
		//10. 6번의 add메서드를 호출
		float result4 = ex.add('1', 10F); //char a = 50은 선언및 초기화할땐 가능하지만 메소드 호출시에는 정확히 ''안에 넣어줘야함
		System.out.println(result4);
	} //main
}//class Qu3_8


class MyAdd{
	
	MyAdd(){
		
	}
	
	
	//1. 클래스변수 a를 선언하고 20의 값으로 초기화 하여라.
	static int a = 20;
	//2. 인스턴스변수 b를 선언하고 15의 값으로 초기화 하여라.
	int b = 15;
	//3. int타입의 매개변수가 하나이며 변수 a의 합을 반환하는 클래스메서드 add를 작성하여라
	static int add(int x){
		int result = a + x;
		return result;
	}
	//4. int타입의 매개변수가 두개이고 매개변수의 합을 반환하는 인스턴스메서드 add를 작성하여라
	int add(int x, int y){		//3과 비교: 메소드명 동일, 매개변수 타입 동일, 갯수 다름
		int result = x + y;
		return result;
	}
	//5. int타입, long타입 각 한개의 매개변수, 매개변수의 합을 반환하는 인스턴스메서드 add를 작성하여라
	long add(int x, long y){	//4와 비교: 메소드명 동일, 매개변수 타입 다름, 갯수 같음
		long result = x + y;
		return result;
	}
	//6. char타입, float타입 각 한개의 매개변수, 매개변수의 합을 반환하는 인스턴스메서드 add를 작성하여라
	float add(char x, float y){	//5와 비교: 메소드명 동일, 매개변수 타입 다름, 갯수 같음
		float result = x + y;
		return result;
	}
	
	//추가1. 인스턴스 메서드 add, 매개변수는 long타입 하나와 int타입 하나이며 매개변수의 합을 반환하는 메서드
//	long add(int x, long y){ //Duplicate method add(int,long) in type MyAdd
//		long result = x + y; 
//		return result;
//	}
	long add(long x, int y){
		long result = x + y;
		return result;
	}
	
	//추가2. 인스턴스 메서드 add, 매개변수는 int타입 두개이며 두 매개변수의 합을 반환하는 메서드
	//		단 반환타입이 long타입
//	long add(int x, int y){	//Duplicate method add(int,int) in type MyAdd --> 4번과 같음
//		long result = (long)x + y;
//		return result;
//	}
	
	
	
}//class MyAdd