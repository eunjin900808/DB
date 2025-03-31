package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeptList2 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@//127.0.0.1:1523/orcl7";
		String username = "c##java";
		String userpass = "1234";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(url,username,userpass);
			Statement stmt = con.createStatement();
			
			String sql = "select deptno,dname,loc from dept";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) { 
				
				String dno = rs.getString("deptno");
				String dnm = rs.getString("dname");
				String loc = rs.getString("loc");
				
				System.out.println(dno + " " + dnm + " " + loc);
			}
			
		}catch (Exception e){
			
		}
		

	}

}
