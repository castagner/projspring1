package br.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.projspringok.model.Jogo;
import br.com.projspringok.repository.JogoRepository;



public class JogoController {
	@Autowired
	
	
	JogoRepository repositoryJogo;


	
	@PostMapping("api/save")
	public Jogo save(@RequestBody Jogo jogo){
		return repositoryJogo.save(jogo);
	}
	
	
	//http://localhost:8080/api/all
	@GetMapping("api/all")
	public List<Jogo> all(){
		return (List<Jogo>) repositoryJogo.findAll();
				
	}
	
	//http://localhost:8080/api/delete/2
	@GetMapping("api/delete/{id}")
	public boolean delete(@PathVariable("id") Long id) {
		try {
			repositoryJogo.deleteById(id);
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}