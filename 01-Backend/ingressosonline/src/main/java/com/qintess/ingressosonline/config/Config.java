package com.qintess.ingressosonline.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config implements WebMvcConfigurer {

	    public void addCorsMapping(CorsRegistry registry) {

	        registry.addMapping( "/**")
	            .allowedOrigins("http://localhost:4200")
	            .allowedMethods( "GET", "PUT", "PATCH", "DELETE" , "POST", "OPTIONS");
	    }

	}

