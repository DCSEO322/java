package f_OOP2;

import java.util.Arrays;
import java.util.Scanner;

public class DeckTest {
	public static void main(String[] args) {
//		Card c1 = new Card();	//1,1
//		System.out.println(c1); //SPADE,A
								// 원래는 c1.toString()임. toString(): 객체가 가지고 있는 정보를 출력할 목적, Object클래스 상속받은 기본형
								//  (**Object 최상위 클래스, 자바의 필수항목 11가지가 들어가있음. (ex. equals()))
								// override한 toString: 부모에 있는 메서드를 상속을 받잖아 근데 그게내가맘에안들어 그래서 내가 재정의할거야
		
//		Card c2 = new Card(2,5); //1,1
//		System.out.println(c2);  //DIAMOND,5
		
		//9. 카드 한 벌의 객체를 생성 - 4. 기본 생성자 확인용
		Deck d = new Deck();
		System.out.println(Arrays.toString(d.c));
		
		//10. 0번 index의 카드 한 장을 뽑기 -
//		Card result1 = d.c[0];
		Card result1 = d.pick(0);
		System.out.println("0번 index: "+result1); //원래는 주소가 나오는데 toString을 override해줘서 카드 문양, 번호가 출력됨
		
		
		//11. 임의의 index번째 카드 한 장을 뽑기 - 6. pick(int index) 확인용...이 아니고 5.pick()사용해야했군
		System.out.println("임의의 숫자를 입력해 주세요");
		Scanner scan = new Scanner(System.in);
		int index = scan.nextInt();
		Card randomIndex = d.pick(index);
		System.out.println("임의의 숫자 반환값 : "+randomIndex);
		
		
		//12. 카드를 자동 섞기 - 7. shuffle 확인용
		d.shuffle();
//		System.out.println(Arrays.toString(d.c));
		
		//13. 0번 index의 카드를 한 장을 뽑기
		Card result2 = d.pick(0);
		System.out.println("0번 index: "+result2);
		
		//14. 카드 1000번 - -8. shuffle(int) 셔플확인용
		System.out.println("임의의 숫자를 입력해 주세요");
		int times = scan.nextInt();
		d.shuffle(times);
//		System.out.println(Arrays.toString(d.c));
		
		//15. 0번 index의 카드를 한 장을 뽑기
		Card result3 = d.pick(0);
		System.out.println("0번 index: "+result3);
		
	}//main
}//class DeckTest 

class Deck{ //카드 한 벌(52장) = Deck
	//2. 카드의 수량을 저장할 수 있는 변수 CARD_NUM을 선언하고 Card클래스의 상수를 사용하여 초기화하여라.
	static final int CARD_NUM = Card.KIND_MAX * Card.NUM_MAX; //JVM에서 대입연산자오른쪽은 값만 취득 ex 4*13=52
	
	//3. 카드 52장을 저장할 수 있는 변수 c를 선언 및 생성하여라. // 카드1장을 2개(종류,넘버)로 관리하고 있음. 
											  //(1,1) (1,2) (1,3) .... (1,13)
											  //(2,1) (2,2) 			(2,13)
											  //
											 //(4,1)					 (4,13)
	//문제 풀기 전 생각
	//카드 52장을 저장할 수 있는 변수 c.. 선언 및 생성-> 배열..
	//카드 1장에는 뭐가 들어있지? -> 숫자2개가 들어있음 각 숫자는 종류와 넘버를 나타냄
	//					 -> int kind랑 int number를 가진 Card의 모음!
	
	Card[] c = new Card[CARD_NUM]; //이러면 배열의 길이가 52여서 카드 전부 담을수 있어!!
	//문제에 '카드'! 를 담는다고했잖아!! 카드!!카드!!!!! 카드만드는방법 카드클래스를 이용해서 객체생성해서 만들어지는 카드들!!! 담는 변수!!!
	
	//틀린 답
//	int[][] c = new int[Card.KIND_MAX][Card.NUM_MAX]; -> 카드종류로 한번 묶이고, 그안에서 숫자로 나뉜다고 생각해서
//	int[] c = new int[CARD_NUM]; -> 1,1 같이 1이 숫자라고 생각해서

	
	//4. 기본생성자를 작성하여라.
	//	 c의 방들의 값을 1,1 ~ 4,13까지의 카드로 초기화하여라
	
