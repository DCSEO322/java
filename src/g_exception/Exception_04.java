package g_exception;

import java.sql.SQLException;

public class Exception_04 {
	public static void main(String[] args) {
		Controll.idCheck();
	}
}

class Controll{
	static void idCheck(){
		Service.idCheck();
	}
}

class Service{
	static void idCheck(){
		try {
			Dao.idCheck();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}

class Dao{
	static void idCheck() throws SQLException{ // Service에 떠넘기기
		SQLException sql = new SQLException("ORA-0001 : unique constraint violated");
		throw sql;
	}
}