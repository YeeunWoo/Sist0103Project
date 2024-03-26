package data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import data.dto.UserDto;
import mysql.db.DbConnect;

public class UserDao {

	DbConnect db = new DbConnect();

	// 사용자를 데이터베이스에 추가하는 메서드
	public void addUser(UserDto user) {
		// 구현 내용
	}

	// 사용자 목록을 가져오는 메서드
	public List<UserDto> getUserList() {
		// 구현 내용
		return null;
	}

	// 사용자 정보를 업데이트하는 메서드
	public void updateUser(UserDto user) {
		// 구현 내용
	}

	// 사용자를 삭제하는 메서드
	public void deleteUser(int userId) {
		// 구현 내용
	}

	public boolean isIdPass(String userId, String password) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean result = false;

		try {

			String sql = "SELECT * FROM users WHERE user_id = ? AND password = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = true; // 아이디와 비밀번호가 일치하는 사용자가 존재함
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

		return result;
	}

	// 아이디에 대한 이름반환
	public String getName(String id) {
		String name = "";

		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from users where user_id=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				name = rs.getString("username");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

		return name;
	}
}
