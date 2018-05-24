package com.inova.webservice.WebServiceInova.resource;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.inova.webservice.WebServiceInova.model.Lista;
import com.inova.webservice.WebServiceInova.service.ListaService;

@RestController
@RequestMapping("/lista")
public class ListaResource {
	
	@Autowired
	ListaService listaService;

	@PostMapping
	public Lista salvar(@RequestBody @Valid Lista lista) {
		return listaService.salvar(lista); 
	}
	@GetMapping
	public @ResponseBody Iterable<Lista> listar(){
		Iterable<Lista> listas = listaService.listar();
		return listas;
	}
	@DeleteMapping("/{codigo}")
	public void excluir(@PathVariable Long codigo) {
		listaService.excluir(codigo);
	}
	
	@GetMapping("{codigo}")
	public ResponseEntity<?> buscar(@PathVariable("codigo") Long codigo){
		
		Lista lista = listaService.buscar(codigo);
		
		if(lista == null) {
			ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<Lista> atualizar(@PathVariable Long codigo, @Valid @RequestBody Lista lista){
		
		Lista existente = listaService.buscar(codigo);
		
		if(existente == null) {
			ResponseEntity.notFound().build();
		}
		
		BeanUtils.copyProperties(lista,existente,"codigo");
		
		listaService.salvar(existente);
		
		return ResponseEntity.ok(existente);
	}
}
