package h_javaLang;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class FileEncodingTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "가나";
	
		byte[] cpStr = str.getBytes("CP949");
		byte[] msStr = str.getBytes("MS949");
		byte[] utfStr = str.getBytes("UTF-8");
		
		System.out.println(Arrays.toString(cpStr));
		System.out.println(Arrays.toString(msStr));
		System.out.println(Arrays.toString(utfStr));
		// 영문자는 인코딩방식과 상관이 없다.
		// 한글은 인코딩방식을 UTF-8타입으로 지정하고 파일을 옮겨도 문자가 깨질 위험이 없다.
		// variable char : 필요없는 부분 제거, char : 배열 방 모두 존재
	}
}
