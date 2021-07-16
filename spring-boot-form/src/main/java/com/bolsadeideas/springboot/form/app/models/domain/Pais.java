package com.bolsadeideas.springboot.form.app.models.domain;

import lombok.Data;

@Data
public class Pais {
	
	private Integer id;
	
	private String codigo;
	
	private String nombre;

	public Pais(Integer id, String codigo, String nombre) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public Pais() {
	}

	@Override
	public String toString() {
		return this.id.toString();
	}
	
	 
	
	
	
}
