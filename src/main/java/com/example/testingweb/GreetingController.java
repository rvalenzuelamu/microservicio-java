package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GreetingController {

	private final GreetingService service;

	public GreetingController(GreetingService service) {
		this.service = service;
	}

	@RequestMapping("/greeting")
	public @ResponseBody String greeting() {
	    try {
		// Intencionalmente lanzando una excepción no controlada
            	throw new RuntimeException("Uncontrolled exception for testing purposes");
            } catch (Exception e) {
            	// No se hace nada aquí, el código no captura la excepción
            }    
		return service.greet();
	}

}
