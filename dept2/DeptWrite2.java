package dept2;

import java.sql.Statement;

public class DeptWrite2 {

	public static void main(String[] args) throws Exception{
		
		
		Statement stmt = DbConn.OracleConn();
		
		String sql = "insert into dept(no,deptno,dname,loc)"
					+ " values('10','100','테스트부','서울')";
		
		int insertCnt = stmt.executeUpdate(sql);

		if(insertCnt == 1) {
			System.out.println("** 저장완료 !!! **");
		}else {
			System.out.println("** 저장실패 !!! **");
		}

	}

}
