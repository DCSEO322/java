package h_javaLang;

import java.io.Serializable;

public class EqualsTest02 {
	public static void main(String[] args) {
		Person reg1 = new Person(950322L);
		Person reg2 = new Person(950322L);
		
		System.out.println(reg1 == reg2);	// false
		System.out.println(reg1.equals(reg2));	// true
	
		System.out.println(reg1.toString());
		System.out.println(reg1.hashCode());
		
//		String a = null;
//		System.out.println(a.equals("")); - 비교할 앞의 값이 null이면 프로그램 오류가 발생, 따라서 비교할 앞에 값은 무조건 값이 존재해야 한다.
		
		
	}
}

class Person implements Serializable{
	long regNo;
	
	Person(long regNo){
		this.regNo = regNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Person && obj != null){
			// 매개변수의 값이 캐스팅이 가능한지, obj의 값이 null인지 확인할 필요가 있다
			result = this.regNo == ((Person)obj).regNo;
		}
		return result;
	}

	
	
	
}