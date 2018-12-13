package com.inova.webservice.WebServiceInova.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Ramal extends MinhaEntidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private Integer ramal;
	@ManyToMany(targetEntity=SetorCliente.class)
	private List<SetorCliente> setorCliente;

	public Integer getRamal() {
		return ramal;
	}

	public void setRamal(Integer ramal) {
		this.ramal = ramal;
	}

	public List<SetorCliente> getSetorCliente() {
		return setorCliente;
	}

	public void setSetorCliente(List<SetorCliente> setorCliente) {
		this.setorCliente = setorCliente;
	}
	
	
	
}
