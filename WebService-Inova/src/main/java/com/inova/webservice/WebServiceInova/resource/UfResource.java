package com.inova.webservice.WebServiceInova.resource;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inova.webservice.WebServiceInova.DAO.UfDAO;
import com.inova.webservice.WebServiceInova.model.Uf;

@RestController
@RequestMapping("/uf")
public class UfResource extends GenericResource<Uf>{
	
	@Autowired
	private UfDAO dao;
	
	@RequestMapping("/teste")
	@GetMapping
	public void teste() {
		dao.teste();
	}
	
}
