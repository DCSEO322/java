package f_OOP2;

import java.util.Vector;

public class ProductTest {
	public static void main(String[] args) {
		NoteBook nb = new NoteBook("Mac", 300);
		Styler st = new Styler("LG Styler", 200);
		Fridge fr = new Fridge("Bespoke", 500);
		
		Buyer b = new Buyer("human", 5000);
		b.buy(nb);
		b.buy(fr);
		b.buy(st);
		
		b.summary();
		System.out.println();
		
		b.refund(fr);
		b.summary();
		System.out.println();

		b.refund(nb);
		b.summary();
		System.out.println();
		
		b.refund(st);
		b.summary();
		System.out.println();

		b.refund(nb);
		
		
	}
}

class Product{
	String name;	//제품이름
	int price;  	//가격
	int point;		//보너스포인트

	
	Product(String name, int price){
		this.name = name;
		this.price = price;
		point = price/10;
	}
}

class NoteBook extends Product{
	public NoteBook(String name, int price){
		super(name,price); //이렇게하면 기본생성자 안만들어줘도됨
	}

	@Override
	public String toString() {
		return "노트북";
	}
}

class Styler extends Product{
	public Styler(String name, int price){
		super(name,price);
	}

	@Override
	public String toString() {
		return "스타일러";
	}
}

class Fridge extends Product{
	public Fridge(String name, int price){
		super(name,price);
	}

	@Override
	public String toString() {
		return "냉장고";
	}
}

class Buyer{
	String name;
	int money;
	int mileage;
	
	Vector item = new Vector(); //Vector:기본 10개, Object 타입으로 저장 -> 꺼낼때 down-casting 필요
	
	public Buyer(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	void buy(Product pd){ //매개변수의 다형성 이용. 이렇게 안만들면 buy(NoteBook nb), buy(Styler nb) 하나하나 같은내용으로 다만들어야함
		if(money < pd.price){				//(Product) nb 업캐스팅이 생략되서 변수가 입력되는 것
			System.out.println("돈가져와");
			return; //중간에 종료하고 나갈 때
		}
		
		money -= pd.price;
		mileage += pd.point;
		
		item.add(pd);
		
		System.out.println(name+"님 "+pd+"를 구매해주셔서 감사합니다.");

	}

	//1. summary 메서드
	void summary(){//성적관리 참고
	/*
			영	수	증
	
	   구매목록					--제품명도 있어야하는 거 아닌가? 제품종류, 가격 잘 되면 Vector brand 만들어서 해보자
	   	NoteBook  300만원
	   	Styler	  200만원
	   	총합		  500만원
	   	
	  xxx고객님의 남은 돈은 xxx만원 이고 마일리지는 xxx입니다
	  ^ㅡ^~~오늘도 좋은하루 보내세요~~^ㅡ^ 
	*/
		
	/*
	제품종류, 제품가격 //제품종류: Object get(int index) 지정된 위치 객체 반환, Object에서 instanceof 확인해서 형변환해서 돌려줘야함
	제품종류, 제품가격//제품가격: 마찬가지
	:
	제품종류, 제품가격 // 행의 수는 제품갯수만큼, 벡터 int size()의 갯수를 알 수 있음 
	총합은 제품가격들의 총합 // for문으로 벡터갯수만큼 돌려서 cost벡터 각방에 있는 애들을 합한다?
	
	*/		
		System.out.println("\t영\t수\t증");
		System.out.println("구매목록");
		
		int sum = 0;
		for(int i = 0; i < item.size(); i++){
			if(item.get(i) instanceof Product){
				Product sp = (Product)item.get(i);
				System.out.println("\t" + sp + "\t" + sp.price + "만원");
				sum += sp.price;
			}
		}
		System.out.println("\t총   합 \t" + sum + "만원");
		
		System.out.println(name+"님의 남은 돈은 "+money+"만원입니다.");
		System.out.println(name+"님의 현재 마일리지는 "+mileage+"포인트입니다.");
		
	}
	
	//2. refund 메서드
	/*
	1. 고려사항
	  - 물건을 산 내역이 없을때
	  - 내가 산 물건만 반품
	  - 재고, 마일리지도 원상태로
	*/
	public void refund(Product prod){
		
//		선생님 풀이(1)
//		if(item.isEmpty()){
//			System.out.println("구매하신 물품이 없습니다");
//			return;
//		}
//		boolean result = false;
//		for(int i = 0; i < item.size(); i++){
//			Product sp = (Product)item.get(i);
//			if(item.get(i) == prod){
//				// 반품
//				money += prod.price;
//				mileage -= prod.point;
//				Product rp =  (Product)item.remove(i);
//				System.out.println(rp + "를 반품하셨습니다.");
//				result = true;
//				break;
//			}
//		}
//		
//		if(!result){
//			System.out.println(prod+"를 구매하신적이 없습니다.");
//		}
		
//		선생님 풀이(2)
//		if(item.remove(prod)){ // 뒤에서 부터 제거(앞에서부터 제거하면 이동할 배열이 많음)
//			money += prod.price;
//			mileage -= prod.point;
//			System.out.println(prod + "를 반품하셨습니다.");
//		} else {
//			System.out.println(prod + "를 구매하신 적이 없습니다.");
//		}
		
		for(int i = 0; i < item.size(); i++){
			Product sp = (Product)item.get(i);
			if(sp == prod){
				item.remove(i);
				mileage -= sp.point;
				money += sp.price;
				return;
			} else {
				continue;
			}
		}
		System.out.println("진상고객");
	}
}

//----여기서부터는 클래스 완전 다 재구성해야함
//3. 물품의 수량을 관리 class 
//Tv 몇대여서 얼마 , Tv 몇대샀는지.. 나중에 또사면 앞에 샀던 내역에서 또 수정... 처음사는거면 내역에서 추가
class ProductList{
	
}
//4. 고객의 목록을 관리해주세요. class
//메인에서 고객을 등록을 시키고 나면, 누가 뭐를 몇개샀는지? 누가 뭐를 반품했는지? 고객들을 관리할수있도록
class CustomerList{
	
}






