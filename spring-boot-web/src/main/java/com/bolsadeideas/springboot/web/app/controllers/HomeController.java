package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	/**
	 * redirect cambia la ruta
	 * y forward la matiene igual
	 * @return
	 */
	@GetMapping("/")
	public String home() {
		//return "forward:/v1/principal";
		return "redirect:/v1/principal";
	}
}
