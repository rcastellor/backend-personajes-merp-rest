package es.castellor.merp.personajes.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="personajes")
public class Personaje implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(insertable=false, updatable=false, nullable=false)
	private Integer id;

	@Embedded
	private DatosPersonaje datos;
	
	
	@ElementCollection
	private List<Caracteristica> caracteristicas = new ArrayList<>();

	@ElementCollection
	private List<Idioma> idiomas = new ArrayList<>();
	
	@ElementCollection
	private List<ListaSortilegio> listas = new ArrayList<>();
	
	@Embedded
	private Dominio dominio;
	
	@ElementCollection
	private List<Habilidad> movimiento = new ArrayList<>();

	@ElementCollection
	private List<Habilidad> armas = new ArrayList<>();

	@ElementCollection
	private List<Habilidad> generales = new ArrayList<>();

	@ElementCollection
	private List<Habilidad> subterfugio = new ArrayList<>();

	@ElementCollection
	private List<Habilidad> magicas = new ArrayList<>();
	
	@ElementCollection
	private List<Habilidad> otras = new ArrayList<>();

	@ElementCollection
	private List<Habilidad> tr = new ArrayList<>();
	
	@ElementCollection
	private List<Habilidad> secundarias = new ArrayList<>();
	
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
	public List<Idioma> getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(List<Idioma> idiomas) {
		this.idiomas = idiomas;
	}
	public List<ListaSortilegio> getListas() {
		return listas;
	}
	public void setListas(List<ListaSortilegio> listas) {
		this.listas = listas;
	}
	public Dominio getDominio() {
		return dominio;
	}
	public void setDominio(Dominio dominio) {
		this.dominio = dominio;
	}
	public List<Habilidad> getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(List<Habilidad> movimiento) {
		this.movimiento = movimiento;
	}

	public List<Habilidad> getArmas() {
		return armas;
	}

	public void setArmas(List<Habilidad> armas) {
		this.armas = armas;
	}

	public List<Habilidad> getGenerales() {
		return generales;
	}

	public void setGenerales(List<Habilidad> generales) {
		this.generales = generales;
	}

	public List<Habilidad> getSubterfugio() {
		return subterfugio;
	}

	public void setSubterfugio(List<Habilidad> subterfugio) {
		this.subterfugio = subterfugio;
	}

	public List<Habilidad> getMagicas() {
		return magicas;
	}

	public void setMagicas(List<Habilidad> magicas) {
		this.magicas = magicas;
	}

	public List<Habilidad> getOtras() {
		return otras;
	}

	public void setOtras(List<Habilidad> otras) {
		this.otras = otras;
	}

	public List<Habilidad> getTr() {
		return tr;
	}
	public void setTr(List<Habilidad> tr) {
		this.tr = tr;
	}
	public List<Habilidad> getSecundarias() {
		return secundarias;
	}
	public void setSecundarias(List<Habilidad> secundarias) {
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
