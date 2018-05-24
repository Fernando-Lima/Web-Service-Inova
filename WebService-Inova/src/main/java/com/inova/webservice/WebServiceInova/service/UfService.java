package com.inova.webservice.WebServiceInova.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inova.webservice.WebServiceInova.model.Uf;
import com.inova.webservice.WebServiceInova.repository.UfRepository;

@Service
public class UfService {
	
	@Autowired
	UfRepository ufRepository;
	
	public Uf salvar(Uf uf) {
		return ufRepository.save(uf);
	}

	public void delete(Long codigo) {
		ufRepository.deleteById(codigo);
	}
	
	public List<Uf> listar(){
		return ufRepository.findAll();
	}
	
	public Uf buscar(Long codigo) {
		Optional<Uf> buscaUf = ufRepository.findById(codigo);
		Uf uf = new Uf();
		uf.setCodigo(buscaUf.get().getCodigo());
		uf.setNome(buscaUf.get().getNome());
		uf.setSigla(buscaUf.get().getSigla());
		return uf;
	} 
}
