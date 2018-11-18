package com.inova.webservice.WebServiceInova.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Setor extends MinhaEntidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private String nome;
	
	@ManyToOne
	@NotNull
	private Unidade unidade; // Empresa
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	
	public Unidade getUnidade() {
		return unidade;
	}
}
