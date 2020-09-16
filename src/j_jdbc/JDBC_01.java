package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_01 {
	public static void main(String[] args) {
		Connection conn = null;	// 연결
		Statement stmt = null;	// 질의
		ResultSet rs = null;	// 결과
		
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver"); // (.)으로 구분
			
			// 2. 접속(준비과정 필요) - localhost, 포트, SID, 사용자이름, 비밀번호
			// localhost : IP, 비밀번호 : 1521, SID : XE
			String url = "jdbc:oracle:thin:@localhost:1521/XE"; // url은 (:)으로 구분
			String id = "SDC";
			String pw = "java";
			
			conn = DriverManager.getConnection(url, id, pw);
			
			// 3. 질의
			stmt = conn.createStatement();
			String mem_id = "a001";
			String sql = "SELECT * "
					     + "FROM MEMBER "
					    + "WHERE MEM_ID = '" + mem_id + "'"; // 문자열에는 (;)을 사용하지 않는다, 띄어쓰기 주의, 대소문자 구분
			
			rs = stmt.executeQuery(sql); // 질의 및 결과 저장

			//범위를 모르므로 while문으로 돌린다
			while(rs.next()){
				String mem_name = rs.getString("MEM_NAME");
				int mem_mileage = rs.getInt("MEM_MILEAGE");
				int mem_regno1 = rs.getInt("MEM_REGNO1");
				System.out.println(mem_name);
				System.out.println(mem_mileage);
				System.out.println(mem_regno1);
			}
			
		} catch (ClassNotFoundException e) { // 로딩 예외처리
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) { // 접속 예외처리
			e.printStackTrace();
			System.out.println("접속 실패");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch(SQLException e){
				e.printStackTrace();
				System.out.println("자원 반납 실패");
			}
		}
		
	}
}