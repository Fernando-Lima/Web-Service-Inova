package com.inova.webservice.WebServiceInova.model;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
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
	@NotNull
	private LocalUnidade localUnidade;

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
	
}
