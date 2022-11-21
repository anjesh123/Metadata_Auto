package com.metadata.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "ist.boomi")
@Component
public class IntegrationConfigProperties {

    @Value("${ist.boomi.baseUrl:https://api.boomi.com/partner/api/rest/v1/}")
    private String baseUrl;
    private String accountGroupName;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getAccountGroupName() {
        return accountGroupName;
    }

    public void setAccountGroupName(String accountGroupName) {
        this.accountGroupName = accountGroupName;
    }
}
