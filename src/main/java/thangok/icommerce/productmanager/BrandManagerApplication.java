package thangok.icommerce.productmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ProductManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagerApplication.class, args);
	}

}