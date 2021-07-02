package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.el.parser.AstConcatenation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/v1")
public class PrincipalController {
	
	@Value("${texto.principalController.index.titulo}")
	private String textoPrincipal;
	
	@Value("${texto.principalController.perfil.titulo}")
	private String textoPerfil;

	@Value("${texto.principalController.listar.titulo}")
	private String textoListar;

	
	/**
	 * Igual se puede usar GetMapping
	 * Si RequestMapping no tiene mas valores que value se puede omitir
	 * value
	 * 
	 * Tambien se puede mapiar mas de una ruta colocando las rutas en llaves
	 * y separando por comas por ejemplo {"/index", "/", "/home"}
	 * @return
	 */
	@GetMapping({"/principal","/","","/home"})
	public String  index(Model model) {
		model.addAttribute("titulo", textoPrincipal);
		return "Principal";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Julieta");
		usuario.setApellido("Cisneros");
		usuario.setEmail("yuli@gmail.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		
		model.addAttribute("titulo", textoListar);
		
		
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> listUser(){
		List<Usuario> listaUsuarios = new ArrayList<>();
		listaUsuarios.add(new Usuario("Julieta","Cisneros","yuli@gmail.com"));
		listaUsuarios.add(new Usuario("Victor","Sosa","victor@gmail.com"));
		listaUsuarios.add(new Usuario("Galleta","Mina","mina@gmail.com"));
		return listaUsuarios;
	}
}
