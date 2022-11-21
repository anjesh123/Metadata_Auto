package com.metadata.rest.dto.envext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Field {
  private boolean componentOverride;

  private String id;

  private boolean usesEncryption;

  private boolean encryptedValueSet;

  private boolean useDefault;

  private String value;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public boolean isComponentOverride() {
    return componentOverride;
  }

  public void setComponentOverride(boolean componentOverride) {
    this.componentOverride = componentOverride;
  }

  public boolean isUsesEncryption() {
    return usesEncryption;
  }

  public void setUsesEncryption(boolean usesEncryption) {
    this.usesEncryption = usesEncryption;
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
