package z_exam;

public class TotalTest {	//TotalTest클래스가 호출되어, Method Area에 클래스변수와 클래스메서드가 로드된다. 클래스영역내에 클래스변수는 없으며, 클래스메소드 main메소드만 로드된다.
	public static void main(String[] args) {	//TotalTest의 클래스메소드인 main메소드가 호출되어 Call Stack에 로드되어 일을 시작한다.

		TvMaker.color = "Blue"; //1.TvMaker클래스가 호출, Method Area에 클래스변수 String 타입 color가 기본값 null로, 
								//  클래스변수 int 타입 inch가 기본값 0으로 로드된다. 클래스 메소드는 없다.
								//2.TvMaker의 클래스변수 color에 "Blue"가 저장된다.
		TvMaker tm = new TvMaker();	//1. 대입연산자 기준 왼쪽부터 시작된다.
									//2. 왼쪽:TvMaker클래스가 호출되었으나 이미 Method Area에 있으므로 이미 있는 걸로 쓴다.
									//		 TvMaker 클래스 타입의 참조변수 tm이 선언된다.
									//3. 오른쪽: 연산자 new에 의해 TvMaker 클래스의 인스턴스가  Heap Area에 생성되고, 그 인스턴스주소에 인스턴스변수와 인스턴스메서드, 인스턴스 초기화 메서드인 생성자가 로드된다.
									//		    인스턴스변수 - String 타입의 name이 선언되고 ""으로 초기화, int타입의 age가 선언되고 기본값 0으로 초기화 
									//			생성자- 매개변수가 없는 기본 생성자와, 매개변수를 String 타입1개, int 타입1개를 받는 생성자가 로드된다.
									//4. 대입연산자에 의해 참조변수 tm에 생성된 인스턴스의 주소가 저장된다.
		tm.age = 30; //위에서 인스턴스화가 이루어졌으니 참조변수tm을 통해 인스턴스변수 age를 불러올 수 있다. Heap Area의 tm의 주소에 가서 age에 30을 저장해준다.
		// 3. 메서드 호출
		// 3.1
		System.out.println(TvControll.channel); //1. System클래스는 기본적으로 자바에 로드가 되어있다. 
												//2. TvControll클래스가 호출되어 Method Area에 클래스상수, 클래스변수, 클래스 메서드와 함꼐 로드된다.
												//3. 클래스 상수: int 타입의 MAX_CHANNEL이 50으로, int타입 MIN_CHANNEL이 1로 초기화되어 로드된다
												//4. 클래스 변수: int타입의 channel이 15로 초기화되어 로드된다.
												//5. 클래스메소드: 매개변수가 없는 클래스 메소드 volumeDown이 로드된다. --Method Area에 클래스와 클래스 데이터들이 전부 로드되었다.
												//6. 클래스 변수 호출: 클래스명.클래스변수명 으로 호출되어  channel에 담긴 15가 콘솔창에 출력된다.
		TvControll.volumeDown();				//1. 클래스 메소드 호출: 클래스명.클래스메소드명();
												//2. TvControll 클래스는 이미 Method Area에 있으므로 이미 있는 걸로 쓴다.
												//3. volumeDown메소드가 호출되어 콜스택에 로드된다. 메소드안 if조건문을 만족하지 않으므로 else블럭이 실행되어 채널이 1단계 올라간다
												//4. 클래스변수 channel에 저장되어 이제 static int channel = 16이 된다.
												//4. return문을 만났으니 반환값을 돌려주고  volumeDown 메소드가 콜스택에서 사라진다(퇴근한다)
		System.out.println(TvControll.channel); //1. 클래스 변수 호출: 클래스명.클래스변수명, channel에 담긴 16이 콘솔창에 출력된다.

		// 3.2
		TvControll tc; 			//TvControll 클래스 타입의 참조변수 tc가 선언된다.
		tc = new TvControll();  //1.연산자 new에 의해 TvControll클래스의 인스턴스가 Heap 에 생성되고, 그 인스턴스의 주소에 인스턴스 데이터(인스턴스 변수,인스턴스 메소드)가 로드된다
								//2.인스턴스 변수: int타입 volume이99로 초기화되어 로드된다.
								//3.인스턴스 메서드: 매개변수를 받지않는 volumeUp메서드
								//4.대입연산자에 의해 참조변수 tc에 생성된 인스턴스의 주소가 저장된다.
		System.out.println(tc.volume);	//인스턴스변수 호출: 참조변수명.인스턴스변수명
										//1. Heap의 tc의 주소에 가서 인스턴스 변수 volume을 호출한다. volume값은 99이므로 콘솔창에 99가 출력된다.
		tc.volumeUp();					//인스턴스메서드 호출: 참조변수명.인스턴스메서드명
										//1. Heap의 tc의 주소에 로드된 volumeUp메서드가 호출되어 Call Stack의 main메서드 위에 쌓인다.
										//2. if문안의 조건을 만족하지 않아 else블럭이 실행되어 증감연산자에 의해 volume이  1올라가서 tc의 주소의 인스턴스변수 int volume 은 100이 된다.
										//3. return문을 만나 반환값을 돌려주고 volumeUp메소드가 콜스택에서 사라진다(퇴근)
		System.out.println(tc.volume);	//참조변수명.인스턴스변수명 으로 인스턴스변수 volume을 호출, 콘솔창에 100이 출력된다.
		tc.volumeUp();					//인스턴스메서드 호출: 참조변수명.인스턴스메서드명
										//1. Heap의 tc의 주소에 로드된 volumeUp메서드가 호출되어 Call Stack의 main메서드 위에 쌓인다.
										//2. if문안의 조건을 만족해 수행문장 실행되어 인스턴스변수 volume에 클래스 상수 MIN_VOLUME 값인 0이 저장된다 
										//3. return문을 만나 반환값을 돌려주고 volumeUp메소드가 콜스택에서 사라진다(퇴근)
		System.out.println(tc.volume);	//참조변수명.인스턴스변수명 으로 인스턴스변수 volume을 호출, 콘솔창에 0이 출력된다.

		//
		Calc cc = new Calc();	//1. 대입연산자 기준 왼쪽부터 시작된다.
								//2. 왼쪽:Calc클래스가 호출되어 Method Area에 클래스 데이터(클래스변수, 클래스메서드)와 함께 로드되나, Calc클래스에 둘다 없으므로 클래스만 로드된다.
								//		 Calc클래스 타입의 참조변수 cc가 선언된다.
								//3. 오른쪽: 연산자 new에 의해 TvMaker 클래스의 인스턴스가  Heap Area에 생성되고, 그 인스턴스주소에 인스턴스변수와 인스턴스메서드가 로드된다.
								//		    인스턴스변수 - 없음
								//			인스턴스메서드 - int타입 매개변수2개를 받는 add메서드, long타입1개와 int타입1개의 매개변수를 받는 add메서드, int타입 매개변수2개를 받는 minus메서드가 로드된다.
								//4. 대입연산자에 의해 참조변수 cc에 생성된 인스턴스의 주소가 저장된다.
		
		System.out.println(cc.add(Integer.MAX_VALUE, 4));	//1. 인스턴스메서드 호출: 참조변수명.인스턴스메서드명();
															//2. 인스턴스 메서드가 호출되어 콜스택에 로드된다.
															//3. Integer클래스가 호출되어 Method Area에 클래스변수, 클래스상수, 클래스 메서드가 로드되어 클래스 내에서
															//	  값이 있다면 그 값으로 초기화되고, 선언만 되었다면 선언된 타입에 따라 그 기본값으로 저장이 된다. 
															//   호출된 인스턴스 메서드는 f2로 확인한 결과 int타입2개를 받는
		System.out.println(cc.add(3L, Integer.MAX_VALUE));

	}
}

class TvMaker {
	// 1.
	// 1.1
	static String color;
	static int inch;
	// 1.2
	String name = "";
	int age;

	// 2.
	// 2.1
	TvMaker() {
		this("man", 25);
	}

	// 2.2
	TvMaker(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
class TvControll {
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	static final int MAX_CHANNEL = 50;
	static final int MIN_CHANNEL = 1;

	static int channel = 15;
	int volume = 99;

	// 4. return문
	int volumeUp() {
		if (volume == MAX_VOLUME) {
			volume = MIN_VOLUME;
		} else {
			volume++;
		}

		return volume;
	}
	//volumeDown인데 ~~가 channel
	static int volumeDown() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		return channel;
	}
}

class Calc {
	// 5.
	int add(int a, int b) {
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a + b; //minus메서드인데 a - b가 아니고 a + b가 수행된다.
	}
}