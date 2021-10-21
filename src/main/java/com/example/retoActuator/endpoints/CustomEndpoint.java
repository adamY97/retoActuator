package com.example.retoActuator.endpoints;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "customEndpoint")
public class CustomEndpoint {

	@GetMapping("/")
	public ResponseEntity<String> customEndponit(){
		return new ResponseEntity<String>("Prueba Custom EndPoint", HttpStatus.OK);
	}
}
