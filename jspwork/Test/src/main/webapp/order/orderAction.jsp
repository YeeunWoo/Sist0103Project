<%@page import="data.dao.OrderDetailDao"%>
<%@page import="data.dto.OrderDetailDto"%>
<%@page import="java.util.Date"%>
<%@page import="data.dao.OrderDao"%>
<%@page import="data.dto.OrderDto"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");

//주문 정보 파라미터 받기
String memNum = request.getParameter("mem_num");
String orderName = request.getParameter("order_name");
String orderStatus = "입금전";
String orderHp = request.getParameter("order_hp");
String orderZipcode = request.getParameter("order_zipcode");
String orderAddr = request.getParameter("order_addr");
String orderAddressDetail = request.getParameter("order_address_detail");
String orderAddress = orderZipcode + orderAddr + orderAddressDetail;
String orderDeliveryRequest = request.getParameter("order_delivery_request");
String paymentMethod = request.getParameter("payment_method");
int orderDeliveryFee = 0;
int orderTotalPayment = 3850000;
int orderDetailSu = 3;
String proNum="5";

//주문 번호 생성
SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
String today = sdf.format(new Date());

OrderDao Orderdao = new OrderDao();
int todayOrderCount = Orderdao.getOrderCountForToday() + 1;
String newOrderNumber = today + String.format("%04d", todayOrderCount);

//OrderDto 객체 생성 및 데이터 설정
OrderDto orderDto = new OrderDto();
orderDto.setOrderNum(newOrderNumber);
orderDto.setMemNum(memNum);
orderDto.setOrderStatus(orderStatus);
orderDto.setOrderDeliveryRequest(orderDeliveryRequest);
orderDto.setOrderAddr(orderAddress);
orderDto.setOrderName(orderName);
orderDto.setOrderHp(orderHp);
orderDto.setOrderDeliveryFee(orderDeliveryFee);
orderDto.setOrderTotalPayment(orderTotalPayment);

// DAO를 이용한 데이터베이스 저장
Orderdao.insertOrder(orderDto);

//주문 상세(OrderDetailDto) 정보 저장
OrderDetailDto orderDetailDto = new OrderDetailDto();
orderDetailDto.setMemNum(memNum);
orderDetailDto.setProNum(proNum);
orderDetailDto.setOrderNum(newOrderNumber);
orderDetailDto.setOrderDetailSu(orderDetailSu);

OrderDetailDao orderDetailDao = new OrderDetailDao();
orderDetailDao.insertOrder(orderDetailDto);

// 주문 처리 후 리다이렉트 또는 메시지 출력 등 후속 처리
response.sendRedirect("orderComplete.jsp"); // 주문 완료 페이지 혹은 메인 페이지로 리다이렉트
%>