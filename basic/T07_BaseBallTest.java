package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * 문제) Set을 이용하여 숫자 야구 게임 프로그램을 작성하시오.
 * 컴퓨터의 숫자는 난수를 이용하여 구한다.
 * (스트라이크는 'S', 볼은 'B'로 출력한다.)
 * 컴퓨터의 난수가 9 5 7일 때 실행 예시
 * 
 * 숫자 입력 => 3 5 6
 * 3 5 6 => 1S 0B
 *
 * 숫자 입력 => 7 8 9
 * 7 8 9 => 1S 1B
 * 	   . . .
 * 숫자 입력 => 9 5 7
 * 9 5 7 => 3S
 * 
 * 3번째 만에 맞추셨네요
 */

public class T07_BaseBallTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Set num = new HashSet();
		
		// 1~10사이의 중복되지않는 랜덤값을 numRnd에 저장
		Set<Integer> numRnd = new HashSet<>();
		while(numRnd.size() < 3) {
			int random = (int)(Math.random() * 9 + 1);
			numRnd.add(random);
		}
		
		List<Integer> numList = new ArrayList<>(numRnd);
		Collections.shuffle(numList);
		System.out.println(numList);
		int strike = 0;
		
		while(strike != 3) {
			System.out.print("공 : ");
			int input1 = scan.nextInt();
			int input2 = scan.nextInt();
			int input3 = scan.nextInt();
			
			if(input1 == numList.get(0)) {
				System.out.println("1S");
			} else if(input1 == numList.get(1)){
				System.out.println("1B");
			} else if(input1 == numList.get(2)) {
				System.out.println("1B");
			}
			
			if(input2 == numList.get(1)) {
				System.out.println("1S");
			} else if(input2 == numList.get(0)){
				System.out.println("1B");
			} else if(input2 == numList.get(2)) {
				System.out.println("1B");
			}
			
			if(input3 == numList.get(2)) {
				System.out.println("1S");
			} else if(input3 == numList.get(0)){
				System.out.println("1B");
			} else if(input3 == numList.get(1)) {
				System.out.println("1B");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
