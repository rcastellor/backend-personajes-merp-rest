package es.castellor.merp.personajes.modelo;

import java.io.Serializable;

public class Profesion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5439356902137111348L;
	private Integer id;
	private String descripcion;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
