package e_OOP;

public class DiceTest {
	public static void main(String[] args) {
		//인스턴스 메서드
		// 1. 인스턴스화
		DoubleDice monopoly = new DoubleDice();
		// 2. 참조변수명.인스턴스메서드();
		int steps = monopoly.throwDice();
		System.out.println(steps+"칸 이동하세요!");
		
	}
}



class DoubleDice{
	
	// 인스턴스 메서드명 throwDice
	//	1. 주사위 두개를 던진다.
	//	- int x,y / 랜덤
	//
	//	2. 던진 주사위 합을 반환한다.
	//		- result=0 
	//		- if 주사위1 != 주사위2 -> 주사위1+주사위2을 반환
	//	3. 단, 주사위의 눈이 같은게 나왔을 때는 한번 더 던진다. (재귀호출이용)
	//		- else(주사위1==주사위2) -> throwDice() 재귀호출
	//
	//	랜덤값을 어떻게 확인할 수 있을까? x!=y면 한번만에 출력할수있는데 x==y면 여러번 출력을해야하잖아
	
	//원래했던거
//	int throwDice(){
//		int result = 0;
//		int d1 = (int)(Math.random()*6+1);
//		int d2 = (int)(Math.random()*6+1);
//		
//		System.out.println("("+d1+","+d2+")");
//		
//		if(d1 != d2){
//			result = d1 + d2; //if문,else문 반복이니까 위에 빼서 먼저 한다
//		}else{
//			result = (d1 + d2) + throwDice();
//		}
//		return result;
//	}
	
	//중복제거
	int throwDice(){
		int firstDice = (int)(Math.random()*6+1);
		int secondDice = (int)(Math.random()*6+1);
		int result = firstDice + secondDice;
		System.out.println("("+firstDice+","+secondDice+")");
		
		if(firstDice == secondDice){
			result += throwDice();
		}
		
		return result;
	}
}