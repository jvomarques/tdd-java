package com.java.tdd.servicos;

import static com.java.tdd.utils.DataUtils.adicionarDias;

import java.util.Date;

import org.junit.Test;

import com.java.tdd.entidades.Filme;
import com.java.tdd.entidades.Locacao;
import com.java.tdd.entidades.Usuario;
import com.java.tdd.utils.DataUtils;

public class LocacaoService {
	
	public Locacao alugarFilme(Usuario usuario, Filme filme) {
		Locacao locacao = new Locacao();
		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		locacao.setValor(filme.getPrecoLocacao());

		//Entrega no dia seguinte
		Date dataEntrega = new Date();
		dataEntrega = adicionarDias(dataEntrega, 1);
		locacao.setDataRetorno(dataEntrega);
		
		//Salvando a locacao...	
		//TODO adicionar método para salvar
		
		return locacao;
	}
	
}