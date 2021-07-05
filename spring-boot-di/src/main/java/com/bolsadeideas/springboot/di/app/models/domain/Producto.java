package com.bolsadeideas.springboot.di.app.models.domain;

import lombok.Data;

@Data
public class Producto {

	private String nombre;

	private Double precio;

	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
}
