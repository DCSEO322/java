package z_exam;

import java.util.Arrays;

public class Exam_04 {
	public static void main(String[] args) {
		
		
		//p.83~87 배열
		
		//[5-1] 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하시오.
		/*
		O	1. int[] arr[];
			-> 2차원 배열의 선언방식 3가지 중 하나
			-> int[][] arr;
			-> int arr[][]; 
				
		O	2. int[] arr = {1,2,3,}; //arr.length = 3 값이 없으니 없는 방으로 취급
			
			-> 1차원 배열의 초기화
			-> int[] arr = {1,2,3};
			-> int[] arr = new int[3];
			-> arr = {1,2,3};
			
			-> 2차원 배열의 초기화
			-> 타입[][] 변수명 = new 타입[1][2];
			
			-> 타입[][] 변수명 = new 타입[][] { {값,값..} , {값, 값..} };
			-> 타입[][] 변수명 = { {값, 값..} , {값, 값..}};
			
			
			-> int[] arr = new int[]{1,2,3};
		
		O	3. int[] arr = new int[5];
			-> 1차원 배열의 선언 및 생성
			
		X	4. int[] arr = new int[5]{1,2,3,4,5};
			-> int[] arr = new int[5];
			-> int[] arr = {1,2,3,4,5}; 둘 중 하나 선택
			
		X	5. int arr[5];
			-> arr을 5의 길이로 생성하고 싶다면 int[] arr = new int[5];
			
		O	6. int[] arr[] = new int[3][];
			-> 작은 배열이 아직 null 
			-> int[] arr[] = {
								null,
								null,
								null,
							 }
							 
			-> 0번방3개, 1번방2개, 2번방4개 
			-> arr[0] = new int[3];
			-> arr[1] = new int[2];
			-> arr[2] = new int[4];
			-> int[] arr[] = {
								{0, 0, 0},
								{0, 0},
								{0, 0, 0, 0}
							  }
		*/
//		int[] arr[] = new int[3][];
//		arr[0] = new int[3];
//		arr[1] = new int[2];
//		arr[2] = new int[4];
//		//시작0 끝2 증감+1, 반복 syso(arr[][]);
//		
//		for(int row = 0 ; row < arr.length ; row++){
//			for(int col = 0; col < arr[row].length ; col++){
//				System.out.print(arr[row][col]);
//			}
//			System.out.println();
//		}
		
		
		//[5-2] 다음과 같은 배열이 있을때,
		int[][] arr0 = {
						{ 5, 5, 5, 5, 5 },	//arr0[0]
						{ 10, 10, 10 },		//arr0[1]
						{ 20, 20, 20, 20 }, //arr0[2]
						{ 30, 30 }			//arr0[3]
					   };
		//(1) arr0[3].length의 값은 얼마인가? 				답:2
		//(2) arr.length의 값은 얼마인가?						답:4
		//(3) System.out.println(arr0[4][1])의 출력 결과는?	답:오류
		
		
		//[5-3] 배열 arr1에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int sum1 = 0;
		
		//sum1 += arr1[0];
		//sum1 += arr1[1];
		//sum1 += arr1[2];
		//sum1 += arr1[3];
		//sum1 += arr1[4];
		//시작0, 끝4, 증감+1, 반복 sum += arr1[i];
		
		for(int i = 0 ; i < arr1.length ; i++){
			sum1 += arr1[i];
		}
		System.out.println("Sum1 = "+sum1);

		System.out.println();
		//[5-4] 2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
		int[][] arr2 = {
						 { 5, 8, 13, 5, 2 },
						 { 22, 13, 28 },
						 { 2, 18, 23, 62 },
						};
		
		int total = 0; //합계를 저장하기 위한 변수
		//total += arr2[0][0];
		//...
		//total += arr2[0][4];
		
		//total += arr2[1][0];
		//
		//total += arr2[1][2];
		
		//total += arr2[2][0];
		//..
		//total += arr2[2][3];
		
		//바깥for(row) 시작0 끝2 증감+1				반복:안쪽for
		//안쪽for(col) 시작0 끝arr2[row].length-1	반복:total += arr2[row][col];
		
		int count = 0;
		//total 총합계
		for(int row = 0; row < arr2.length ; row++){
			for(int col = 0 ; col < arr2[row].length ; col++){
				total += arr2[row][col];
				count++; // 이렇게 하면 average = (float)total/count로 한번에 구할 수 있음
			}
		}
		
		//average 평균 = 합계 / 배열의 총 길이
		//1단계) 배열의 총길이
		int arr2Length = 0;
		//arr2Length += arr2[0].length;
		//arr2Length += arr2[1].length;
		//arr2Length += arr2[2].length;
		//시작0 끝2 증감+1 반복 arr2Length += arr2[i].length;
		for(int i = 0; i < arr2.length; i++){
			arr2Length += arr2[i].length;
		}

		
		
		//2단계) 평균 = 합계 / 배열의 총 길이
		float average = 0; //평균을 저장하기 위한 변수
		average = (float)total/arr2Length;
		
		System.out.println("arr2의 합계 : "+total);	//201
		System.out.println("arr2의 평균 : "+average);	//16.75
		
		System.out.println();
		//[5-5] 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제.
		//		변수 money의 금액을 동전으로 바꾸었을 때 각각 몇개의 동전이 필요한지 계산해서  출력하라.
		//		단, 가능한 한 적은 수의 동전으로 거슬러 주어야 한다.
		//		답: 500원 5개, 100원 2개, 50원 1개, 10원 4개
		
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2790;
		
		//문제풀기전 생각
		//1. 가능한 적은 수 -> 500 부터 나누어 나간다 
		//2. 몫과 나머지를 쓰는걸까?
		
		//1단계 : 갯수 저장할 변수 생성
		int[] coinNeed = new int[4];
		
		//2단계 : 동전 단위 당 필요한 갯수
		//500원 coinNeed[0] = money / coinUnit[0];
		//		money %= coinUnit[0];
		//100원 coinNeed[1] = money / coinUnit[1];
		//		money %= coinUnit[1];
		//50원  coinNeed[2] = money / coinUnit[2];
		//		money %= coinUnit[2];
		//10원  coinNeed[3] = money / coinUnit[3];
		//		money %= coinUnit[3];
		//시작0, 끝3, 증감+1, 반복 coinNeed[i] = money / coinUnit[i]
		//					money %= coinUnit[i] -> 단 이 조건은 i < coinUnit.length -1 일때만 실행
		
		for(int i = 0 ; i < coinUnit.length ; i++){
			coinNeed[i] = money / coinUnit[i];
			money %= coinUnit[i];
			System.out.println(coinUnit[i]+"원 : "+coinNeed[i]+"개");
		}
		
		//언니풀이 - 내꺼에서 coinNeed[i] 배열 대신 직접 출력문에 수식 넣은 것
//		for(int coin = 0; coin < coinUnit.length ; coin++){
//			System.out.println(coinUnit[coin] + "원 : "+money/coinUnit[coin] + "개");
//			money %= coinUnit[coin];
//		}
		
		//쌤풀이 -> 5-8과 연관 
		//change = money / coinUnit[0]; //거스름 동전의 갯수 = 돈 / 동전의 단위
		//money -= (coinUnit[0]*change) //남은돈 = 원래돈 - 동전의 단위 * 동전의 갯수
		
//		for(int i = 0; i < coinUnit.length ; i++){
//			int change = money / coinUnit[i];
//			money -= (coinUnit[i]*change);
//			System.out.println(coinUnit[i]+"원 :"+change+"개");
//		}
//		System.out.println();
		
		//[5-7] 내 풀이 문제점
		//1. 동전의 갯수를 굳이 for문 밖에서배열로 만들지 않아도 됨 -> 반복문내에서 출력되고 쓰이지 않으니까
		
		
		
		//[5-6] 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램
		//		* 임의의 값을 사용했기 때문에 실행 결과와 다를 수 있다.
		//		* 실행결과: 6 8 2
		
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];
		
