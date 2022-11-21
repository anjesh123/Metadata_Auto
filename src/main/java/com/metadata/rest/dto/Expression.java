package com.metadata.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Expression {

    @JsonProperty("argument")
    private List<String> argument;

    @JsonProperty("property")
    private String property;

    @JsonProperty("operator")
    private String operator;

    @JsonProperty("nestedExpression")
    private List<NestedExpressionBean> nestedExpression;

    public List<NestedExpressionBean> getNestedExpression() {
        return nestedExpression;
    }

    public void setNestedExpression(List<NestedExpressionBean> nestedExpression) {
        this.nestedExpression = nestedExpression;
    }


    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public List<String> getArgument() {
        return argument;
    }

    public void setArgument(List<String> argument) {
        this.argument = argument;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

}