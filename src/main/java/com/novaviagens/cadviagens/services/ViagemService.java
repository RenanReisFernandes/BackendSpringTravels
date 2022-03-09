package com.novaviagens.cadviagens.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.novaviagens.cadviagens.entities.Viagem;
import com.novaviagens.cadviagens.repositories.ViagemRepository;

@Service
public class ViagemService {
	
	@Autowired
	private ViagemRepository repository;
	
	@Transactional (readOnly = true)
	public List<Viagem> findAll(){
		List<Viagem> resultado = repository.findAll();
		return resultado;
	}

}
