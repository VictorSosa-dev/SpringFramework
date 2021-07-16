package com.bolsadeideas.springboot.form.app.models.domain;

import lombok.Data;

@Data
public class Role {
	
	private Integer id;
	
	private String nombre;
	
	private String role;

	public Role(Integer id, String nombre, String role) {
		this.id = id;
		this.nombre = nombre;
		this.role = role;
	}

	public Role() { }
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Role)) {
			return false;
		}
		Role role = (Role)obj;
		return this.id != null && this.id.equals(role.id);
	}
}
