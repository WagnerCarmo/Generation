package com.generation.Exercicio2Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class Exercício2Controller {

	@GetMapping 

	public String Hello () {
		
		return "Luiz Arrombado";
	
}
}