package g_exception;

public class StringTest {
	public static void main(String[] args) {
		/*
		  주어진 문자열(s)을 갖는 String인스턴스를 생성
	 	 String(String s) : 매개변수 s의 값을 변수에 입력하여 그 값을 출력 
		*/
		String s = new String("Hello");
		System.out.println(s);

		/*
		  지정된 위치(index)에 있는 문자열을 알려준다.
		 char charAt(int index) : index번째에 있는 값을 뽑아낸다
		*/
		String s1 = "Hello";
		char c = s1.charAt(1);
		System.out.println(c);
		
		/*
		  문자열(str)과 사전순서를 비교
		  같으면 0을 사전순으로 이전이면 음수를, 이후면 양수를 반환
		 int compareTo(String str) : 문자열을 비교하여 음수인지 양수인지 판단
		*/
		int a = "aaa".compareTo("aaa");
		int b = "aaa".compareTo("aab");
		System.out.println(a);
		System.out.println(b);
		
		/*
		  문자열(str)을 뒤에 덧붙인다
		 String concat(String s) : concat을 이용하여 기존 변수 값에 문자열을 붙인다
		*/
		String s2 = "Hello";
		String s3 = s2.concat(" Oracle");
		System.out.println(s3);
		
		/* 
		  지정된 문자열(s)이 포함되었는지 검사한다.
		 boolean contains() : 기존 문자열에 같은 값이 있으면 true를 반환
		*/
		String s4 = "JavaSoEz";
		boolean a1 = s4.contains("S");
		System.out.println(a1);
		
		/*
		  지정된 문자열(suffix)로 끝나는지 검사한다.
		 boolean endsWith(str) : 문자열 마지막의 값이 같으면 true를 반환
		*/
		String s5 = "JavaSoEz.java";
		boolean a2 = s5.endsWith("java");
		System.out.println(a2);
		
		/*
		  매개변수로 받은 문자열(obj)과 String인스턴스의 문자열을 비교한다.
		 obj가 String이 아니거나 문자열이 다르면 false를 반환
		 boolean equals(Object obj) : obj의 값과 같으면 true를 반환(대소문자 비교)
		*/
		String s6 = "Java";
		boolean a3 = s6.equals("java");
		System.out.println(a3);
		
		/*
		  주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다.
		  못 찾으면 -1을 반환
		 int indexOf(int ch) : 문자열을 존재하는지 확인하여 존재하면 그 위치의 값을 반환(순서대로)
		*/
		String s7 = "Hello";
		int a4 = s7.indexOf("l");
		System.out.println(a4);
		
		/*
		  지정된 문자열을 인스턴스의 문자열 끝에서부터 찾아서 위치(index)를 알려준다.
		  못 찾으면 -1을 반환
		 int lastIndexOf(int ch) : 문자열을 거꾸로 확인하여 존재하면 그 위치의 값을 반환(반대로)
		*/
		String s8 = "Hello";
		int a5 = s8.lastIndexOf("l");
		System.out.println(a5);
		
		/*
		  문자열의 길이를 알려준다
		 int length() : 문자열의 길이를 확인하여 그 값을 반환
		*/
		String s9 = "My Length";
		int a6 = s9.length();
		System.out.println(a6);
		
		/*
		  문자열중의 문자열(obj)을 새로운 문자열(new)로 모두 바꾼 문자열을 반환
		 String replace(CharSequence old, CharSequence new) : 앞에 있는 문자열을 새로운 문자열로 변환
		*/
		String s10 = "Hello Oracle";
		String b1 = s10.replace("Oracle", "Java");
		System.out.println(b1);
		
		/*
		  문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환
		 String[] split(String regex) : 문자열의 값으로 문자열을 나누어 그 값을 배열의 index방에 저장
		*/
		String s11 = "dog-cat-snake";
		String[] sArr = s11.split("-");
		System.out.println(sArr[0]);
		System.out.println(sArr[1]);
		System.out.println(sArr[2]);
		
		/*
		  주어진 시작위치(begin)부터 끝 위치(end)범위에 포함된 문자열을 넣는다.
  		  이 때, 시작위치의 문자는 범위에 포함되지만, 끝 위치의 문자는 포함되지 않는다.
		 String subString(int begin, int end) : begin에서 시작하여 end번째까지 문자를 잘라낸다
		*/
		String s12 = "I Love Java";
		String b2 = s12.substring(2, 6);
		System.out.println(b2);
		
		/*
		 String인스턴스에 저장되어 있는 모든 문자열을 소문자로 변환하여 반환
		 String toLowerCase() : 문자열의 값들 중 대문자가 있으면 그 값을 소문자로 반환
		*/
		String s13 = "I Love Java";
		String b4 = s13.toLowerCase();
		System.out.println(b4);
		
		/*
		 String인스턴스에 저장되어 있는 모든 문자열을 대문자로 변환하여 반환
		 String toUpperCase() : 문자열의 값들 중 소문자가 있으면 그 값을 대문자로 반환 
		*/
		String s14 = "I Love Java";
		String b5 = s14.toUpperCase();
		System.out.println(b5);
		
		/*
		  문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환
  		  이 때, 문자열 중간에 있는 공백은 제거되지 않는다.
		 String trim() : 문자열의 양 끝이 공백이 존재하면 공백을 제거하여 문자열 반환
		*/
		String s15 = "  My Java  ";
		String b6 = s15.trim();
		System.out.println(b6);
		
		/*
		  지정된 값을 문자열로 반환하여 반환
   		  참조변수의 경우, toString()을 호출한 결과를 반환(매개변수로 모든 타입이 올 수 있다)
		 static String valueOf(boolean b) : 인자값을 문자열로 반환하여 반환
		*/
		String x = String.valueOf(true);
		String y = String.valueOf(100);
		String z = String.valueOf('a');
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
