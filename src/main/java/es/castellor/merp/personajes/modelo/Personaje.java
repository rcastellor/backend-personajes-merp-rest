package es.castellor.merp.personajes.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="personajes")
public class Personaje implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(insertable=false, updatable=false, nullable=false)
	private Integer id;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="datos", referencedColumnName="id")
	private DatosPersonaje datos;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="personaje", referencedColumnName="id")
	private List<Caracteristica> caracteristicas = new ArrayList<>();

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
	
	private String avatar;

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

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
	public List<Caracteristica> getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(List<Caracteristica> caracteristicas) {
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
