package kr.or.ddit.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
문제)

호텔 운영을 관리하는 프로그램 작성.(Map이용)
 - 키값은 방번호 
 
실행 예시)

**************************
호텔 문을 열었습니다.
**************************

*******************************************
어떤 업무를 하시겠습니까?
1.체크인  2.체크아웃 3.객실상태 4.업무종료
*******************************************
메뉴선택 => 1 <-- 입력

어느방에 체크인 하시겠습니까?
방번호 입력 => 101 <-- 입력

누구를 체크인 하시겠습니까?
이름 입력 => 홍길동 <-- 입력
체크인 되었습니다.

*******************************************
어떤 업무를 하시겠습니까?
1.체크인  2.체크아웃 3.객실상태 4.업무종료
*******************************************
메뉴선택 => 1 <-- 입력

어느방에 체크인 하시겠습니까?
방번호 입력 => 102 <-- 입력

누구를 체크인 하시겠습니까?
이름 입력 => 성춘향 <-- 입력
체크인 되었습니다

*******************************************
어떤 업무를 하시겠습니까?
1.체크인  2.체크아웃 3.객실상태 4.업무종료
*******************************************
메뉴선택 => 3 <-- 입력

방번호 : 102, 투숙객 : 성춘향
방번호 : 101, 투숙객 : 홍길동

*******************************************
어떤 업무를 하시겠습니까?
1.체크인  2.체크아웃 3.객실상태 4.업무종료
*******************************************
메뉴선택 => 2 <-- 입력

어느방을 체크아웃 하시겠습니까?
방번호 입력 => 101 <-- 입력
체크아웃 되었습니다.

*******************************************
어떤 업무를 하시겠습니까?
1.체크인  2.체크아웃 3.객실상태 4.업무종료
*******************************************
메뉴선택 => 1 <-- 입력

어느방에 체크인 하시겠습니까?
방번호 입력 => 102 <-- 입력

누구를 체크인 하시겠습니까?
이름 입력 => 허준 <-- 입력
102방에는 이미 사람이 있습니다.

*******************************************
어떤 업무를 하시겠습니까?
1.체크인  2.체크아웃 3.객실상태 4.업무종료
*******************************************
메뉴선택 => 2 <-- 입력

어느방을 체크아웃 하시겠습니까?
방번호 입력 => 101 <-- 입력
101방에는 체크인한 사람이 없습니다.

*******************************************
어떤 업무를 하시겠습니까?
1.체크인  2.체크아웃 3.객실상태 4.업무종료
*******************************************
메뉴선택 => 3 <-- 입력

방번호 : 102, 투숙객 : 성춘향

*******************************************
어떤 업무를 하시겠습니까?
1.체크인  2.체크아웃 3.객실상태 4.업무종료
*******************************************
메뉴선택 => 4 <-- 입력

**************************
호텔 문을 닫았습니다.
**************************

 */

public class T13_hotelTest {
	private Scanner scan;
	private Map<String, Hotel> hotelMap;
	
	public T13_hotelTest() {
		scan = new Scanner(System.in);
		hotelMap = new HashMap<>();
	}
	
	public static void main(String[] args) {
		new T13_hotelTest().hotelTestStart();

	}

	private void hotelTestStart() {
		Scanner scan = new Scanner(System.in);
		System.out.println("**************************");
		System.out.println("호텔 문을 열었습니다.");
		System.out.println("**************************");
		System.out.println();
		
		while (true) {
			System.out.println("*******************************************");
			System.out.println("어떤 업무를 하시겠습니까?");
			System.out.println("1.체크인  2.체크아웃 3.객실상태 4.업무종료");
			System.out.println("*******************************************");
			System.out.print("메뉴선택 : ");
			int input = scan.nextInt();

			switch (input) {
			case 1:
				checkIn(); // 체크인
				break;
			case 2:
				checkOut(); // 체크아웃
				break;
			case 3:
				checkRoom(); // 객실상태 확인
				break;
			case 4:
				System.out.println("업무종료");
				System.exit(0);
				break;
			default:
				System.out.println("번호를 다시 입력해주세요");
				break;
			}
		}
	}

	/**
	 * 체크인을 하기 위한 메서드
	 */
	private void checkIn() {
		System.out.print("체크인할 방 번호를 입력하세요 : ");
		String roomNum = scan.next();
		
		// 방이 비어있는지 검사
		if(hotelMap.get(roomNum) != null) {
			System.out.println(roomNum + "방은 이미 투숙객이 묶고 있는 방입니다.");
			return;
		}
		
		System.out.println("누구를 체크인하시겠습니까 ?");
		System.out.print("투숙객 이름 : ");
		String name = scan.next();
		
		hotelMap.put(roomNum, new Hotel(roomNum, name));
		System.out.println(name + "님 " + roomNum +"번 방으로 체크인 되었습니다.");
		System.out.println();
		
	}

	/**
	 * 체크아웃을 하기 위한 메서드
	 */
	private void checkOut() {
		System.out.print("체크아웃할 방 번호를 입력하세요 : ");
		String roomNum = scan.next();
		
		if(hotelMap.remove(roomNum) == null) {
			System.out.println(roomNum + "방은 체크인 되어있지 않습니다.");
		} else {
			System.out.println(roomNum + "번방 체크아웃 되었습니다.");
		}
		System.out.println();
	}

	/**
	 * 객실상태를 확인하기 위한 메서드
	 */
	private void checkRoom() {
		Set<String> keySet = hotelMap.keySet();
		
		if(keySet.size() == 0) {
			System.out.println("체크인된 방이 없습니다.");
		} else {
			Iterator<String> it = keySet.iterator();

			while(it.hasNext()) {
				String roomNum = it.next();
				Hotel h = hotelMap.get(roomNum);
				System.out.println(" 방 번호 : " + h.getRoomNum() + "\t" + "투숙객 : " + h.getName());
			}
		}
	}
}

/**
 * 투숙객을 저장하기 위한 VO클래스
 */
class Hotel {
	private String roomNum;
	private String name;
	
	public Hotel(String roomNum, String name) {
		super();
		this.roomNum = roomNum;
		this.name = name;
	}
	
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Hotel [roomNum=" + roomNum + ", name=" + name + "]";
	}
	
	
	
	
	
	
	
	
}