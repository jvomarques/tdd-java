package com.java.tdd.servicos;

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
}
