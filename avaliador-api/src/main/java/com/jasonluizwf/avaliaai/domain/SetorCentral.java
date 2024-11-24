package com.jasonluizwf.avaliaai.domain;

import java.util.HashMap;
import java.util.Map;

public class SetorCentral {

	private static final String NOME = "Central";

	// Map para todas as ruas do setor
	Map<String, Map<String, Map<String, Map<String, Double>>>> setor = new HashMap<>();

	// Map para todas as ruas
	Map<String, Map<String, Double>> rua = new HashMap<>();

	// Criando um mapa para a Rua
	Map<String, Double> ruaPerimetralMap = new HashMap<>();
	Map<String, Double> travessaRuaUranoComJoseMartinsMap = new HashMap<>();
	Map<String, Double> ruaVereadorManoelRicardoMap = new HashMap<>();
	Map<String, Double> ruaJoseVieiraDaSilvaMap = new HashMap<>();
	Map<String, Double> ruaAntenorBorgesMap = new HashMap<>();
	Map<String, Double> rua15DeNovembroMap = new HashMap<>();
	Map<String, Double> rua02Map = new HashMap<>();
	Map<String, Double> rua04Map = new HashMap<>();
	Map<String, Double> ruaJoseMartinsMendesMap = new HashMap<>();
	Map<String, Double> ruaUranoJoseDeUrzedaMap = new HashMap<>();
	Map<String, Double> ruaJoaquimPiresDeOliveiraMap = new HashMap<>();
	Map<String, Double> rua13DeMaioMap = new HashMap<>();
	Map<String, Double> demaisLogradourosCentroMap = new HashMap<>();

	public String getNome() {
		return NOME;
	}

	public Map<String, 
				Map<String, 
					Map<String, 
						Map<String, Double>>>> getSetor() {
		return setor;
	}

	public void setSetor(String nome, 
							Map<String, 
								Map<String, 
									Map<String, Double>>> setor) {
		this.setor.put(nome, setor);
	}

	public Map<String, Map<String, Double>> getRua() {
		return rua;
	}

	public void setRua(String nome, Map<String, Double> ruaMap) {
		this.rua.put(nome, ruaMap);
	}

	public Map<String, Double> getRuaPerimetralMap() {
		return ruaPerimetralMap;
	}

	public void setRuaPerimetralMap(String quadra, double valor) {
		this.ruaPerimetralMap.put(quadra, valor);
	}

	public Map<String, Double> getTravessaRuaUranoComJoseMartinsMap() {
		return travessaRuaUranoComJoseMartinsMap;
	}

	public void setTravessaRuaUranoComJoseMartinsMap(String quadra, double valor) {
		this.travessaRuaUranoComJoseMartinsMap.put(quadra, valor);
	}

	public Map<String, Double> getRuaVereadorManoelRicardoMap() {
		return ruaVereadorManoelRicardoMap;
	}

	public void setRuaVereadorManoelRicardoMap(String quadra, double valor) {
		this.ruaVereadorManoelRicardoMap.put(quadra, valor);
	}

	public Map<String, Double> getRuaJoseVieiraDaSilvaMap() {
		return ruaJoseVieiraDaSilvaMap;
	}

	public void setRuaJoseVieiraDaSilvaMap(String quadra, double valor) {
		this.ruaJoseVieiraDaSilvaMap.put(quadra, valor);
	}

	public Map<String, Double> getRuaAntenorBorgesMap() {
		return ruaAntenorBorgesMap;
	}

	public void setRuaAntenorBorgesMap(String quadra, double valor) {
		this.ruaAntenorBorgesMap.put(quadra, valor);
	}

	public Map<String, Double> getRua15DeNovembroMap() {
		return rua15DeNovembroMap;
	}

	public void setRua15DeNovembroMap(String quadra, double valor) {
		this.rua15DeNovembroMap.put(quadra, valor);
	}

	public Map<String, Double> getRua02Map() {
		return rua02Map;
	}

	public void setRua02Map(String quadra, double valor) {
		this.rua02Map.put(quadra, valor);
	}

	public Map<String, Double> getRua04Map() {
		return rua04Map;
	}

	public void setRua04Map(String quadra, double valor) {
		this.rua04Map.put(quadra, valor);
	}

	public Map<String, Double> getRuaJoseMartinsMendesMap() {
		return ruaJoseMartinsMendesMap;
	}

	public void setRuaJoseMartinsMendesMap(String quadra, double valor) {
		this.ruaJoseMartinsMendesMap.put(quadra, valor);
	}

	public Map<String, Double> getRuaUranoJoseDeUrzedaMap() {
		return ruaUranoJoseDeUrzedaMap;
	}

	public void setRuaUranoJoseDeUrzedaMap(String quadra, double valor) {
		this.ruaUranoJoseDeUrzedaMap.put(quadra, valor);
	}

	public Map<String, Double> getRuaJoaquimPiresDeOliveiraMap() {
		return ruaJoaquimPiresDeOliveiraMap;
	}

	public void setRuaJoaquimPiresDeOliveiraMap(String quadra, double valor) {
		this.ruaJoaquimPiresDeOliveiraMap.put(quadra, valor);
	}

	public Map<String, Double> getRua13DeMaioMap() {
		return rua13DeMaioMap;
	}

	public void setRua13DeMaioMap(String quadra, double valor) {
		this.rua13DeMaioMap.put(quadra, valor);
	}

	public Map<String, Double> getDemaisLogradourosCentroMap() {
		return demaisLogradourosCentroMap;
	}

	public void setDemaisLogradourosCentroMap(String quadra, double valor) {
		this.demaisLogradourosCentroMap.put(quadra, valor);
	}

}
