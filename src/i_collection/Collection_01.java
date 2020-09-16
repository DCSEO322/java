package i_collection;

import java.util.ArrayList;

public class Collection_01 {
	public static void main(String[] args) {
		/*
		 1. collection framework
		 	- Collection 
		 		: 데이터 그룹
		 	- Frame work
		 		: 일을 하기 위한 틀
				: 표준화가 가능하다.
		 
		 2. 핵심 인터페이스
		 	- List
		 		: 순서가 있다.
		 		: 데이터 중복을 허용한다.
		 		: (구현체) ArrayList, Vector, Stack, LinkedList,...
		 		ex) 대기표 명단
		 	- Set
		 		: 순서가 없다.
		 		: 데이터 중복을 허용하지 않는다.
		 		: (구현체) HashSet, TreeSet,...
		 		: 정수의 집합
		 	- Map
		 		: 키와 값으로 이루어져 있다.
		 		: 순서가 없다.
		 		: 키는 중복을 허용하지 않고 값은 중복을 허용한다.
		 		: HashTable, HashMap, TreeMap,...
		  		ex) 지역번호, 우편번호
		
		 3. ArrayList
		 	- 배열을 사용하였을 때 길이를 한 번 정하면 변경이 불가한 단점을 보안하기위해 만들어졌다.
		 	- 동기화를 적용하지 않아 Vector보다 속도가 빠르다
		 	- 메서드들
		 		: add()		-> 객체를 추가
		 		: remove()	-> 객체를 제거
				: get(int index) -> index번째 객체를 얻어온다
				: set(int index, Object obj) -> index번째 객체를 교체한다.
				
		 4. LinkedList
		 	- 자신의 데이터와 다음 데이터의 주소를 가지고 있다.
		 	- 단점 : 이전 요소를 찾을 수가 없다
		 
		 5. DoubleLinkedList
		 	- 자신의 데이터와 이전의 데이터 주소, 다음 데이터의 주소를 가지고 있다.
		 	- 이전 요소를 찾을 수 없는 단점을 보안하기 위해 만들어 졌다.
		 	
		 6. Stack
		 	- First In Last Out : FILO
		 	- push()   : 객체 추가
		 	- pop()    : 추출(객체 삭제)
		 	- search() : 원하는 객체 찾기
		 	- peek()   : 가장 위의 객체를 가져온다(확인만 함)
		 
		 7. Queue - 인터페이스
		 	- First In Fisrt Out : FIFO
		 	- offer() : 추가
		 	- poll()  : 추출
		 	
		 8. HashSet
		 	- 새로운 요소를 추가하기 위해 add, addAll메서드를 사용할 때 중복추가될 때는 실패하게 된다.
		 
		 9. Map(Object, Object) - HashMap
		 	- 키(key)와 값(value)로 이루어져 있다. (둘 다 Object타입)
		 	- 순서가 없기 때문에 키는 중복을 허용하지 않고 값은 중복을 허용한다.
		 	- 키와 값의 type이 Object형태이지만 일반적으로 키의 경우는 String으로 많이 사용한다.
		 	- method들
		 		: put() -> 객체 추가
		 		: get(키) -> 원하는 객체의 값을 가져온다
		 		: remove(키) -> 객체 삭제
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		*/
	}
}
