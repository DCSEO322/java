package e_OOP;

public class CardTest {
	public static void main(String[] args) {
		//1. Card 클래스의 폭을 출력
		//클래스명 호출방식: 클래스명.클래스변수
		System.out.println(Card.width);
		
		//2. Card 클래스의 폭을 출력
		//클래스명 호출방식: 클래스명.클래스변수
		System.out.println(Card.height);
		
		//3. Card 클래스의 객체를 생성. 변수명: cd1
		//객체 생성 방식: 클래스명 참조변수명 = new 클래스명();
		Card cd1 = new Card();
		//대입연산자가 있으니까 왼쪽부터 시작, 왼쪽에는 변수가 선언되고 오른쪽은 변수값이 초기화되는 것
		//1. Card 는 이미 Method Area에 로드가 되어있으니 패스
		//2. cd1가 main메소드안의 지역변수이기때문에 main 메소드 안에 선언
		//3. cd1의 주소가 heap영역에 로드, 인스턴스 변수, 메소드도 로드
		//4. 이제 대입연산자를 통해 메인메소드안 지역변수에 저장이 되었어요 . .. .. ........
		
		//4. 변수 cd1의 이름을 "Daniel"로 변경.
		//참조변수명.인스턴스변수명 = 변경할 값;
		cd1.name = "Daniel";
		
		//5. 변수 cd1의 직원 번호을 "19961210"로 변경.
		//참조변수명.인스턴스변수명 = 변경할 값;
		cd1.number = 19961210;
		
		//6. Card 클래스의 객체를 생성. 변수명: cd2
		//객체 생성 방식: 클래스명 참조변수명 = new 클래스명();
		Card cd2 = new Card();
		
		//7. 변수 cd2의 이름을 "nayeon"로 변경.
		cd2.name = "nayeon";
		
		//8. 변수 cd2의 직원 번호을 "19950922"로 변경.
		cd2.number = 19950922;
		
		//9. 결과의 출력1과 같이 출력하여라.
		System.out.println("1번 카드의 이름은 "+cd1.name+", 직원번호 "+cd1.number+", 폭은"+cd1.width+", 높이는"+cd1.height+"이다.");
		System.out.println("2번 카드의 이름은 "+cd2.name+", 직원번호 "+cd2.number+", 폭은"+cd2.width+", 높이는"+cd2.height+"이다.");
		
		//10. Card 클래스의 폭을 70으로 변경.
		Card.width = 70; 		//cd1.width 라고 해도 바뀜

		
		//11. Card 클래스의 폭을 70으로 변경.
		Card.height = 100;
		
		//12. 결과의 출력2와 같이 출력하여라.
		System.out.println(1+"번 카드의 이름은 "+cd1.name+", 직원번호 "+cd1.number+", 폭은"+cd1.width+", 높이는"+cd1.height+"이다.");
		System.out.println(2+"번 카드의 이름은 "+cd2.name+", 직원번호 "+cd2.number+", 폭은"+cd1.width+", 높이는"+cd2.height+"이다.");
		
		
		

		
	}//main
}



class Card {
	
	String name; // 이름
	int number; // 직원번호
	static int width = 100; //폭
	static int height = 250; //높이
	
}