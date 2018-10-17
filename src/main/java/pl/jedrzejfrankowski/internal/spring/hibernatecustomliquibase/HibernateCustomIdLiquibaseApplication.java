
package pl.jedrzejfrankowski.internal.spring.hibernatecustomliquibase;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class HibernateCustomIdLiquibaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateCustomIdLiquibaseApplication.class, args);
	}

}
