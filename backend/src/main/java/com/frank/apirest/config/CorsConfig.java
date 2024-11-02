package com.frank.apirest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Permite CORS para todas las rutas
                        .allowedOrigins("http://localhost:5173") // origenes permitidos
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // métodos HTTP permitidos
                        .allowedHeaders("*") // Permite todos los encabezados
                        .allowCredentials(true); // Permite credenciales (cookies, autenticación HTTP, etc.)
            }
        };
    }
}
