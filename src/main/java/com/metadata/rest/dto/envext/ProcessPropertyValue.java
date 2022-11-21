package com.metadata.rest.dto.envext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ProcessPropertyValue {
  private String label;

  private boolean encryptedValueSet;

  private String key;

  private boolean useDefault;

  private String value;

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public boolean isEncryptedValueSet() {
    return encryptedValueSet;
  }

  public void setEncryptedValueSet(boolean encryptedValueSet) {
    this.encryptedValueSet = encryptedValueSet;
  }

  public boolean isUseDefault() {
    return useDefault;
  }

  public void setUseDefault(boolean useDefault) {
    this.useDefault = useDefault;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}