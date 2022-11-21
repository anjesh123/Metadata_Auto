package com.metadata.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:boomi.properties")
public class BoomiConfig {

    @Value("${cust.data.boomi.accountID}")
    private String accountId;

    @Value("${cust.data.boomi.environmentID}")
    private String environmentID;

    @Value("$cust.data.boomi.username")
    private String username;

    @Value("$cust.data.boomi.password")
    private String password;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getEnvironmentID() {
        return environmentID;
    }

    public void setEnvironmentID(String environmentID) {
        this.environmentID = environmentID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
