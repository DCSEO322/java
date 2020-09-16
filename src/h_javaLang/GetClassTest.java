package h_javaLang;

import java.util.Arrays;

public class GetClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		//1. 클래스의 정보를 객체로부터 얻는 방법
		Class re1 = new Person(23423L).getClass();
		System.out.println(re1.getName());
		System.out.println(Arrays.toString(re1.getInterfaces()));
		
		//2. 클래스 리터럴로부터 얻는 방법
		Class re2 = Person.class;
		System.out.println(re2.getName());
		System.out.println(Arrays.toString(re2.getInterfaces()));
		
		//3. 클래스명으로부터 얻는 방법
//		Class re3 = Class.forName("Person"); - ClassNotFoundException오류 발생
		Class re3 = Class.forName("h_javaLang.Person");	// 패키지명까지 입력해야 Exception이 발생하지 않는다.
		System.out.println(re3.getName());
		System.out.println(Arrays.toString(re3.getInterfaces()));
	}
}
