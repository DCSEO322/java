package project;

import java.util.List;
import java.util.Map;

public interface IDao {
	/**
	 * 로그인을 위한 메서드
	 * @param params mem_id 사람의 아이디, mem_pw 비밀번호
	 * @return id와  pw가 일치하는 한명의 아이디, 일치하는 사람이 없으면 null
	 * @author 서대철
	 * @since 2020.09.04
	 * @see
	 */
	String logIn(Map<String, String> params);
	
	/**
	 * 회원가입을 위한 메서드
	 * @create MemberVO mvo(mem_id 아이디, mem_pass 비밀번호, mem_add1 주소, mem_add2 상세주소, mem_coltel 전화번호)
	 * @return 
	 * @author 서대철
	 * @since 2020.09.05
	 */
	String create(MemberVO mvo);
	
	/**
	 * 회원조회를 위한 메서드
	 * @select 
	 * @return 
	 * @author 서대철
	 * @since 2020.09.06
	 */
	List<String> select(String mem_id);
	
	/**
	 * 회원정보 변경을 위한 메서드
	 * @update
	 * @return 
	 * @author 서대철
	 * @since 2020.09.06
	 */
	String update(MemberVO mvo);
	
	/**
	 * 회원삭제를 위한 메서드
	 * @delete 
	 * @return
	 * @author 서대철
	 * @since 2020.09.06
	 */
	String delete(MemberVO mvo);


	
	
	
}