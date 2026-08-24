package com.agendio.api.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("API do Sistema")
                        .version("1.0")
                        .description("Documentação da API desenvolvida com Spring Boot Swagger para a aula de segurança de aplicação")
                        .contact(new Contact()
                                .name("Sérgio")
                                .email("contato.sergiowork@gmail.com")));
    }
}
