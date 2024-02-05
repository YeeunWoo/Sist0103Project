package day0125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectTest {

	static final String URL ="jdbc:oracle:thin:@localhost:1521:XE";

	public void connectSawon() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select * from sawon order by num";

		try {
			conn = DriverManager.getConnection(URL, "stu", "a1234");

			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);

			//여러 줄을 가져올 때는 while문 사용
			while(rs.next()) { // rs.next(): 다음 데이터로 이동하면서 true 반환
				//db로 부터 데이터 가져오기
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String buseo = rs.getString("buseo");
				int pay = rs.getInt("pay");

				System.out.println(num+"\t"+name+"\t"+gender+"\t"+buseo+"\t"+pay);
			}

			System.out.println("오라클 드라이버 연결 성공!!!");
		} catch (SQLException e) {
			System.out.println("오라클 드라이버 연결 실패...");
		} finally {

			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void connectShop() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select idx,c.num,sangpum,color,cnt,guipday from shop s,cart2 c where s.num=c.num";

		try {
			conn = DriverManager.getConnection(URL, "stu", "a1234");

			System.out.println("오라클 드라이버 연결 성공!!!");

			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);

			System.out.println("회원 장바구니");
			System.out.println("주문번호\t상품번호\t상품명\t색상\t개수\t구입일");
			System.out.println("----------------------");

			while(rs.next()) { 
				int idx = rs.getInt("idx");
				int num = rs.getInt("num");
				String sangpum = rs.getString("sangpum");
				String color = rs.getString("color");
				int cnt = rs.getInt("cnt");
				String guipday = rs.getString("guipday");

				System.out.println(idx+"\t"+num+"\t"+sangpum+"\t"+color+"\t"+cnt+"\t"+guipday);
			}


		} catch (SQLException e) {
			System.out.println("오라클 드라이버 연결 실패...");
		} finally {

			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void sawonRead() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql="select buseo, count(*) cnt, round(avg(pay),0) pay from sawon group by buseo";

		try {
			conn = DriverManager.getConnection(URL, "stu", "a1234");


			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);

			System.out.println("[부서별 평균 인원 및 급여 구하기]");
			System.out.println("----------------------");

			while(rs.next()) { 
				String buseo = rs.getString("buseo");
				int cnt = rs.getInt("cnt");
				int pay = rs.getInt("pay");

				System.out.println(buseo+"\t"+cnt+"\t"+pay);
			}


		} catch (SQLException e) {
			System.out.println("오라클 드라이버 연결 실패...");

		} finally {

			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void foodShopRead() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select order_num 주문번호, foodshop2.fno 음식번호, order_name 주문자, fname 음식명, to_char(price,'L999,999,999') 가격, fshopname 상호명, \r\n"
				+ "shoploc 상점위치, order_addr 주문자위치 from foodshop2, jumun2 where foodshop2.fno = jumun2.fno order by order_name";

		try {
			conn = DriverManager.getConnection(URL, "stu", "a1234");


			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.printf("%10s %10s %10s %20s %15s %15s %15s %15s%n", "주문번호", "음식번호", "주문자", "음식명", "가격", "상호명", "상점위치", "주문자위치");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

			while(rs.next()) { 
				int order_num = rs.getInt("주문번호");
				int fno = rs.getInt("음식번호");
				String order_name = rs.getString("주문자");
				String fname = rs.getString("음식명");
				String price = rs.getString("가격");
				String fshopname = rs.getString("상호명");
				String shoploc = rs.getString("상점위치");
				String order_addr = rs.getString("주문자위치");


			    System.out.printf("%10d %10d %10s %20s %15s %15s %15s %15s%n", order_num, fno, order_name, fname, price, fshopname, shoploc, order_addr);
			}


		} catch (SQLException e) {
			System.out.println("오라클 드라이버 연결 실패...");

		} finally {

			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		ConnectTest ct = new ConnectTest();
		//ct.connectSawon();

		ct.foodShopRead();


	}

}
