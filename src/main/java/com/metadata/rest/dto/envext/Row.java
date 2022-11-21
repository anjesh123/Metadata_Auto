package com.metadata.rest.dto.envext;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Row implements Serializable {

  private static final long serialVersionUID = 156587565763435678L;

  private Map<String, String> dataMap;

  public Row() {
    this.dataMap = new LinkedHashMap<>();
  }

  @JsonAnyGetter
  public Map<String, String> getDataMap() {
    return dataMap;
  }

  @JsonAnySetter
  public void addData(String name, String value) {
    if (!"@type".equalsIgnoreCase(name)) {
      dataMap.put(name, value);
    }
  }
}