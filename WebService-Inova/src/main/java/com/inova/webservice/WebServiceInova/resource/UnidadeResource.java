package com.inova.webservice.WebServiceInova.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inova.webservice.WebServiceInova.model.Empresa;
import com.inova.webservice.WebServiceInova.model.Unidade;

@RestController
@RequestMapping("/unidade")
public class UnidadeResource extends GenericResource<Unidade> {

}