	//문제풀기전 생각
	//1. c의 방(배열)에 들어있는 카드 한장씩(객체)
	//2. 객체생성하면 인스턴스변수 int kind, int number/ 생성자: Card(kind,number), Card() 로드, 인.메: toString() 로드 
	//3. 그 값을 초기화하려면 매개변수 2개인 Card생성자를 이용해서 인스턴스 변수를 초기화할 수 있음. 
	//4. 그리고 그 값을 담을 곳은 c[]배열의 각 방임. 0번부터 51번째 방까지
	
	//반복문
	//첫번째 (SPADE(1)부터 저장)
	//c[0] = new Card(1,1);
	//c[1] = new Card(1,2);
	//         :
	//c[12] = new Card(1,13);	
	//이게 한바퀴 다돌고나면
	//c[13] = new Card(2,1);
	//			:
	//c[25] = new Card(2,13);
	//			:
	//c[51] = new Card(4,13);
	
	//안쪽 반복문: 숫자저장 - 시작: 1, 끝:13, 증감+1, 반복 c[0] = new Card(1,number);
	//바깥쪽 반복문: 문양저장-시작: 1, 끝:4,  증감+1, 반복 c[0] = new Card(kind,number);
	
	//★생각해볼 것: 배열의 방번호-시작0, 끝:51(<c.length), 증감+1 
	//--> 근데 배열방번호 올라가는건 어디에넣지? 
	//--> 생성자랑 배열이랑 반복이 다르게되고있음. number반복이끝나도 배열방번호는 계속 증가하고있음
	
	
//	Deck(){
//		int index = 0;
//		do{
//			for(int kind = 1; kind < Card.KIND_MAX +1; kind++){
//				for(int number = 1; number < Card.NUM_MAX +1; number++){
//					c[index] = new Card(kind,number);
//					index++;
//				}
//			}
//		}while(index<c.length);
//	}
	
	//★★c.length생각하지말고 그냥 해보기! -이 식도 Card.KIND_MAX * Card.NUM_MAX 만큼 반복됨 
//	Deck(){
//		int index = 0;
//		for(int kind = 1; kind < Card.KIND_MAX +1; kind++){
//			for(int number = 1; number < Card.NUM_MAX +1; number++){
//				c[index++] = new Card(kind,number); 
//				index++;
//			}
//		}
//	}
	
	//다른방법
	//1. index++로 할수도있음 2.(kind-1)*13+(number-1) 3.CARD_NUM횟수로 FOR문돌려서 한번에 가능
	Deck(){
		int index = 0;
		for(int num = 0; num < CARD_NUM ; num++){
			c[index++] = new Card(num,num);
		}
	}
	
	
	
	//5. c에서 임의의 index번째 카드 한 장을 반환하는 메서드(pick)를 작성하여라.
	//문제에서 얻을 수 있는 정보
	//1) 임의의 index번째 카드 한장 -> Math.random()? c[0]~c[51]중에 한 장.
	//2) 입력값은 언급없으니 매개변수 x / 반환 return - 반환타입은? 카드를 뱉는거니까 Card?
	
	
	Card pick(){
		int random = (int)(Math.random()*CARD_NUM); //CARD_NUM 으로 하는게 좋은지? c.length 로 하는게 좋은지? 
		Card result = c[random];
		return result;
	}
	//★★result에 저장한 후 반환하도록 할것!
	
	//5-1. 사용자로부터 입력받은 index번째 카드 한 장을 반환하는 메서드(pick)를 작성하여라.
	
	//6. 사용자로부터 입력받은 index번째 카드 한 장을 반환하는 메서드(pick)를 작성하여라
	//	  단, 입력받은 값이 0~51사이의 정수라면 입력받은 index번째 카드 한 장을 반환하고
	//   그렇지 않은 경우에는 "랜덤번호"를 출력하고 임의의 한 장을 반환하도록 하여라.
	//문제에서 얻을 수 있는 정보
	//1) 사용자로부터 입력: Scanner 사용 -? index
	//2) 매개변수: int index
	//3) 수행문장: index방 번호의 카드 반환
	//4) 반환값: 그 카드값 -> 반환타입: Card
	//5) 단: if 0~51이면 -> index번째 카드, 아니면 syso 랜덤번호 + 임의의 한장
	
	Card pick(int index){ 			//매개변수가 있어야 오버로드가능함 
		Card result;				//아니면 Card result = new Card()?
		if(0<=index && index<=51){
			result = c[index];
		}else{
			result = pick();
			System.out.println("랜덤번호 : "+index);
		}
		return result;
	}
	
	
	//6-1. pick c의 방중 임의의 index번째 카드 한장을 반환하는 메서드
	//	     단. 5-1번에서 만든 pick메서드를 활용
//	Card pick(){
//		int random = (int)(Math.random()*CARD_NUM);
//		Card result = pick(random);
//		return result;
//	}
	
