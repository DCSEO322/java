package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sun.org.apache.bcel.internal.generic.Select;

import sun.font.CreatedFontTracker;

public class IDaoImpl implements IDao{

	@Override
	public String logIn(Map<String, String> params) {
		String mem_id = params.get("mem_id");
		String mem_pass = params.get("mem_pass");
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String logIn_id = null;
		
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		// 2. 접속
			String url = "jdbc:oracle:thin:@localhost:1521/XE";
			String id = "SEO";
			String pass = "java";
			conn = DriverManager.getConnection(url, id, pass);
			
		// 질의
			stmt = conn.createStatement();
			String sql = "SELECT * FROM CUSTOMER";
			
			rs = stmt.executeQuery(sql); // 질의 및 결과
			while(rs.next()){
				logIn_id = rs.getString("MEM_ID");
			}
			
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e){
			e.printStackTrace();
			System.out.println("접속 실패");
		} finally {
			
			try {
				if(rs != null){
					rs.close();
				}
				if(stmt != null){
					stmt.close();
				}
				if(conn != null){
					conn.close();
				}
				
			} catch (SQLException e){
				e.printStackTrace();
				System.out.println("반환 실패");
			}
		}
		
		return logIn_id;
	}
	
	
	//회원가입
	@Override
	public String create(MemberVO mvo) {
		Connection con = null;
		Statement state = null;
		ResultSet rset = null;
		
		String mem_id = mvo.getMem_id();
		String mem_pass = mvo.getMem_pass();
		String mem_name = mvo.getMem_name();
		String mem_add1 = mvo.getMem_add1();
		String mem_add2 = mvo.getMem_add2();
		String mem_hometel = mvo.getMem_hometel();
		String mem_coltel = mvo.getMem_coltel();

		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 접속
			String url = "jdbc:oracle:thin:@localhost:1521/XE";
			String id = "SEO";
			String pass = "java";
			con = DriverManager.getConnection(url, id, pass);
			
			// 3. 질의
			state = con.createStatement();
			String sql = "INSERT INTO CUSTOMER "
					+ "VALUES ('" +  mem_id + "', "
							 + "'" + mem_pass  + "', "
							 + "'" + mem_name + "', "
							 + "'" + mem_add1 +"', "
							 + "'" + mem_add2 + "', "
							 + "'" + mem_hometel + "', "
							 + "'" + mem_coltel + "')";
			state.executeQuery(sql);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e){
			e.printStackTrace();
			System.out.println("접속 실패");
		} finally {
			try {
				if(rset != null){
					rset.close();
				}
				if(state != null){
					state.close();
				}
				if(con != null){
					con.close();
				}
			} catch (SQLException e){
				e.printStackTrace();
				System.out.println("반환 실패");
			}
		}
		
		return mem_id + mem_pass + mem_name + mem_add1 + mem_add2 + mem_hometel + mem_coltel;
	}

	// 회원조회
	@Override
	public List<String> select(String mem_id) {
		Connection con = null;
		Statement state = null;
		ResultSet rset = null;
		
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 접속
			String url = "jdbc:oracle:thin:@localhost:1521/XE";
			String id = "SEO";
			String pass = "java";
			con = DriverManager.getConnection(url, id, pass);
			
			// 3. 질의
			state = con.createStatement();
			String sql = "SELECT * "
					     + "FROM CUSTOMER "
					     + "WHERE MEM_ID = '" + mem_id + "'";
			rset = state.executeQuery(sql);
			
			List<String> list = new ArrayList<>();
			
			while(rset.next()){
				String mem_pass = rset.getString("mem_pass");
				String mem_name = rset.getString("mem_name");
				String mem_add1 = rset.getString("mem_add1");
				String mem_add2 = rset.getString("mem_add2");
				String mem_hometel = rset.getString("mem_hometel");
				String mem_comtel = rset.getString("mem_comtel");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e){
			e.printStackTrace();
			System.out.println("접속 실패");
		} finally {
			try {
				if(rset != null){
					rset.close();
				}
				if(state != null){
					state.close();
				}
				if(con != null){
					con.close();
				}
			} catch (SQLException e){
				e.printStackTrace();
				System.out.println("반환 실패");
			}
		}
		
		return null;
	}
	
	
	// 회원변경
	@Override
	public String update(MemberVO mvo) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		// 2. 접속
			String url = "jdbc:oracle:thin:@localhost:1521/XE";
			String id = "SEO";
			String pass = "java";
			conn = DriverManager.getConnection(url, id, pass);
			
		// 질의
			stmt = conn.createStatement();
			String sql = "UPDATE CUSTOMER "
					      + "SET MEM_PASS = " + mvo.getMem_pass();
			
			rs = stmt.executeQuery(sql); // 질의 및 결과
			
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e){
			e.printStackTrace();
			System.out.println("접속 실패");
		} finally {
			
			try {
				if(rs != null){
					rs.close();
				}
				if(stmt != null){
					stmt.close();
				}
				if(conn != null){
					conn.close();
				}
				
			} catch (SQLException e){
				e.printStackTrace();
				System.out.println("반환 실패");
			}
		}
		
		
		return null;
	}

	// 회원삭제
	@Override
	public String delete(MemberVO mvo) {
		Connection con = null;
		Statement state = null;
		ResultSet rset = null;
		
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 접속
			String url = "jdbc:oracle:thin:@localhost:1521/XE";
			String id = "SEO";
			String pass = "java";
			con = DriverManager.getConnection(url, id, pass);
			
			// 3. 질의
			state = con.createStatement();
			String sql = "DELTE TABLE CUSTOMER "
					   + "WHERE MEM_ID = " + "'" + mvo.getMem_id() + "'";
			state.executeQuery(sql);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e){
			e.printStackTrace();
			System.out.println("접속 실패");
		} finally {
			try {
				if(rset != null){
					rset.close();
				}
				if(state != null){
					state.close();
				}
				if(con != null){
					con.close();
				}
			} catch (SQLException e){
				e.printStackTrace();
				System.out.println("반환 실패");
			}
		}
		
		return null;

	}




	
}