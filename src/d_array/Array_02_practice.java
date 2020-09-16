package d_array;

import java.util.Arrays;

public class Array_02_practice {
	public static void main(String[] args) {
		
		//아이디어:한줄출력 -> 한회전출력 -> 전체출력 
		//1. 배열 선언, 생성, 초기화
		int[] bb = new int[]{5,2,3,1,4};
		
		//2. 한줄출력 
		//if	: bb[0] > bb[1]		-> bb[1]에 있던 값이 bb[0]과 변경 
		//else	: bb[0] =< bb[1]	-> 아무일도 없음
//		if( bb[0] > bb[1]){
//			int temp = bb[0]; //bb[0]을 임시 저장할 변수 temp 생성
//			bb[0] = bb[1];
//			bb[1] = temp;
//			System.out.println(Arrays.toString(bb));
//		}else{
//			System.out.println(Arrays.toString(bb));
//		}
		//이 한줄 출력이 반복되면 한 회전이 됨
		//시작1, 끝4, 증가량1

		//3. 한회전출력 (한줄출력 반복)
//		for(int num = 0 ; num<bb.length -1; num++){ 
//			if(bb[num] > bb[num+1]){  
//				int temp = bb[num];
//				bb[num] = bb[num+1];
//				bb[num+1] = temp;
//				System.out.println(Arrays.toString(bb));
//			}else{
//				System.out.println(Arrays.toString(bb));
//			}
//		}
		
		//이 한회전 출력이 반복되면 전체출력이 됨 
		//시작 0, 끝4, 증가량1
		
		//4. 전체출력 (한회전출력 반복)
//		for(int cycle = 0; cycle < bb.length -1; cycle++){
//			System.out.println(cycle+1 +"회전");
//			for(int num = 0; num < bb.length -1; num++){
//				if( bb[num] > bb[num+1] ){
//					int temp = bb[num];
//					bb[num] = bb[num+1];
//					bb[num+1] = temp;
//				}
//				System.out.println(Arrays.toString(bb));
//				
//			}
//		}
//		

		//5. 전체출력 (한회전출력 반복) - Arrays.toString(bb)쓰지말고 3중 for문으로
//		for(int cycle = 0; cycle < bb.length -1; cycle++){
//			System.out.println(cycle+1 +"회전");
//			for(int num = 0; num < bb.length -1; num++){
//				if( bb[num] > bb[num+1] ){
//					int temp = bb[num];
//					bb[num] = bb[num+1];
//					bb[num+1] = temp;
//				}
//				for(int i = 0; i < bb.length ; i++){
//					System.out.print(bb[i]+" ");
//				}
//				System.out.println();
//			}
//		}
				
		
		
		
		
		
		
		//확정개념 추가
		for(int cycle = 0; cycle < bb.length -1; cycle++){
			System.out.println(cycle+1 +"회전");
			for(int num = 0; num < bb.length -1 -cycle; num++){	//-cycle : 불필요한 회전수 줄이기 (확정개념)
				if( bb[num] > bb[num+1] ){
					int temp = bb[num];
					bb[num] = bb[num+1];
					bb[num+1] = temp;
				}
				System.out.println(Arrays.toString(bb));
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
	}
}
