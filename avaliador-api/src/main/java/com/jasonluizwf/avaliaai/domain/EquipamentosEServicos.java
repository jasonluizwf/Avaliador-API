package com.jasonluizwf.avaliaai.domain;

import java.util.HashMap;
import java.util.Map;

public class EquipamentosEServicos {
	Map<Integer, Double> redeDeAguaMap = new HashMap<>();
	Map<Integer, Double> redeDeEsgotoMap = new HashMap<>();
	Map<Integer, Double> redeEletricaMap = new HashMap<>();
	Map<Integer, Double> redeTelefonicaMap = new HashMap<>();
	Map<Integer, Double> galeriasPluviaisMap = new HashMap<>();
	Map<Integer, Double> passeioCalcadaMap = new HashMap<>();
	Map<Integer, Double> conservacaoDeViasPublicasMap = new HashMap<>();
	Map<Integer, Double> limpezaPublicaMap = new HashMap<>();
	Map<Integer, Double> situacaoDoLogradouro = new HashMap<>();
	Map<Integer, Double> iluminacaoPublica = new HashMap<>();

	public EquipamentosEServicos(Map<Integer, Double> redeDeAguaMap, Map<Integer, Double> redeDeEsgotoMap,
			Map<Integer, Double> redeEletricaMap, Map<Integer, Double> redeTelefonicaMap,
			Map<Integer, Double> galeriasPluviaisMap, Map<Integer, Double> passeioCalcadaMap,
			Map<Integer, Double> conservacaoDeViasPublicasMap, Map<Integer, Double> limpezaPublicaMap,
			Map<Integer, Double> situacaoDoLogradouro, Map<Integer, Double> iluminacaoPublica) {
		super();
		this.redeDeAguaMap = redeDeAguaMap;
		this.redeDeEsgotoMap = redeDeEsgotoMap;
		this.redeEletricaMap = redeEletricaMap;
		this.redeTelefonicaMap = redeTelefonicaMap;
		this.galeriasPluviaisMap = galeriasPluviaisMap;
		this.passeioCalcadaMap = passeioCalcadaMap;
		this.conservacaoDeViasPublicasMap = conservacaoDeViasPublicasMap;
		this.limpezaPublicaMap = limpezaPublicaMap;
		this.situacaoDoLogradouro = situacaoDoLogradouro;
		this.iluminacaoPublica = iluminacaoPublica;

		redeDeAguaMap.put(1, 120.0);
		redeDeAguaMap.put(2, 100.0);

		redeDeEsgotoMap.put(1, 130.0);
		redeDeEsgotoMap.put(2, 100.0);

		redeEletricaMap.put(1, 120.0);
		redeEletricaMap.put(2, 100.0);

		redeTelefonicaMap.put(1, 110.0);
		redeTelefonicaMap.put(2, 100.0);

		galeriasPluviaisMap.put(1, 130.0);
		galeriasPluviaisMap.put(2, 100.0);

		passeioCalcadaMap.put(1, 120.0);
		passeioCalcadaMap.put(2, 100.0);

		conservacaoDeViasPublicasMap.put(1, 110.0);
		conservacaoDeViasPublicasMap.put(2, 100.0);

		limpezaPublicaMap.put(1, 115.0);
		limpezaPublicaMap.put(2, 100.0);

		situacaoDoLogradouro.put(0, 100.0);
		situacaoDoLogradouro.put(1, 115.0);
		situacaoDoLogradouro.put(2, 130.0);

		iluminacaoPublica.put(0, 100.0);
		iluminacaoPublica.put(1, 115.0);
		iluminacaoPublica.put(2, 130.0);

	}

	public Map<Integer, Double> getRedeDeAguaMap() {
		return redeDeAguaMap;
	}

	public Map<Integer, Double> getRedeDeEsgotoMap() {
		return redeDeEsgotoMap;
	}

	public Map<Integer, Double> getRedeEletricaMap() {
		return redeEletricaMap;
	}

	public Map<Integer, Double> getRedeTelefonicaMap() {
		return redeTelefonicaMap;
	}

	public Map<Integer, Double> getGaleriasPluviaisMap() {
		return galeriasPluviaisMap;
	}

	public Map<Integer, Double> getPasseioCalcadaMap() {
		return passeioCalcadaMap;
	}

	public Map<Integer, Double> getConservacaoDeViasPublicasMap() {
		return conservacaoDeViasPublicasMap;
	}

	public Map<Integer, Double> getLimpezaPublicaMap() {
		return limpezaPublicaMap;
	}

	public Map<Integer, Double> getSituacaoDoLogradouro() {
		return situacaoDoLogradouro;
	}

	public Map<Integer, Double> getIluminacaoPublica() {
		return iluminacaoPublica;
	}

	@Override
	public String toString() {
		return "EquipamentosEServicos [redeDeAguaMap=" + redeDeAguaMap + ", redeDeEsgotoMap=" + redeDeEsgotoMap
				+ ", redeEletricaMap=" + redeEletricaMap + ", redeTelefonicaMap=" + redeTelefonicaMap
				+ ", galeriasPluviaisMap=" + galeriasPluviaisMap + ", passeioCalcadaMap=" + passeioCalcadaMap
				+ ", conservacaoDeViasPublicasMap=" + conservacaoDeViasPublicasMap + ", limpezaPublicaMap="
				+ limpezaPublicaMap + ", situacaoDoLogradouro=" + situacaoDoLogradouro + ", iluminacaoPublica="
				+ iluminacaoPublica + "]";
	}

}
