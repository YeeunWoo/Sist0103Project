package day0126;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracleDb.DbConnect;

public class HelloCrud {

	DbConnect db = new DbConnect();
	
	public void insert() {
		Scanner sc = new Scanner(System.in);
		String name, addr;
		String sql = "";
		System.out.print("이름을 입력: ");
		name = sc.nextLine();
		System.out.print("주소 입력: ");
		addr = sc.nextLine();
		
		sql = "insert into hello values(seq1.nextval,'"+name+"','"+addr+"', sysdate)";
		System.out.println(sql);
		
		//1. db 연결
		Connection conn = null;
		//2. statement 
		Statement stmt = null; //sql문 객체 전송에 필요한 API
		
		conn = db.getOracle();
		
		try {
			stmt = conn.createStatement();
			
			//3.sql문 실행
			stmt.execute(sql);
			System.out.println("insert 성공");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
	
	}
	
	public void select() {
		
		System.out.println("시퀀스\t이름\t주소\t가입날짜");
		System.out.println("--------------------------------------------");
		
		String sql = "select * from hello order by num";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		conn = db.getOracle();
		
		try {
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) { 
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				String sdate = rs.getString("sdate");

				System.out.println(num+"\t"+name+"\t"+addr+"\t"+sdate);
			}
			System.out.println("select 성공");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}
		
		
	}
	
	public void delete() {
		//삭제할 번호 입력 후 삭제
		Scanner sc = new Scanner(System.in);
		String num;
		String sql = "";
		
		System.out.println("삭제할 번호 입력");
		num = sc.nextLine();
		
		sql = "delete from hello where num = '" + num +"'";
		System.out.println(sql);
		
		Connection conn = null;
		Statement stmt = null;
		
		conn = db.getOracle();
		try {
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql); // 성공한 레코드의 개수
			
			//없는 번호 입력 시 삭제가 안 되므로 0 반환
			if(a ==0)
				System.out.println("없는 데이터 번호입니다...");
			else
				System.out.println("삭제 성공");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloCrud h = new HelloCrud();
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			
			System.out.println("▶▶▶ hello db ◀◀◀");
			System.out.println("1.insert 2.select 3.delete 4.update 9.exit");
			
			n = Integer.parseInt(sc.nextLine());
			
			if(n == 1)
				h.insert();
			else if(n == 2)
				h.select();
			else if(n ==3)
				h.delete();
			else if(n == 9) {
				System.out.println("▶▶▶ 종료 ◀◀◀");
				break;
			}
		}
		
	}

}
