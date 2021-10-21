package com.example.retoActuator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class TestController {

	private Counter counter;
	
	public TestController(MeterRegistry registry) {
		this.counter = Counter.builder("pruebaCounter.bienvenida").description("Prueba Bienvenida").register(registry);
	}
	
	@GetMapping("/bienvenida")
	public String Bienvenida() {
		counter.increment();
		return "Probando Bienvenida";
	}
}
