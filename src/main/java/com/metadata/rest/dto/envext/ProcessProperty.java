package com.metadata.rest.dto.envext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ProcessProperty {
  private String id;

  @JsonProperty("ProcessPropertyValue")
  private List<ProcessPropertyValue> processPropertyValue;

  private String name;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("ProcessPropertyValue")
  public List<ProcessPropertyValue> getProcessPropertyValue() {
    return processPropertyValue;
  }

  @JsonProperty("ProcessPropertyValue")
  public void setProcessPropertyValue(List<ProcessPropertyValue> processPropertyValue) {
    this.processPropertyValue = processPropertyValue;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}