package com.java.tdd.servicos;

import static com.java.tdd.utils.DataUtils.adicionarDias;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import com.java.tdd.entidades.Filme;
import com.java.tdd.entidades.Locacao;
import com.java.tdd.entidades.Usuario;
import com.java.tdd.utils.DataUtils;

public class LocacaoService {
	
	public Locacao alugarFilmes(Usuario usuario, ArrayList<Filme> filmes) throws Exception {
		
		Locacao locacao = new Locacao();
		Double valorTotalLocacao = 0.0;
		
		for(int i = 0; i < filmes.size();i++) {
			
			if(filmes.get(i).getEstoque() <= 0)
				throw new Exception(filmes.get(i).getNome() + " não está disponíel em estoque.");
			
			locacao.addFilme(filmes.get(i));
			valorTotalLocacao += filmes.get(i).getPrecoLocacao();
		}
		
		locacao.setValor(valorTotalLocacao);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		

		//Entrega no dia seguinte
		Date dataEntrega = new Date();
		dataEntrega = adicionarDias(dataEntrega, 1);
		locacao.setDataRetorno(dataEntrega);
		
		//Salvando a locacao...	
		//TODO adicionar mÃ©todo para salvar
		
		return locacao;
	}
	
}