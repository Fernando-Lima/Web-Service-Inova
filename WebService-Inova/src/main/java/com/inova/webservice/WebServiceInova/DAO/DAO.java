package com.inova.webservice.WebServiceInova.DAO;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inova.webservice.WebServiceInova.model.MinhaEntidade;

public interface DAO<T extends MinhaEntidade> extends  JpaRepository<T,Serializable>{

}
