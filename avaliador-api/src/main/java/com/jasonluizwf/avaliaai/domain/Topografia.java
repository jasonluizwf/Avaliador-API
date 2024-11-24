package com.jasonluizwf.avaliaai.domain;

import java.util.HashMap;
import java.util.Map;

public class Topografia {
	private Map<Integer, Double> topografiaMap;

	public Topografia(Map<Integer, Double> topografiaMap) {
	    if (topografiaMap == null) {
	        topografiaMap = new HashMap<>();
	    }
	    // Inicializa o mapa com os valores padrões
	    topografiaMap.put(1, 115.0);
	    topografiaMap.put(2, 100.0);
	    topografiaMap.put(3, 130.0);
	    topografiaMap.put(4, 85.0);
	    topografiaMap.put(5, 115.0);
	    this.topografiaMap = topografiaMap;
	}

	public double getTopografiaDoTerrenoMap(int chave) {
	    Double valor = topografiaMap.get(chave);
	    if (valor == null) {
	        throw new IllegalArgumentException("Chave não encontrada na topografia: " + chave);
	    }
	    return valor;
	}

	@Override
	public String toString() {
		return "Topografia [topografiaMap=" + topografiaMap + "]";
	}
}