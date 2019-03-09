package com.ciceksepeti.hackathon.pojo;

import java.util.List;

public class Dealer{

	private String name;
	private byte minLimit;
	private byte maxLimit;
	private double latitude;
	private double longitude;
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

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
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
