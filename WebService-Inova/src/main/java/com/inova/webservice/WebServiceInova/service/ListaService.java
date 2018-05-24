package com.inova.webservice.WebServiceInova.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inova.webservice.WebServiceInova.model.Lista;
import com.inova.webservice.WebServiceInova.repository.ListaRepository;

@Service
public class ListaService {
	
	@Autowired
	ListaRepository listaRepository;

	public Lista salvar(Lista lista) {
		return listaRepository.save(lista);
	}
	
	public List<Lista> listar(){
		return listaRepository.findAll();
	}
	
	public void excluir(Long codigo) {
		listaRepository.deleteById(codigo);
	}
	public Lista buscar(Long codigo) {
		Optional<Lista> lista = listaRepository.findById(codigo);
		Lista lis = new Lista();
		lis.setCodigo(lista.get().getCodigo());
		lis.setRamal(lista.get().getRamal());
		lis.setTelefone(lista.get().getTelefone());
		lis.setResponsavel(lista.get().getResponsavel());
		return lis;
	}

}
