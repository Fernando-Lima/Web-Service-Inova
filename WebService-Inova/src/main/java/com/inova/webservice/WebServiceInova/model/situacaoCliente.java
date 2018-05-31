package com.inova.webservice.WebServiceInova.model;

public enum situacaoCliente {
	ATIVO ("Ativo"),
	INATIVO("Inativo");
	
	private String descricao;
	
	private situacaoCliente(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	
}
