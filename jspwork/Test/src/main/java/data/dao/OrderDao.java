package data.dao;

import java.util.List;
import data.dto.OrderDto;

public class OrderDao {
    // 주문을 데이터베이스에 추가하는 메서드
    public void addOrder(OrderDto order) {
        // 구현 내용
    }

    // 주문 목록을 가져오는 메서드
    public List<OrderDto> getOrderList() {
        // 구현 내용
        return null;
    }

    // 특정 사용자의 주문 목록을 가져오는 메서드
    public List<OrderDto> getOrderListByUserId(int userId) {
        // 구현 내용
        return null;
    }

    // 특정 제품의 주문 목록을 가져오는 메서드
    public List<OrderDto> getOrderListByProductId(int productId) {
        // 구현 내용
        return null;
    }

    // 주문을 업데이트하는 메서드
    public void updateOrder(OrderDto order) {
        // 구현 내용
    }

    // 주문을 삭제하는 메서드
    public void deleteOrder(int orderId) {
        // 구현 내용
    }
}
