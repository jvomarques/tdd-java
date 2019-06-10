package com.java.tdd.entidades;

import java.util.ArrayList;
import java.util.Date;

public class Locacao {

	private Usuario usuario;
	private ArrayList<Filme> filmes;
	private Date dataLocacao;
	private Date dataRetorno;
	private Double valor;
	
	public Locacao() {
		this.filmes = new ArrayList<Filme>();
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Date getDataLocacao() {
		return dataLocacao;
	}
	
	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	
	public Date getDataRetorno() {
		return dataRetorno;
	}
	
	public void setDataRetorno(Date dataRetorno) {
		this.dataRetorno = dataRetorno;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public ArrayList<Filme> getFilmes() {
		return filmes;
	}
	
	public void addFilme(Filme filme) {
		this.filmes.add(filme);
	}
	
}