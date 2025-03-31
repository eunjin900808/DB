package dept2;

import java.sql.Statement;

public class DeptDelete {

	public static void main(String[] args) throws Exception {
		

		Statement stmt =  DbConn.OracleConn();
		
		String sql = "delete from dept where loc = 'bbb'";

		int cnt = stmt.executeUpdate(sql);
		System.out.println("** 삭제개수 >> " + cnt);
		
		if(cnt > 0) {
			System.out.println("** 삭제완료 !!! **");
		}else {
			System.out.println("** 삭제실패 !!! **");
		}

	}

}
