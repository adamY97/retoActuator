package com.example.retoActuator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {

	@GetMapping("/empleado/{nombre}")
	public String empleado(@PathVariable String nombre) {
		return "Bienvenido empleado" + nombre;
	}
	
	@GetMapping("/empleado/{nombre}/{id}")
	public String empleado(@PathVariable String nombre, @PathVariable int id) {
		return "Bienvenido empleado" + nombre + " con id (" + id +")";
	}
	
//	@GetMapping("/empleado/{nombre}/{id}/{datos}")
//	public String empleado(@PathVariable String nombre, @PathVariable String apellidos, Empleado datos) {
//		return "Bienvenido " + nombre + " " + apellidos;
//	}
}
