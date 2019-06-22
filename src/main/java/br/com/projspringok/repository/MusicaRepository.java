package br.com.projspringok.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.projspringok.model.Musica;



public interface MusicaRepository  extends CrudRepository<Musica, Long> {

}