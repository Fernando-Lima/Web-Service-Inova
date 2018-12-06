package com.inova.webservice.WebServiceInova.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inova.webservice.WebServiceInova.model.Empresa;

@RestController
@RequestMapping("/empresa")
public class EmpresaResource extends GenericResource<Empresa> {

}
