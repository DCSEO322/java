package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ViewClass {
	
	private IService service = new IServiceImpl();
	private String logIn_id;
	private String create;
	private String update;
	private String delete;
	public void startMethod() {
		System.out.println("┌────────────────┐");
		System.out.println("│메뉴를 고르세요\t │");
		System.out.println("│────────────────│");
		System.out.println("│1. 회원가입\t │");
		System.out.println("│2. 로그인\t │");
		System.out.println("│3. 회원조회\t │");
		System.out.println("│4. 회원정보변경\t │");
		System.out.println("│5. 회원삭제\t │");
		System.out.println("│6. 끝내기\t │");
		System.out.println("└────────────────┘");
		
		// CRUD만들기
		// 로그인, 회원 리스트, 상세정보(수정, 삭제)
		
		// 고르기
		Scanner scan = new Scanner(System.in);
		int input = 0;

		try{	// try-catch, int 범위 초과 시 예외 발생
			input = scan.nextInt();
		} catch (InputMismatchException e){
			e.printStackTrace();
			System.out.println("범위 초과");
		} 
		
		// 메서드이용
		switch (input) {
		case 1:
			// 회원가입
			create();
			break;
		case 2:
			// 로그인
			logIn();
			break;
		case 3:
			// 회원조회
			select();
			break;
		case 4:
			// 회원정보 변경
			update();
			break;
		case 5:
			delete();
			break;
		case 6:
			// 끝내기
			System.exit(0);
			break;
		default:
			System.out.println("다시 입력");
			break;
		}
		
	}

	private void showMemList() {
		
	}

	private void create() {
		MemberVO mvo = new MemberVO();
		// try-catch 및 정규식
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		String mem_id = scan.next();
		mvo.setMem_id(mem_id);
		
		System.out.print("비밀번호를 입력하세요 : ");
		String mem_pass = scan.next();
		mvo.setMem_pass(mem_pass);
		
		System.out.print("이름를 입력하세요 : ");
		String mem_name = scan.next();
		mvo.setMem_name(mem_name);
		scan.nextLine();
		
		System.out.print("주소를 입력하세요 : ");
		String mem_addr1 = scan.nextLine();
		mvo.setMem_add1(mem_addr1);
		
		System.out.print("상세주소를 입력하세요 : ");
		String mem_addr2 = scan.nextLine();
		mvo.setMem_add2(mem_addr2);
		
		System.out.print("집전화번호를 입력하세요 : ");
		String mem_hometel = scan.next();
		mvo.setMem_hometel(mem_hometel);
		
		System.out.print("핸드폰 번호를 입력하세요 : ");
		String mem_coltel = scan.next();
		mvo.setMem_coltel(mem_coltel);
		
		create = service.create(mvo);
		if(create == mem_id){
			System.out.println("회원가입이 되어있습니다.");
		} else {
			System.out.println(mem_name + "님 회원가입이 되었습니다.");
			showMemList();
		}
	}
	
	// ID를 입력받아 DB CUSTOMER의 데이터를 비교 했을 때 같은 값이 있으면 그 컬럼에 대한 값을 반환한다.
	private void select(){
		Scanner scan = new Scanner(System.in);
		System.out.print("조회할 아이디를 입력하세요 : ");
		String mem_id = scan.next();
	

		List<String> list = new ArrayList<>();
		list = service.select(mem_id);
	}
	
	private void update(){
		MemberVO mvo = new MemberVO();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("변경할 비밀번호를 입력하세요 : ");
		String mem_pass = scan.next();
		
		System.out.print("변경할 이름을 입력하세요 : ");
		String mem_name = scan.next();
		scan.nextLine();
		
		System.out.print("변경할 주소를 입력하세요 : ");
		String mem_add1 = scan.nextLine();

		System.out.print("변경할 상세주소를 입력하세요 : ");
		String mem_add2 = scan.next();
		
		System.out.print("변경할 전화번호를 입력하세요 : ");
		String mem_hometel = scan.next();
		
		System.out.print("변경할 휴대폰번호를 입력하세요 : ");
		String mem_coltel = scan.next();
		
	}
	
	private void delete(){
		MemberVO mvo = new MemberVO();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 아이디를 입력하세요 : ");
		String mem_id = scan.next();
		mvo.setMem_id(mem_id);
		
		if(delete == mem_id){
			System.out.println(mem_id + "가 삭제 되었습니다");
		} else {
			System.out.println(mem_id + "가 없습니다");
			showMemList();
		}
		
		delete = service.delete(mvo);
		
	}
	
	private void logIn() {
		// id, pass
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력하시오 : ");
		String mem_id = scan.next();
		System.out.print("비밀번호를 입력하시오 : ");
		String mem_pass = scan.next();
		
		Map<String, String> params = new HashMap<>();
		params.put("mem_id", mem_id);
		params.put("mem_pass", mem_pass);
		
		logIn_id = service.logIn(params); 
		
		if(logIn_id == null){
			System.out.println("회원 없음");
		} else {
			System.out.println(logIn_id + "회원님 어서오세요");
			showMemList();
		}
		
	}
		
}