package com.metadata.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryIPackResponse {

    private QueryIPackResult[] result;
    private Integer numberOfResults;

    public QueryIPackResult[] getResult() {
        return result;
    }

    public void setResult(QueryIPackResult[] result) {
        this.result = result;
    }

    public Integer getNumberOfResults() {
        return numberOfResults;
    }

    public void setNumberOfResults(Integer numberOfResults) {
        this.numberOfResults = numberOfResults;
    }

}