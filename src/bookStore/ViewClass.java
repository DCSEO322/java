package bookStore;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 서대철 서점 메인 화면(1. 회원가입, 2. 로그인, 3. 종료)
 * @since 2020.09.07
 */
public class ViewClass {
	Scanner scan = new Scanner(System.in);

	public void startMethod() {
		while (true) {

			System.out.println("┌───────────────────────────────┐");
			System.out.println("│    강선철 서점에 오신것을 환영합니다\t│");
			System.out.println("│───────────────────────────────│");
			System.out.println("│\t     메뉴를 고르세요\t\t│");
			System.out.println("└───────────────────────────────┘");
			System.out.print("    1.회원가입  ");
			System.out.print("2.로그인  ");
			System.out.println("3.종료");

			Scanner scan = new Scanner(System.in);
			int input = 0;

			try {
				input = scan.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("입력이 올바르지 않습니다.");

			}

			switch (input) {
			case 1:
				// 회원가입
				createMember();
				break;
			case 2:
				// 로그인
				logIn();
				break;
			case 3:
				System.out.println("종료");
				System.exit(0);
				break;
			default:
				System.out.println("번호를 다시 입력하세요");
				break;
			}
		}
	}

	/**
	 * @author 서대철 회원조회 메서드
	 * @since 2020.09.07
	 */
	private void selectMember() {
		System.out.println("┌───────────────────────────────┐");
		System.out.println("│      조회할 아이디를 입력하세요            │");
		System.out.println("└───────────────────────────────┘");
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력하세요  : ");
		String input = scan.next();
	}

	/**
	 * @author 서대철 회원가입 정보 입력
	 * @since 2020.09.07
	 */
	private void createMember() {
		System.out.println("┌───────────────────────────────┐");
		System.out.println("│         회원가입 정보 입력\t\t│");
		System.out.println("└───────────────────────────────┘");
		System.out.print("아이디 : ");
		String mem_id = scan.next();
		System.out.print("비밀번호 : ");
		String mem_pass = scan.next();
		System.out.print("이름 : ");
		String mem_name = scan.next();
		System.out.print("주소 : ");
		String mem_add1 = scan.nextLine();
		scan.nextLine();
		System.out.print("상세주소 : ");
		String mem_add2 = scan.next();
		System.out.print("전화번호 : ");
		String mem_phone = scan.next();
		System.out.println("┌───────────────────────────────┐");
		System.out.println("│      회원가입이 완료되었습니다.\t│");
		System.out.println("│───────────────────────────────│");
		System.out.println("│\t   로그인 하시겠습니까?   \t│");
		System.out.println("└───────────────────────────────┘");
		System.out.println("1. 예");
		System.out.println("2. 아니오. 프로그램을 종료하겠습니다.");
		System.out.println();
		int input = scan.nextInt();
		switch (input) {
		case 1:
			logIn();
			break;
		case 2:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		}
	}

	/**
	 * @author 서대철 회원 및 관리자 로그인 메뉴 선택 logIn메서드
	 * @since 2020.09.07
	 */
	private void logIn() {
		System.out.println("┌───────────────────────────────┐");
		System.out.println("│          메뉴를 고르세요\t\t│");
		System.out.println("└───────────────────────────────┘");
		System.out.print(" 1.회원로그인   ");
		System.out.print("2.관리자로그인  ");
		System.out.println("3.뒤로가기 ");

		int input = 0;

		try {
			input = scan.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("범위 초과");
		}

		switch (input) {
		case 1:
			// 회원로그인
			memberLogin();
			break;
		case 2:
			// 관리자 로그인
			managerLogin();
			break;
		case 3:
			// 뒤로가기
			return;

		}
	}

