package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
	@GetMapping("/helloworld")
	public String hello() {
		return "Hello World";
	}

	@GetMapping("/atividade1")
	public String hello1() {
		return "Habilidade: persistencia. \nMentalidade: Atenção aos detalhes.";
	}

	@GetMapping("/atividade2")
	public String hello2() {
		return "O objetivo de aprendizagem é desenvolver spring boot";
	}
}
