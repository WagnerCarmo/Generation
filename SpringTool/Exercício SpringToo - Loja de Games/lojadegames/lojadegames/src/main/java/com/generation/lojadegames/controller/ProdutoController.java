package com.generation.lojadegames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.lojadegames.model.Produto;
import com.generation.lojadegames.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin (origins = "*", allowedHeaders = "*")

public class ProdutoController {

	@Autowired
    private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
		
	}
	    
	@GetMapping("/{id}")
	public ResponseEntity<Produto> GetById(@PathVariable long id) {
		return repository.findById(id)
			   .map(resp -> ResponseEntity.ok(resp))
			   .orElse(ResponseEntity.notFound().build());
		
	}
               
	@GetMapping ("/titulo/{titulo}")
	public ResponseEntity<List<Produto>> getBytitulo(@PathVariable String titulo) {
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));  
	
   }

	@PostMapping
	public ResponseEntity<Produto> postBody(@RequestBody Produto produto) {
		return ResponseEntity.status(HttpStatus.CREATED)
		.body(repository.save(produto));
	}

	@PutMapping
	public ResponseEntity<Produto> putBody(@RequestBody Produto produto) {
		return ResponseEntity.ok(repository.save(produto));

	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
		
	}

}