package f_OOP2;
//p.139 예제3-14 super()
public class PointTest {
	public static void main(String[] args) {
		
	}
}

class Point2{
	int x;
	int y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	//부모에 기본생성자가 없을때 자손클래스 컴파일때 부모 기본생성자 호출하려고 하니 이걸 염두해야함
}

class Point3D extends Point2{ //컴파일러가 만들어주는 기본생성자안에는 부모의 기본생성자가 숨겨져있다.
	int z;
	
	Point3D(int x, int y, int z) { 	
		super(x,y);	//super로 부모꺼 먼저 초기화하고 자손꺼해야됨
		this.z = z;
	}
	
	//모든 생성자의 첫줄에는 super();가 들어있다
	Point3D(int t){
		super(t,0);
	}
}







