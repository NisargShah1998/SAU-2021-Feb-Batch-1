package com.nisarg.domain;

public class OrderEvent {

	private Integer orderEventId;
	private Order order;
	
	public Integer getOrderEventId() {
		return orderEventId;
	}
	public void setOrderEventId(Integer orderEventId) {
		this.orderEventId = orderEventId;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public String toString() {
		return "OrderEvent [orderEventId=" + orderEventId + ", order=" + order + "]";
	}

}
