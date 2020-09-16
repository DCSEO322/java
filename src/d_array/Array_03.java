package d_array;

import java.util.Arrays;

public class Array_03 {
	public static void main(String[] args) {
		/*
		1. 다차원배열
		  - 자바에서는 1차원 배열뿐만 아니라 다차원 배열도 허용한다.
		
		2. 이차원배열의 선언
		  - 변수타입[][] 변수명;  int[][] arr;
		  - 변수타입 변수명[][];
		  - 변수타입[] 변수명[];
		  
		3. 이차원배열의 생성
		  - 변수명 = new 변수타입[크기1][크기2];
		
		4. 이차원배열의 선언 및 생성
		  - 변수타입[][] 변수명 = new 타입[크기][크기];
		
		5. 이차원배열의 초기화
		  - 변수타입[][] 변수명 = new 타입[][]{ {값, 값..} , {값, 값..}}
		  - 
		*/
		
		int[][] arr = new int[2][3];
//		{
//			{0,0,0},
//			{0,0,0}
//		}
		
		// arr.length : 2
		System.out.println("arr.length : "+arr.length);
		System.out.println("arr[0].length : "+arr[0].length);
		System.out.println("arr[1].length : "+arr[1].length);
		System.out.println();
		
		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
		//바깥for: 시작0 끝1 증감+1 반복 arr[row][column] 중에 row
		//안쪽for: 시작0 끝2 증감+1 반복 arr[row][column] 중에 column
		
		for(int row = 0; row < arr.length; row++){
			for(int column = 0; column < arr[row].length; column++){
				System.out.println(arr[row][column]);
			}
		}
		
		System.out.println();

		
		int[][] arr2 = {
						{10,20,30},
						{40,50,60}
					   };
		
		for(int row = 0; row < arr2.length; row++){
			for(int column = 0; column < arr2[row].length; column++){
				System.out.println(arr2[row][column]);
			}
		}
		
		System.out.println(arr2[0]); //주소
		System.out.println();
		
		
		int[][] arr3 = new int[3][];
		System.out.println(arr3[0]); //주소, 아직 작은배열 생성전이라 null
		System.out.println();
//		{
//			null,
//			null,
//			null
//		}
		
		arr3[0] = new int[2];
//		{
//			{0,0},
//			null,
//			null
//		}
		
		arr3[1] = new int[3];
//		{
//			{0,0},
//			{0,0,0},
//			null
//		}
		
		arr3[2] = new int[4];
//		{
//			{0,0},
//			{0,0,0},
//			{0,0,0,0}
//		}
		
		/*
		arr3[0] = new int[2];
		arr3[1] = new int[3];
		arr3[2] = new int[4];
		*/
		
		//3. 변수 names를 선언하고 주변친구 6명의 이름으로 초기화 하여라.
		String[] names = {"근호","지현","운주","임건","대철","문정"};
		
		//4. 변수 subjects를 선언하고 과목 7개의 이름으로 초기화 하여라.
		String[] subjects = {"국어","영어","수학","사회","과학","오라클","자바"};
		
		//1. 6명의 7과목을 저장할 수 있는 배열 score를 선언 및 생성해 주세요
//		int[][] score = new int[6][7];
		
		//bonus. 3,4번 이용해서 1번을 숫자 대신 쓸 수 있는 걸로 교체, 과목이 바뀌어도 쓸 수 있는 것
		int[][] score = new int[names.length][subjects.length];  
		
		//2. score 각방을 0~100점 사이의 임의의 정수의 값을 저장하여라.
//		score[0][0] = (int)(Math.random()*101);
//		score[0][1] = (int)(Math.random()*101);
//		score[0][2] = (int)(Math.random()*101);
//		score[0][3] = (int)(Math.random()*101);
//		score[0][4] = (int)(Math.random()*101);
//		score[0][5] = (int)(Math.random()*101);
//		score[0][6] = (int)(Math.random()*101);
		//바깥for(row) 시작0 끝5 안쪽for
		//안쪽for(column) 시작0 끝6 score[row][column] = (int)(Math.random()*101);
		
		for(int row = 0 ; row < score.length ; row++){
			for(int column = 0; column < score[row].length ; column++){
				score[row][column] = (int)(Math.random()*101);
			}
		}
		
		
		//5. 사람별 합계 사람수만큼 자바옆에 나오게
		int[] sumNames = new int[names.length];

		//사람0(근호)의 합계 sum[0]
		//sumNames[0] += score[0][0]
		//sumNames[0] += score[0][1]
		//...
		//sumNames[0] += score[0][6]
		
		//사람1(지현)의 합계 sum[1]
		//sumNames[1] += score[1][0]
		//sumNames[1] += score[2][1]
		//...
		//sumNames[1] += score[6][6]
		
		//사람5(문정)의 합계 sum[5]
		//sumNames[5] += score[1][0]
		//sumNames[5] += score[2][1]
		//...
		//sumNames[5] += score[5][6]
		//바깥for 시작0,끝5,증가1, 반복 안쪽for
		//안쪽for 시작0,끝6,증가1, 반복 sum[names.length] += score[names.length][subjects.length]
		
		for(int row = 0 ; row < names.length ; row++){
			for(int column = 0 ; column < subjects.length; column++){
				sumNames[row] += score[row][column];
			}
		}
		
		
		//6. 사람별 평균 소수점두번째자리까지구하기 : 평균 = 합계/과목수
		float[] avgNames = new float[names.length];
		//사람0(근호)의 평균 avgNames[0]
		//avgNames[0] = (int)(((float)sum[0]/subjects.length)*100+0.5)/100f
		//...
		//사람5(문정)의 평균 avgNames[5]
		//avgNames[5] = (int)(((float)sum[5]/subjects.length)*100+0.5)/100f
		
		//시작0 끝5 증감+1 반복 avg[row] = (int)(((float)sum[row]/subjects.length)*100+0.5)/100f
		for(int row = 0; row < names.length ; row++){
			avgNames[row] = (int)(((float)sumNames[row]/subjects.length)*100+0.5)/100f;
		}
		
		//7. 과목별 합계 
		int[] sumSubjects = new int[subjects.length];
		//국어합계 sumSubjects[0]
		//sumSubjects[0] += score[0][0]
		//sumSubjects[0] += score[1][0]
		//...
		//sumSubjects[0] += score[5][0]
		
		//자바합계 sumSubjects[6]
		//sumSubjects[6] += score[0][6]
		//sumSubjects[6] += score[1][6]
		//..
		//sumSubjects[6] += score[5][6]
		//바깥for(column) 시작0,끝6,증감+1,반복 안쪽for
		//안쪽for(row)	 시작0,끝5,증감+1,반복 sumSubjects[column] += score[row][column]
		
		for(int column = 0; column < subjects.length; column++){
			for(int row = 0; row < names.length; row++){
				sumSubjects[column] += score[row][column];
			}
		}
		
		//8. 과목별 평균(소수점 둘째자리까지만 나타나게) = 과목별합계 / 사람수
		float[] avgSubjects = new float[subjects.length];
		//국어평균
		//avgSubjects[0] = ((int)(((float)sumSubjects[0]/names.length)*100+0.5))/100f;
		//...
		//자바평균
		//avgSubjects[6] = ((int)(((float)sumSubjects[6]/names.length)*100+0.5))/100f;
		
		//시작0 끝6 증감+1 반복 avgSubjects[column] = ((int)(((float)sumSubjects[column]/names.length)*100+0.5))/100f;
		for(int column = 0 ; column < subjects.length; column++){
			avgSubjects[column] = ((int)(((float)sumSubjects[column]/names.length)*100+0.5))/100f;
		}
		
		//9. 사람별 석차, 합계기준 평균옆에 (정렬 사용x), 같은 석차가 나올수도있음
		int[] rank = new int[names.length]; //{0,0,0,0,0,0}

		//1단계 rank[0] 근호석차만 비교하자
//		rank[0] = 1; //근호 혼자 있었을 때는 1등
//		if( sumNames[0] < sumNames[1] ){
//			rank[0]++;
//		}else if( sumNames[0] < sumNames[2] ){
//			rank[0]++;
//		}else if( sumNames[0] < sumNames[3] ){
//			rank[0]++;
//		}else if( sumNames[0] < sumNames[4] ){
//			rank[0]++;
//		}else if( sumNames[0] < sumNames[5] ){
//			rank[0]++;
//		}
		//위를 거쳐 rank[0]이 확정됨
		//시작0, 끝5, +1, if문
//		for(int i = 1; i < names.length ; i++){
//			if ( sumNames[0] < sumNames[i] ){
//				rank[0]++;
//			}
//		}

		//2단계 rank[1] 지현석차만 비교
//		rank[1] = 1; //지현 혼자 있었을 때는 1등
//		if( sumNames[1] < sumNames[0] ){
//			rank[1]++;
//		}else if( sumNames[1] < sumNames[2] ){
//			rank[1]++;
//		}else if( sumNames[1] < sumNames[3] ){
//			rank[1]++;
//		}else if( sumNames[1] < sumNames[4] ){
//			rank[1]++;
//		}else if( sumNames[1] < sumNames[5] ){
//			rank[1]++;
//		}
		
		for(int i = 0; i < names.length ; i++){
			rank[i] = 1;								//i가 1일때에도 j가 0~names.length-1 돌게해야된다.
			for(int j = 0; j < names.length ; j++){
				if(sumNames[i] < sumNames[j]){
					rank[i]++;
				}
			}
		}
	
//		System.out.println(Arrays.toString(rank));

		
		
		
		//0. 아래와 같이 출력해 주세요
//		System.out.print(score[0][0]+"\t");
//		System.out.print(score[0][1]+"\t");
//		System.out.print(score[0][2]+"\t");
//		System.out.print(score[0][3]+"\t");
//		System.out.print(score[0][4]+"\t");
//		System.out.print(score[0][5]+"\t");
//		System.out.println(score[0][6]+"\t");
		//바깥for(row) 시작0 끝5 반복 안쪽for
		//안쪽for(column) 시작0 끝6 반복 System.out.print(score[0][0]+"\t");
		
		// 국 영 수 사 과 오 자
//		System.out.print("\t"+subjects[0]);
//		System.out.print("\t"+subjects[1]);
//		System.out.print("\t"+subjects[2]);
//		System.out.print("\t"+subjects[3]);
//		System.out.print("\t"+subjects[4]);
//		System.out.print("\t"+subjects[5]);
//		System.out.print("\t"+subjects[6]);
//		System.out.println();
		//시작0,끝6,증감+1,출력문 반복, 조건?? row가 0되기전이니까
		
		
		for(int subTitle = 0; subTitle < subjects.length; subTitle++){
			System.out.print("\t"+subjects[subTitle]);
		}
		System.out.print("\t"+"합계");
		System.out.print("\t"+"평균");
		System.out.println("\t"+"석차");
		for(int row = 0 ; row < score.length ; row++){
			System.out.print(names[row]+":"+"\t");
			for(int column = 0 ; column < score[row].length ; column++){
				System.out.print(score[row][column]+"\t");
			}
			System.out.print(sumNames[row]+"\t");
			System.out.print(avgNames[row]+"\t");
			System.out.print(rank[row]);
			System.out.println();
		}
		
		System.out.print("과목별 합계:");
		
		for(int column = 0; column < subjects.length; column++){
			System.out.print(sumSubjects[column]+"\t");
		}
		System.out.println();
		
		System.out.print("과목별 평균:");
		for(int column = 0; column < subjects.length; column++){
			System.out.print(avgSubjects[column]+"\t");
		}
		System.out.println();
		
		
		
		//10. 합계 기준 성적순으로 sort하여라. (이름,합계,평균,석차) -> (가능하면 과목별도)

		//정렬
		//1단계. 합계 기준 선택정렬 - 랭크이용 
		//int rank[] = {4,5,3,2,1,6}
		//1회전 기준 0 번 
//		int min = rank[0];
//		int minBang = 0;
//		
//		for(int i = 0+1; i < rank.length ; i++){
//			if( min > rank[i]){
//				min = rank[i];
//				minBang = i;
//			}
//		}
//		
//		int temp = rank[0];
//		rank[0] = rank[minBang];
//		rank[minBang] = temp;
		//5회전 기준 4번 
		//바깥for : 시작0, 끝4,증감+1, 반복 int min~temp;
		int[][] temp5 = new int[names.length][subjects.length]; //점수바꾸려고생성
		for(int j = 0; j < rank.length -1; j++){ //선택정렬5회전치
			int min = rank[j];
			int minBang = j;
			
			for(int i = j+1; i < rank.length ; i++){ //선택정렬 1회전당 수행하는 작업
				if( min > rank[i] ){
					min = rank[i];
					minBang = i;
				}
			}
			
			//석차정렬
			int temp  = rank[j];		
			rank[j] = rank[minBang];
			rank[minBang] = temp;
			//이름정렬
			String temp2 = names[j];
			names[j] = names[minBang];
			names[minBang] = temp2;
			//합계정렬
			int temp3 = sumNames[j];
			sumNames[j] = sumNames[minBang];
			sumNames[minBang] = temp3;
			//평균정렬
			float temp4 = avgNames[j];
			avgNames[j] = avgNames[minBang];
			avgNames[minBang] = temp4;

			//과목별: 1.밖에 int[][] temp5 선언하고 쓰는 경우
			temp5[0] = score[j]; //바깥에 생성 
			score[j] = score[minBang];
			score[minBang] = temp5[0];

//			//과목별: 2.for문 밖에 int[][] temp5 선언하지 않고 하는 경우
//			for(int k = 0 ; k < subjects.length ; k++){
//				int temp6 = score[j][k];
//				score[j][k] = score[minBang][k];
//				score[minBang][k] = temp5[j][k];
//			}
			
		}
		System.out.println(Arrays.toString(rank));
		
		//2단계. 구한 방값으로 names[i], sumNames[i], avgNames[i], rank[i]
		//3단계. 과목 옮기려면 score[row][]가 i 따라서 가야
		
		
		//정렬 후 성적표 
		System.out.println();
		System.out.println("------------------------------------AFTER SORTING------------------------------------");
		for(int subTitle = 0; subTitle < subjects.length; subTitle++){
			System.out.print("\t"+subjects[subTitle]);
		}
		System.out.print("\t"+"합계");
		System.out.print("\t"+"평균");
		System.out.println("\t"+"석차");
		for(int row = 0 ; row < score.length ; row++){
			System.out.print(names[row]+":"+"\t");
			for(int column = 0 ; column < score[row].length ; column++){
				System.out.print(score[row][column]+"\t");
			}
			System.out.print(sumNames[row]+"\t");
			System.out.print(avgNames[row]+"\t");
			System.out.print(rank[row]);
			System.out.println();
		}
		
		System.out.print("과목별 합계:");
		
		for(int column = 0; column < subjects.length; column++){
			System.out.print(sumSubjects[column]+"\t");
		}
		System.out.println();
		
		System.out.print("과목별 평균:");
		for(int column = 0; column < subjects.length; column++){
			System.out.print(avgSubjects[column]+"\t");
		}		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
