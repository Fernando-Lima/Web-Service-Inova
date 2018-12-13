package com.inova.webservice.WebServiceInova.resource;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inova.webservice.WebServiceInova.DAO.DAO;
import com.inova.webservice.WebServiceInova.model.Ramal;
import com.inova.webservice.WebServiceInova.model.SetorCliente;

@RestController
@RequestMapping("/setorCliente")
public class SetorClienteResource extends GenericResource<SetorCliente>{
	
	@Autowired
	private DAO<SetorCliente> dao;
	
	@PostMapping
	public SetorCliente salvar(@RequestBody @Valid SetorCliente entity) {
		List<Ramal> ramais = new ArrayList<Ramal>();
		ramais.addAll(entity.getRamal());
		
		return dao.save(entity); 
	}

}
