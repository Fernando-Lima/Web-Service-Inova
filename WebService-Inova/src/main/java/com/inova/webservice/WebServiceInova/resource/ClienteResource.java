package com.inova.webservice.WebServiceInova.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inova.webservice.WebServiceInova.model.Cliente;
import com.inova.webservice.WebServiceInova.model.SituacaoCliente;

@RestController
@RequestMapping("/cliente")
public class ClienteResource extends GenericResource<Cliente>{
	
	@RequestMapping("/situacaoCliente")
	public List<SituacaoCliente> situacaoClientes () {
		List<SituacaoCliente> lista = Arrays.asList(SituacaoCliente.values());
		return lista;
	}

}
