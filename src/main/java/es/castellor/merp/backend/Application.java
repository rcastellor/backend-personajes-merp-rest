package es.castellor.merp.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("es.castellor.merp.personajes.modelo")
public class Application {
	public static void main(String args[]) {
		System.out.println("Hello");
		SpringApplication.run(Application.class, args);
	}
}
