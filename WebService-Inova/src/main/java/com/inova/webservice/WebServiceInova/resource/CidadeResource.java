package com.inova.webservice.WebServiceInova.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inova.webservice.WebServiceInova.model.Cidade;

@RestController
@RequestMapping("/cidade")
public class CidadeResource extends GenericResource<Cidade>{

}