		// ballArr의 index순서대로 index의 요소와 임의의 요소를 골라서 값을 바꾼다.
		//int random = (int)(Math.random()*9);
		//int temp = ballArr[0];
		//ballArr[0] = ballArr[random];
		//ballArr[random] = temp;
		//시작0 끝8 증감+1, 반복: 위의 세 문장
		for(int i = 0 ; i < ballArr.length ; i++){
			int random = (int)(Math.random()*ballArr.length);
			int temp = ballArr[i];
			ballArr[i] = ballArr[random];
			ballArr[random] = temp;
		}
		
		System.out.println(Arrays.toString(ballArr));
		// ballArr의 앞에서 3개를 ball3로 복사한다.
		// ball3의 값을 출력한다.
		
		//int temp = ballArr[0];
		//ballArr[0] = ball3[0];
		//ball3[0] = temp;
		//System.out.println(ball3[0]);
		//시작0,끝2,증감+1, 반복: 위의 4문장
		for(int i = 0 ; i < ball3.length ; i++){
			ball3[i] = ballArr[i];
//			int temp = ballArr[i]; 	//다른 배열에 있는 값을 가지고 오는 것이기 때문에 굳이 이렇게 할 필요 없음
//			ballArr[i] = ball3[i];
//			ball3[i] = temp;
			System.out.println(ball3[i]);
		}
		
		
		
		
		System.out.println();
		//[5-7] 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 '*'을 찍어서 그래프를 그리는 프로그램
		int[] answer = { 1, 4, 3, 2, 1, 2, 3, 2, 1, 4 };
		int[] counter = new int[4];
		
