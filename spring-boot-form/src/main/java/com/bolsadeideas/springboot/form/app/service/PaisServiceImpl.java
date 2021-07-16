package com.bolsadeideas.springboot.form.app.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.form.app.models.domain.Pais;

@Service
public class PaisServiceImpl  implements PaisService{
	
	private List<Pais> lista;
	
	public PaisServiceImpl(){
		this.lista = Arrays.asList(
				new Pais(1,"ES","España"),
				new Pais(2,"MX","Mexico"),
				new Pais(3,"PA","Paris"),
				new Pais(4,"CH","Chile"),
				new Pais(5,"PE","Peru"),
				new Pais(6,"HO","Holanda"));
	}
	@Override
	public List<Pais> listar() {
		return lista;
	}

	@Override
	public Pais obtenerPorId(Integer id) {
		Pais resultado = null;
		for (Pais pais : lista) {
			if(id == pais.getId()) {
				resultado = pais;
				break;
			}
		}
		return resultado;
	}

}