	/**
	 * @author 서대철 회원로그인 메서드
	 * @since 2020.09.07
	 */
	private void memberLogin() {
		while (true) {

			System.out.println("┌───────────────────────────────┐");
			System.out.println("│    아이디와 비밀번호를 입력하세요\t│");
			System.out.println("└───────────────────────────────┘");
			System.out.print("아이디 : ");
			String mem_id = scan.next();
			System.out.print("비밀번호 : ");
			String mem_pass = scan.next();

			// 로그인이 성공했으면 로그인 메뉴로 넘어간다.
			// 로그인이 실패했으면 다시 입력받도록 한다.

			System.out.println("로그인 성공"); // 처리할 부분

			System.out
					.println("┌────────────────────────────────────────────┐");
			System.out.println("│\t\t        회원\t\t\t     │");
			System.out
					.println("└────────────────────────────────────────────┘");
			System.out.println("1. 서적 주문 ");
			System.out.println("2. 장바구니 조회 ");
			System.out.println("3. 내 주문 내역 관리");
			System.out.println("4. 개인정보 변경 ");
			System.out.println("5. 로그아웃 ");
			System.out.println("6. 뒤로가기");

			int input = 0;

			// 입력값 변수타입의 범위를 초과했을 때 예외처리
			try {
				input = scan.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("범위 초과");
			}

			switch (input) {
			case 1:
				// 서적 주문 메서드 호출
				bookOrder();
				break;
			case 2:
				// 장바구니 조회 메서드 호출
				bucketSelect();
				break;
			case 3:
				// 내 주문 내역 관리 메서드 호출
				orderInfo();
				break;
			case 4:
				// 개인정보 변경 메서드 호출
				memUpdatePass();
				break;
			case 5:
				// 로그아웃 메서드 호출
				memberlogOut();
				break;
			case 6:
				// 뒤로가기
				return;
			default:
				System.out.println("번호를 다시 입력하세요");
				break;
			}
		}
	}

	/**
	 * @author 서대철 서적 주문 메서드
	 * @since 2020.09.07
	 */
	private void bookOrder() {
		while (true) {

			System.out.println("┌───────────────────────────┐");
			System.out.println("│\t      서적주문\t    │");
			System.out.println("└───────────────────────────┘");
			System.out.print("    1. 인문 ");
			System.out.print("2. IT ");
			System.out.print("3. 역사");
			System.out.println("4. 뒤로가기");

			int input = 0;
			try {
				input = scan.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("범위 초과");
			}

			switch (input) {
			case 1:
				// 인문
				humanities();
				break;
			case 2:
				// IT
				it();
				break;
			case 3:
				// 역사
				history();
				break;
			case 4:
				return;
			default:
				System.out.println("번호를 다시 입력하세요");
			}

		}
	}

	/**
	 * @author 서대철 인문서적 메서드
	 * @since 2020.09.07
	 */
	private void humanities() {
		while (true) {

			System.out.println("┌───────────────────────────┐");
			System.out.println("│\t      인문서적\t    │");
			System.out.println("└───────────────────────────┘");
			System.out.println("1. 공부란 무엇인가 ");
			System.out.println("2. 코로나 사피엔스 ");
			System.out.println("3. 아비투스");
			System.out.println("4. 뒤로가기");

			int input = 0;

			try {
				input = scan.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("범위 초과");
			}

			switch (input) {
			case 1:
				System.out.println(input + "번을 선택하셨습니다.");
				bookQuestion();
				break;
			case 2:
				System.out.println(input + "번을 선택하셨습니다.");
				bookQuestion();
				break;
			case 3:
				System.out.println(input + "번을 선택하셨습니다.");
				bookQuestion();
				break;
			case 4:
				return;
			default:
				System.out.println("번호를 다시 입력하세요");
			}
		}
	}

	/**
	 * @author 서대철 IT 서적 메서드
	 * @since 2020.09.07
	 */
	private void it() {
		while (true) {

			System.out.println("┌───────────────────────────┐");
			System.out.println("│\t    IT서적\t    │");
			System.out.println("└───────────────────────────┘");
			System.out.println("1. 정보처리기사 ");
			System.out.println("2. 컴퓨터활용능력1급 ");
			System.out.println("3. Do it! 첫 파이썬");
			System.out.println("4. 뒤로가기");
			int input = 0;

			try {
				input = scan.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("범위 초과");
			}

			switch (input) {
			case 1:
				System.out.println(input + "번을 선택하셨습니다.");
				bookQuestion();
				break;
			case 2:
				System.out.println(input + "번을 선택하셨습니다.");
				bookQuestion();
				break;
			case 3:
				System.out.println(input + "번을 선택하셨습니다.");
				bookQuestion();
				break;
			case 4:
				return;
			default:
				System.out.println("번호를 다시 입력하세요");
			}
		}
	}

