package com.inova.webservice.WebServiceInova.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	private Unidade unidade;
	
	@ManyToMany(targetEntity=Ramal.class)
	private List<Ramal> ramal;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public List<Ramal> getRamal() {
		return ramal;
	}

	public void setRamal(List<Ramal> ramal) {
		this.ramal = ramal;
	}
	
	
}
