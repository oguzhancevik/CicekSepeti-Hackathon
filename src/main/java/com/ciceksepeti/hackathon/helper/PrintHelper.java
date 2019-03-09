package com.ciceksepeti.hackathon.helper;

import com.ciceksepeti.hackathon.pojo.Dealer;
import com.ciceksepeti.hackathon.pojo.Order;

public class PrintHelper {

	public static void printDealerOrderSize(Dealer dealer) {
		System.out.println(dealer.getName() + " bayi " + dealer.getOrders().size() + " adet siparis teslim etmistir.");
	}

	public static void printOrder(Order order) {
		System.out.println(order.getId() + " nolu siparisi teslim eden bayi: " + order.getDealer().getName());
	}

}
