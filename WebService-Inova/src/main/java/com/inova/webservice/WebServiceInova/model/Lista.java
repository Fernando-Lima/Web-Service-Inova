package com.inova.webservice.WebServiceInova.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Lista extends MinhaEntidade{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private Integer ramal;
	
	@NotNull
	private Integer telefone;
	
	@NotNull
	private String responsavel;

	public Integer getRamal() {
		return ramal;
	}

	public void setRamal(Integer ramal) {
		this.ramal = ramal;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	
}
