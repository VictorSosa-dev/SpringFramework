package com.bolsadeideas.springboot.error.app.models.domain;

import lombok.Data;

@Data
public class Usuario {
	
	private Integer id;
	
	private String  nombre;
	
	private String apellido;

	public Usuario(Integer id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Usuario() {
	}
	
	
	
	
}
