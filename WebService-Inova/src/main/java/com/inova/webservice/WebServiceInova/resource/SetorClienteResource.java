package com.inova.webservice.WebServiceInova.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inova.webservice.WebServiceInova.model.SetorCliente;

@RestController
@RequestMapping("/setorCliente")
public class SetorClienteResource extends GenericResource<SetorCliente>{

}
