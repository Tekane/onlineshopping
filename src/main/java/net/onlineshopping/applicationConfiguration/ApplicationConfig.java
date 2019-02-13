package net.onlineshopping.applicationConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

@Configuration
public class ApplicationConfig {

    @Bean
    public StandardServletMultipartResolver multipartResolver(){
       return new StandardServletMultipartResolver();
    }
}
