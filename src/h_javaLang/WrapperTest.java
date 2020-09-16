package h_javaLang;

import java.util.Arrays;

public class WrapperTest {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		//toString()가 오버라이드 되어 있다.
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1 == i2);
		
		//equals()가 오버라이드 되어 있다.
		System.out.println(i1.equals(i2));
		
		Integer[] intArr = new Integer[3];
//		intArr[0] = new Integer(5);
//		intArr[1] = new Integer(10);
//		intArr[2] = new Integer(40);
		
		//AutoBoxing : 기본형 값을 wrapper클래스의 객체로 변환해 주는 기능
		intArr[0] = 5;
		intArr[1] = 10;
		intArr[2] = 40;
//		System.out.println(Arrays.toString(intArr));
		
		//UnBoxing : wrapper클래스의 객체를 기본형 값으로 변환해 주는 기능
		int b = intArr[0];
		
	}
}
