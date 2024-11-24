package com.jasonluizwf.avaliaai.controller;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jasonluizwf.avaliaai.domain.SetorCentral;
import com.jasonluizwf.avaliaai.service.GerenciadorDeSetores;

@RestController
@RequestMapping("/setores")
public class SetorController {

	private final GerenciadorDeSetores gerenciador;

	public SetorController(GerenciadorDeSetores gerenciador) {
		this.gerenciador = gerenciador;
	}

	@GetMapping
	public Map<String, Map<String, Map<String, Double>>> listarSetores() {
		return gerenciador.getTodosSetores().entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().getRua()));
	}
	
	@GetMapping("/{setor}/{rua}/{quadra}")
	public Double buscarValorQuadra(
	        @PathVariable String setor,
	        @PathVariable String rua,
	        @PathVariable String quadra) {

	    // Busca o setor
	    SetorCentral setorCentral = gerenciador.getSetor(setor);

	    if (setorCentral == null) {
	        throw new IllegalArgumentException("Setor não encontrado");
	    }

	    // Busca o mapa da rua
	    Map<String, Double> ruaMap = setorCentral.getRua().get(rua);

	    if (ruaMap == null) {
	        throw new IllegalArgumentException("Rua não encontrada no setor");
	    }

	    // Busca o valor da quadra
	    Double valorQuadra = ruaMap.get(quadra);

	    if (valorQuadra == null) {
	        throw new IllegalArgumentException("Quadra não encontrada na rua");
	    }

	    return valorQuadra;
	}
}