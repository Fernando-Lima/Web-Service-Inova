package com.inova.webservice.WebServiceInova.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inova.webservice.WebServiceInova.model.Produto;

@RestController
@RequestMapping("/produto")
public class ProdutoResource extends GenericResource<Produto>{

}
