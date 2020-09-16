package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class IServiceImpl implements IService{

	private IDao dao = new IDaoImpl();
	
	// 로그인
	@Override
	public String logIn(Map<String, String> params) {
		String mem_id = dao.logIn(params);
		return mem_id;
	}
	
	// 회원가입
	@Override
	public String create(MemberVO mvo) {

		return dao.create(mvo);
	}
	
	// 회원조회
	@Override
	public List<String> select(String mem_id) {
		List<String> list = dao.select(mem_id);
		return list;
	}

	// 회원정보 변경
	@Override
	public String update(MemberVO mvo) {
		return dao.update(mvo);
	}
	
	// 회원삭제
	@Override
	public String delete(MemberVO mvo) {
		return dao.delete(mvo);
	}




}