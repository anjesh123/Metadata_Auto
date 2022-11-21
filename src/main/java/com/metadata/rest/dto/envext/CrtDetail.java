package com.metadata.rest.dto.envext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CrtDetail {

  private String crtId;

  private String crtName;

  public String getCrtId() {
    return crtId;
  }

  public void setCrtId(String crtId) {
    this.crtId = crtId;
  }

  public String getCrtName() {
    return crtName;
  }

  public void setCrtName(String crtName) {
    this.crtName = crtName;
  }
}
