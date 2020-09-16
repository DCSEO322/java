package i_collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> param = new HashMap<>();
		
		// put이 update와 insert의 개념을 둘 다 가지고 있다
		param.put("이현무", 74);
		param.put("김근호", 27);
		param.put("이경륜", 35);
		param.put("이운주", 41);
		
		//Read
		int ju = param.get("이운주");
		System.out.println(ju);
		System.out.println(param);
		
		//Delete
		System.out.println(param.remove("이현무"));
		System.out.println(param);
		
		Map<String, String> mem = new HashMap<>();
		mem.put("mem_id", "a001");
		System.out.println(mem.get("mem_id"));
		mem.put("mem_pw", "asdfasdf");
		System.out.println(mem.get("mem_pw"));
		mem.put("mem_id", "b001");
		System.out.println(mem.get("mem_id"));
		mem.put("mem_pw", "asdasd");
		System.out.println(mem.get("mem_pw"));
		
		
		
//		SELECT *
//		  FROM MEMBER
//		 WHERE MEM_ID = mem.get("mem_id");
//		   AND MEM_PW = mem.get("mem_pw");
	}
}
