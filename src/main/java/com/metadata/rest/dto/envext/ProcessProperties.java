package com.metadata.rest.dto.envext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ProcessProperties {
  @JsonProperty("ProcessProperty")
  private List<ProcessProperty> processProperty;

  @JsonProperty("ProcessProperty")
  public List<ProcessProperty> getProcessProperty() {
    return processProperty;
  }

  @JsonProperty("ProcessProperty")
  public void setProcessProperty(List<ProcessProperty> processProperty) {
    this.processProperty = processProperty;
  }

}