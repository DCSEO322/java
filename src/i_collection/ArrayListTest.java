package i_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(new Integer(5));
		list1.add(2);
		list1.add(3);
		list1.add(1);
		list1.add(4);
		
		List<Integer> list2 = new ArrayList<>(list1.subList(1, 4));
		// subList(int fromIndex, int toIndex) : from ~ to까지 잘라낸다(toIndex는 포함 x) 
		
		//toString()가 오버라이드
		System.out.println(list1);
		System.out.println(list2);
		
		//Read
		int a = list1.get(2);
		System.out.println(a);
		
		//Delete
		list1.remove(2);
		System.out.println(list1);
		
		//Update
		int change = new Integer(10);		// 변경된 값
		int after = list1.set(1, change);	// 변경 전 값을 반환
		System.out.println("변경 전 : " + after + ", 변경 값 : " + change);
		System.out.println(list1);	// 5 10 1 4
		
		// 정렬해주는 메서드
		Collections.sort(list1);	// 오름차순 정렬
		System.out.println(list1);
		
		
		
		
		
		
	}
}
