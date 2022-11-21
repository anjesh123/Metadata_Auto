package com.metadata.adapter.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
//import org.springframework.retry.annotation.Backoff;
//import org.springframework.retry.annotation.Retryable;

import java.net.URI;

public interface TPRetryBoomiService {

//    @Retryable(value = {TPApiServiceLimitException.class}, maxAttempts = 3, backoff = @Backoff(delay = 500))
    <C, H> C thirdPartyApiCall(URI url, HttpEntity<H> jsonRequest,
                               HttpMethod httpMethod, Class<C> returnClassType);
}