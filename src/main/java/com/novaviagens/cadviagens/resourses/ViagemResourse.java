package com.novaviagens.cadviagens.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.novaviagens.cadviagens.entities.Viagem;
import com.novaviagens.cadviagens.services.ViagemService;

@RestController
@RequestMapping("/minhasviagens")
public class ViagemResourse {
	
	
	@Autowired
	private ViagemService service;
	
	@GetMapping
	public List<Viagem> findAll(){
		return service.findAll();
		
	}

}