	/**
	 * @author 서대철 역사서적 메서드
	 * @since 2020.09.07
	 */
	private void history() {
		while (true) {

			System.out.println("┌───────────────────────────┐");
			System.out.println("│\t      역사서적\t    │");
			System.out.println("└───────────────────────────┘");
			System.out.println("1. 곰브리치 세계사 ");
			System.out.println("2. 식탁 위의 세계사");
			System.out.println("3. 이승만 건국 대통령 이야기");
			System.out.println("4. 뒤로가기");
			int input = 0;

			try {
				input = scan.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("범위 초과");
			}

			switch (input) {
			case 1:
				System.out.println(input + "번을 선택하셨습니다.");
				bookQuestion();
				break;
			case 2:
				System.out.println(input + "번을 선택하셨습니다.");
				bookQuestion();
				break;
			case 3:
				System.out.println(input + "번을 선택하셨습니다.");
				bookQuestion();
				break;
			case 4:
				return;
			default:
				System.out.println("번호를 다시 입력하세요");
			}
		}
	}

	/**
	 * @author 이선엽 장바구니에 담거나 서적을 바로 주문하기
	 * @since 2020.09.07
	 */
	private void bookQuestion() {
		while (true) {

			System.out.println("┌───────────────────────────┐");
			System.out.println("│\t      서적주문\t    │");
			System.out.println("└───────────────────────────┘");
			System.out.println("1. 서적 주문하기");
			System.out.println("2. 장바구니에 담기");
			System.out.println("3. 뒤로 가기");

			int input = 0;

			try {
				input = scan.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("범위 초과");
			}

			switch (input) {
			case 1:
				System.out.println("장바구니에 서적이 추가되었습니다.");
				System.out.println();
				System.out.println("장바구니로 이동합니다.");
				bucketSelect();
				break;
			case 2:
				System.out.println("장바구니에 서적이 추가되었습니다.");
				System.out.println("초기 화면으로 돌아갑니다.");
				bookOrder();
				break;
			case 3:
				return;
			default:
				System.out.println("번호를 다시 입력하세요");
				break;
			}
		}
	}

	/**
	 * @author 이선엽 장바구니에 담아 놓은 서적을 주문하거나 주문 취소를 한다.
	 * @since 2020.09.07
	 */
	private void bucketSelect() {
		while (true) {

			System.out.println("┌──────────────────────────────┐");
			System.out.println("│\t    장바구니 목록\t       │");
			System.out.println("└──────────────────────────────┘");
			System.out.print("1. 장바구니 내역 취소");
			System.out.print("2. 장바구니 내역 주문 ");
			System.out.println("3. 뒤로가기");

			int input = 0;
			try {
				input = scan.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("범위 초과");
			}

			switch (input) {
			case 1:
				System.out.println("장바구니 내역이 삭제되었습니다.");
				System.out.println("선택 화면으로 돌아갑니다.");
				bookOrder();
				break;

			case 2:
				System.out.println("주문이 완료되었습니다.");
				break;
			case 3:
				return;

			}
		}
	}

	/**
	 * @author 강문정 회원 주문 목록 조회 메서드
	 * @since 2020.09.07
	 */
	private void orderInfo() {
		while (true) {

			System.out.println("1. 주문 내역 조회");
			System.out.println("2. 뒤로 가기");

			int input = scan.nextInt();
		}
	}

	/**
	 * @author 강문정 개인정보 변경(비밀번호 확인 전) 메서드
	 * @since 2020.09.07
	 */
	private void memUpdatePass() {
		System.out.println("┌────────────────────────────────────────────┐");
		System.out.println("│\t\t      비밀 번호 확인  \t\t     │");
		System.out.println("└────────────────────────────────────────────┘");
		System.out.println(" ** 개인정보처리방침에 따라 비밀번호를 한번 더 입력해주세요 **");
		System.out.print("비밀번호 : ");
		String mem_pass = scan.next();

		// 비밀번호를 확인 받아서 입력받은 비밀번호가 틀리면 틀렸습니다 반환

		if (mem_pass == null) {
			System.out.println("비밀번호가 틀렸습니다.");
			memUpdatePass();
		} else {
			// 비밀번호가 맞으면
			memUpdate();

		}

	}

