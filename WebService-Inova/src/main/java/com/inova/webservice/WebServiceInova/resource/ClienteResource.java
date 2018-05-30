package com.inova.webservice.WebServiceInova.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inova.webservice.WebServiceInova.model.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteResource extends GenericResource<Cliente>{

}
