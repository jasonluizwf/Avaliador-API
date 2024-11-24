package com.jasonluizwf.avaliaai.domain;

import com.jasonluizwf.avaliaai.service.GerenciadorDeSetores;

public class Terreno {

	private double area;
	private double valorDoMetroQuadrado;
	private double linhaDeDivisaFrente;
	private double linhaDeDivisaFundo;
	private Topografia topografia;
	private Pedologia pedologia;
	private ElementoDeProtecao elementoDeProtecao;
	private SituacaoDoTerreno situacao;
	private OcupacaoDoSolo ocupacaoDoSolo;
	private EquipamentosEServicos equipamentosEServicos;
	private GerenciadorDeSetores gerenciadorDeSetores;

	// Construtor
	public Terreno(double area, double linhaDeDivisaFrente, double linhaDeDivisaFundo,
			GerenciadorDeSetores gerenciadorDeSetores) {
		this.area = area;
		this.linhaDeDivisaFrente = linhaDeDivisaFrente;
		this.linhaDeDivisaFundo = linhaDeDivisaFundo;
		this.gerenciadorDeSetores = gerenciadorDeSetores;
	}

	public double getValorVenalDoTerreno(String setor, String rua, String quadra, int topografiaChave,
			int pedologiaChave, int elementoDeProtecaoChave, int situacaoChave, int ocupacaoDoSoloChave,
			int redeDeAguaChave, int redeDeEsgotoChave, int redeEletricaChave, int redeTelefonicaChave,
			int galeriaPluviaisChave, int passeioCalcadaChave, int conservacaoDeViasPublicasChave,
			int limpezaPublicaChave, int situacaoDoLogradouroChave, int iluminacaoPublicaChave) {

		// Cálculo do Coeficiente de Aproveitamento Técnico do Terreno
		double coeficienteDeAproveitamentoTecnicoDoTerreno = (area / ((linhaDeDivisaFrente + linhaDeDivisaFundo) / 2)
				/ 100);

		// Fatores Corretivos
		double fc14 = topografia.getTopografiaDoTerrenoMap(topografiaChave);
		double fc15 = pedologia.getPedologiaMap(pedologiaChave);
		double fc16 = elementoDeProtecao.getElementoDeProtecaoMap(elementoDeProtecaoChave);
		double fc17 = situacao.getSituacaoMap(situacaoChave);
		double fc18 = ocupacaoDoSolo.getocupacaoDoSoloMap(ocupacaoDoSoloChave);
		double fc50 = equipamentosEServicos.getRedeDeAguaMap(redeDeAguaChave);
		double fc51 = equipamentosEServicos.getRedeDeEsgotoMap(redeDeEsgotoChave);
		double fc52 = equipamentosEServicos.getRedeEletricaMap(redeEletricaChave);
		double fc53 = equipamentosEServicos.getRedeTelefonicaMap(redeTelefonicaChave);
		double fc54 = equipamentosEServicos.getGaleriasPluviaisMap(galeriaPluviaisChave);
		double fc55 = equipamentosEServicos.getPasseioCalcadaMap(passeioCalcadaChave);
		double fc56 = equipamentosEServicos.getConservacaoDeViasPublicasMap(conservacaoDeViasPublicasChave);
		double fc57 = equipamentosEServicos.getLimpezaPublicaMap(limpezaPublicaChave);
		double fc58 = equipamentosEServicos.getSituacaoDoLogradouroMap(situacaoDoLogradouroChave);
		double fc59 = equipamentosEServicos.getIluminacaoPublicaMap(iluminacaoPublicaChave);

		// Fator Corretivo Médio (FCM)
		double fatorCorretivoMedio = ((fc14 + fc15 + fc16 + fc17 + fc18 + fc50 + fc51 + fc52 + fc53 + fc54 + fc55 + fc56
				+ fc57 + fc58 + fc59) / 15) + coeficienteDeAproveitamentoTecnicoDoTerreno;

		// Valor por Localização
		Double valorPorLocalizacao = gerenciadorDeSetores.obterValorPorLocalizacao(setor, rua, quadra);
		if (valorPorLocalizacao == null) {
			throw new IllegalArgumentException("Valor por localização não encontrado para os parâmetros fornecidos.");
		}

		// Valor Venal do Terreno (VTT)
		double vtt = area * valorPorLocalizacao * fatorCorretivoMedio;
		return vtt;
	}
	public double getValorDoMetroQuadradp(double area, double valorVenalDoTerreno) {
		return area / valorVenalDoTerreno;
	}
}
