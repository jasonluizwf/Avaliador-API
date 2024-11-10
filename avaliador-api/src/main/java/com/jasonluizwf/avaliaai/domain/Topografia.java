package com.jasonluizwf.avaliaai.domain;

import java.util.HashMap;
import java.util.Map;

public class Topografia {
	Map<Integer, Double> topografiaMap = new HashMap<>();

	public Topografia(Map<Integer, Double> topografiaMap) {
		super();
		this.topografiaMap = topografiaMap;
		topografiaMap.put(1, 115.0);
		topografiaMap.put(2, 100.0);
		topografiaMap.put(3, 130.0);
		topografiaMap.put(4, 85.0);
		topografiaMap.put(5, 115.0);
	}

	public Map<Integer, Double> getTopografiaDoTerrenoMap() {
		return topografiaMap;
	}

	@Override
	public String toString() {
		return "Topografia [topografiaMap=" + topografiaMap + "]";
	}
}