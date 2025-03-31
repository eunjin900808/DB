package dept2;

import java.sql.Statement;
import java.util.Scanner;

public class DeptDelete2 {

	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		Statement stmt = DbConn.OracleConn();
		
		System.out.print("1. 부서번호 >> ");
		String deptno = scn.next();

			
			String sql = "delete from dept2 where deptno = '"+deptno+"'";

			int cnt = stmt.executeUpdate(sql);
			
			if(cnt == 1) {
				System.out.println("** 삭제완료 !!! **");
			}else {
				System.out.println("** 삭제실패 !!! **");
			}

	}

}
