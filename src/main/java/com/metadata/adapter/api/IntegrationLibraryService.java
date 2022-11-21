package com.metadata.adapter.api;

import com.metadata.rest.dto.NestedExpressionBean;
import com.metadata.rest.dto.QueryIPackRequest;
import org.springframework.http.HttpHeaders;

import java.net.URI;
import java.util.List;

public interface IntegrationLibraryService {

    public QueryIPackRequest createSimpleQueryExpression(List<String> argument,
                                                         String property, String operator);

    public HttpHeaders getHttpHeader();

    public List<NestedExpressionBean> createNestedExpression(
            String firstParam, String secondParam, String firstParamName, String secondParamName);

    public QueryIPackRequest createNestedQueryExpression(String operator, String firstParam, String secondParam,
                                                         String firstParamName, String secondParamName);

    public URI getUri(String apiUrl, String overrideAccountID);

    public URI getAccountUri(String apiUrl);

}