	/**
	 * @author 강문정 개인정보 변경 메서드
	 * @since 2020.09.07
	 */
	// 개인정보 변경(비밀번호 확인 후)
	private void memUpdate() {
		while (true) {

			System.out
					.println("┌────────────────────────────────────────────┐");
			System.out.println("│\t\t      개인 정보 변경  \t\t     │");
			System.out
					.println("└────────────────────────────────────────────┘");
			System.out.print("1. 비밀번호 변경 ");
			System.out.print("2. 이름 변경 ");
			System.out.print("3. 주소 변경 ");
			System.out.print("4. 상세주소 변경 ");
			System.out.print("5. 전화번호 변경 ");
			System.out.println("6. 뒤로가기");

			int input = 0;

			try {
				input = scan.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("범위 초과");
			}

			switch (input) {
			case 1:
				// 1.비밀번호 변경
				passUpdate();
				break;
			case 2:
				// 2.이름변경
				nameUpdate();
				break;
			case 3:
				// 3.주소변경
				add1Update();
				break;
			case 4:
				// 4.상세주소변경
				add2Update();
				break;
			case 5:
				// 4.전화번호변경
				tel2Update();
				break;
			case 6:
				return;
			default:

				break;
			}

			try {
				input = scan.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("범위 초과");
			}
		}
	}

	/**
	 * @author 강문정 비밀번호 변경을 하는 메서드
	 * @since 2020.09.07
	 */
	private void passUpdate() {
		System.out.println("┌────────────────────────────────────────────┐");
		System.out.println("│\t\t      비밀 번호 변경  \t\t     │");
		System.out.println("└────────────────────────────────────────────┘");
		System.out.print("비밀번호 : ");
		String mem_pass = scan.next();

		if (mem_pass == null) {
			passUpdate();
		} else {
			System.out.println("비밀번호가 변경되었습니다.");
		}
	}

	/**
	 * @author 강문정 이름 변경할 수 있게하는 메서드
	 * @since 2020.09.07
	 */
	private void nameUpdate() {

		System.out.println("┌────────────────────────────────────────────┐");
		System.out.println("│\t\t      이름 변경  \t\t     │");
		System.out.println("└────────────────────────────────────────────┘");
		System.out.print("이름 : ");
		String mem_name = scan.next();

		if (mem_name == null) {
			nameUpdate();
		} else {
			System.out.println("이름이 변경되었습니다.");
		}
	}

	/**
	 * @author 강문정 주소를 변경할 수 있게하는 메서드
	 * @since 2020.09.07
	 */
	private void add1Update() {
		System.out.println("┌────────────────────────────────────────────┐");
		System.out.println("│\t\t      주소 변경  \t\t     │");
		System.out.println("└────────────────────────────────────────────┘");
		System.out.print("주소 : ");
		String mem_add1 = scan.nextLine();
		scan.nextLine();

		if (mem_add1 == null) {
			add1Update();
		} else {
			System.out.println("이름이 변경되었습니다.");
		}
	}

	/**
	 * @author 강문정 상세주소를 변경할 수 있게 해주는 메서드
	 * @since 2020.09.07
	 */
	private void add2Update() {
		System.out.println("┌────────────────────────────────────────────┐");
		System.out.println("│\t\t      상세 주소 변경  \t\t     │");
		System.out.println("└────────────────────────────────────────────┘");
		System.out.print("상세주소 : ");
		String mem_add2 = scan.next();

		if (mem_add2 == null) {
			add2Update();
		} else {
			System.out.println("상세주소가 변경되었습니다.");
		}
	}

