package com.metadata.rest.dto.envext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossReferences {
  @JsonProperty("crossReference")
  private List<CrossReference> crossReference;

  public List<CrossReference> getCrossReference() {
    return crossReference;
  }

  public void setCrossReference(List<CrossReference> crossReference) {
    this.crossReference = crossReference;
  }

}