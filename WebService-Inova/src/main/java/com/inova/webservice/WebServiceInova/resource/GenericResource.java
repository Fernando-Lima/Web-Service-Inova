package com.inova.webservice.WebServiceInova.resource;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inova.webservice.WebServiceInova.DAO.DAO;
import com.inova.webservice.WebServiceInova.model.MinhaEntidade;

public class GenericResource <T extends MinhaEntidade>{
	
	@Autowired
	private DAO<T> dao;;

	@PostMapping
	public T salvar(@RequestBody @Valid T entity) {
		return dao.save(entity); 
	}
	
	@GetMapping
	public @ResponseBody List<T> listar(){
		return dao.findAll();
	}
	
	@DeleteMapping("/{codigo}")
	public void excluir(@PathVariable Long codigo) {
		dao.deleteById(codigo);
	}
	
	@GetMapping("/{codigo}")
	public Optional<T> buscar(@PathVariable Long codigo){
		return dao.findById(codigo);
	}
	
	@PutMapping("/{codigo}")
	public T atualizar(@PathVariable Long codigo,@Valid @RequestBody T entity ){
		return dao.save(entity);
	}
}
