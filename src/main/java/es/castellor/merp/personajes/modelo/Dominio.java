package es.castellor.merp.personajes.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Dominio implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3296678345733902859L;
	private String dominio;
	private Integer ppoder;
	
	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	public Integer getPpoder() {
		return ppoder;
	}
	public void setPpoder(Integer ppoder) {
		this.ppoder = ppoder;
	}
	
}
