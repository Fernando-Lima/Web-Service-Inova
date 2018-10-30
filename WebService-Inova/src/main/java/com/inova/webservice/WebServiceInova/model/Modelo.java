package com.inova.webservice.WebServiceInova.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Modelo extends MinhaEntidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private String modelo;
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
