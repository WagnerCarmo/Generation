package com.generation.exercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frase")
public class Exercício1Controller {
	
	@GetMapping 

	public String Hello () {
		
		return "Mentalidade de Crescimento";

}
}