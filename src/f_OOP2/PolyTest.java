package f_OOP2;

public class PolyTest {
	public static void main(String[] args) {
		//1. SmartTv 3대를 저장해주세요
		SmartTv stv1 = new SmartTv();
		SmartTv stv2 = new SmartTv();
		SmartTv stv3 = new SmartTv();
		SmartTv[] stv = {stv1,stv2,stv3};
		
//		SmartTv[] stv = new SmartTv[3];
//		stv[0] = new SmartTv();
//		stv[1] = new SmartTv();
//		stv[2] = new SmartTv();
		
		//2. AfreecaTv 2대를 저장해주세요
		AfreecaTv atv1 = new AfreecaTv();
		AfreecaTv atv2 = new AfreecaTv();
		AfreecaTv[] atv = new AfreecaTv[]{atv1, atv2};
		
//		AfreecaTv[] atv = new AfreecaTv[2];
//		atv[0] = new AfreecaTv();
//		atv[1] = new AfreecaTv();
		
		//3. DMBTv 2대를 저장해주세요
		DMBTv dtv1 = new DMBTv();
		DMBTv dtv2 = new DMBTv();
		DMBTv[] dtv = {dtv1,dtv2};
		
//		DMBTv[] dtv = new DMBTv[2];
//		dtv[0] = new DMBTv();
//		dtv[1] = new DMBTv();
		
		//4. 3대,2대,2대를 한 군데에 저장
		Tv[] t = new Tv[] {stv1,stv2,stv3,atv1,atv2,dtv1,dtv2}; //Tv형만 저장가능, stv,atv,dtv모두 tv를 상속받기때문에 가능, 보관 용이

		//업캐스팅 설명
		t[2] = (Tv)stv3;//SmartTv의 주소를 가지고있는 자식타입 stv3를 부모인 Tv타입 배열에 넣어줬다. 
		t[2] = stv3; 	//자식(작은타입)->부모(더 큰 타입)으로 가는거라서 (Tv) 캐스팅연산자가 생략됨
		
		//5. 3번방에 있는거 꺼내서 변수에 저장
		Tv t2 = t[2];
		
		//다운캐스팅
		//t[2]. <으로는 Tv클래스 멤버들만 부를 수 있고 SmartTv는 부를 수없다. 그래서 인터넷기능을 못쓴다. 인터넷 쓰려면 다운캐스팅해줘야한다.
		SmartTv st2 = (SmartTv)t2;
		
		//6.
		SmartTv tt = (SmartTv)new Tv(); //문법상 오류는 없지만 에러가 난다
		//다운캐스팅 예랑은 다름. 다운캐스팅은 t[3]에 있던걸 Tv t2에 저장해서 다운캐스팅한건데 t[2]에 이미 stv가 있어서 가능한거
		//이예시는 Tv인스턴스 만든건데 stv기능도 없이 tv인스턴스기능만 있는거가지고 SmartTv타입에 넣으려니까 안되는거
	}
}

class Tv{
	int volume;
	String color;
	void changeColor(String color){
		this.color = color;
	}
}

class SmartTv extends Tv{
	void internet(){
		
	}
}

class AfreecaTv extends Tv{
	void starBalloon(){
		
	}
}

class DMBTv extends Tv{
	void antena(){
		
	}
}

