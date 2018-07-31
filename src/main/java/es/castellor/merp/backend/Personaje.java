package es.castellor.merp.backend;


public class Personaje {
	private Integer id;
	private String nombre;
	private Idioma idiomas[];
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Idioma[] getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(Idioma[] idiomas) {
		this.idiomas = idiomas;
	}
	
	
}
