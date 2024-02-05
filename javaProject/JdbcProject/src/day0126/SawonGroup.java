package day0126;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracleDb.DbConnect;

public class SawonGroup {
	
	DbConnect db = new DbConnect();
	
	public void connectSawonGroup() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		//sql 전달할 객체
		String sql = "select gender, count(buseo) count, to_char(round(avg(pay),0),'L999,999,999') avgpay, to_char(max(pay),'L999,999,999') maxpay, to_char(min(pay),'L999,999,999') minpay from sawon group by gender";

		
		conn = db.getOracle();
		System.out.println("오라클 계정 연결 성공!!!");
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("\t***회사 남녀별 급여통계***\n");
			System.out.println("성별\t인원수\t평균급여\t최고급여\t최저급여");
			System.out.println("-------------------------------------------------");
		
			while(rs.next()) {
				String gender = rs.getString("gender");
				int count = rs.getInt("count");
				String avgpay = rs.getString("avgpay");
				String maxpay = rs.getString("maxpay");
				String minpay = rs.getString("minpay");
				
				System.out.println(gender+"\t"+count+"\t"+avgpay+"\t"+maxpay+"\t"+minpay);

			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}
	}

	//job별 인원수와 평균나이
	public void personGroup() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select job, count(job) cnt, avg(age) avg from person group by job";
		
		conn = db.getOracle();

		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("\t***job별 인원수와 평균나이***\n");
			System.out.println("job\t인원\t평균나이");
			System.out.println("-------------------------------------------------");
		
			while(rs.next()) {
				String job = rs.getString("job");
				int cnt = rs.getInt("cnt");
				String avg = rs.getString("avg");

				
				System.out.println(job+"\t"+cnt+"\t"+avg);

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
		SawonGroup s = new SawonGroup();
		//s.connectSawonGroup();
		s.personGroup();
	}

}
