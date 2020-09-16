package f_OOP2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class DrawShape extends Frame {
	public static void main(String[] args) {
		DrawShape ds = new DrawShape();
		//ds.paint(g); //Frame이 paint(g)를 자동호출하기때문에 주석처리 해놓음.
		
//		Point p1 = new Point(2,3);
//		Point p2 = new Point(5,7);
//		Point p3 = new Point(6,3);
//		//추가. 메인메소드안에서 트라이앵글 객체만들어봐 그럼 터질거야
//		Triangle tri = new Triangle(p1, p2, p3);
	}
	
	
	
	DrawShape(){
		super("경륜아 정신줄 놓지마!!!!"); //super: 부모 super(): 부모의 기본생성자 호출
		setSize(500, 500);
		setBackground(Color.ORANGE); //Color클래스의 클래스변수 ORANGE는 16진수로 값을 가지고있음.
		setVisible(true);
		setResizable(false);
	}
	
	
	@Override
	public void paint(Graphics g) {//Graphics g의 주소를 받기위해 객체가 만들어졌어야한다. 
		//1. 매개변수가 두개인 생성자를 이용하여 Circle 객체를 만들어주세요
		int r = 250;
		Point p = new Point(30, 40);
		Circle won = new Circle(r, p);

		//2. g.drawOval() 원을 그려주세요
		g.drawOval(p.x, p.y, won.r*2, won.r*2);
		
		//3-1. 매개변수가 하나인 생성자를 이용하여 Triangle객체를 만들어주세요
		//	 100,100  200,200  200,100
		Point[] pfriends = new Point [3];
		pfriends[0] = new Point(100,100);
		pfriends[1] = new Point(200,200);
		pfriends[2] = new Point(200,100);
		Triangle semo = new Triangle(pfriends);
		
		//3-2. 매개변수 세개짜리 생성자를 이용하여 Triangle객체를 만들어주세요. (위에꺼 주석하고)
//		Triangle semo = new Triangle(new Point(100,100),new Point(200,200),new Point(200,100));
		
		//4. g.drawLine() 3개를 이용하여 삼각형을 그려주세요
		g.drawLine(semo.p[0].x, semo.p[0].y, semo.p[1].x, semo.p[1].y);
		g.drawLine(semo.p[1].x, semo.p[1].y, semo.p[2].x, semo.p[2].y);
		g.drawLine(semo.p[2].x, semo.p[2].y, semo.p[0].x, semo.p[0].y);


	}
		
	
		
	
}
/**
 * 점을 관리하기 위한 클래스
 * @author ryun
 * @since 2020.08.24
 */
class Point{
	int x; // 점의 x좌표
	int y; // 점의 y좌표
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Circle{
	//1. 반지름(정수)을 저장할 수 있는 변수 r을 선언해 주세요
	int r;
	
	//2. 점 하나를 저장할 수 있는 변수 center를 선언해주세요 
	Point center;
	
	//3. 매개변수가 두개인 생성자를 이용하여 r과 center를 초기화해주세요.
	Circle(int r, Point center){
		this.r = r;
		this.center = center;	
	}
	
	//4. 기본생성자를 만들어주세요.
	//   단, 매개변수가 두개인 생성자를 호출하여 좌표는 100,100 반지름 50으로 초기화해주세요.
	Circle(){ 							//기본생성자
		this(50, new Point(100,100));	//매개변수가 두개인 생성자 호출. this()는 첫번째 줄에 호출
										//빈자리에 포인트타입이 들어가야함
	}
}


class Triangle{
	//1. 점3개를 저장할 수 있는 변수 p를 선언해주세요
	Point[] p;
	
	//2. 매개변수가 하나인 생성자를 만들어주세요
	Triangle(Point[] p){ //매개변수가 하나인 이유: 생성자=인스턴스 초기화메서드, Triangle의 인스턴스= 점을 담는 포인트배열 1개
		this.p = p;
	}
	
	//3. 매개변수가 3개인 생성자를 만들어주세요 ---매개변수: 꼭짓점 세개?
	Triangle(Point p1, Point p2, Point p3){
		p = new Point[3];
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
	}
	
	
}

