package es.castellor.merp.personajes.modelo;

import java.io.Serializable;

public class Raza implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4739174579825256806L;
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
