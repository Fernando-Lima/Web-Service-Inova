package com.inova.webservice.WebServiceInova.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.inova.webservice.WebServiceInova.DAO.UnidadeDAO;
import com.inova.webservice.WebServiceInova.model.Unidade;

@RestController
@RequestMapping("/unidade")
public class UnidadeResource extends GenericResource<Unidade> {
	
	@Autowired
	private UnidadeDAO unidadeDao;
	
	@GetMapping("/cliente/{codigo}")
	public @ResponseBody List<Unidade> listar(@PathVariable Long codigo){
		return unidadeDao.findByCLiente(codigo);
	}

}