	//7. c의 카드를 섞는 메서드(shuffle)을 작성하여라. - 자동 섞기
	//   단, 카드 섞는 법  : 연습문제 5-6의 방법을 활용
	//문제에서 얻을 수 있는 정보
	//0) 메소드명: shuffle
	//1) 자동으로 섞는거니까 입력값 없음, 반환해주는 게 아니니까 반환타입 void
	//2) 카드를 섞는다 -> 배열 안에서 숫자가 이동한다. 
	//	  1. 랜덤돌려서 랜덤인덱스값을 만들고, 그 랜덤 인덱스 값을 다른 곳에 저장해주고 그렇게 52번돌림?
	void shuffle(){
		for(int num = 0; num < CARD_NUM; num++){// 52
			int random = (int)(Math.random()*CARD_NUM);
			Card temp = c[num];
			c[num] = c[random];
			c[random] = temp;
		}
	}
	
	
	
	
	
	//8. 사용자로부터 입력받은 횟수만큼 c의 카드를 섞는 메서드(shuffle)을 작성하여라.
	//   단, 임의의 방 두개를 뽑아 두개의 index번째 요소의 위치를 바꾼다.
	//   이를 사용자로부터 입력받은 횟수만큼 반복한다.
	//문제에서 얻을 수 있는 정보
	//1) shuffle 메서드 오버로딩
	//2) 매개변수: 사용자 입력값
	//3) 수행: 임의의 방 2개를 뽑아 두개의 index번째 요소 위치 바꿈
	//	           사용자로 입력받은 횟수만큼 반복한다
	//4) 수행예시: 사용자가 3을 입력받으면 3회반복(for문), 그안에서 int random1, random2해서 방 바꾸는거 해야함
	//5) 반환: 하지않음 -> 반환타입 보이드
	
	void shuffle(int times){
		for(int num = 0 ; num < times ; num++){
			int random1 = (int)(Math.random()*CARD_NUM);
			int random2 = (int)(Math.random()*CARD_NUM);
			Card temp = c[random1];
			c[random1] = c[random2];
			c[random2] = temp;
		}
	}
	
	
	
}//class Deck









class Card{ //extends Object가 숨어있음
	
	//상수는 클래스변수로 만드는게 일반적이다
	static final int KIND_MAX = 4; //문양의 갯수
	static final int NUM_MAX = 13; //숫자 ace~king(13)
	
	static final int SPADE = 1; 
	static final int DIAMOND = 2;
	static final int HEART = 3;
	static final int CLOVER = 4;
		
	static int width = 100;
	static int height = 250;

	int kind;
	int number;
	
	Card(int kind, int number){ //매개변수 있는 생성자 
		this.kind = kind;
		this.number = number;
	}
	
	Card(){ //기본 생성자 
		this(SPADE,1); //상수 사용: 변수명만으로도 숫자를 인지할 수 있게! --> 나중에 enum(열거형)에서 비슷한 용법이 나옴 
	}
	
	@Override //Object 클래스(상속받은 클래스)의 메소드를 재정의해서 쓸 수 있다. 부모꺼보다 내꺼가 우선!
	public String toString() { //반환타입 String 의 Object 클래스의 toString메소드 
		String kind = "";	//SPADE ...  //공백으로 한 이유: 선언만 했을때 해당문장을 안지나가면 초기화가안됨 default 없으면 null값되서 null point exception??
		String number = ""; //A,J,Q,K는 숫자가아님
		
		//종류에 따라
		switch (this.kind) {
		case 1:
			kind = "SPADE";
			break;
		
		case 2:
			kind = "DIAMOND";
			break;
			
		case 3:
			kind = "HEART";
			break;

		default:
			kind = "CLOVER";
			break;
		}
		
		//1. 인스턴스변수 number의 값이 11이면 지역변수 number의 값을 "J"로, 12이면 "Q"로, 13이면 "K"로, 1이면 "A"로 
		//   그 외의 경우는 번호 그대로를 저장하여라
		switch (this.number) {
		case 1:
			number = "A";
			break;
			
		case 11:
			number = "J";
			break;
			
		case 12:
			number = "Q";
			break;
			
		case 13:
			number = "K";
			break;
			
		default:
			number = this.number + ""; //숫자->문자
			//number += this.number; (이미 number에 ""이 들어있기때문에 가능) -> ★이런 생각을 할 수 있도록 노력할 것!!
			break;
			
		}
		
		
		return kind+"|"+number;
	}
	
	
}