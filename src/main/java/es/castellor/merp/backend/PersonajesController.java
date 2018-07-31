package es.castellor.merp.backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonajesController {
	
	@RequestMapping("/personajes")
	public Personaje[] personajes(@RequestParam(value="pagina", defaultValue="0") String pagina) {
		Personaje p[] = {new Personaje()};
		p[0].setId(1);
		p[0].setNombre("Borzung");
		Idioma i[] = {new Idioma()};
		i[0].setIdioma("Oestron");
		i[0].setGrado(5);
		p[0].setIdiomas(i);
		return p;
	}
}
