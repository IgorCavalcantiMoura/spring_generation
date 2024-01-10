package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OlaMundo {

	@GetMapping("/ola")
	public String olaMundo() {
		return "Olá Mundo!!";
	}
	
	@GetMapping("/bsm")
	public List<String> listaBSMs() {
        return Arrays.asList(
        		"- Mentalidade de Crescimento",
        		"- Orientação ao Futuro", 
        		"- Persistência", 
        		"- Comunicação", 
        		"- Atenção aos detalhe"
        	);
    }
	
	 @GetMapping("/objetivos")
	    public List<String> objetivosAprendizagem() {
	        return Arrays.asList(
	                "1- Aprender Spring Boot",
	                "2- Aprofundar conhecimentos em Java",
	                "3- Entender o desenvolvimento de APIs REST"
	        ); 
	        
	 }
}
