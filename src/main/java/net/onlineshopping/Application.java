package net.onlineshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("net.PTSonlineshoppingback_end.model")
@EnableJpaRepositories(basePackages = "net.PTSonlineshoppingback_end.repository")
@ComponentScan({"net.onlineshopping.controller", "net.onlineshopping.config", "net.onlineshopping", " "
    + "net.PTSonlineshoppingback_end", "net.PTSonlineshoppingback_end.services",
     "net.PTSonlineshoppingback_end.repository"})
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
