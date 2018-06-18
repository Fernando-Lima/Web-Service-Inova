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
	private Setor setor;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	
	public Setor getSetor() {
		return setor;
	}
}
