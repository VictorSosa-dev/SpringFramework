package com.bolsadeideas.springboot.error.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private List<Usuario> listar;
	
	
	
	public UsuarioServiceImpl() {
		this.listar = new ArrayList<>();
		this.listar.add(new Usuario(1,"Victor","Sosa"));
		this.listar.add(new Usuario(2,"Julieta","Cisneros"));
		this.listar.add(new Usuario(3,"Mina","Sosa "));
		this.listar.add(new Usuario(4,"Cinthia","Sosa"));
		this.listar.add(new Usuario(5,"Mari","Perez"));
		this.listar.add(new Usuario(1,"Renata","Perez"));
	}

	@Override
	public List<Usuario> listar() {
		return this.listar;
	}

	@Override
	public Usuario obtnerPorId(Integer id) {
		Usuario reusltado = null;
		
		for (Usuario u : this.listar) {
			if(u.getId().equals(id)){
				reusltado = u;
				break;
			}
		}
		return reusltado;
	}

	@Override
	public Optional<Usuario> obtnerPorIdOptional(Integer id) {
		Usuario usuario = this.obtnerPorId(id);
		
		return Optional.ofNullable(usuario);
	}

}
