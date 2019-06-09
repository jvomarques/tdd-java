package com.java.tdd.servicos;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import com.java.tdd.entidades.Filme;
import com.java.tdd.entidades.Locacao;
import com.java.tdd.entidades.Usuario;

public class LocacaoServiceTest {

	@Test
	public void verificaSeOValorDeLocacaoEstaCorreto() {
		//cenario
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Usuario 1");
		Filme filme = new Filme("Filme 1", 2, 5.0);
		Double valorLocacacaoEsperado = 5.0;
		
		
		//acao
		Locacao locacao = service.alugarFilme(usuario, filme);
		Double valorLocacao = locacao.getValor();
		
		//verificacao
		Assert.assertEquals(valorLocacacaoEsperado, valorLocacao);
	}
	
	@Test
	public void exemplosDeAsserts() {
		
		//Cenario
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Usuario 1");
		Filme filme = new Filme("Filme 1", 2, 5.0);
		Double valorLocacacaoEsperado = 5.0;
		
		
		//Acao
		Locacao locacao = service.alugarFilme(usuario, filme);
		Double valorLocacao = locacao.getValor();
		
		//Com o assertThat, a leitura do teste fica mais simplificada. "Verifique que...
		assertThat(valorLocacao, is(valorLocacacaoEsperado));
	}
}
