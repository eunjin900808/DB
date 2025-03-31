package dept2;

import java.sql.Statement;

public class DeptModify {

	public static void main(String[] args) throws Exception{
		
		Statement stmt = DbConn.OracleConn();
		
		String sql = "update dept set dname='테스트부3', loc='광주' where deptno = 100";

		
		int insertCnt = stmt.executeUpdate(sql);
		if(insertCnt == 1) {
			System.out.println("** 변경완료 !!! **");
		}else {
			System.out.println("** 변경실패 !!! **");
		}

	}

}
