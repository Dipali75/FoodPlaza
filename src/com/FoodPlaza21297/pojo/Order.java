package com.FoodPlaza21297.pojo;

public class Order {
	int orderId;
	String oStatus;
	double totalBill;
	String cusEmail;
	public Order()
	{
		
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getoStatus() {
		return oStatus;
	}
	public void setoStatus(String oStatus) {
		this.oStatus = oStatus;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	public String getCusEmail() {
		return cusEmail;
	}
	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", oStatus=" + oStatus
				+ ", totalBill=" + totalBill + ", cusEmail=" + cusEmail + "]";
	}
	

}
