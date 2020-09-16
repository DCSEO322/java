package g_exception;

public class Exception_03 {
	public static void main(String[] args) {
		
		Exception e1 = new Exception("예외");	// Exception() : ()안에 예외발생 이유를 추가할 수 있다.
		
		try {
			throw e1;
		} catch (Exception e) {
			System.out.println("예외발생 성공");
			e.printStackTrace();
			System.out.println(e.getMessage()); // getMessage() : 이유만 출력
		}
		
		RuntimeException re = new RuntimeException("도시락 그만하고 싶다");
		try{
			throw re;
		} catch(RuntimeException e){
			e.printStackTrace();
		}
		/*
		컴파일러가 예외처리를 강제하지 않는 경우
			- RuntimeException과 그 자손들
			- Error
		이 두 가지를 'unChecked예외'라고 부른다.
		*/
	}
}
