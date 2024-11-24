package com.jasonluizwf.avaliaai.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jasonluizwf.avaliaai.domain.SetorCentral;
import com.jasonluizwf.avaliaai.domain.Terreno;
import com.jasonluizwf.avaliaai.service.GerenciadorDeSetores;

@Configuration
public class DataLoader {

	@Bean
	CommandLineRunner loadData(GerenciadorDeSetores gerenciador) {
		return args -> {

			SetorCentral central = new SetorCentral();

			// Adicionar map de quadra

			central.setRuaPerimetralMap("M e I", 155.21);
			central.setRuaPerimetralMap("Demais Quadras", 155.21);

			central.setTravessaRuaUranoComJoseMartinsMap("M", 118.81);

			central.setRuaVereadorManoelRicardoMap("I", 476.33);
			central.setRuaVereadorManoelRicardoMap("D, E, L e M", 476.33);
			central.setRuaVereadorManoelRicardoMap("N e O", 155.21);

			central.setRuaJoseVieiraDaSilvaMap("H", 476.33);
			central.setRuaJoseVieiraDaSilvaMap("C e D", 662.32);
			central.setRuaJoseVieiraDaSilvaMap("K e L", 311.77);

			central.setRuaAntenorBorgesMap("B, C, G, H, K", 155.21);
			central.setRuaAntenorBorgesMap("Demais Quadras(Vênus)", 155.21);

			central.setRua15DeNovembroMap("A, B, F, G e J", 155.21);
			central.setRua15DeNovembroMap("Demais Quadras(Vênus)", 155.21);

			central.setRua02Map("J", 207.40);

			central.setRua04Map("A e F", 311.77);

			central.setRuaJoseMartinsMendesMap("J, K, M, N e O", 155.21);
			central.setRuaJoseMartinsMendesMap("Demais Quadras", 155.21);

			central.setRuaUranoJoseDeUrzedaMap("F e J", 155.21);
			central.setRuaUranoJoseDeUrzedaMap("G", 155.21);
			central.setRuaUranoJoseDeUrzedaMap("H e K", 155.21);
			central.setRuaUranoJoseDeUrzedaMap("L", 476.33);
			central.setRuaUranoJoseDeUrzedaMap("I e M", 155.21);
			central.setRuaUranoJoseDeUrzedaMap("Praça", 476.33);
			central.setRuaUranoJoseDeUrzedaMap("Demais Quadras", 155.21);

			central.setRuaJoaquimPiresDeOliveiraMap("A e F", 155.21);
			central.setRuaJoaquimPiresDeOliveiraMap("B e G", 155.21);
			central.setRuaJoaquimPiresDeOliveiraMap("C e H", 155.21);
			central.setRuaJoaquimPiresDeOliveiraMap("D", 476.33);
			central.setRuaJoaquimPiresDeOliveiraMap("E e I", 155.21);

			central.setRua13DeMaioMap("A", 155.21);
			central.setRua13DeMaioMap("B", 155.21);
			central.setRua13DeMaioMap("C e D", 155.21);
			central.setRua13DeMaioMap("E", 155.21);

			central.setDemaisLogradourosCentroMap("Todas as Quadras", 155.21);

			// Adicionar map de quadra a um map rua

			central.setRua("Rua Perimetral", central.getRuaPerimetralMap());
			central.setRua("Travessa Rua Urano Com Jose Martins", central.getTravessaRuaUranoComJoseMartinsMap());
			central.setRua("Rua Vereador Manoel Ricardo", central.getRuaVereadorManoelRicardoMap());
			central.setRua("Rua Jose Vieira Da Silva", central.getRuaJoseVieiraDaSilvaMap());
			central.setRua("Rua Antenor Borges", central.getRuaAntenorBorgesMap());
			central.setRua("Rua 15 De Novembro", central.getRua15DeNovembroMap());
			central.setRua("Rua 02", central.getRua02Map());
			central.setRua("Rua 04", central.getRua04Map());
			central.setRua("Rua Jose Martins Mendes", central.getRuaJoseMartinsMendesMap());
			central.setRua("Rua Urano Jose De Urzeda", central.getRuaUranoJoseDeUrzedaMap());
			central.setRua("Rua Joaquim Pires De Oliveira", central.getRuaJoaquimPiresDeOliveiraMap());
			central.setRua("Rua 13 De Maio", central.getRua13DeMaioMap());
			central.setRua("Demais Logradouros Centro", central.getDemaisLogradourosCentroMap());
			
	        gerenciador.adicionarSetor(central.getNome(), central);
	        
	        
	        Terreno terreno = new Terreno(200, 10, 10, gerenciador);
	        double valor = terreno.getValorVenalDoTerreno("Central", "Rua 15 De Novembro", "A, B, F, G e J", 
	        		1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 2, 1);
	        
	        System.out.println(valor);
		};
	}
}
