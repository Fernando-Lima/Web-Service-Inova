package com.inova.webservice.WebServiceInova.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inova.webservice.WebServiceInova.model.Funcionario;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioResource extends GenericResource<Funcionario>{

}
