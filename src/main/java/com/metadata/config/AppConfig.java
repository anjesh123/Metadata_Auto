package com.metadata.config;

import com.metadata.adapter.api.TPRetryBoomiService;
//import com.metadata.adapter.impl.BoomiVaultService;
import com.metadata.adapter.impl.TPRetryBoomiServiceImpl;
import com.metadata.rest.dto.BoomiSecret;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

@Configuration
//@EnableConfigurationProperties(value = AppConfig.class)
public class AppConfig {

//    @Bean
//    public VaultRepositoryService vaultRepositoryService(String path){
//        return new VaultRepositoryService() {
//            @Override
//            public Optional<JsonNode> getSecret(String path) {
//                return Optional.empty();
//            }
//        }
//    }

    //Auth
//    @Bean
//    public BasicAuthenticationInterceptor boomiBasicAuthenticationInterceptor(BoomiVaultService boomiVaultService) {
//        BoomiSecret boomiAuth = boomiVaultService.getBoomiSecret();
//        return new BasicAuthenticationInterceptor(boomiAuth.getUsername(), boomiAuth.getToken());
//    }

    @Bean
    public RestTemplate clientLibraryRestTemplate(BasicAuthenticationInterceptor boomiBasicAuthenticationInterceptor) {

//        final RestTemplate clientLibraryRestTemplate = new RestTemplate();
//        clientLibraryRestTemplate.getInterceptors().add(boomiBasicAuthenticationInterceptor);
//        return clientLibraryRestTemplate;
        return new RestTemplate();
    }

//    @Bean
//    public TPRetryBoomiService tpRetryBoomiService(@Qualifier("clientLibraryRestTemplate") RestTemplate clientLibraryRestTemplate) {
//        return new TPRetryBoomiServiceImpl(clientLibraryRestTemplate);
//    }

}


