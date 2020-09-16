package h_javaLang;

public class StringBufferTest {
	public static void main(String[] args) {
		/*
		 String str = "a";
		 str += "a";
		 str += "a";
		 str += "a";
		 str += "a";
		 	  :
		 --------------------------------
		 
		 String str = "a";
		 str = new StringBuffer(str).append("a").toString();
		 str = new StringBuffer(str).append("a").toString();
		 str = new StringBuffer(str).append("a").toString();
		 							:
		*/
//		String str = "a";
//		long start = System.currentTimeMillis();
//		for(int i = 0; i < 3000000; i++){
//			str += "a";
//		}
//		
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		
		// 문자열을 합칠 때 StringBuffer를 사용 - 연산속도가 빠름, 동기화 보장
		StringBuffer strB = new StringBuffer("a");
		long start = System.currentTimeMillis();
		for(int i = 0; i < 300000000; i++){
			strB.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		// 문자열을 합칠 때 StringBuilder를 사용 - Builder는 동기화를 보장하지 않으므로 Buffer보다 연산속도가 빠르다.
//		StringBuilder strB = new StringBuilder("a");
//		long start = System.currentTimeMillis();
//		for(int i = 0; i < 300000000; i++){
//			strB.append("a");
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
	}
}
