package e_OOP;

import java.util.Scanner;

public class InfiniteCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		inCal cal = new inCal();
		double result = 0;
		System.out.println("첫번째 숫자를 입력하세요");
		double firNum = scan.nextDouble();
		System.out.println("사칙연산을 입력하세요");
		String buho = scan.next();
		System.out.println("두번째 숫자를 입력하세요");
		double secNum = scan.nextDouble();
		
		if("+".equals(buho)){
			result = cal.add(firNum, secNum);
			double newResult = cal.add(firNum, secNum);
		}else if("-".equals(buho)){
			result =cal.substract(firNum, secNum);
			
		}else if("*".equals(buho)){
			result = cal.multiply(firNum, secNum);
			
		}else if("/".equals(buho)){
			result = cal.divide(firNum, secNum);

		}else if(!("exit".equals(buho))){
			System.out.println("연산종료");
		}
		System.out.println(result);
	}
}

class inCal{
	
	double add(double firNum, double secNum){
		double result = firNum + secNum;
		return result;
	}
	
	double substract(double firNum, double secNum){
		double result = firNum - secNum;
		return result;
	}
	
	double multiply(double firNum, double secNum){
		double result = firNum * secNum;
		return result;
	}
	
	double divide(double firNum, double secNum){
		double result = (int)((float)firNum / secNum * 10 + 0.5)/10;
		return result;
	}
	
	//1. 숫자값2개와 부호1개를 받는다
	//2. 부호에 따라 if문으로 계산기가 수행된다 (부호가 아니거나 exit 치면 종료)
	
	//3. 결과값이 result에 저장되고 출력
	//4. 부호1개와 숫자1개를 받는다
	//5. 부호에 따라 result+새로운값을 연산하는 if문으로 계산기가 수행된다
	
	//6. 결과값이 result에 저장되고 출력
	//7. 부호1개와 숫자1개를 받는다
	//8. 부호에 따라 result+새로운값을 연산하는 if문으로 계산기가 수행된다
	

}