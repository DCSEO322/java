package y_Project;

import java.util.Scanner;

public class View {

	public void startMethod() {
		System.out.println("어서오세요 대덕마트입니다");
		System.out.println("원하시는 Menu를 선택해주세요");
		System.out.println("1. 물품추가");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
		
		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();
		
		switch(select){
		case 1:
			addProduct();
//			join();
			break;

		case 2:
//			login();
			break;
		
		case 3:
			System.exit(0);
			break;
			
		default:
			System.out.println("1,2,3에 골라주세요");
			break;
		}
		
	}

	private void addProduct() {
		// 이름, 가격
		Scanner scan = new Scanner(System.in);
		System.out.println("물건의 이름을 입력하세요 : ");
		String name = scan.next();
		System.out.println("물건의 가격을 설정하세요 : ");
		int price = scan.nextInt();
		
		Service sv = new Service();
		boolean result = sv.addProduct(name, price);
		if(result){
			System.out.println("물품 등록에 성공하였습니다.");
		}
		
		
	}
	
}
