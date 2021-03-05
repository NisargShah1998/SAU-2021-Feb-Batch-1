package com.nisarg.domain;

import java.util.List;

public class Order {

	private int orderId;
	private String username;
	private List<String> items;
	
	public Order(int orderId, String username, List<String> items) {
		this.orderId = orderId;
		this.username = username;
		this.items = items;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", username=" + username + ", items=" + items + "]";
	}
	
	
}
