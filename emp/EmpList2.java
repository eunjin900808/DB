package emp;

import java.sql.ResultSet;
import java.sql.Statement;

import comm.DbConn;

public class EmpList2 {

	public static void main(String[] args) throws Exception {

		Statement stmt = DbConn.OracleConn();
		
		String sql1 = "select count(*) total from emp";
		ResultSet rs1 = stmt.executeQuery(sql1);
		rs1.next();
		int total = rs1.getInt("total");
		
		// 사원번호 사원이름 업무 부서번호
		String sql  = " select empno,ename,job,sal,hiredate,deptno from emp "
				    + " order by hiredate desc ";
		ResultSet rs = stmt.executeQuery(sql);

		System.out.println( "총 사원 수 : " + total );
		System.out.println("---------------------");
		while(rs.next()) { 
			String eno = rs.getString("empno");
			String enm = rs.getString("ename");
			String job = rs.getString("job");
			String dno = rs.getString("deptno");
			String hdt = rs.getString("hiredate").substring(0,10);
			System.out.println( eno+" "+enm+" "+job+" "+dno+" "+hdt );
		}
	}
}