	/**
	 * @author 강문정 전화번호를 변경할수 수 있게 해주는 메서드
	 * @since 2020.09.07
	 */
	private void tel2Update() {
		System.out.println("┌────────────────────────────────────────────┐");
		System.out.println("│\t\t      전화 번호 변경  \t\t     │");
		System.out.println("└────────────────────────────────────────────┘");
		System.out.print("전화번호 : ");
		String mem_phone = scan.next();

		if (mem_phone == null) {
			tel2Update();
		} else {
			System.out.println("전화변호가 변경되었습니다.");
		}
	}

	/**
	 * @author 강문정 회원 로그아웃을 할 수 있는 메서드
	 * @since 2020.09.07
	 */
	private void memberlogOut() {
		System.out.println("──────────────────────────────");
		System.out.println("\t로그아웃 되었습니다.");
		System.out.println("\t로그인 화면으로 돌아갑니다.");
		System.out.println("──────────────────────────────");
		memberLogin();
	}

	// 로그인 성공이라는 메서드를 완성했다고 가정하고 1번 누르면 밑에 출력문이 실행된다.

	/**
	 * @author 이선엽 관리자로그인을 할 수 있는 메서드
	 * @since 2020.09.07
	 */
	private void managerLogin() {
		while (true) {

			System.out.println("┌───────────────────────────────┐");
			System.out.println("│    아이디와 비밀번호를 입력하세요\t│");
			System.out.println("└───────────────────────────────┘");
			System.out.print("아이디 : ");
			String manager_id = scan.next();
			System.out.print("비밀번호 : ");
			String manager_pass = scan.next();

			// 로그인이 성공했으면 로그인 메뉴로 넘어간다.
			// 로그인이 실패했으면 다시 입력받도록 한다.
			System.out.println("┌───────────────────────────────┐");
			System.out.println("│             관리자\t\t│");
			System.out.println("└───────────────────────────────┘");
			System.out.println("1. 주문 관리");
			System.out.println("2. 서적 관리");
			System.out.println("3. 카테고리 관리");
			System.out.println("4. 회원정보 조회");
			System.out.println("5. 로그아웃");
			System.out.println("6. 뒤로가기");

			int input = 0;

			// 입력값 변수타입의 범위를 초과했을 때 예외처리
			try {
				input = scan.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("범위 초과");
			}

			switch (input) {

			case 1:
				orderManage();
				break;
			case 2:
				bookManage();
				break;
			case 3:
				categoryManage();
				break;
			case 4:
				memberManage();
				break;
			case 5:
				managerLogOut();
				return;
			case 6:
				return;

			default:
				System.out.println("잘못된 입력입니다.");
				System.out.println("다시 입력해주세요.");
				break;

			}
		}
	}

	/**
	 * @author 이선엽 관리자 모드 회원 정보관리 메서드
	 * @since 2020.09.07
	 */
	private void memberManage() {
		System.out.println("회원 정보 관리 화면입니다.");
		System.out.println("관리자 로그인 성공"); // 메서드 생성부분

	}

