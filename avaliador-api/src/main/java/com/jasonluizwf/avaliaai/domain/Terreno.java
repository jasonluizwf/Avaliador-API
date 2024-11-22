package com.jasonluizwf.avaliaai.domain;

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


	public double getValorVenalDoTerreno(int topografiaChave, int pedologiaChave, int elementoDeProtecaoChave,
			int situacaoChave, int ocupacaoDoSoloChave, int redeDeAguaChave, int redeDeEsgotoChave,
			int redeEletricaChave, int redeTelefonicaChave, int galeriaPluviaisChave, int passeioCalcadaChave,
			int conservacaoDeViasPublicasChave, int limpezaPublicaChave, int situacaoDoLogradouroChave,
			int iluminacaoPublicaChave) {
		
		// FCM (fator corretivo medio)= (FC14+FC15+FC16+FC17+FC18+FC50+FC51+FC52+FC53+FC54+FC55+FC56+FC57+FC58+FC59+CATT)/15
		// CAT =  AREA TOTAL DO TERRENO EM M2 DIVIDIDO POR METRAGEM DE LINHA DE DIVISA (FRENTE) +
		// METRAGEM DA LINHA DE DIVISA COM O FUNDO DIVIDIDO POR 2 DIVIDIDO POR 100
		
		double coeficienteDeAproveitamentoTecnicoDoTerreno = (area / ((linhaDeDivisaFrente + linhaDeDivisaFundo) / 2) / 100);
	
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
		
		// pode haver problema aqui com CATT
		double fatorCorretivoMedio = ((fc14+fc15+fc16+fc17+fc18+fc50+fc51+fc52+fc53+fc54+fc55+fc56+fc57+fc58+fc59)/15) + coeficienteDeAproveitamentoTecnicoDoTerreno;
		
		
		// calcular  VVT = area * valor por localização * FCM
		// double valorVenalDoTerreno = (area *  * fatorCorretivoMedio);

		return 0.0;
	}

}