package com.inova.webservice.WebServiceInova.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inova.webservice.WebServiceInova.model.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioResource extends GenericResource<Usuario> {

}