		// answer의 요소들 중 1이면 counter의 0번방을 증가, 2이면 counter의 1번방을 증가
		// 				 3이면 counter의 2번방을 증가, 4이면 counter의 3번방을 증가
		
		// counter에 저장된 요소를 결과와 같이 출력하여라
		// 1 : 3개 *** //별의 개수 == System.out.print("*")을 counter[i]만큼 반복하고 System.out.println();
		// 2 : 2개 **
		// 3 : 2개 **
		// 4 : 2개 **
		
		
		//문제 풀기 전 생각 - (처음에 선택정렬 했었는데 할 필요 없음)
		//1단계: answer[i] == 1~4? 반복을 통해 들어있는 값 찾기
		//2단계: 저장된 요소 확인 후 counter에 값 저장하기
		//answer[0]값 확인
//		if(answer[0] == 1){
//			counter[0]++;
//		}else if(answer[0] == 2 ){
//			counter[1]++;
//		}else if(answer[0] == 3 ){
//			counter[2]++;
//		}else if(answer[0] == 4 ){
//			counter[3]++;
		
		//안쪽for문
//		for(int i = 0 ; i < counter.length ; i++)
//			if(answer[0] == i+1){
//				counter[i]++;
//			}
//		}
		
		//answer[9]값 확인
//		}else if(answer[9] == 3 ){
//			counter[2]++;
//		}else if(answer[9] == 4 ){
//			counter[3]++;
		
		//바깥for 시작0 끝9 증가1 반복 안쪽for문
		for(int j = 0 ; j < answer.length ; j++){
			for(int i = 0 ; i < counter.length ; i++){
				if(answer[j] == i+1){
					counter[i]++;
				}
			}
		}
		//운주언니 -- 이 방법은 답을 알고있는 경우에만 쓸 수 있고 hide문제처럼 범위를 모른다면 쓸 수 없다
//		for(int num = 0 ; num < answer.length ; num++){
//			counter[answer[num]-1]++;
//		}
		
		System.out.println(Arrays.toString(counter)); // [3, 3, 2, 2]

		
		//3단계: counter[i] 를 활용해 별의 개수 출력
		//별의 개수 == System.out.print("*")을 counter[i]만큼 반복하고 System.out.println();
//		System.out.print(0+1+" : "+counter[0]+"개 "); //바깥for
//		System.out.print('*');
//		System.out.print('*');
//		System.out.print('*'); //counter[0]번 만큼 반복 - 안쪽for
//		System.out.println();
//		System.out.print(1+1+" : "+counter[1]+"개 ");
//		System.out.print('*');
//		System.out.print('*');
//		System.out.print('*'); //counter[1]번 만큼 반복
//		System.out.println();
//		System.out.print(2+1+" : "+counter[2]+"개 ");
//		System.out.print('*');
//		System.out.print('*'); //counter[2]번 만큼 반복
//		System.out.println();
//		System.out.print(3+1+" : "+counter[3]+"개 ");
//		System.out.print('*');
//		System.out.print('*'); //counter[3]번 만큼 반복
//		System.out.println();  //					 바깥for
		
//		for(int j = 0 ; j < counter.length ; j++){
//			System.out.print(j+1+" : "+counter[j]+"개 ");
//			for(int i = 0 ; i < counter[j] ; i++){
//				System.out.print('*');
//			}
//			System.out.println();
//		}	
		
		for(int j = 0 ; j < counter.length ; j++){
			System.out.print(j+1+" : "+counter[j]+"개 ");
			for(int i = 0 ; i < counter[j] ; i++){
				System.out.print('*');
			}
			System.out.println();
		}	
		
		
		// hide : answer의 값의 범위를 측정하여 최대 5개의 통계 만들기 --??
		// -> 배열의 갯수를 모를때 => 해당배열중 최댓값을 찾아서 counter배열의 크기를 지정 (최솟값 필요없음)
		int[] answer2 = { 2, 7, 2, 8, 6, 5, 6, 6, 2 }; //1:3개 2:3개 5:1개 6:3개 7:1개 8:1개
	
