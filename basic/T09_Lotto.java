package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
	 로또를 구매하는 프로그램 작성하기
 
 사용자는 로또를 구매할 때 구매할 금액을 입력하고
 입력한 금액에 맞게 로또번호를 출력한다.
 (단, 로또 한장의 금액은 1000원이고 거스름돈도 계산하여
      출력한다.)

	==========================
         	Lotto 프로그램
	--------------------------
	 1. Lotto 구입
	  2. 프로그램 종료
	==========================		 
	메뉴선택 : 1  <-- 입력
			
	 Lotto 구입 시작
		 
	(1000원에 로또번호 하나입니다.)
	금액 입력 : 2500  <-- 입력
			
	행운의 로또번호는 아래와 같습니다.
	로또번호1 : 2,3,4,5,6,7
	로또번호2 : 20,21,22,23,24,25
			
	받은 금액은 2500원이고 거스름돈은 500원입니다.
			
   	 ==========================
       	  Lotto 프로그램
	--------------------------
	  1. Lotto 구입
	  2. 프로그램 종료
	==========================		 
	메뉴선택 : 2  <-- 입력
		
	감사합니다
 */

public class T09_Lotto {
	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("==============================");
			System.out.println("\tLotto 프로그램");
			System.out.println("------------------------------");
			System.out.println("\t1. Lotto 구입");
			System.out.println("\t2. 프로그램 종료");
			System.out.println("==============================");
			System.out.print("메뉴 선택 : ");

			int input = 0;
			input = scan.nextInt();
			switch (input) {
			case 1:
				System.out.println("Lotto 구입 시작");
				LottoBuy();
				break;
			case 2:
				System.out.println("감사합니다");
				System.exit(0);
				break;
			default:
				System.out.println("번호를 다시 입력하세요");
			}
		}
	}

	private static void LottoBuy() {
		Scanner scan = new Scanner(System.in);

		System.out.print("금액 입력 : ");
		int money = scan.nextInt();

		if (money >= 1000) {
			for (int i = 0; i < money / 1000; i++) {
				Set<Integer> Lotto = new HashSet<>();
				while (Lotto.size() < 6) {
					int random = (int) (Math.random() * 45 + 1);
					Lotto.add(random);
				}
				System.out.println("로또 번호 : " + Lotto);
			}
			money = money % 1000;
			System.out.println("거스름 돈 " + money + "입니다.");
		} else {
			System.out.println("돈이 부족합니다.");
			return;
		}
	}
}
