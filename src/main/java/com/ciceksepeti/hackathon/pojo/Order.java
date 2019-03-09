package com.ciceksepeti.hackathon.pojo;

public class Order {

	private short id;
	private double latitude;
	private double longitude;
	private Dealer dealer;

	public Order() {
	}

	public Order(short id, double latitude, double longitude) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
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

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", dealer=" + dealer.getName() + "]";
	}

}
