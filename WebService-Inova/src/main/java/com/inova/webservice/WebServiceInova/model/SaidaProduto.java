package com.inova.webservice.WebServiceInova.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class SaidaProduto extends MinhaEntidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private Date dataSaida;
	
	@ManyToOne
	private Produto produto;
	
	@ManyToOne
	@NotNull
	private Setor setor;
	
	public Date getDataSaida() {
		return dataSaida;
	}
	
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto (Produto produto) {
		this.produto = produto;
	}
	
	public Setor getSetor() {
		return setor;
	}
	
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
}
