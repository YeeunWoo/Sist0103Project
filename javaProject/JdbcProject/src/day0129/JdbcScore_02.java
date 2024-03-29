package day0129;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracleDb.DbConnect;

public class JdbcScore_02 {

	DbConnect db = new DbConnect();
	Scanner sc = new Scanner(System.in);

	public void insertSungjuk() {
		System.out.print("학생명: ");
		String name = sc.nextLine();

		System.out.print("java 점수: ");
		int java = Integer.parseInt(sc.nextLine());

		System.out.print("oracle 점수: ");
		int oracle = Integer.parseInt(sc.nextLine());

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		String sql = "insert into sungjuk(num, name, java, oracle) values (seq_score.nextval, ?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);

			//바인딩
			pstmt.setString(1, name);
			pstmt.setInt(2, java);
			pstmt.setInt(3, oracle);

			//?개수만큼 바인딩 후 실행
			pstmt.execute();
			System.out.println("***추가 완료***");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}

	//전체출력
	public void writeAll() {
		//총점, 평균 계산 후 출력
		this.calcTotalAverage();

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from sungjuk order by num";
		System.out.println("\t\t**학생성적 출력**\n");
		System.out.println("번호\t이름\t자바\t오라클\t총점\t평균");
		System.out.println("-------------------------------------------------");

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("num")+"\t"
						+ rs.getString("name") + "\t"
						+ rs.getInt("java") + "\t"
						+ rs.getInt("oracle") + "\t"
						+ rs.getInt("total") + "\t"
						+ rs.getDouble("average"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}


	}

	public void deleteSungjuk() {

		//시퀀스를 입력 받아 해당 데이터 지우기
		//만약 해당 번호가 없으면 "*번 학생은 존재하지 않습니다" 출력

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		System.out.print("시퀀스 입력: ");
		int num = Integer.parseInt(sc.nextLine());

		String sql = "delete from sungjuk where num = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);

			int n = pstmt.executeUpdate();

			if(n==1)
				System.out.printf("%d번 학생을 삭제하였습니다.\n",num);
			else 
				System.out.printf("%d번 학생은 존재하지 않습니다.\n",num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}
	
	public void updateSungjuk() {
		//수정할 num을 입력 후 java, oracle의 수정값을 입력 받아 수정하기
		//num이 있을 경우 "수정됨" 없을 경우 "*번 학생은 존재하지 않음"
		System.out.print("수정할 번호 선택: ");
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.println("수정할 자바점수 입력: ");
		int java = Integer.parseInt(sc.nextLine());

		System.out.println("수정할 오라클점수 입력: ");
		int oracle = Integer.parseInt(sc.nextLine());
		
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		
		String sql = "update sungjuk set java =?, oracle=? where num=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, java);
			pstmt.setInt(2, oracle);
			pstmt.setInt(3, num);

			int n = pstmt.executeUpdate();
			
			if(n==1)
				System.out.println("수정됨");
			else {
				System.out.printf("%d번 학생이 존재하지 않습니다.",num);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
		
	}

	//총점, 평균 구하는 메서드
	public void calcTotalAverage() {
		Connection conn = db.getOracle();
		Statement stmt = null;

		String sql = "update sungjuk set total = java + oracle, average = (java+oracle)/2";

		try {
			stmt=conn.createStatement();
			stmt.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}

	}

	public void process() {
		while(true) {
			System.out.println("1.학생성적추가 2.학생정보전체출력 3.학생정보삭제 4.학생정보수정 9.종료");

			int num = Integer.parseInt(sc.nextLine());

			switch(num) {
			case 1:
				this.insertSungjuk();
				break;
			case 2:
				this.writeAll();
				break;
			case 3:
				this.deleteSungjuk();
				break;
			case 4:
				this.updateSungjuk();
				break;
			case 9:
				System.out.println("***프로그램 종료***");
				System.exit(0);
			}

		}
	}

	public static void main(String[] args) {

		JdbcScore_02 s = new JdbcScore_02();
		s.process();

	}

}
