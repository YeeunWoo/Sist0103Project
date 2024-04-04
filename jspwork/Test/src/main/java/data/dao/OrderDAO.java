package data.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import data.dto.OrderDTO;
import mysql.db.DbConnect;

public class OrderDAO {

	DbConnect db = new DbConnect();

	public boolean insertOrder(OrderDTO order) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;

		String sql = "INSERT INTO order_info (member_id, payment_method, delivery_request) VALUES (?, ?, ?)";

		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, order.getMemberId());
			pstmt.setString(2, order.getPaymentMethod());
			pstmt.setString(3, order.getDeliveryRequest());

			int affectedRows = pstmt.executeUpdate();
			return affectedRows > 0;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
