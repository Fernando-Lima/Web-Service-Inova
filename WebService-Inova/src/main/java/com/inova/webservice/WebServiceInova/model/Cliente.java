package com.inova.webservice.WebServiceInova.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Cliente extends MinhaEntidade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private String nome;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP) // Cria a o campo datatype da tabela como Datatime, retorna data e hora
	private Date data;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP) // Cria a o campo datatype da tabela como Datatime, retorna data e hora
	private Date dataInicioContrato;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP) // Cria a o campo datatype da tabela como Datatime, retorna data e hora
	private Date dataFinalContrato;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP) // Cria a o campo datatype da tabela como Datatime, retorna data e hora
	private Date sla;

	private Integer numeroAditivo;

	@NotNull
	@Column(unique=true, length = 14) // chave única da tupla da tabela e 14 caracteres
	private Long cnpj;

	@NotNull
	private String endereco;
	
	@Enumerated(EnumType.STRING)
	private situacaoCliente situacaoCliente;

	@NotNull
	@ManyToOne
	private Cidade cidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = new Date();
	}

	public Date getDataInicioContrato() {
		return dataInicioContrato;
	}

	public void setDataInicioContrato(Date dataInicioContrato) {
		this.dataInicioContrato = new Date();
	}

	public Date getDataFinalContrato() {
		return dataFinalContrato;
	}

	public void setDataFinalContrato(Date dataFinalContrato) {
		this.dataFinalContrato = new Date();
	}

	public Date getSla() {
		return sla;
	}

	public void setSla(Date sla) {
		this.sla = new Date();
	}

	public Integer getNumeroAditivo() {
		return numeroAditivo;
	}

	public void setNumeroAditivo(Integer numeroAditivo) {
		this.numeroAditivo = numeroAditivo;
	}

	public Long getCnpj() {
		return cnpj;
	}

	
	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public situacaoCliente getSituacaoCliente() {
		return situacaoCliente;
	}

	public void setSituacaoCliente(situacaoCliente situacaoCliente) {
		this.situacaoCliente = situacaoCliente;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}
