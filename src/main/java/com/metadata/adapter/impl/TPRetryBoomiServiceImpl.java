package com.metadata.adapter.impl;

import com.metadata.adapter.api.TPRetryBoomiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class TPRetryBoomiServiceImpl implements TPRetryBoomiService {

    private static final Logger logger = LoggerFactory.getLogger(TPRetryBoomiServiceImpl.class);

    private final RestTemplate clientLibraryRestTemplate;

    public TPRetryBoomiServiceImpl(@Qualifier("clientLibraryRestTemplate") RestTemplate clientLibraryRestTemplate) {
        this.clientLibraryRestTemplate = clientLibraryRestTemplate;
    }

    public <C, H> C thirdPartyApiCall(URI url, HttpEntity<H> jsonRequest,
                                      HttpMethod httpMethod, Class<C> returnClassType) {
        try {
            logger.debug("Third party API call request URL:{}, method: {} and body: {}", url, httpMethod, jsonRequest.getBody());
            ResponseEntity<C> result = clientLibraryRestTemplate.exchange(url, httpMethod, jsonRequest, returnClassType);
            logger.debug("Third party API call response status: {} and body: {}", result.getStatusCode(), result.getBody());
            return result.getBody();
        } catch (HttpClientErrorException hcee) {
            logger.error("HttpClientError in third party API", hcee);
            throw hcee;
        } catch (HttpServerErrorException hsee) {
            if (hsee.getStatusCode() == HttpStatus.SERVICE_UNAVAILABLE) {
                logger.error("Encountered Boomi Api Rate limit exception. The execution will be retried", hsee);
            } else {
                logger.error("Error in third party API", hsee);
            }
            throw hsee;
        }
    }
}

