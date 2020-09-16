package project;

import java.util.List;
import java.util.Map;

public interface IService {

	/**
	 * 로그인 메서드
	 * @param params mem_id 사람의 아이디, mem_pass 비밀번호
	 * @return id와 pw가 일치하는 한명의 아이디, 일치하는 사람이 없으면 null
	 * @author 서대철
	 * @since 2020.09.04
	 */
	String logIn(Map<String, String> params);
	
	/**
	 * 회원가입 메서드
	 * @param createMember mem_id, mem_pass
	 * @return 
	 * @author 서대철
	 * @since 2020.09.04
	 */
	String create(MemberVO mvo);
	
	/**
	 * 회원정보 조회 메서드
	 * @param selectMember : mem_id
	 * @return 
	 * @author 서대철
	 * @since 2020.09.06
	 */
	List<String> select(String mem_id);

	
	/**
	 * 회원정보 변경 메서드
	 * @author 서대철
	 * @since 2020.09.06
	 */
	String update(MemberVO mvo);
	
	/**
	 * 회원정보 삭제 메서드
	 * @param params1 mem_id 사람의 아이디, mem_pass 비밀번호
	 * @return 
	 * @author 서대철
	 * @since 2020.09.04
	 */
	String delete(MemberVO mvo);


}