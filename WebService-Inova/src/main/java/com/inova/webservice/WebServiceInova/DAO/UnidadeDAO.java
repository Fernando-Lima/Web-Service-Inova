package com.inova.webservice.WebServiceInova.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.inova.webservice.WebServiceInova.model.Unidade;

public interface UnidadeDAO extends DAO<Unidade>{

	@Query(value = "select * from unidade u where u.cliente_codigo = ?1",
			nativeQuery = true)
			List<Unidade> findByCLiente(Long codigo);
}
