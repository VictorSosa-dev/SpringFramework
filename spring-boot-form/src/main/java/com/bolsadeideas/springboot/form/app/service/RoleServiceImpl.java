package com.bolsadeideas.springboot.form.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.form.app.models.domain.Role;

@Service
public class RoleServiceImpl implements RoleService {
	
	private List<Role> lista;
	
	public RoleServiceImpl() {
		this.lista = new ArrayList<Role>();
		this.lista.add(new Role(1,"Administrador", "ROLE_ADMI"));
		this.lista.add(new Role(2,"Usuario", "ROLE_USER"));
		this.lista.add(new Role(3,"Moderador", "ROLE_MODERATOR"));
	}
	@Override
	public List<Role> listar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Role obtenerPorId(Integer id) {
		Role resultado = null;
		for (Role role : lista) {
			if(id == role.getId()) {
				resultado = role;
				break;
			}
		}
		return resultado;
	}

}
