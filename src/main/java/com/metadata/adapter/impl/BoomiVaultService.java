package com.metadata.adapter.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metadata.adapter.api.VaultRepositoryService;
import com.metadata.exception.BoomiVaultException;
import com.metadata.rest.dto.BoomiSecret;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import

import java.util.Optional;

//Auth
@Service
public class BoomiVaultService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BoomiVaultService.class);
    private static final ObjectMapper mapper = new ObjectMapper();
    private static final String PATH = "/bdes/boomi/private/credentials";

    @Autowired
    private VaultRepositoryService vaultRepositoryService;

    /**
     * Method to get the Boomi Secrets from vault instance.
     *
     * @return BoomiSecret
     */
    public BoomiSecret getBoomiSecret() {
        LOGGER.info("Get Boomi secrets from vault instance ");
        Optional<BoomiSecret> boomiSecretOptional = vaultRepositoryService.getSecret(PATH).map(this::getBoomiSecretObj);
        return boomiSecretOptional.orElseThrow(() -> {
            String message = "Could not retrieve Boomi secrets from vault instance";
            LOGGER.error(message);
            throw new BoomiVaultException(message);
        });
    }

    private BoomiSecret getBoomiSecretObj(JsonNode secret) {
        BoomiSecret boomiSecret = null;
        try {
            boomiSecret = mapper.treeToValue(secret, BoomiSecret.class);
        } catch (JsonProcessingException ex) {
            LOGGER.error("Unable to parse vault secrets into BoomiSecret Object", ex);
        }
        return boomiSecret;
    }

}