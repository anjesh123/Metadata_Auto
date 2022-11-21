package com.metadata.adapter.api;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Optional;

//Auth
public interface VaultRepositoryService {

    /**
     * For a given path, retrieves a {@link JsonNode} representation of the data in the
     * Secret Store.
     *
     * @param path The secret path in the Secret Store
     * @return the {@link JsonNode} wrapped in an {@link Optional}
     */
    Optional<JsonNode> getSecret(String path);
}