package com.java.docker.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.docker.Application.model.Pessoa;

@Repository
public interface PessoaRepository  extends JpaRepository<Pessoa, Long>{

}
