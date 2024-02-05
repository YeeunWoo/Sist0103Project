package day0129;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracleDb.DbConnect;

public class QuizJdbc {

	DbConnect db = new DbConnect();
	Scanner sc = new Scanner(System.in);

	public void insertMember() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		System.out.print("이름 입력: ");
		String name = sc.nextLine();

		System.out.print("부서 입력: ");
		String buseo = sc.nextLine();

		System.out.print("직위 입력: ");
		String position = sc.nextLine();

		System.out.print("성별 입력: ");
		String gender = sc.nextLine();

		System.out.print("급여 입력: ");
		int pay = Integer.parseInt(sc.nextLine());

		System.out.print("보너스 입력: ");
		int bonus = Integer.parseInt(sc.nextLine());


		String sql = "insert into sawonmember values(seq_smem.nextval, ?, ?, ?, ?, ?, ?, sysdate)";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);
			pstmt.setString(2, buseo);
			pstmt.setString(3, position);
			pstmt.setString(4, gender);
			pstmt.setInt(5, pay);
			pstmt.setInt(6, bonus);

			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}
	
	public void writeMember() {
		Connection conn = db.getOracle();
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "select s_no,s_name,buseo,position,gender,to_char(pay,'L999,999,999') pay,to_char(bonus,'L999,999,999') bonus,ipsaday from sawonmember";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("사원번호\t사원명\t부서\t직위\t성별\t\t\t급여\t\t\t보너스\t입사날짜");
			while(rs.next()) {
				System.out.println(rs.getInt("s_no") + "\t"
						+ rs.getString("s_name") + "\t"
						+ rs.getString("buseo") + "\t"
						+ rs.getString("position") + "\t"
						+ rs.getString("gender") + "\t"
						+ rs.getString("pay") + "\t"
						+ rs.getString("bonus") + "\t"
						+ rs.getDate("ipsaday"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}
	}
	
	public void deleteMember() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		
		System.out.print("삭제할 사원번호: ");
		int s_no = Integer.parseInt(sc.nextLine());
		
		String sql = "delete from sawonmember where s_no = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, s_no);
			int n = pstmt.executeUpdate();

			if(n==1)
				System.out.printf("%d번 학생을 삭제하였습니다.\n",s_no);
			else 
				System.out.printf("%d번 학생은 존재하지 않습니다.\n",s_no);			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
		
		
	}
	
	public void updateMember() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		
		System.out.print("수정할 사원번호 번호--> ");
		String s_no = sc.nextLine();
		
		if(!this.isOneData(s_no)) {
			System.out.println("해당 번호는 존재하지 않습니다.");
			return; 
		} 
		
		System.out.print("부서: ");
		String buseo = sc.nextLine();
		
		System.out.print("직급: ");
		String position = sc.nextLine();
		
		System.out.print("급여: ");
		int pay  = Integer.parseInt(sc.nextLine());

		System.out.print("보너스: ");
		int bonus = Integer.parseInt(sc.nextLine());
		
		String sql = "update sawonmember set buseo = ?, position = ?, pay = ?, bonus = ? where s_no = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, buseo);
			pstmt.setString(2, position);
			pstmt.setInt(3, pay);
			pstmt.setInt(4, bonus);
			pstmt.setString(5, s_no);
			
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
		
	}
	
	public void searchName() {
		System.out.print("검색할 이름: ");
		String s_name = sc.nextLine();
		
		String sql = "select s_no, s_name, buseo, position from sawonmember where s_name like ?";
		
		System.out.println("사원번호\t사원명\t부서\t직위");
		
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "%"+s_name+"%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("s_no")+"\t"+rs.getString("s_name")+"\t"+rs.getString("buseo")+"\t"+rs.getString("position"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
	}
	
	public boolean isOneData(String s_no) {
		boolean b = false;
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from sawonmember where s_no = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s_no);
			rs=pstmt.executeQuery();
			
			if(rs.next()) { 
				b = true; 
			} else {
				b = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
		return b;
	}

	public void process() {

		while(true) {
			System.out.println("1.사원정보입력 2.전체사원출력 3.사원삭제 4.사원수정 5.이름검색 9.시스템종료");
			System.out.print("번호 입력--> ");
			int n = Integer.parseInt(sc.nextLine());
			
			switch (n) {
			case 1: 
				insertMember();
				break;
			case 2:
				writeMember();
				break;
			case 3:
				deleteMember();
				break;
			case 4:
				updateMember();
				break;
			case 5:
				searchName();
				break;
			case 9:
				System.out.println("프로그램종료");
				System.exit(0);
			default:
				System.out.println("잘못된 숫자입니다.");
				break;
			}



		}



	}

	public static void main(String[] args) {
		QuizJdbc q = new QuizJdbc();
		q.process();

	}

}
