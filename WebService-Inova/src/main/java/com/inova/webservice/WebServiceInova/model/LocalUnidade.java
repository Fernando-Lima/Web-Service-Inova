package com.inova.webservice.WebServiceInova.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class LocalUnidade extends MinhaEntidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String endereco;

	@NotNull
	@ManyToOne
	private Unidade unidadeCliente;

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

	public Unidade getUnidadeCliente() {
		return unidadeCliente;
	}

	public void setUnidadeCliente(Unidade unidadeCliente) {
		this.unidadeCliente = unidadeCliente;
	}
	
	
}
