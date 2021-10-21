package com.example.retoActuator.endpoints;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "estado")
public class EstadoEndpoint {

	private List<String> lista= new ArrayList<>();
	
	@ReadOperation
	public List<String> estados(){
		return lista;
	}
	
	@WriteOperation
	public void writeOperation(@Selector String nuevoEstado) {
		lista.add(nuevoEstado);
	}
	
	@DeleteOperation
	public void deleteOperation(@Selector String borrarEstado) {
		lista.remove(borrarEstado);
	}
	
}
