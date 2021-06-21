package com.java.docker.Application.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.docker.Application.model.Pessoa;
import com.java.docker.Application.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

	
	private PessoaRepository repository;
	
	
	public PessoaController(PessoaRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(value="/all", method = RequestMethod.GET)
	public List<Pessoa> getAll(){
		return repository.findAll();
	}
	
	@RequestMapping(value="/insertpessoa", method = RequestMethod.POST)
	public void save(@RequestBody Pessoa pessoa){
		 repository.save(pessoa);
	}
}
