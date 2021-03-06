package com.inova.webservice.WebServiceInova.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Produto extends MinhaEntidade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private String nome;

	@Column(unique = true, length = 30)
	private Long patrimonio;

	@NotNull
	private String descricao;

	@ManyToOne
	private Modelo modelo;

	@Column(unique = true)
	private String mac;

	@Column(unique = true)
	private String ns;

	@Temporal(TemporalType.TIMESTAMP) // Cria a o campo datatype da tabela como Datatime, retorna data e hora
	private Date garantia;

	@Temporal(TemporalType.TIMESTAMP) // Cria a o campo datatype da tabela como Datatime, retorna data e hora
	private Date dataEntrada; // dia em que foi dado entrada do produto

	@ManyToOne
	private Fornecedor fornecedor;

	@ManyToOne
	private Setor setor;

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

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		if(mac == "") {
			this.mac = null;
		}else {
			this.mac = mac.replaceAll(" ", "");
		}
	}

	public String getNs() {
		return ns;
	}

	public void setNs(String ns) {
		if(ns == "") {
			this.ns = null;
		}else{
			this.ns = ns.replaceAll(" ", "");
		}
	}

	public Date getGarantia() {
		return garantia;
	}

	public void setGarantia(Date garantia) {
		this.garantia = new Date();
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}
