package com.bolsadeideas.springboot.error.app.service;

import java.util.List;
import java.util.Optional;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;

public interface UsuarioService {
	
	public List<Usuario> listar();
	
	public Usuario obtnerPorId(Integer id);
	
	public Optional<Usuario> obtnerPorIdOptional(Integer id);

	
}
