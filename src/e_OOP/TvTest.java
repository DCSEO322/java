package e_OOP;

public class TvTest { //(src) TvTest.java = (bin) TvTest.class +  (bin) Tv.class
	public static void main(String[] args) {
		
		// 다른 클래스의 변수나 메서드를 부르기
		// 방법: Tv. 입력 -> △(변수), ▲(메서드), ⓢ(static = class 친구들)
		System.out.println(Tv.color); //기본값: null
		//1. color를 black으로 바꿔주세요.
		Tv.color = "black";	//내가 직접 클래스 변수에다가 black을 저장해야함.
		System.out.println(Tv.color); //black
		//2. color를 yellow로 바꿔주세요.
		Tv.changeColor(); //이 동작을 하는 메서드를 Class Tv에서 이미 만들어줬기 때문에 시키기만 하면 됨.
		System.out.println(Tv.color); //yellow
		
		
		
		//인스턴스화: 레시피 검색해서 가져와서 된찌(인스턴스)만들기
//		int[] arr = new int[3]; //arr을 int[3]으로 new 만들거임. 그럼 arr 타입도 int[]로 지정해줘야하는 것처럼
								//t도 Tv()타입으로 새로 만드니깐 			t의 타입은 Tv타입으로 만들어줘야함.
		Tv t = new Tv(); 		//==> 선언해줄 때 변수의 타입은 인스턴스 타입이랑 같아야한다. 참조변수
		//1. 인스턴스는 Heap 어딘가에 생성되었음
		//2. 인스턴스를 찾아갈 참조형 주소(인스턴스친구들이 로드 되는 곳)가 Heap에 생성되고, 그 주소가 t에 저장되었다. 
		//★ 인스턴스화 안하면 인스턴스친구들은 못써먹음
		//★  t는 't의 주소'를 가지고있다!
		
		//위에서 만든 t에 가서 channel을 찾아와라
		System.out.println(t.channel); //기본값: 0 출력
		t.channel = 10; //참조변수명.인스턴스변수명 
		//channel 올려라 : 미리만든애한테 시키기
		t.channelUp(); //참조변수명.인스턴스메소드명
		System.out.println("올린 채널 : " +t.channel);
		
		//볼륨 불러오쇼
		t.volume = 15;
		//볼륨 올리쇼 : 메서드한테 시켜
		t.volumeUp();
		System.out.println("올린 볼륨 : "+t.volume);
		
		
		//결론
		//누구 친구냐에 따라 부르는 방식이 달라짐
		//클래스친구 : 클래스명.친구
		//인스턴스친구 : 인스턴스화 (참조변수 선언) -> 참조변수.친구
		
		
		
	}//main
}

class Tv{ //TV관리 모음
	//전역변수(멤버변수)
	//클래스변수 - static
	static String color;
	//인스턴스변수
	int channel;
	int volume;
	
	
	
	//클래스메서드 - static
	static void changeColor(){
		color = "yellow";
	}
	
	//인스턴스메서드
	void channelUp(){
		channel++;
	}
	
	void volumeUp(){
		volume++;
	}
	
	
	
}