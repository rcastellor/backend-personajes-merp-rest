package es.castellor.merp.personajes.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;


@Entity
public class Personaje implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Lob
	@Column(length=100000)
	private DatosPersonaje datos;
	@Lob
	@Column(length=100000)
	private Caracteristica caracteristicas[];
	@Lob
	@Column(length=100000)
	private Idioma idiomas[];
	@Lob
	@Column(length=100000)
	private ListaSortilegio listas[];
	private Dominio dominio;
	@Lob
	@Column(length=100000)
	private Habilidad habilidades[][];
	@Lob
	@Column(length=100000)
	private Habilidad tr[];
	@Lob
	@Column(length=100000)
	private Habilidad secundarias[];

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public DatosPersonaje getDatos() {
		return datos;
	}
	public void setDatos(DatosPersonaje datos) {
		this.datos = datos;
	}
	public Caracteristica[] getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(Caracteristica[] caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public Idioma[] getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(Idioma idiomas[]) {
		this.idiomas = idiomas;
	}
	public ListaSortilegio[] getListas() {
		return listas;
	}
	public void setListas(ListaSortilegio[] listas) {
		this.listas = listas;
	}
	public Dominio getDominio() {
		return dominio;
	}
	public void setDominio(Dominio dominio) {
		this.dominio = dominio;
	}
	public Habilidad[][] getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(Habilidad[][] habilidades) {
		this.habilidades = habilidades;
	}
	public Habilidad[] getTr() {
		return tr;
	}
	public void setTr(Habilidad[] tr) {
		this.tr = tr;
	}
	public Habilidad[] getSecundarias() {
		return secundarias;
	}
	public void setSecundarias(Habilidad[] secundarias) {
		this.secundarias = secundarias;
	}
}
