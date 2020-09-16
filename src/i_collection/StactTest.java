package i_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class StactTest {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		
		s.push("0");
		s.push("1");
		s.push("2");

		System.out.println("============Stack============");
		while(!s.empty()){	// 비어있지 않으면 while문 반복
			System.out.println(s.pop());
		}
		
		Queue<String> qu = new LinkedList<>();
		qu.offer("0");
		qu.offer("1");
		qu.offer("2");
		
		System.out.println("============Queue============");
		while(!qu.isEmpty()){
			System.out.println(qu.poll());
		}
		
	}
}
