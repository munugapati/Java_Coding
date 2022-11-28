package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapSwapDemo {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<String>();

		Map<String, List<String>> mp = new HashMap<String, List<String>>();

		l1.add("A2");
		l1.add("A3");
		mp.put("B1", l1);

		List<String> l2 = new ArrayList<String>();
		l2.add("A1");
		l2.add("A2");
		mp.put("B2", l2);

		List<String> l3 = new ArrayList<String>();
		l3.add("A4");
		l3.add("A3");
		mp.put("B3", l3);

		List<String> l4 = new ArrayList<String>();
		l4.add("A4");
		l4.add("A1");
		mp.put("B4", l4);

		Map<String, List<String>> mp1 = new HashMap<>();

		for (Entry<String, List<String>> e : mp.entrySet()) {

			for (String s : e.getValue()) {

				if (mp1.containsKey(s)) {

					List<String> temp = mp1.get(s);
					temp.add(e.getKey());
					mp1.put(s, temp);

				} else {

					List<String> temp1 = new ArrayList<>();
					temp1.add(e.getKey());
					mp1.put(s, temp1);

				}

			}

		}

		System.out.println("Before Swaping elements:");

		for (Entry<String, List<String>> e : mp.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}

		System.out.println("After Swaping elements:");

		for (Entry<String, List<String>> e : mp1.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}

	}

}
