package com.jasonluizwf.avaliaai.service;

import org.springframework.stereotype.Service;

import com.jasonluizwf.avaliaai.domain.SetorCentral;

import java.util.HashMap;
import java.util.Map;

@Service
public class GerenciadorDeSetores {

	private final Map<String, SetorCentral> setores = new HashMap<>();

	public void adicionarSetor(String nome, SetorCentral setor) {
		setores.put(nome, setor);
	}

	public SetorCentral getSetor(String nome) {
		return setores.get(nome);
	}

	public Map<String, SetorCentral> getTodosSetores() {
		return setores;
	}

	public Double obterValorPorLocalizacao(String setor, String rua, String quadra) {
		// Verifica se o setor existe no mapa
		if (setores.containsKey(setor)) {
			SetorCentral setorCentral = setores.get(setor);
			Map<String, Map<String, Double>> ruas = setorCentral.getRua(); // Assume que SetorCentral possui um método
																			// getRuas()

			if (ruas.containsKey(rua)) {
				Map<String, Double> quadras = ruas.get(rua);

				if (quadras.containsKey(quadra)) {
					return quadras.get(quadra);
				} else {
					throw new IllegalArgumentException("Quadra não encontrada: " + quadra);
				}
			} else {
				throw new IllegalArgumentException("Rua não encontrada: " + rua);
			}
		} else {
			throw new IllegalArgumentException("Setor não encontrado: " + setor);
		}
	}
}