		int answer2Max = answer2[0];
		for(int i = 0 ; i < answer2.length ; i++){
			if(answer2Max < answer2[i]){
				answer2Max = answer2[i];
			}
		}
		System.out.println(answer2Max);
		
		int[] counter2 = new int[answer2Max];
		
		//counter2방값 증가
		for(int j = 0 ; j < answer2.length ; j++){
			for(int i = 0 ; i < counter2.length ; i++){
				if(answer2[j] == i+1){
					counter2[i]++;
				}
			}
		}
		
		
		//별찍기
		for(int j = 0 ; j < counter2.length ; j++){
			System.out.print(j+1+" : "+counter2[j]+"개 ");
			for(int i = 0 ; i < counter2[j] ; i++){
				System.out.print('*');
			}
			System.out.println();
		}	
		
		//[5-8] 문제 5-5에 동전의 개수를 추가한 프로그램
		//		커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다.
		//		보유한 동전의 개수로 거스름돈을 지불할 수 없으면, '거스름돈이 부족합니다.'라고 출력하고 종료한다.
		//		지불할 돈이 충분히 있으면, 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다.
//		args? 파일명 우클릭 - Run As - Run Configuration - Arguments 에 들어있는 문자열 값
//		System.out.println(args[0]);
//		args[0]; // "3170"
//		int a = Integer.parseInt(args[0]); // "3170"이라는 문자열을 3170이라는 숫자로

		
		if(args.length!=1){
			System.out.println("한개의 숫자만 입력해 주세요.");
			System.exit(0);
		}
		// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		int money2 = Integer.parseInt(args[0]);
		System.out.println("money2="+money2);
		int[] coinUnit2 = { 500, 100, 50, 10 }; // 동전의 단위
		int[] coin2 = { 5, 5, 5, 5 };			// 단위별 동전의 개수
		
		for(int i = 0; i < coinUnit2.length ; i++){
			int coinNum = 0;
			/*
				아래의 로직에 맞게 코드를 작성하시오
				1. 금액(money2)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
				2. 배열 coin2에서 coinNum만큼의 동전을 뺀다.
					(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
				3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
			*/
			coinNum = money2 / coinUnit2[i]; 						//로직1
			
			//처음생각한 풀이, 근데 다시보니까 너무 중복이 많아
//			if(coin2[i]>=coinNum){
//				money2 -= (coinNum*coinUnit2[i]);
//				coin2[i] -= coinNum;
//			}else{
//				money2 -= (coin2[i]*coinUnit2[i]);
//				coinNum = coin2[i];
//				coin2[i] -= coin2[i];
//			}
			//if와 else사이에 공통되는 거는 어짜피 진행되니까 밖으로 빼도됨
			//조건을 안되는거 경우인 if(coinNum > coin2[i])로 해서 만들어보기
			
			//다시푼방법
			if(coinNum > coin2[i]){									//로직2 만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다
				coinNum = coin2[i];									// --> 있는 만큼 빼기 위해 같은 값으로 만들어 준것
			}
			coin2[i] -= coinNum;									//배열 coin2에서 coinNum만큼의 동전을 뺀다.
			money2 -= (coinNum * coinUnit2[i]);						//로직3. money2 -= (coinNUm * coinUnit2[i]);
			
			System.out.println(coinUnit2[i]+"원: "+coinNum);
		}
	

		
		if(money2 > 0){
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); //프로그램을 종료한다.	
		}
		
		System.out.println("=남은 동전의 개수 =");
		for(int i=0 ; i < coinUnit2.length ; i++){
			System.out.println(coinUnit2[i]+"원:"+coin2[i]);
		}
		
		
		//[5-9] 주어진 배열을 시계방향으로 90도 회전 시켜서 출력하는 프로그램을 완성하시오.
		
		char[][] star = {
							{'*','*',' ',' ',' '},
							{'*','*',' ',' ',' '},
							{'*','*','*','*','*'},
							{'*','*','*','*','*'},
						};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i = 0 ; i < star.length; i++){
			for(int j = 0; j < star[i].length ; j++){
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0 ; i < star.length ; i++){
			for(int j=0 ; j < star[i].length ; j++){
				result[j][i] = star[3-i][j];
			}
		}
		
		for(int i=0; i < result.length ; i++){
			for(int j=0; j <result[i].length; j++){
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
		
		
	} //main
}
