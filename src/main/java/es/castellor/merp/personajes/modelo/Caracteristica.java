package es.castellor.merp.personajes.modelo;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="caracteristicas")
public class Caracteristica implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -447893342907132672L;
	
	@EmbeddedId
	private CaracteristicaID id;
	
	private String caracteristica;
	private String abr;
	private String valor;
	private String normal;
	private String raza;
	private String total;
	
	public CaracteristicaID getId() {
		return id;
	}
	public void setId(CaracteristicaID id) {
		this.id = id;
	}

	public String getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	public String getAbr() {
		return abr;
	}
	public void setAbr(String abr) {
		this.abr = abr;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getNormal() {
		return normal;
	}
	public void setNormal(String normal) {
		this.normal = normal;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
	
}
