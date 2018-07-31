package es.castellor.merp.personajes.modelo;

import java.io.Serializable;

public class ListaSortilegio implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7910226375500248491L;
	private String lista;
	private Boolean aprendida;
	private Integer prob;
	
	public String getLista() {
		return lista;
	}
	public void setLista(String lista) {
		this.lista = lista;
	}
	public Boolean getAprendida() {
		return aprendida;
	}
	public void setAprendida(Boolean aprendida) {
		this.aprendida = aprendida;
	}
	public Integer getProb() {
		return prob;
	}
	public void setProb(Integer prob) {
		this.prob = prob;
	}
	
}
