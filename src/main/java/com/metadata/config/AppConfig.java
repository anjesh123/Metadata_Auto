package com.metadata.config;

import com.metadata.adapter.impl.BoomiVaultService;
import com.metadata.rest.dto.BoomiSecret;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    //Auth
    @Bean
    public BasicAuthenticationInterceptor boomiBasicAuthenticationInterceptor(BoomiVaultService boomiVaultService) {
        BoomiSecret boomiAuth = boomiVaultService.getBoomiSecret();
        return new BasicAuthenticationInterceptor(boomiAuth.getUsername(), boomiAuth.getToken());
    }

    @Bean
    public RestTemplate clientLibraryRestTemplate(BasicAuthenticationInterceptor boomiBasicAuthenticationInterceptor){

        final RestTemplate clientLibraryRestTemplate = new RestTemplate();
        clientLibraryRestTemplate.getInterceptors().add(boomiBasicAuthenticationInterceptor);
        return clientLibraryRestTemplate;
//        return new RestTemplate();
    }

}


