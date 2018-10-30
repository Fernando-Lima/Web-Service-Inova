package com.inova.webservice.WebServiceInova.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inova.webservice.WebServiceInova.model.Modelo;

@RestController
@RequestMapping("/modelo")
public class ModeloResource extends GenericResource<Modelo> {

}
