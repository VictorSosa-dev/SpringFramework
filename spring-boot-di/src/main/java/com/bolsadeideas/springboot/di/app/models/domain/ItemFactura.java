package com.bolsadeideas.springboot.di.app.models.domain;

import lombok.Data;

@Data
public class ItemFactura {

	private Producto producto;
	
	private Integer cantidad;

	public ItemFactura(Producto producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	
}
