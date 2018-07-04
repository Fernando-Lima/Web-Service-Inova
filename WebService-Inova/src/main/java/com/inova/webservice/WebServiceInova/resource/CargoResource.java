package com.inova.webservice.WebServiceInova.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inova.webservice.WebServiceInova.model.Cargo;

@RestController
@RequestMapping("/cargo")
public class CargoResource extends GenericResource<Cargo>{

}
