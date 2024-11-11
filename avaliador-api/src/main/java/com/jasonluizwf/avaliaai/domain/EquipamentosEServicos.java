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
	Map<Integer, Double> situacaoDoLogradouroMap = new HashMap<>();
	Map<Integer, Double> iluminacaoPublicaMap = new HashMap<>();

	public EquipamentosEServicos(Map<Integer, Double> redeDeAguaMap, Map<Integer, Double> redeDeEsgotoMap,
			Map<Integer, Double> redeEletricaMap, Map<Integer, Double> redeTelefonicaMap,
			Map<Integer, Double> galeriasPluviaisMap, Map<Integer, Double> passeioCalcadaMap,
			Map<Integer, Double> conservacaoDeViasPublicasMap, Map<Integer, Double> limpezaPublicaMap,
			Map<Integer, Double> situacaoDoLogradouroMap, Map<Integer, Double> iluminacaoPublicaMap) {
		super();
		this.redeDeAguaMap = redeDeAguaMap;
		this.redeDeEsgotoMap = redeDeEsgotoMap;
		this.redeEletricaMap = redeEletricaMap;
		this.redeTelefonicaMap = redeTelefonicaMap;
		this.galeriasPluviaisMap = galeriasPluviaisMap;
		this.passeioCalcadaMap = passeioCalcadaMap;
		this.conservacaoDeViasPublicasMap = conservacaoDeViasPublicasMap;
		this.limpezaPublicaMap = limpezaPublicaMap;
		this.situacaoDoLogradouroMap = situacaoDoLogradouroMap;
		this.iluminacaoPublicaMap = iluminacaoPublicaMap;

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

		situacaoDoLogradouroMap.put(0, 100.0);
		situacaoDoLogradouroMap.put(1, 115.0);
		situacaoDoLogradouroMap.put(2, 130.0);

		iluminacaoPublicaMap.put(0, 100.0);
		iluminacaoPublicaMap.put(1, 115.0);
		iluminacaoPublicaMap.put(2, 130.0);

	}

	public double getRedeDeAguaMap(int chave) {
		return redeDeAguaMap.get(chave);
	}

	public double getRedeDeEsgotoMap(int chave) {
		return redeDeEsgotoMap.get(chave);
	}

	public double getRedeEletricaMap(int chave) {
		return redeEletricaMap.get(chave);
	}

	public double getRedeTelefonicaMap(int chave) {
		return redeTelefonicaMap.get(chave);
	}

	public double getGaleriasPluviaisMap(int chave) {
		return galeriasPluviaisMap.get(chave);
	}

	public double getPasseioCalcadaMap(int chave) {
		return passeioCalcadaMap.get(chave);
	}

	public double getConservacaoDeViasPublicasMap(int chave) {
		return conservacaoDeViasPublicasMap.get(chave);
	}

	public double getLimpezaPublicaMap(int chave) {
		return limpezaPublicaMap.get(chave);
	}

	public double getSituacaoDoLogradouroMap(int chave) {
		return situacaoDoLogradouroMap.get(chave);
	}

	public double getIluminacaoPublicaMap(int chave) {
		return iluminacaoPublicaMap.get(chave);
	}

	@Override
	public String toString() {
		return "EquipamentosEServicos [redeDeAguaMap=" + redeDeAguaMap + ", redeDeEsgotoMap=" + redeDeEsgotoMap
				+ ", redeEletricaMap=" + redeEletricaMap + ", redeTelefonicaMap=" + redeTelefonicaMap
				+ ", galeriasPluviaisMap=" + galeriasPluviaisMap + ", passeioCalcadaMap=" + passeioCalcadaMap
				+ ", conservacaoDeViasPublicasMap=" + conservacaoDeViasPublicasMap + ", limpezaPublicaMap="
				+ limpezaPublicaMap + ", situacaoDoLogradouroMap=" + situacaoDoLogradouroMap + ", iluminacaoPublicaMap="
				+ iluminacaoPublicaMap + "]";
	}

}
