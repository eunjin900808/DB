package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeptTotal {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@//127.0.0.1:1523/orcl7";
		String username = "c##java";
		String userpass = "1234";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(url,username,userpass);
			Statement stmt = con.createStatement();
			
			String sql = "select count(*) total from dept";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) { 
				
				int total = rs.getInt("total"); //getInt : 숫자타입으로 가져오기
				
				System.out.println("총 개수 : " +total);
			}
			
		}catch (Exception e){ }

	}

}
