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

import com.inova.webservice.WebServiceInova.model.Uf;
import com.inova.webservice.WebServiceInova.service.UfService;

@RestController
@RequestMapping("/uf")
public class UfResourse {
	
	@Autowired
	UfService ufService;

	@PostMapping
	public Uf salvar(@RequestBody @Valid Uf uf) {
		return ufService.salvar(uf); 
	}
	@GetMapping
	public @ResponseBody Iterable<Uf> listar(){
		Iterable<Uf> listaUf = ufService.listar();
		return listaUf;
	}
	
	@DeleteMapping("/{codigo}")
	public void excluir(@PathVariable Long codigo) {
		ufService.excluir(codigo);
	}
	
	@GetMapping("{codigo}")
	public ResponseEntity<?> buscar(@PathVariable("codigo")Long codigo){
		
		Uf uf = ufService.buscar(codigo);
		
		if(uf == null) {
			ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(uf);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<Uf> atualizar(@PathVariable Long codigo,@Valid @RequestBody Uf uf ){
		
		Uf existente = ufService.buscar(codigo);
		
		if(existente == null) {
			ResponseEntity.notFound().build();
		}
		
		BeanUtils.copyProperties(uf, existente, "codigo");
		
		ufService.salvar(existente);
		return ResponseEntity.ok(existente);
	}
}
