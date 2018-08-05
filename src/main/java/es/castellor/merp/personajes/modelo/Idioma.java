package es.castellor.merp.personajes.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Idioma implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6745979558554343370L;
	private String idioma;
	private Integer grado;
	
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public Integer getGrado() {
		return grado;
	}
	public void setGrado(Integer grado) {
		this.grado = grado;
	}
	
	

}
