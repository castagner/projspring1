package br.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projspringok.model.Jogo;
import br.com.projspringok.model.Musica;
import br.com.projspringok.repository.JogoRepository;
import br.com.projspringok.repository.MusicaRepository;

@RestController
public class MusicaController {
	
	@Autowired
	MusicaRepository repository;
	


	
	@PostMapping("api/save")
	public Musica save(@RequestBody Musica musica){
		return repository.save(musica);
	}
	
	
	//http://localhost:8080/api/all
	@GetMapping("api/all")
	public List<Musica> all(){
		return (List<Musica>) repository.findAll();
				
	}
	
	//http://localhost:8080/api/delete/2
	@GetMapping("api/delete/{id}")
	public boolean delete(@PathVariable("id") Long id) {
		try {
			repository.deleteById(id);
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}