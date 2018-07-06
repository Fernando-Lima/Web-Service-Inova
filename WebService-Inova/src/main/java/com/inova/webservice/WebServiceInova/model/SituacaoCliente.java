package com.inova.webservice.WebServiceInova.model;

public enum SituacaoCliente {
	ATIVO ("Ativo"),
	INATIVO("Inativo");
	
	private String descricao;
	
	private SituacaoCliente(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	
}
