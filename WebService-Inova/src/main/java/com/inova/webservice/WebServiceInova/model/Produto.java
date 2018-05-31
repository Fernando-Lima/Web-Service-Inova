package com.inova.webservice.WebServiceInova.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Produto extends MinhaEntidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String nome;
	
	@Column(unique=true, length = 30)
	private Long patrimonio;
	
	@NotNull
	private String descricao;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP) // Cria a o campo datatype da tabela como Datatime, retorna data e hora
	private Date dataCompra;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP) // Cria a o campo datatype da tabela como Datatime, retorna data e hora
	private Date garantia;
	
	@ManyToOne
	private SetorCliente setorCliente;
	
	@ManyToOne
	private Fornecedor fornecedor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(Long patrimonio) {
		this.patrimonio = patrimonio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = new Date();
	}

	public Date getGarantia() {
		return garantia;
	}

	public void setGarantia(Date garantia) {
		this.garantia = new Date();
	}

	public SetorCliente getSetorCliente() {
		return setorCliente;
	}

	public void setSetorCliente(SetorCliente setorCliente) {
		this.setorCliente = setorCliente;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}
