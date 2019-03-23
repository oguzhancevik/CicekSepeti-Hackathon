package com.ciceksepeti.hackathon.pojo;

import java.util.List;

public class Dealer extends Location {

	private String name;
	private byte minLimit;
	private byte maxLimit;
	private List<Order> orders;

	public Dealer() {
	}

	public Dealer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getMinLimit() {
		return minLimit;
	}

	public void setMinLimit(byte minLimit) {
		this.minLimit = minLimit;
	}

	public byte getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(byte maxLimit) {
		this.maxLimit = maxLimit;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Dealer [name=" + name + "]";
	}

}
