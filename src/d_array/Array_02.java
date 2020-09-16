package d_array;

import java.util.Arrays;

public class Array_02 {
	public static void main(String[] args) {
		/*
		1. 정렬(sort)
		  - 어떤 데이터를 빠르고 쉽게 찾을 목적으로 일정한 순서대로 데이터를 가지런히 나열하는 작업.
		  - 버블정렬, 선택정렬, 삽입정렬  (기사시험단골: 버블, 선택)
		  
		2. 버블정렬(bubble sort)
		  - 인접한 데이터 간에 교환이 계속해서 일어난다.
		  - 한 회전이 끝나면 가장 큰값이 뒤쪽에 확정된다.
		  - 회전수 = 인덱스값 - 1
		  - 회전 도중 정렬이 완성되어도 컴퓨터는 모르기때문에 계속 끝까지 회전한다.
		
		3. 선택정렬(select sort)
		  - 한 회전이 끝나면 가장 작은 값이 앞쪽에 확정된다.
		  - 회전수 = 인덱스값 - 1
		*/
		
		/*
		5 2 3 1 4
		
		-- 1회전 (기준 0번 인덱스)
		1. 기준방에서부터 시작해 최솟값을 가지고 있는 인덱스를 찾는다. (3번 인덱스)
		2. 기준 index와 최솟값이 있는 index의 값을 바꿔준다. (3번 <-> 0번)
		1 2 3 5 4
		
		-- 2회전 (기준 1번 인덱스 -> 1제외하고 2 3 5 4)
		1. 기준방에서부터 시작해 최솟값을 가지고 있는 인덱스를 찾는다. (1번 인덱스)
		2. 기준 index와 최솟값이 있는 index의 값을 바꿔준다.
		1 2 3 5 4
		
		-- 3회전 (기준 2번 인덱스 -> 1 2제외하고  3 5 4)
		1. 기준방에서부터 시작해 최솟값을 가지고 있는 인덱스를 찾는다. (2번 인덱스)
		2. 기준 index와 최솟값이 있는 index의 값을 바꿔준다. 
		1 2 3 5 4
		
		-- 4회전 (기준 3번 인덱스 -> 1 2 3제외하고 5 4)
		1. 기준방에서부터 시작해 최솟값을 가지고 있는 인덱스를 찾는다. (4번 인덱스)
		2. 기준 index와 최솟값이 있는 index의 값을 바꿔준다. 
		1 2 3 4 5
		*/
		
		// 1회전 (기준 0번 인덱스)
//		int[] select = new int[]{5,2,3,1,4};
//		int min = select[0];
//		int minBang = 0; 			//난 사이클횟수인줄알고 int cycle=1 해서 for문안에 cycle++했었음
//
//		
//		for(int i = 0+1; i < select.length ; i++){
//			if(min > select[i]){
//				min = select[i];
//				minBang = i;
//			}
//		}
//		
//		int temp = select[0]; // temp = 5
//		select[0] = select[minBang];	 // select[0] = 1 , temp =5
//		select[minBang] = temp; //min = temp; (X) -> select[3] = temp;
//							  //->min이 select[3]인지 어떻게 알지? 
//							  //-> for문 사이클이 언제 멈췄는지? 
//		System.out.println(Arrays.toString(select)); // 1 2 3 5 4 
		
		// 2회전 (기준 1번 인덱스) // 시작 : 1 2 3 5 4
		/*
		int min = select[1];
		int minBang = 1;
		
		for(int i = 1+1; i < select.length ; i++){
			if(min > select[i]){
				min = select[i];
				minBang = i;
			}
		}
		
		int temp = select[1];
		select[1] = select[minBang];
		select[minBang] = temp;
		
		System.out.println(Arrays.toString(select)); // 1 2 3 5 4 
		*/
		
		// 3회전 (기준 2번 인덱스) // 시작 : 1 2 3 5 4
		/*
		int min = select[2];
		int minBang = 2;
		
		for(int i = 2+1; i < select.length ; i++){
			if(min > select[i]){
				min = select[i];
				minBang = i;
			}
		}
		
		int temp = select[2];
		select[2] = select[minBang];
		select[minBang] = temp;
		
		System.out.println(Arrays.toString(select)); // 1 2 3 5 4 
		*/
		
		// 4회전 (기준 3번 인덱스) // 시작 : 1 2 3 5 4
		/*
		int min = select[3];
		int minBang = 3;
		
		for(int i = 3+1; i < select.length ; i++){
			if(min > select[i]){
				min = select[i];
				minBang = i;
			}
		}
		
		int temp = select[3];
		select[3] = select[minBang];
		select[minBang] = temp;
		
		System.out.println(Arrays.toString(select)); // 1 2 3 4 5 
		*/
		
		//바깥for(회전) 시작0, 끝3, 증감+1, 반복문 int min~출력문까지
		int[] select = new int[]{5,2,3,1,4};
		for(int i = 0; i < select.length -1;i++){
			System.out.println(i+1+"회전");
			int min = select[i];
			int minBang = i;
			
			for(int j = i+1; j < select.length ; j++){
				if(min > select[j]){
					min = select[j];
					minBang = j;
				}
			}
			
			int temp = select[i];
			select[i] = select[minBang];
			select[minBang] = temp;
			
			System.out.println(Arrays.toString(select));
		}
		
		
		
	}
	
}
