package data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import data.dto.OrderDto;
import mysql.db.DbConnect;

public class OrderDao {

	DbConnect db = new DbConnect();
	
	// 해당 날짜의 주문 수를 가져오는 메서드
    public int getOrderCountForToday() {
    	Connection conn = db.getConnection();
    	PreparedStatement pstmt = null;
    	ResultSet rs=null;
    	
        String sql = "SELECT COUNT(*) AS orderCount FROM order_info WHERE DATE(order_date) = CURDATE()";
        int orderCount = 0;
        try {
        	pstmt=conn.prepareStatement(sql);
        	rs=pstmt.executeQuery();
        	if(rs.next()) {
                orderCount = rs.getInt("orderCount");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orderCount;
    }

	// insert
	public void insertOrder(OrderDto dto) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;

		String sql = "INSERT INTO order_info VALUES (?, ?, now(), ?, ?, ?, ?, ?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getOrderNum());
			pstmt.setString(2, dto.getMemNum());
			pstmt.setString(3, dto.getOrderStatus());
			pstmt.setString(4, dto.getOrderDeliveryRequest());
			pstmt.setString(5, dto.getOrderAddr());
			pstmt.setString(6, dto.getOrderName());
			pstmt.setString(7, dto.getOrderHp());
			pstmt.setInt(8, dto.getOrderDeliveryFee());
			pstmt.setInt(9, dto.getOrderTotalPayment());
			
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
}
