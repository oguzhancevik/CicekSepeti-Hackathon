package com.ciceksepeti.hackathon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ciceksepeti.hackathon.dao.OrderDAO;
import com.ciceksepeti.hackathon.helper.DistanceHelper;
import com.ciceksepeti.hackathon.helper.PrintHelper;
import com.ciceksepeti.hackathon.helper.SortHelper;
import com.ciceksepeti.hackathon.pojo.Dealer;
import com.ciceksepeti.hackathon.pojo.Order;

public class Main {

	private static Dealer dealerRed, dealerGreen, dealerBlue;
	private static List<Order> orders;
	private static DistanceHelper distanceHelper;

	public void fillDealerInfo() {
		dealerRed = new Dealer("Kirmizi");
		dealerRed.setMinLimit((byte) 20);
		dealerRed.setMaxLimit((byte) 30);
		dealerRed.setLatitude(41.049792);
		dealerRed.setLongitude(29.003031);
		dealerRed.setOrders(new ArrayList<>());

		dealerGreen = new Dealer("Yesil");
		dealerGreen.setMinLimit((byte) 35);
		dealerGreen.setMaxLimit((byte) 50);
		dealerGreen.setLatitude(41.069940);
		dealerGreen.setLongitude(29.019250);
		dealerGreen.setOrders(new ArrayList<>());

		dealerBlue = new Dealer("Mavi");
		dealerBlue.setMinLimit((byte) 20);
		dealerBlue.setMaxLimit((byte) 80);
		dealerBlue.setLatitude(41.049997);
		dealerBlue.setLongitude(29.026108);
		dealerBlue.setOrders(new ArrayList<>());
	}

	public void loadOrders() {
		OrderDAO orderDAO = new OrderDAO();
		orders = new ArrayList<>();
		orders = orderDAO.loadOrders();
	}

	public void calculateDealerDistanceByOrder() {
		double distanceFromDealerRed, distanceFromDealerGreen, distanceFromDealerBlue;
		distanceHelper = new DistanceHelper();

		for (Order order : orders) {
			distanceFromDealerRed = distanceHelper.calculateDistance(dealerRed.getLatitude(), dealerRed.getLongitude(),
					order.getLatitude(), order.getLongitude());

			distanceFromDealerGreen = distanceHelper.calculateDistance(dealerGreen.getLatitude(),
					dealerGreen.getLongitude(), order.getLatitude(), order.getLongitude());

			distanceFromDealerBlue = distanceHelper.calculateDistance(dealerBlue.getLatitude(),
					dealerBlue.getLongitude(), order.getLatitude(), order.getLongitude());

			HashMap<Dealer, Double> unsortedDistances = new HashMap<>();
			unsortedDistances.put(dealerRed, distanceFromDealerRed);
			unsortedDistances.put(dealerGreen, distanceFromDealerGreen);
			unsortedDistances.put(dealerBlue, distanceFromDealerBlue);

			// mesafeleri kucukten buyuge gore sirala
			HashMap<Dealer, Double> sortedDistances = new HashMap<>();
			SortHelper sortHelper = new SortHelper();
			sortedDistances = sortHelper.sortHashMap(unsortedDistances, "ASC");

			order = deliverOrderByNearestDealer(order, sortedDistances);

			PrintHelper.printOrder(order);

		}

	}

	public Order deliverOrderByNearestDealer(Order order, HashMap<Dealer, Double> distances) {

		for (Object distance : distances.entrySet()) {
			Map.Entry<Dealer, Double> entry = (Map.Entry) distance;

			if (entry.getKey().getOrders().size() < entry.getKey().getMaxLimit()) {
				if (entry.getKey().getName().equals("Kirmizi")) {
					order.setDealer(dealerRed);
					dealerRed.getOrders().add(order);
					break;
				} else if (entry.getKey().getName().equals("Yesil")) {
					order.setDealer(dealerGreen);
					dealerGreen.getOrders().add(order);
					break;
				} else if (entry.getKey().getName().equals("Mavi")) {
					order.setDealer(dealerBlue);
					dealerBlue.getOrders().add(order);
					break;
				}
			}
		}

		return order;
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.fillDealerInfo();
		main.loadOrders();
		main.calculateDealerDistanceByOrder();

		PrintHelper.printDealerOrderSize(dealerRed);
		PrintHelper.printDealerOrderSize(dealerGreen);
		PrintHelper.printDealerOrderSize(dealerBlue);

	}

}
