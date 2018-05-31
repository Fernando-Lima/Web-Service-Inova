package com.inova.webservice.WebServiceInova.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.inova.webservice.WebServiceInova.model.LocalUnidade;

@RestController
@RequestMapping("/localUnidade")
public class LocalUnidadeResource extends GenericResource<LocalUnidade>{

}
