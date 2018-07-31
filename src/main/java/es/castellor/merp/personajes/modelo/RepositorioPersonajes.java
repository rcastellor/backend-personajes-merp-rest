package es.castellor.merp.personajes.modelo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "personajes", path = "personajes")
@CrossOrigin
public interface RepositorioPersonajes extends PagingAndSortingRepository<Personaje, Integer> {
	

}
