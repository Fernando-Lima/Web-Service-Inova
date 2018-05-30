package com.inova.webservice.WebServiceInova.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inova.webservice.WebServiceInova.model.Fornecedor;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorResource extends GenericResource<Fornecedor>{

}
