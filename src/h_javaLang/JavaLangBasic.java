package h_javaLang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaLangBasic {
	public static void main(String[] args) {
		/*
		 1. java.lang패키지
		 	- java프로그래밍이 기본적으로 필요한 클래스들을 모아놓은 패키지이다.
		 	- String, Object, System,...
		 	
		 2. Object
		 	- Object클래스는 멤버변수없이 11개의 메서드로 되어있다.
		 	
		 	- equals()
		 		: 참조변수가 가르키는 주소를 비교
		 		: 주소가 아닌 변수의 해당 인스턴스가 가지고 있는 값을 비교하게 하려면 equals()를 오버라이드 해야한다.
		 		: equals()가 오버라이드 되어있는 클래스들
		 			-> String, file, Date,...
		 	
		 	- hashCode() - 10진수로 구성
		 		: 객체의 주소에서 해시코드를 만들어 반환한다.
		 		: String클래스는 같은 문자열을 가지고 있다면 동일한 해시코드를 반환하게 만들어져 있다.
		 	
		 	- toString()
		 		: Object의 toString
		 			-> return getClass().getName() + "@" + Integer.toHexString(haseCode());
		 		:toString() 오버라이드 되어있는 클래스들
		 			-> String,...
		 	
		 	- getClass()
		 		: 클래스의 정보를 얻어올 때 사용한다.
		 			1) 생성된 객체로 부터 얻는 방법
		 				ex) Class obj = new Person().getClass();
		 			2) 클래스 리터럴로부터 얻는 방법
		 				ex) Class obj = Person.class;
		 			3) 클래스명으로 부터 얻는 방법
		 				ex) Class obj = Class.forName("Person"); - ClassNotFoundException이 발생할 가능성이 있음
		 		
		 3. String
		 	- 다른 언어에서는 문자열을 char형 배열로 다룬다. 하지만 java에서는 문자열을 다룰 수 있는 String클래스를 제공한다.
		 	- 문자열을 합칠 때는 합쳐진 문자열을 저장할 인스턴스가 생성된다.
		 	- 문자열 비교
		 		: 문자열 리터럴을 만드는 방법과 객체의 생성자를 이용할 수 있다.
		 		
		 	- 인코딩 변환
		 		: Elipse의 기본 인코딩 방식은 "MS949"
		 		: 한글 윈도우의 기본 인코딩 방식은 "CP949"
		 		: 우리가 사용하는 인코딩 방식은 "UTF-8"
		 		
		 	- 문자열 format
		 		: 기본형 타입을 String타입으로 변환
		 			1) 빈 문자열을 더하는 방식
		 				ex) int a = 10;
		 					String b = a + "";
		 			2) valueOf메서드
		 				ex) String b = String.valueOf();
		 		: String타입을 기본형 타입으로 변환
		 			1) wrapper클래스를 이용하는 방식
		 				ex) String b = "123"; - 문자열이 숫자면 상관이 없지만 문자로 구성되어있으면 문제가 발생할 수 있다. 따라서 try-catch로 묶어줘야 한다.
		 					int c = Integer.parseInt(b);
		 					int c = Integer.valueOf(b);
		 			2) wrapper클래스의 진수
		 				ex) String b = "234";
		 					int c = Integer.parseInt(b,8); - 8진수인 "234"를 10진수로 변환
		 			
		 4. StringBuffer, StringBuilder
		 	- 문자열을 합치기 위해서 사용한다.
		 	- StringBuffer는 동기화를 보장
		 	- StringBuilder는 동기화를 보장하지 않아 StringBuffer보다 연산속도가 빠르다.
		 	
		 5. wrapper클래스
		 	- java는 모든 것을 객체로 다루어야 한다.
		 		  기본형	  |	   wrapper클래스	
		 		boolean   |	  	Boolean
		 		char      |	  	Character ***
		 		byte      |		Byte
		 		short     |		Short
		 		int       |		Integer ***
		 		long      |		Long
		 		float     |		Float
		 		double    |		Double
		 		
		 	- 기본형 타입 -> wrapper클래스 : AutoBoxing
		 	- wrapper클래스 -> 기본형 타입 : UnBoxing
		 
		 6. 정규식
		 	- 텍스트 데이터에서 원하는 형태의 문장을 찾기 위해 만들어 졌다.
		 	- 정규식 순서
		 		: 패턴정의
		 			-> Pattern클래스를 이용하여 패턴을 정의
		 			ex) Pattern p = Pattern.compile("[a-z]*");
		 		
		 		: 텍스트 비교
		 			-> Matchar클래스를 이용하여 패턴과 텍스트를 비교
		 			ex) Matchar m = p.matcher("text");
		 			
		 			    m.matches()
		 	
		 	- 정규식 문법
		 		^  : 문자열의 시작
		 			 ex) ^a
		 		$  : 문자열의 끝
		 			 ex) a$
		 		.  : 임의의 한 문자, " \ "는 포함하지 않는다.
		 		*  : 0개 또는 무한정 있을 수 있다.
		 		+  : 한 개이상 있을 수 있다
		 		?  : 0개 또는 한 개가 있을 수 있다
		 		() : 문자열을 하나의 문자로 인지한다.
		 		{} : 반복횟수를 지정,
		 			 ex) {3, 5} -> 3~5번 사이 반복, {4, } -> 4번이상 반복
		 		[] : 범위를 지정할 때 사용
		 			 ex) [abc] -> a,b,c 중에 하나, [a-z] -> 소문자 전부, [a-zA-Z0-9] -> 영문자에서 숫자
		 		|  : or연산을 수행할 때 사용
		 		\s : 공백문자
		 		\S : 공백문자를 제외한 나머지 문자
		 		\w : 알파벳이나 숫자
		 			 ex) [a-zA-Z0-9]
		 		\W : 알파벳이나 숫자를 제외한 나머지
		 		\d : 숫자[0-9]를 의미
		 		\D : 숫자를 제외한 모든 문자
		 		
		 		
		 		
		 		
		 		
		 */
		Pattern p = Pattern.compile("[a-z]*");	// 범위지정
		Matcher m = p.matcher("sdbfjhKlhfjk");	// 문자열 비교
		System.out.println(m.matches());		// 확인
	}
}
