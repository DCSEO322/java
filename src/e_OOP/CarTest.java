package e_OOP;

public class CarTest {
	public static void main(String[] args) {
		
		//basic: black,stick,4
//		Car basic = new Car();
//		basic.color = "black";
//		basic.gearType = "stick";
//		basic.door = 4;
		
		//기본 생성자 생성후
		Car basic = new Car(); //new:	 basic주소 생성해 heap에 color=null,g.T=null, door=0, Car() 로드, 
							   //Car();: 생성자 CallStack에 호출, 메소드처럼 시작 
		System.out.println(basic.color);
		
		Car limited = new Car("Orange","Auto",2); //메소드 오버로딩해서 원하는 인자 넣어주는 방식과 같음
		System.out.println(limited.color);
		System.out.println(limited.gearType);
		System.out.println(limited.door);
		
		Car colorCar = new Car("Red");
		System.out.println(colorCar.color);
		System.out.println(colorCar.gearType);
		System.out.println(colorCar.door);
		
		
	}//main
}//class CarTest


class Car{
	
	String color;
	String gearType;
	int door;
	
	//매개변수가 없는 "기본 생성자" - p.118
	Car(){
		color = "black";
		gearType = "stick";
		door = 4;
	}
	
	//매개변수 3개인 생성자 - p.120,121
	Car(String color, String gearType, int door){	//사용자가 볼 때 변수명이 직관적이어야함
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	//매개변수가 1개 + this()가 쓰인 생성자 - p.122
	Car(String color){
		this(); // "첫줄"에서 생성자 내부에서 다른 생성자 호출할때 쓰임
		this.color = color;
	}

}//class Car
