package com.ciceksepeti.hackathon.pojo;

public class Order extends Location {

	private short id;
	private Dealer dealer;

	public Order() {
	}

	public Order(short id, double latitude, double longitude) {
		super();
		setId(id);
		this.setLongitude(longitude);
		this.setLatitude(latitude);
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
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
