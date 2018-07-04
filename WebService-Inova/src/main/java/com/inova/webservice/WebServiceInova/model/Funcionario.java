package com.inova.webservice.WebServiceInova.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Funcionario extends MinhaEntidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private String nome;
	
	@NotNull
	private String email;
	
	@NotNull
	@Column(unique=true)
	private Long cpf;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataNascimento;
	
	private Long telefone;
	
	@NotNull
	private Long celular;
	
	private Integer ramal;
	
	private String usuario;
	
	private String senha;
	
	@ManyToOne
	@NotNull
	private Setor setor;
	
	@ManyToOne
	@NotNull
	private Cargo cargo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Long getCpf() {
		return cpf;
	}
	
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = new Date();
	}
	
	public Long getTelefone() {
		return telefone;
	}
	
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	
	public Long getCelular() {
		return celular;
	}
	
	public void setCelular(Long celular) {
		this.celular = celular;
	}
	
	public Integer getRamal() {
		return ramal;
	}
	
	public void setRamal(Integer ramal) {
		this.ramal = ramal;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Setor getSetor() {
		return setor;
	}
	
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	
}
