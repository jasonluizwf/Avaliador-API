package com.jasonluizwf.avaliaai.domain;

import java.util.HashMap;
import java.util.Map;

public class OcupacaoDoSolo {
	Map<Integer, Double> ocupacaoDoSoloMap = new HashMap<>();

	public OcupacaoDoSolo(Map<Integer, Double> ocupacaoDoSoloMap) {
		super();
		this.ocupacaoDoSoloMap = ocupacaoDoSoloMap;
		ocupacaoDoSoloMap.put(1, 130.0);
		ocupacaoDoSoloMap.put(2, 100.0);
		ocupacaoDoSoloMap.put(3, 115.0);
		ocupacaoDoSoloMap.put(4, 70.0);
		ocupacaoDoSoloMap.put(5, 130.0);
		ocupacaoDoSoloMap.put(6, 85.0);
	}

	public Map<Integer, Double> getocupacaoDoSoloMap() {
		return ocupacaoDoSoloMap;
	}

	@Override
	public String toString() {
		return "OcupacaoDoSolo [ocupacaoDoSoloMap=" + ocupacaoDoSoloMap + "]";
	}

}
