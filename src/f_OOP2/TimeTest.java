package f_OOP2;

public class TimeTest {
	public static void main(String[] args) {
		TimeVO t = new TimeVO();
	
		//사용자가 10시간을 입력 0~23
		t.setHour(25);
		
		//시간을 돌려주쇼
		int hour = t.getHour();
		System.out.println(hour+"시");
		
		//숙제
		//타임객체1
		//시간 40시간 -> 16시
		//분	 200분  -> 19:20
		//초  10000초-> 22:6:40
		TimeVO t1 = new TimeVO();
		t1.setHour(40);
		t1.setMinute(200);
		t1.setSecond(10000);
		
		int t1Hour = t1.getHour();
		int t1Min = t1.getMinute();
		int t1Sec = t1.getSecond();
		System.out.println("현재시간 : "+t1Hour+"시 "+t1Min+"분 "+t1Sec+"초");
		
		//타임객체2
		//시간 22시간 -> 22시
		//분	 100분  -> 23:40
		//초  10000초-> 26:26:40 (10000초 2시간 46분 40초)
		//			  2:26:40
		
		TimeVO t2 = new TimeVO();

		t2.setHour(22);

		t2.setMinute(100);

		t2.setSecond(10000);
		int t2Hour = t2.getHour();
		int t2Min = t2.getMinute();
		int t2Sec = t2.getSecond();

		System.out.println("현재시간 : "+t2Hour+"시 "+t2Min+"분 "+t2Sec+"초");

		
		//초 10000초-> 2:46:40
		//분 100분    -> 4:26:40
		//시 22시 	  -> 26:26:40
		//            2:26:40
		
		
		//시간 23
		//분 200분 3시간 20분 -> 26시20분 ->2시20분

		
		
	}
}
/***
 * 
 * 시간 관리 클래스
 * @author ryun
 * @since 20.08.27
 *
 */
class TimeVO{
	private int hour; 	//시
	private int minute; //분
	private int second; //초
	
	//문제흐름
	//1. hour입력 -> 저장
	//2. min입력 -> min저장 & hour 증가
	//3. sec입력 -> sec저장 & min, hour증가

	//1. 시간 셋팅
	//if문
//	void setHour(int hour){ 
//		if(hour > 23){
//			this.hour = hour%24; //나머지
//		}else{
//			this.hour = hour;
//		}
//	}
	
	//삼항
	void setHour(int hour){
		this.hour = (hour > 23) ? hour%24 : hour;
	}
	
	//1-1.시간 반환
	int getHour(){
		return hour;
	}
	
	//2-1. 분 셋팅. 0~59분. 
	//	      단, 분이 60분 넘는다면 1시간을 의미하므로 시간이 추가되도록 하여라. 예) 100분 -> 1시간40분
	//문제풀기전 생각
	//60분 = 1시간
	//minute > 59 이면
	//60으로 나눈 몫은 시간 으로 보내주고 나머지는 분으로 남게?
	//아니면
	//그냥 그대로 저장, 인데 초로 넘어와서 바뀔수도있으니까 hour 값을 바꿔주는 식을 같이 써줘야되나?
	
	//if문
//	void setMinute(int minute){
//		if(minute > 59){
//			this.minute = minute%60;
//			setHour(hour += minute/60);
//		}else{
//			this.minute = minute;
//		}
//	}
	
	//삼항 
	void setMinute(int minute){
		this.minute = minute > 59 ? minute%60 : this.minute + minute;
		setHour(hour = minute > 59 ? hour + minute/60 : hour);
	}

	

	
	//2-2. 분 반환
	int getMinute(){
		return minute;
	}
	
	//3-1. 초 셋팅. 0~59초.
	//	      단, 초가 60초 넘는다면 1분을 의미하므로 분이 추가되도록 하여라. 예) 10000초 -> 2시간 46분 40초
	//문제풀기전 생각
	//60초 = 1분
	//3600초 = 1시간
	// if 구간을 두번설정?? -> 시간으로 넘어갈때, 분으로 넘어갈때? 근데 분으로 넘어가면 분에서 set(Hour)호출되니까 자동으로 되니까 구간설정안해도됨
	
//	void setSecond(int second){
//		if(second > 59){
//			this.second = second%60;
//			setMinute(minute += second/60);
//		}else{
//			this.second = second; //this.second = second%60이랑 같기때문에 if밖으로 뺄 수 있다
//		}
//	}
	
	//삼항
	void setSecond(int second){
		this.second = second > 59 ? second%60 : second;
		setMinute(minute = second > 59 ? minute + second/60 : minute);
	}
	
	
	
//	void setSecond(int second){
//		this.second += second;
//		if(this.second > 59){
//			this.second = this.second%60;
//			minute += this.second/60;
////			setMinute(minute);
//		}
//	}
	
	
	
	//3-2. 초 반환
	int getSecond(){
		return second;
	}
	
	
	
	//최종버전 hour1줄 minute,second2줄인데 신경쓰지말고 하쇼...
	
	
	
}