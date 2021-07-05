package com.bolsadeideas.springboot.di.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.service.IServicio;

@Controller
public class indexController {
	
	/**
	 * Inyeccion de dependencia que mas se usa.
	 */
    @Autowired
  //  @Qualifier("miServicioSimple")
	private IServicio servicio;
	
	/**
	 *  Inyeccion de dependencia con el contructor
	 *  Cuando se hace a traves del constructor 
	 *  se puede omitir el Autowired
	 * 
	 *	@Autowired
	 *	public indexController(IServicio servicio) {
	 *		this.servicio = servicio;
	 *	}
	 */



	/**
	 * Inyeccion de dependencia con el metodo
	 * set
	@Autowired
	public void setServicio(IServicio servicio) {
		this.servicio = servicio;
	}
	*/
	
	@GetMapping({"/","","/index"})
	public String index(Model model) {
		
		model.addAttribute("objeto",servicio.operacion());
		return "index";
	}
	
	
	
	
	
}
