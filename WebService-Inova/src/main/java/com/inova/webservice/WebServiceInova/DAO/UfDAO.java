package com.inova.webservice.WebServiceInova.DAO;

import com.inova.webservice.WebServiceInova.model.Uf;

public interface UfDAO extends DAO<Uf>{

	public default void teste() {
		System.out.println("TESTE");
	}
}