	/**
	 * @author 이선엽 관리자모드 카테고리 메서드
	 * @since 2020.09.07
	 */
	private void categoryManage() {
		while (true) {
			System.out.println("┌───────────────────────────────┐");
			System.out.println("│             카테고리          \t│");
			System.out.println("└───────────────────────────────┘");
			System.out.println("1. 카테고리 조회");
			System.out.println("2. 카테고리 등록");
			System.out.println("3. 카테고리 삭제");
			System.out.println("4. 뒤로가기");

			int input = 0;

			try {
				input = scan.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("올바른 입력이 아닙니다.");
			}

			switch (input) {
			case 1:
				categorySearch();
				break;
			case 2:
				categoryRegit();
				break;
			case 3:
				categoryDelete();
				break;
			case 4:
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}

	/**
	 * @author 이선엽 관리자모드 카테고리 메소드 - 카테고리 삭제
	 * @since 2020.09.07
	 */
	private void categoryDelete() {
		System.out.println();
		System.out.println("카테고리 삭제 화면입니다.");
	}

	/**
	 * @author 이선엽 관리자모드 카테고리 메소드 - 카테고리 등록
	 * @since 2020.09.07
	 */
	private void categoryRegit() {
		System.out.println();
		System.out.println("카테고리 등록 화면입니다.");
	}

	/**
	 * @author 이선엽 관리자모드 카테고리 메소드 - 카테고리 조회
	 * @since 2020.09.07
	 */
	private void categorySearch() {
		System.out.println();
		System.out.println("카테고리 조회 화면입니다.");
	}

	/**
	 * @author 이선엽 관리자모드 서적관리 메서드
	 * @since 2020.09.07
	 */
	private void bookManage() {
		while (true) {

			System.out.println("┌───────────────────────────────┐");
			System.out.println("│      관리자모드 서적 관리 화면 \t│");
			System.out.println("└───────────────────────────────┘");
			System.out.println("1. 카테고리별 서적 조회");
			System.out.println("2. 카테고리별 서적 등록");
			System.out.println("3. 카테고리별 서적 삭제");
			System.out.println("4. 한줄평 조회");
			System.out.println("5. 뒤로가기");

			int input = 0;
			try {
				input = scan.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("올바른 입력이 아닙니다.");
			}

			switch (input) {
			case 1:
				categoryBookSearch();
				break;

			case 2:
				categoryBookRegit();
				break;

			case 3:
				categoryBookDelete();
				break;

			case 4:
				evalInquiry();
				break;
			case 5:
				return;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}

	/**
	 * @author 이선엽 관리자모드 서적 관리 메서디 - 한줄평 조회
	 * @since 2020.09.07
	 */
	private void evalInquiry() {
		System.out.println();
		System.out.println("카테고리별 한줄평 조회 화면입니다.");
	}

	/**
	 * @author 이선엽 관리자모드 서적관리 메소드 - 카테고리별 서적 삭제
	 * @since 2020.09.07
	 */
	private void categoryBookDelete() {
		System.out.println();
		System.out.println("카테고리별 서적 삭제 화면입니다.");
	}

	/**
	 * @author 이선엽 관리자모드 서적관리 메소드 - 카테고리별 서적 등록
	 * @since 2020.09.07
	 */
	private void categoryBookRegit() {
		System.out.println();
		System.out.println("카테고리별 서적 등록 화면입니다.");
	}

	/**
	 * @author 이선엽 관리자모드 서적관리 메소드 - 카테고리별 서적 조회
	 * @since 2020.09.07
	 */
	private void categoryBookSearch() {
		System.out.println();
		System.out.println("카테고리별 서적 조회 화면입니다.");
	}

	/**
	 * @author 이선엽 관리자모드 주문관리 메소드
	 * @since 2020.09.07
	 */
	private void orderManage() {
		while (true) {

			System.out.println();
			System.out.println("관리자 모드 주문 관리 화면입니다.");
			System.out.println();
			System.out.println("┌───────────────────────────────┐");
			System.out.println("│    번호를 입력하세요\t        │");
			System.out.println("└───────────────────────────────┘");

			System.out.println("1. 주문 목록 조회");
			System.out.println("2. 반품 목록 조회");
			System.out.println("3. 뒤로가기");
			int input = 0;

			try {
				input = scan.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("올바른 입력이 아닙니다.");
			}

			switch (input) {
			case 1:
				orderList();
				break;

			case 2:
				takeBack();
				break;
			case 3:
				// 뒤로가기
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

		}
	}

	/**
	 * @author 이선엽 관리자모드 주문관리 - 반품 목록 조회
	 * @since 2020.09.07
	 */
	private void takeBack() {
		System.out.println();
		System.out.println("관리자 모드 반품 목록 조회 화면입니다.");
	}

	/**
	 * @author 이선엽 관리자모드 주문관리 - 주문 목록 조회
	 * @since 2020.09.07
	 */
	private void orderList() {
		System.out.println();
		System.out.println("관리자 모드 주문 목록 조회 화면입니다.");

	}

	/**
	 * @author 강문정 관리자모드 로그아웃
	 * @since 2020.09.07
	 */
	private void managerLogOut() {
		System.out.println("──────────────────────────────");
		System.out.println("\t로그아웃 되었습니다.");
		System.out.println("\t로그인 화면으로 돌아갑니다.");
		System.out.println("──────────────────────────────");
		managerLogin();
	}
}