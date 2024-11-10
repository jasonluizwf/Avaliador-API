package com.jasonluizwf.avaliaai.domain;

import java.util.HashMap;
import java.util.Map;

public class Pedologia {
	Map<Integer, Double> pedologiaMap = new HashMap<>();

	public Pedologia(Map<Integer, Double> pedologiaMap) {
		super();
		this.pedologiaMap = pedologiaMap;
		pedologiaMap.put(1, 130.0);
		pedologiaMap.put(2, 115.0);
		pedologiaMap.put(3, 100.0);
		pedologiaMap.put(4, 70.0);
		pedologiaMap.put(5, 85.0);
	}

	public Map<Integer, Double> getPedologiaMap() {
		return pedologiaMap;
	}

	@Override
	public String toString() {
		return "Pedologia [pedologiaMap=" + pedologiaMap + "]";
	}
	
}
