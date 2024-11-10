package com.jasonluizwf.avaliaai.domain;

import java.util.HashMap;
import java.util.Map;

public class ElementoDeProtecao {
	Map<Integer, Double> elementoDeProtecaoMap = new HashMap<>();

	public ElementoDeProtecao(Map<Integer, Double> elementoDeProtecaoMap) {
		super();
		this.elementoDeProtecaoMap = elementoDeProtecaoMap;
		elementoDeProtecaoMap.put(1, 140.0);
		elementoDeProtecaoMap.put(2, 130.0);
		elementoDeProtecaoMap.put(3, 120.0);
		elementoDeProtecaoMap.put(4, 110.0);
		elementoDeProtecaoMap.put(5, 100.0);
	}

	public Map<Integer, Double> getElementoDeProtecaoMap() {
		return elementoDeProtecaoMap;
	}

	@Override
	public String toString() {
		return "ElementoDeProtecao [elementoDeProtecaoMap=" + elementoDeProtecaoMap + "]";
	}

}
