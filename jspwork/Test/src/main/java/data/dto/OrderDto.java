package data.dto;

import java.sql.Timestamp;

public class OrderDto {
	private String orderNum;
    private String memNum;
    private Timestamp orderDate;
    private String orderStatus;
    private String orderDeliveryRequest;
    private String orderAddr;
    private String orderName;
    private String orderHp;
    private int orderDeliveryFee;
    private int orderTotalPayment;
    
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getMemNum() {
		return memNum;
	}
	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}
	public Timestamp getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderDeliveryRequest() {
		return orderDeliveryRequest;
	}
	public void setOrderDeliveryRequest(String orderDeliveryRequest) {
		this.orderDeliveryRequest = orderDeliveryRequest;
	}
	public String getOrderAddr() {
		return orderAddr;
	}
	public void setOrderAddr(String orderAddr) {
		this.orderAddr = orderAddr;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderHp() {
		return orderHp;
	}
	public void setOrderHp(String orderHp) {
		this.orderHp = orderHp;
	}
	public int getOrderDeliveryFee() {
		return orderDeliveryFee;
	}
	public void setOrderDeliveryFee(int orderDeliveryFee) {
		this.orderDeliveryFee = orderDeliveryFee;
	}
	public int getOrderTotalPayment() {
		return orderTotalPayment;
	}
	public void setOrderTotalPayment(int orderTotalPayment) {
		this.orderTotalPayment = orderTotalPayment;
	}  
}