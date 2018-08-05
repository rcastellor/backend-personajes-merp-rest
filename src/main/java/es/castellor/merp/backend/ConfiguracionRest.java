package es.castellor.merp.backend;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

import es.castellor.merp.personajes.modelo.Profesion;
import es.castellor.merp.personajes.modelo.Raza;

@Component
public class ConfiguracionRest extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Raza.class);
		config.exposeIdsFor(Profesion.class);
	}

}
