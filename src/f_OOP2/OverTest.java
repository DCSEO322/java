package f_OOP2;
//
public class OverTest {
	public static void main(String[] args) {
		
		OverGo og = new OverGo();
		String result = og.overMethod();
		System.out.println(result);
		
		System.out.println(og.value);
		
		//오버업의 객체를 만들지 않고 OverUp 클래스의 메소드를 호출할수있는방법
		int result2 = og.getOverUpValue();
		System.out.println(result2);
		
		
	}//main()
}//class OverTest

class OverUp{
	int value=10;
	
	String overMethod(){
		return "OverUp Method";
	}
}

class OverGo extends OverUp{
	int value = 20;
	
	@Override //다른 사람에게 상속받아 오버라이드한 메서드라고 알려줄 수 있음
	String overMethod(){
		return "OverGo Method";
	}
	
	//오버라이드한 것을 오버로딩.. 
	String overMethod(int k){
		return k+"OverGo Method";
	}
	
	int getOverUpValue(){
		return super.value; //super. -> 부모에 있는 인스턴스멤버(변수,메서드)에 접근하기위해. (*this. -> 인스턴스변수만 접근가능)
	}
	
	
	
}
