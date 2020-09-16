package e_OOP;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		//5. 사용자로부터 정수를 입력 받아 변수 firstNum에 저장하여라
//		Scanner scan = new Scanner(System.in);		//스캐너 클래스의 객체 scan을 생성. scan의 주소가 heap에 생성. scan의 인스턴스변수,메소드가 로드됨
//		System.out.println("첫번째 숫자를 입력해 주세요");
//		int firstNum = scan.nextInt();
//		
//		//6. 사용자로부터 부호를 입력 받아 변수 buho에 저장하여라
//		System.out.println("부호를 입력해 주세요");
//		String buho = scan.next();
//		
//		//7. 사용자로부터 정수를 입력 받아 변수 secondNum에 저장하여라
//		System.out.println("두번째 숫자를 입력해 주세요");
//		int secondNum = scan.nextInt();
//
//		
//		//8. buho에 저장된 값이 '+'이면 add메서드, '-'이면 substract메서드,
//		//	 '*'이면 multiply메서드, '/'이면 divide메서드를 호출하고 결과를 출력하여라
//		//   단, buho의 저장된 값이 위의 4가지 경우가 아니라면 '연산종료'를 출력하여라.
//		
//		//Calc클래스의 인스턴스 메서드 사용을 위해 인스턴스 생성
//		Calc example = new Calc();
//		
//		if("+".equals(buho)){
//			int resultAdd = example.add(firstNum, secondNum);
//			System.out.println("두 숫자를 더한 값: "+resultAdd);
//			
//		}else if("-".equals(buho)){
//			int resultSubstract =example.substract(firstNum, secondNum);
//			System.out.println("두 숫자를 뺀 값: "+resultSubstract);
//			
//		}else if("*".equals(buho)){
//			long resultMultiply = example.multiply(firstNum, secondNum);
//			System.out.println("두 숫자를 곱한 값: "+resultMultiply);
//			
//		}else if("/".equals(buho)){
//			float resultDivide =example.divide(firstNum, secondNum);
//			System.out.println("두 숫자를 나눈 값: "+resultDivide);
//
//		}else{
//			System.out.println("연산종료");
//		}
		
		Scanner scan = new Scanner(System.in);
		Calc example = new Calc();
		//JVM 그릴때는 3*2라고 가정
		do{
			
			System.out.println("첫번째 숫자를 입력해 주세요");
			int firstNum = scan.nextInt();
			System.out.println("부호를 입력해 주세요");
			String buho = scan.next();
			System.out.println("두번째 숫자를 입력해 주세요");
			int secondNum = scan.nextInt();
			
			if("+".equals(buho)){
				int resultAdd = example.add(firstNum, secondNum);
				System.out.println("두 숫자를 더한 값: "+resultAdd);
				
			}else if("-".equals(buho)){
				int resultSubstract =example.substract(firstNum, secondNum);
				System.out.println("두 숫자를 뺀 값: "+resultSubstract);
				
			}else if("*".equals(buho)){
				long resultMultiply = example.multiply(firstNum, secondNum);
				System.out.println("두 숫자를 곱한 값: "+resultMultiply);
				
			}else if("/".equals(buho)){
				float resultDivide =example.divide(firstNum, secondNum);
				System.out.println("두 숫자를 나눈 값: "+resultDivide);
	
			}else{
				System.out.println("연산종료");
			}
			
		}while(true);	
		
	}//main 끝
}//클래스 Calculator 끝

class Calc {
	//1. 두 개의 int타입 입력받아 두 인자의 합의 결과를 반환하는 인스턴스메서드  add를 구현하여라
	int add(int x, int y){
		int result = x + y;
		return result;
	}
	//2. 두 개의 int타입 입력받아 앞의 인자에서 뒤의 인자를 뺀 결과를 반환하는 인스턴스메서드 substract를 구현하여라.
	int substract(int x, int y){
		int result = x - y;
		return result;
	}
	//3. 두 개의 int타입 입력받아 두 인자의 곱의 결과를 반환하는 인스턴스메서드 multiply를 구현하여라.
	//   단, overflow를 고려하여라.
	long multiply(int x, int y){
		long result = (long)x * y;
		return result;
	}
	//4. 두 개의 int타입 입력받아 앞의 인자를 뒤의 인자로 나누기한 결과를 반환하는 인스턴스메서드 divide를 구현하여라.
	//   단, 결과는 소수점 두 번째 자리에서 반올림하여 첫번째 자리까지 표현하여라.
	float divide(int x, int y){
		float result = (int)((float)x / y * 10 + 0.5)/10f;
		return result;
	}
	
	
	
	
	
}// 클래스 Calc 끝