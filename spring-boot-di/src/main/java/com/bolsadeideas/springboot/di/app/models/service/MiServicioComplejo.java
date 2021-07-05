package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Service;

//@Service("miServicioComplejo")
public class MiServicioComplejo  implements IServicio{

	@Override
	public String operacion() {
		// TODO Auto-generated method stub
		return "Ejecutando algo importante complicado.....";
	}
	
	
}
