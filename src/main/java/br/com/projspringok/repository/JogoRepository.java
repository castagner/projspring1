package br.com.projspringok.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.projspringok.model.Jogo;

public interface JogoRepository extends CrudRepository<Jogo, Long> {

}