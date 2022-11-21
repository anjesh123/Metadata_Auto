package com.metadata.rest.dto.envext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnvironmentExtension {

  private String id;

  @JsonProperty("crossReferences")
  private CrossReferences crossReferences;

  @JsonProperty("extensionGroupId")
  private String extensionGroupId;

  @JsonProperty("processProperties")
  private ProcessProperties processProperties;

  private Connections connections;

  private String environmentId;

  private boolean partial;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CrossReferences getCrossReferences() {
    return crossReferences;
  }

  public void setCrossReferences(CrossReferences crossReferences) {
    this.crossReferences = crossReferences;
  }

  public String getExtensionGroupId() {
    return extensionGroupId;
  }

  public void setExtensionGroupId(String extensionGroupId) {
    this.extensionGroupId = extensionGroupId;
  }

  public ProcessProperties getProcessProperties() {
    return processProperties;
  }

  public void setProcessProperties(ProcessProperties processProperties) {
    this.processProperties = processProperties;
  }

  public Connections getConnections() {
    return connections;
  }

  public void setConnections(Connections connections) {
    this.connections = connections;
  }

  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public boolean isPartial() {
    return partial;
  }

  public void setPartial(boolean partial) {
    this.partial = partial;
  }
}