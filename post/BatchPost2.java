package post;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Statement;

import comm.DbConn;
/*
 * 배치파일 - 우편번호/주소 데이터 일괄입력
 */
public class BatchPost2 {

	public static void main(String[] args) throws Exception{
		
		Statement stmt = DbConn.OracleConn();
		
		//IO Service
				String filePath = "c:/mytemp/post1.txt.bak";
				FileReader fr = new FileReader(filePath);
				BufferedReader br = new BufferedReader(fr);
				
				long ct1 = System.currentTimeMillis();	// 유닉스시간(1000 -> 1초)
				long nt1 = System.nanoTime();	// 나노시간
				
				int cnt = 0;
				System.out.println("*** 작업 시작 ***");
				System.out.println("*** 작업 중 ***");
				while(true) {
					String str = br.readLine();
					if(str == null) break;
					
					System.out.println(str);
					
					// 210821,강원도,강릉시,강동면,모전리,,,
					String[] datas = new String[8];	// 값이 없는 {배열구조}물 탄생
					// datas[0] = null;
					// datas[1] = null;
					//  :
					// datas[7] = null;
					
					String[] array = str.split(",");
					
					for(int i =0; i<8; i++) { //0,1,2,3,4,5,6,7
						if(i < array.length) {	//array.length  == 5 / 0~4
							//datas[0] = array[0];
							//datas[1] = array[1];
							//datas[2] = array[2];
							//datas[3] = array[3];
							//datas[4] = array[4];
							datas[i] = array[i];
						}else {
							datas[i] = "";
						}
					}
					String p1 = datas[0].replace("'", "''");
					String p2 = datas[1].replace("'", "''");
					String p3 = datas[2].replace("'", "''");
					String p4 = datas[3].replace("'", "''");
					String p5 = datas[4].replace("'", "''");
					String p6 = datas[5].replace("'", "''");
					String p7 = datas[6].replace("'", "''");
					String p8 = datas[7].replace("'", "''");
					
					String sql = "insert into post2 values"
							+ "('"+p1+"','"+p2+"','"+p3+"','"+p4+"','"+p5+"','"+p6+"','"+p7+"','"+p8+"')";
					
					stmt.executeUpdate(sql);
					cnt++;
				}
				System.out.println("*** 작업 완료 ***");
				long ct2 = System.currentTimeMillis();	// 유닉스시간(1000 -> 1초)
				long nt2 = System.nanoTime();	// 나노시간
				System.out.println("-------------------------");
				System.out.println("{유닉스} : " + (ct2-ct1));
				System.out.println("{나노시간} : " + (nt2-nt1));
				System.out.println("{입력 데이터} "+ cnt + "건 저장완료!!");

	}

}
