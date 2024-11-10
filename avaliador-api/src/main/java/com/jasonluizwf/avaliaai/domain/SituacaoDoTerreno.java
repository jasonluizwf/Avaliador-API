package com.jasonluizwf.avaliaai.domain;

import java.util.HashMap;
import java.util.Map;

public class SituacaoDoTerreno {
	Map<Integer, Double> situacaoMap = new HashMap<>();

	public SituacaoDoTerreno(Map<Integer, Double> situacaoMap) {
		super();
		this.situacaoMap = situacaoMap;
		situacaoMap.put(1, 115.0);
		situacaoMap.put(2, 130.0);
		situacaoMap.put(3, 100.0);
		situacaoMap.put(4, 85.0);
		situacaoMap.put(5, 70.0);
	}

	public Map<Integer, Double> getSituacaoMap() {
		return situacaoMap;
	}

	@Override
	public String toString() {
		return "SituacaoDoTerreno [situacaoMap=" + situacaoMap + "]";
	}

}
