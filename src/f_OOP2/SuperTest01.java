package f_OOP2;
//p.138
public class SuperTest01 {
	public static void main(String[] args) {
		Child2 cd = new Child2();
		cd.method();
	}
}

class Parent2{
	int value = 40;
	void method(){
		System.out.println("Parent");
	}
}

class Child2 extends Parent2{
	int value = 30;
	void method(){
		System.out.println(value);//30 
		System.out.println(this.value); //30
		System.out.println(super.value);//40
		super.method(); //메서드도 super로 호출 가능 ↔ this는 인스턴스변수만 
	}
	//지역변수 -> 클래스내 전역변수 -> 부모클래스의 변수
}