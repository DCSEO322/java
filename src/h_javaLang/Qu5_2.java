package h_javaLang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qu5_2 {
	public static void main(String[] args){
	    //1. 텍스트가 영문자가 3회 반복되고 이후에 숫자가 하나이상으로 구성
	    Pattern p1 = Pattern.compile("[A-Za-z]{3}[0-9]+");
		Matcher m1 = p1.matcher("aaa0");
		System.out.println(m1.matches());

//		String regEx1 = "[a-z]{2,3}"; 
//		System.out.println(Pattern.matches(regEx1, "ssss"));
		
	    //2. 텍스트가 핸드폰 번호 형태인 '숫자3개-숫자4개-숫자4개'로 구성
		String regEx2 = "\\d{3}(-)\\d{4}(-)\\d{4}";
		System.out.println(Pattern.matches(regEx2, "010-5061-7530"));

	    //3. 텍스트가 핸드폰 번호로 구성
	    //  01 다음 0,1,7,8,9 – 0을 제외한 숫자, 숫자3개 – 숫자4개
		String regEx3 = "^01[0-1 | 7-9](-)[1-9]{3}(-)[0-9]{4}";
		System.out.println(Pattern.matches(regEx3, "011-751-0154"));

	    //4. 텍스트가 주민등록번호로 구성
	    //   년도 월 일 – 1~4 숫자6개
		String regEx4 = "[1-4]{2}(년도)[0-1]?[1-4](월)[0-3]?[1-4](일-)[1-4]{2}?0[1-4]";
		System.out.println(Pattern.matches(regEx4, "34년도12월23일-11"));

	    //5. 텍스트가 이메일로 구성
	    //  시작은 영문자 이어야 하고 특수기호는 - ,_ , \, . 4가지가 포함될 수 있다.
	    //  @ 이후 영문자가 1개~7개가 포함될 수 있다. 
	    //  . 이후 영문자가 2~3개가 포함되어야 한다.
	    //  .kr이 없을 수도 하나 존재 할 수도 있다.
		String regEx5 = "";
		System.out.println(Pattern.matches(regEx5, ""));
		
		
	}
}
