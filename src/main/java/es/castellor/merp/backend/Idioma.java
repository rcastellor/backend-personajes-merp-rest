package es.castellor.merp.backend;

import java.io.Serializable;

public class Idioma implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5337406842264446536L;
	
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
