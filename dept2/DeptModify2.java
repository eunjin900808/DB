package dept2;

import java.sql.Statement;
import java.util.Scanner;

public class DeptModify2 {

	public static void main(String[] args) throws Exception{
		
		Scanner scn = new Scanner(System.in);
		Statement stmt = DbConn.OracleConn();
		
		System.out.print("1. 부서번호 >> ");
		String deptno = scn.next();

		System.out.print("2. 부서이름 >> ");
		String dname = scn.next();
		
		System.out.print("3. 부서위치>> ");
		String loc = scn.next();
		
		
		String sql = " update dept2 set dname='"+dname+"',loc='"+loc+"' "
				+ " where deptno='"+deptno+"'";
		
		int cnt = stmt.executeUpdate(sql);
		if(cnt == 1) {
			System.out.println("** 변경완료 !!! **");
		}else {
			System.out.println("** 없는부서번호입니다. !!! **");
		}

	}

}
