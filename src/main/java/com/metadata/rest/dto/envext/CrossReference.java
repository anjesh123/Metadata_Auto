package com.metadata.rest.dto.envext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossReference {
  private String id;

  private String name;

  @JsonProperty("CrossReferenceRows")
  private CrossReferenceRows crossReferenceRows;

  private boolean overrideValues;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("CrossReferenceRows")
  public CrossReferenceRows getCrossReferenceRows() {
    return crossReferenceRows;
  }

  @JsonProperty("CrossReferenceRows")
  public void setCrossReferenceRows(CrossReferenceRows crossReferenceRows) {
    this.crossReferenceRows = crossReferenceRows;
  }

  @JsonProperty("overrideValues")
  public boolean getOverrideValues() {
    return overrideValues;
  }

  @JsonProperty("overrideValues")
  public void setOverrideValues(boolean overrideValues) {
    this.overrideValues = overrideValues;
  }
}
