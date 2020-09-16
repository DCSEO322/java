package f_OOP2;

import z_exam.ProTest_03;

public class ProTest_01 extends ProTest_03 {
	public static void main(String[] args) {
		ProTest_02 pt2 = new ProTest_02(); //같은패키지
		System.out.println(pt2.a);//public 제한없음
		System.out.println(pt2.b);//protected 같은 패키지 + 다른 패키지, 상속받은 클래스
		System.out.println(pt2.c);//default 같은 패키지
//		System.out.println(pt2.d);//private 같은 클래스 내에서만
		
		ProTest_03 pt3 = new ProTest_03(); //다른패키지
		System.out.println(pt3.a);//public 제한없음
//		System.out.println(pt3.b);//protected 같은 패키지 + 다른패키지, 상속받은 클래스
//		System.out.println(pt3.c);//default 같은 패키지
//		System.out.println(pt3.d);//private 같은 클래스 내에서만
		
		ProTest_01 pt1 = new ProTest_01();
		System.out.println(pt1.b); //pt1 객체에 조상 변수들도 있어서 protected 변수도 불러올 수 있음
//		System.out.println(pt1.c); //default인데 다른 패키지라서 못불러옴
//		System.out.println(pt1.d); //private, 같은 클래스 아니라서 못불러옴
	}
}
