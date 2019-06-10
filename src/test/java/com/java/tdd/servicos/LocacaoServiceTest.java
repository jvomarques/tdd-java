package com.java.tdd.servicos;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import com.java.tdd.entidades.Filme;
import com.java.tdd.entidades.Locacao;
import com.java.tdd.entidades.Usuario;

public class LocacaoServiceTest {
	
	@Rule
	public ErrorCollector error = new ErrorCollector();

	@Test
	public void verificaSeOValorDeLocacaoEstaCorreto() throws Exception {
		//Cenario
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Usuario 1");
		
		ArrayList<Filme> filmes = new ArrayList<Filme>();
		Filme filme1 = new Filme("Filme 1", 0, 5.0);
		Filme filme2 = new Filme("Filme 2", 2, 5.0);
		filmes.add(filme1);
		filmes.add(filme2);
		Double valorLocacacaoEsperado = 10.0;
		
		
		//Acao
		Locacao locacao = service.alugarFilmes(usuario, filmes);
		Double valorLocacao = locacao.getValor();
		
		//Verificacao
		Assert.assertEquals(valorLocacacaoEsperado, valorLocacao);
	}
	
	@Test
	public void verificaSeUmFilmeSemEstoqueEstaSendoAlugado() {
		
	}
	
	@Test
	public void exemplosDeAsserts() throws Exception {
		
		//Cenario
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Usuario 1");
		
		ArrayList<Filme> filmes = new ArrayList<Filme>();
		Filme filme1 = new Filme("Filme 1", 2, 5.0);
		Filme filme2 = new Filme("Filme 2", 2, 5.0);
		filmes.add(filme1);
		filmes.add(filme2);
		Double valorLocacacaoEsperado = 10.0;
		
		
		//Acao
		Locacao locacao = service.alugarFilmes(usuario, filmes);
		Double valorLocacao = locacao.getValor();
		
		//Com o assertThat, a leitura do teste fica mais simplificada. "Verifique que...
		assertThat(valorLocacao, is(valorLocacacaoEsperado));
		assertThat(valorLocacao, is(equalTo(valorLocacacaoEsperado)));
		
		//Utilizando @Rule pode-se criar uma regra de verificação onde todos os testes serão feitos 
		//em um única rodada, mesmo que um teste falhe
		error.checkThat(valorLocacao, is(valorLocacacaoEsperado));
	}
}
