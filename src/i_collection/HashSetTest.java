package i_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;



public class HashSetTest {
	public static void main(String[] args) {
		Set<Integer> se = new HashSet<>();
		
		for(int i = 0; i < 10; i++){
			int random = (int)(Math.random()*35+1);
			boolean result = se.add(random);
			System.out.println(result);
		}
		System.out.println(se);

		ArrayList<Integer> array = new ArrayList<>(se);
		Collections.sort(array);
		
		System.out.println(array);
	}
}
