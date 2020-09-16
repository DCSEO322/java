package e_OOP;

public class Ex3_8 {
	public static void main(String[] args) {
		
		ExTest01 et01 = new ExTest01(); //생성자는 new할때만 부를 수 있음
		
		ExTest02 et02 = new ExTest02(3);		
		
		
	}
}


class ExTest01{
	int value;
	
//	ExTest01(){	//저장하면 컴파일러가 자동으로 '기본생성자' 만들어줌
//	
//	}
}

class ExTest02{
	int value;
	ExTest02(int value){	//매개변수가 있는 생성자
		this.value = value;
	}
}