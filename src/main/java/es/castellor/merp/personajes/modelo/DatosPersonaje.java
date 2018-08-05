package es.castellor.merp.personajes.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Embeddable
public class DatosPersonaje implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4910365881527885214L;
	
	
	private String nombre;
	
	
	@ManyToOne
	@JoinColumn(name="raza", referencedColumnName="id", nullable=false)
	private Raza raza;
	
	private String estatura;
	private String peso;
	private String pelo;
	private String ojos;
	private String actitud;
	private String especial;
	
	@ManyToOne
	@JoinColumn(name="profesion", referencedColumnName="id", nullable=false)
	private Profesion profesion;
	
	private Integer nivel;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Raza getRaza() {
		return raza;
	}
	public void setRaza(Raza raza) {
		this.raza = raza;
	}
	public String getEstatura() {
		return estatura;
	}
	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getPelo() {
		return pelo;
	}
	public void setPelo(String pelo) {
		this.pelo = pelo;
	}
	public String getOjos() {
		return ojos;
	}
	public void setOjos(String ojos) {
		this.ojos = ojos;
	}
	public String getActitud() {
		return actitud;
	}
	public void setActitud(String actitud) {
		this.actitud = actitud;
	}
	public String getEspecial() {
		return especial;
	}
	public void setEspecial(String especial) {
		this.especial = especial;
	}
	public Profesion getProfesion() {
		return profesion;
	}
	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
}
