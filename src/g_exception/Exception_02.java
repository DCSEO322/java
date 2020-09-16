package g_exception;

public class Exception_02 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		// 0~10번 반복
//		for(int i = 0; i < 10; i++){
//			int random = (int)(Math.random()*5);
//			result = number/random;
//			System.out.println(result);
//		}
//		System.out.println("종료");
		
		// 0~10번 반복 중 오류가 발생하더라도 프로그램이 계속 돌아가도록 수행
		for(int i = 0; i < 10; i++){
			int random = (int)(Math.random()*5);
			try {
				result = number/random;
				System.out.println(result);
			} catch(ArithmeticException e) {
				System.out.println("0으로 나누지 마세요");
			}
		}
		System.out.println("종료");
	}
}