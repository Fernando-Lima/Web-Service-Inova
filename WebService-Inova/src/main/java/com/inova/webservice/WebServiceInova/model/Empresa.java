package com.inova.webservice.WebServiceInova.model;

public class Empresa extends MinhaEntidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nome;
	private String endereco;
	private Cidade cidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}
