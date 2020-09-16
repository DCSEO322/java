package f_OOP2;

public class InstanceTest {
	public static void main(String[] args) {
		//1.
		Object fc = new FireCar(); //참조변수 타입 바꿔도 그대로 출력된다.
		
		if(fc instanceof FireCar){
			System.out.println("fc는 FireCar의 인스턴스이다.");
			FireCar ff = (FireCar)fc; //다운캐스팅
		}
		
		if(fc instanceof Car){
			System.out.println("fc는 Car의 인스턴스이다.");
			Car cc = (Car)fc; //다운캐스팅
		}
		
		if(fc instanceof Object){
			System.out.println("fc는 Object의 인스턴스이다.");
			Object oj = fc; //다운캐스팅
		}
		
		//2.
		Car c = new Car();
		if(c instanceof FireCar){
			System.out.println("c는 FireCar의 인스턴스이다.");
			FireCar ff = (FireCar)c; //문법적 오류는 없지만 24라인에서 c에 주소 생성시 FireCar의 인스턴스는 만들어지지 않았기때문에 빈것을 FireCar에 담을 수 없다
		}
		
		//3.
		Car cc = new FireCar(); //업캐스팅
		System.out.println(cc.a);
		System.out.println(cc.b);
		cc.method();
		cc.method2(); //(오버라이드되든 안되든) 인스턴스메서드만 객체타입에 영향을받는다
					  //클변,클메,인변은 참조변수타입에 영향

	}
	
	
}

class Car{
	static int a = 20;
	int b = 30;
	
	static void method(){
		System.out.println("Car 클래스메서드");
	}
	
	void method2(){
		System.out.println("Car 인스턴스메서드");
	}
}

class FireCar extends Car{
	static int a = 40;
	int b = 50;
	
	static void method(){ //오버라이딩은 인스턴스메서드끼리만 가능
		System.out.println("FireCar 클래스메서드");
	}
	
	@Override
	void method2(){
		System.out.println("FireCar 인스턴스메서드");
	}
}
	
class Ambulance extends Car{}