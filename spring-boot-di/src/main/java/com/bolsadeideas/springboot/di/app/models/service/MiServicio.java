package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
//@Service("miServicioSimple")
public class MiServicio  implements IServicio{

	@Override
	public String operacion() {
		// TODO Auto-generated method stub
		return "Ejecutando algo simple....";
	}
	
	
}
