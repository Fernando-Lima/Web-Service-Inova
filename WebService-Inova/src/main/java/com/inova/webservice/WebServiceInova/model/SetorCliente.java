package com.inova.webservice.WebServiceInova.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class SetorCliente extends MinhaEntidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String nome;
	
	@ManyToOne
	private LocalUnidade localUnidade;
	
	//carregar uma lista de produtos dentro do setor
	@OneToMany
	private List<Produto> produtos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalUnidade getLocalUnidade() {
		return localUnidade;
	}

	public void setLocalUnidade(LocalUnidade localUnidade) {
		this.localUnidade = localUnidade;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
}
