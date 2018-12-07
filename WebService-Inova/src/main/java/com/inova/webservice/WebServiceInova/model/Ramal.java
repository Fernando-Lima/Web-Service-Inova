package com.inova.webservice.WebServiceInova.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Ramal extends MinhaEntidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private Integer ramal;
	//fazer o relacionamento com o setor cliente;
	private SetorCliente setorCliente;

	public Integer getRamal() {
		return ramal;
	}

	public void setRamal(Integer ramal) {
		this.ramal = ramal;
	}

	public SetorCliente getSetorCliente() {
		return setorCliente;
	}

	public void setSetorCliente(SetorCliente setorCliente) {
		this.setorCliente = setorCliente;
	}
	
	
	
}
