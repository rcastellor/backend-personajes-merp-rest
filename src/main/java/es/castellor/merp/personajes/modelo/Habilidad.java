package es.castellor.merp.personajes.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class Habilidad implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7172687337526725469L;
	private String descripcion;
	private Integer grado;
	private Integer valorGrado;
	private Boolean aplicaGrado;
	private Integer gradoRaza;
	private Integer gradoMaximo;
	private Boolean aplicaTiradas;
	private Integer valorTiradas[];
	private String abrCar;
	private Boolean aplicaCar;
	private Integer caracteristica;
	private Boolean aplicaProfesion;
	private Integer profesion;
	private Integer objeto;
	private Integer especial;
	private Integer especial2;
	private Boolean especial2sl;
	private Integer tipoTirada;
	private Integer valorTotal;
	private Boolean descripcionLibre;
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getGrado() {
		return grado;
	}
	public void setGrado(Integer grado) {
		this.grado = grado;
	}
	public Integer getValorGrado() {
		return valorGrado;
	}
	public void setValorGrado(Integer valorGrado) {
		this.valorGrado = valorGrado;
	}
	public Boolean getAplicaGrado() {
		return aplicaGrado;
	}
	public void setAplicaGrado(Boolean aplicaGrado) {
		this.aplicaGrado = aplicaGrado;
	}
	public Integer getGradoRaza() {
		return gradoRaza;
	}
	public void setGradoRaza(Integer gradoRaza) {
		this.gradoRaza = gradoRaza;
	}
	public Integer getGradoMaximo() {
		return gradoMaximo;
	}
	public void setGradoMaximo(Integer gradoMaximo) {
		this.gradoMaximo = gradoMaximo;
	}
	public Boolean getAplicaTiradas() {
		return aplicaTiradas;
	}
	public void setAplicaTiradas(Boolean aplicaTiradas) {
		this.aplicaTiradas = aplicaTiradas;
	}
	public Integer[] getValorTiradas() {
		return valorTiradas;
	}
	public void setValorTiradas(Integer[] valorTiradas) {
		this.valorTiradas = valorTiradas;
	}
	public String getAbrCar() {
		return abrCar;
	}
	public void setAbrCar(String abrCar) {
		this.abrCar = abrCar;
	}
	public Boolean getAplicaCar() {
		return aplicaCar;
	}
	public void setAplicaCar(Boolean aplicaCar) {
		this.aplicaCar = aplicaCar;
	}
	public Integer getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(Integer caracteristica) {
		this.caracteristica = caracteristica;
	}
	public Boolean getAplicaProfesion() {
		return aplicaProfesion;
	}
	public void setAplicaProfesion(Boolean aplicaProfesion) {
		this.aplicaProfesion = aplicaProfesion;
	}
	public Integer getProfesion() {
		return profesion;
	}
	public void setProfesion(Integer profesion) {
		this.profesion = profesion;
	}
	public Integer getObjeto() {
		return objeto;
	}
	public void setObjeto(Integer objeto) {
		this.objeto = objeto;
	}
	public Integer getEspecial() {
		return especial;
	}
	public void setEspecial(Integer especial) {
		this.especial = especial;
	}
	public Integer getEspecial2() {
		return especial2;
	}
	public void setEspecial2(Integer especial2) {
		this.especial2 = especial2;
	}
	public Boolean getEspecial2sl() {
		return especial2sl;
	}
	public void setEspecial2sl(Boolean especial2sl) {
		this.especial2sl = especial2sl;
	}
	public Integer getTipoTirada() {
		return tipoTirada;
	}
	public void setTipoTirada(Integer tipoTirada) {
		this.tipoTirada = tipoTirada;
	}
	public Integer getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Integer valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Boolean getDescripcionLibre() {
		return descripcionLibre;
	}
	public void setDescripcionLibre(Boolean descripcionLibre) {
		this.descripcionLibre = descripcionLibre;
	}
	
	

}

