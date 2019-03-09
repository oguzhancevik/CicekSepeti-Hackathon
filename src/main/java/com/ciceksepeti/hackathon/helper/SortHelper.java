package com.ciceksepeti.hackathon.helper;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import com.ciceksepeti.hackathon.pojo.Dealer;

public class SortHelper {

	public HashMap<Dealer, Double> sortHashMap(HashMap<Dealer, Double> unsortedHashMap, String order) {
		List<Entry<Dealer, Double>> list = new LinkedList<Entry<Dealer, Double>>(unsortedHashMap.entrySet());

		// Sorting the list based on values
		Collections.sort(list, new Comparator<Entry<Dealer, Double>>() {
			public int compare(Entry<Dealer, Double> o1, Entry<Dealer, Double> o2) {
				if (order.equals("ASC")) {
					return o1.getValue().compareTo(o2.getValue());
				} else {
					return o2.getValue().compareTo(o1.getValue());

				}
			}
		});

		// Maintaining insertion order with the help of LinkedList
		HashMap<Dealer, Double> sortedMap = new LinkedHashMap<Dealer, Double>();
		for (Entry<Dealer, Double> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

}
