package com.inova.webservice.WebServiceInova.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Uf extends MinhaEntidade{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private String sigla;
	
	@NotNull
	private String nome;
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}

